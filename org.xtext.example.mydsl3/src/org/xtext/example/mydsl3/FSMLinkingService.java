package org.xtext.example.mydsl3;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.xtext.example.mydsl3.fSM.EnumerationLiteral;
import org.xtext.example.mydsl3.fSM.EnumerationType;
import org.xtext.example.mydsl3.fSM.FSM;
import org.xtext.example.mydsl3.fSM.Model;
import org.xtext.example.mydsl3.fSM.State;
import org.xtext.example.mydsl3.fSM.Transition;

import com.google.inject.Inject;

public class FSMLinkingService extends DefaultLinkingService {
	private static final Logger logger = Logger.getLogger(DefaultLinkingService.class);

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		final EClass requiredType = ref.getEReferenceType();
		if (requiredType == null) {
			return Collections.<EObject>emptyList();
		}
		final String crossRefString = getCrossRefNodeAsString(node);
		if (crossRefString == null || crossRefString.equals("")) {
			return Collections.<EObject>emptyList();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("before getLinkedObjects: node: '" + crossRefString + "'");
		}
		final IScope scope = getScope(context, ref);

		final QualifiedName qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString);
		final IEObjectDescription eObjectDescription = scope.getSingleElement(qualifiedLinkName);
		if (logger.isDebugEnabled()) {
			logger.debug("after getLinkedObjects: node: '" + crossRefString + "' result: " + eObjectDescription);
		}
		if (eObjectDescription == null) {
			return Collections.emptyList();
		}
		final EObject result;
		if (context instanceof Transition && ref.getName().equals("target")) {
			State state = getReferringState((EnumerationLiteral) eObjectDescription.getEObjectOrProxy());
			result = state;
		} else {
			result = eObjectDescription.getEObjectOrProxy();
		}
		return Collections.singletonList(result);
	}

	private State getReferringState(EnumerationLiteral literal) {
		EnumerationType type = (EnumerationType) literal.eContainer();
		Model model = (Model) type.eContainer();
		for (FSM fsm : model.getFsm()) {
			for (State state : fsm.getOwnedState()) {
				if (state.getLiteral() == literal)
					return state;
			}
		}
		return null;
	}

}
