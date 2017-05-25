/*
 * generated by Xtext 2.11.0
 */
grammar InternalFSM;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl3.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl3.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl3.services.FSMGrammarAccess;

}
@parser::members {
	private FSMGrammarAccess grammarAccess;

	public void setGrammarAccess(FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFSM
entryRuleFSM
:
{ before(grammarAccess.getFSMRule()); }
	 ruleFSM
{ after(grammarAccess.getFSMRule()); } 
	 EOF 
;

// Rule FSM
ruleFSM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFSMAccess().getGroup()); }
		(rule__FSM__Group__0)
		{ after(grammarAccess.getFSMAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationType
entryRuleEnumerationType
:
{ before(grammarAccess.getEnumerationTypeRule()); }
	 ruleEnumerationType
{ after(grammarAccess.getEnumerationTypeRule()); } 
	 EOF 
;

// Rule EnumerationType
ruleEnumerationType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationTypeAccess().getGroup()); }
		(rule__EnumerationType__Group__0)
		{ after(grammarAccess.getEnumerationTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral
:
{ before(grammarAccess.getEnumerationLiteralRule()); }
	 ruleEnumerationLiteral
{ after(grammarAccess.getEnumerationLiteralRule()); } 
	 EOF 
;

// Rule EnumerationLiteral
ruleEnumerationLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); }
		(rule__EnumerationLiteral__NameAssignment)
		{ after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedID
entryRuleQualifiedID
:
{ before(grammarAccess.getQualifiedIDRule()); }
	 ruleQualifiedID
{ after(grammarAccess.getQualifiedIDRule()); } 
	 EOF 
;

// Rule QualifiedID
ruleQualifiedID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedIDAccess().getAlternatives()); }
		(rule__QualifiedID__Alternatives)
		{ after(grammarAccess.getQualifiedIDAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); }
		RULE_QUALIFIED_ID
		{ after(grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getTypesAssignment_0()); }
	(rule__Model__TypesAssignment_0)*
	{ after(grammarAccess.getModelAccess().getTypesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getFsmAssignment_1()); }
	(rule__Model__FsmAssignment_1)*
	{ after(grammarAccess.getModelAccess().getFsmAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FSM__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__0__Impl
	rule__FSM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getFSMKeyword_0()); }
	'FSM'
	{ after(grammarAccess.getFSMAccess().getFSMKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__1__Impl
	rule__FSM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__2__Impl
	rule__FSM__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getFSMAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__3__Impl
	rule__FSM__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getTypeAssignment_3()); }
	(rule__FSM__TypeAssignment_3)
	{ after(grammarAccess.getFSMAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__4__Impl
	rule__FSM__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getOwnedStateAssignment_4()); }
	(rule__FSM__OwnedStateAssignment_4)*
	{ after(grammarAccess.getFSMAccess().getOwnedStateAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_0()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_2()); }
	(rule__State__Group_2__0)
	{ after(grammarAccess.getStateAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_3()); }
	(rule__State__Group_3__0)?
	{ after(grammarAccess.getStateAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_2__0__Impl
	rule__State__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLiteralKeyword_2_0()); }
	'literal'
	{ after(grammarAccess.getStateAccess().getLiteralKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLiteralAssignment_2_1()); }
	(rule__State__LiteralAssignment_2_1)
	{ after(grammarAccess.getStateAccess().getLiteralAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__0__Impl
	rule__State__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getTransitionsKeyword_3_0()); }
	'transitions'
	{ after(grammarAccess.getStateAccess().getTransitionsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__1__Impl
	rule__State__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_3_1()); }
	'('
	{ after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__2__Impl
	rule__State__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_3_2()); }
	(rule__State__OutgoingTransitionAssignment_3_2)*
	{ after(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightParenthesisKeyword_3_3()); }
	')'
	{ after(grammarAccess.getStateAccess().getRightParenthesisKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getToKeyword_0()); }
	'to'
	{ after(grammarAccess.getTransitionAccess().getToKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); }
	(rule__Transition__TargetAssignment_1)
	{ after(grammarAccess.getTransitionAccess().getTargetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__0__Impl
	rule__EnumerationType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0()); }
	'EnumerationType'
	{ after(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__1__Impl
	rule__EnumerationType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); }
	(rule__EnumerationType__NameAssignment_1)
	{ after(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__2__Impl
	rule__EnumerationType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2()); }
	'literals'
	{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__3__Impl
	rule__EnumerationType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__4__Impl
	rule__EnumerationType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); }
	(rule__EnumerationType__LiteralsAssignment_4)
	{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__5__Impl
	rule__EnumerationType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getGroup_5()); }
	(rule__EnumerationType__Group_5__0)*
	{ after(grammarAccess.getEnumerationTypeAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationType__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group_5__0__Impl
	rule__EnumerationType__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationType__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); }
	(rule__EnumerationType__LiteralsAssignment_5_1)
	{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__TypesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getTypesEnumerationTypeParserRuleCall_0_0()); }
		ruleEnumerationType
		{ after(grammarAccess.getModelAccess().getTypesEnumerationTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__FsmAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getFsmFSMParserRuleCall_1_0()); }
		ruleFSM
		{ after(grammarAccess.getModelAccess().getFsmFSMParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getTypeEnumerationTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getFSMAccess().getTypeEnumerationTypeQualifiedIDParserRuleCall_3_0_1()); }
			ruleQualifiedID
			{ after(grammarAccess.getFSMAccess().getTypeEnumerationTypeQualifiedIDParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getFSMAccess().getTypeEnumerationTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__OwnedStateAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_0()); }
		ruleState
		{ after(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__LiteralAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralQualifiedIDParserRuleCall_2_1_0_1()); }
			ruleQualifiedID
			{ after(grammarAccess.getStateAccess().getLiteralEnumerationLiteralQualifiedIDParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutgoingTransitionAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_3_2_0()); }
		ruleTransition
		{ after(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TargetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTargetStateQualifiedIDParserRuleCall_1_0_1()); }
			ruleQualifiedID
			{ after(grammarAccess.getTransitionAccess().getTargetStateQualifiedIDParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__LiteralsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationType__LiteralsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_QUALIFIED_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* '.' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('.' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*)*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
