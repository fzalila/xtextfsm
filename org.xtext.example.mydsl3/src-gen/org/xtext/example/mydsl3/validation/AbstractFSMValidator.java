/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl3.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractFSMValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.mydsl3.fSM.FSMPackage.eINSTANCE);
		return result;
	}
	
}
