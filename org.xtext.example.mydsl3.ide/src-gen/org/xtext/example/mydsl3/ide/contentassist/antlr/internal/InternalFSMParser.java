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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_QUALIFIED_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'{'", "'type'", "'}'", "'State'", "'literal'", "'transitions'", "'('", "')'", "'to'", "'EnumerationType'", "'literals'", "','"
    };
    public static final int RULE_QUALIFIED_ID=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFSM.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalFSM.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFSM.g:54:1: ( ruleModel EOF )
            // InternalFSM.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFSM.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalFSM.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalFSM.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalFSM.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalFSM.g:69:3: ( rule__Model__Group__0 )
            // InternalFSM.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFSM"
    // InternalFSM.g:78:1: entryRuleFSM : ruleFSM EOF ;
    public final void entryRuleFSM() throws RecognitionException {
        try {
            // InternalFSM.g:79:1: ( ruleFSM EOF )
            // InternalFSM.g:80:1: ruleFSM EOF
            {
             before(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            ruleFSM();

            state._fsp--;

             after(grammarAccess.getFSMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalFSM.g:87:1: ruleFSM : ( ( rule__FSM__Group__0 ) ) ;
    public final void ruleFSM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:91:2: ( ( ( rule__FSM__Group__0 ) ) )
            // InternalFSM.g:92:2: ( ( rule__FSM__Group__0 ) )
            {
            // InternalFSM.g:92:2: ( ( rule__FSM__Group__0 ) )
            // InternalFSM.g:93:3: ( rule__FSM__Group__0 )
            {
             before(grammarAccess.getFSMAccess().getGroup()); 
            // InternalFSM.g:94:3: ( rule__FSM__Group__0 )
            // InternalFSM.g:94:4: rule__FSM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FSM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFSMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalFSM.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalFSM.g:104:1: ( ruleState EOF )
            // InternalFSM.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFSM.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalFSM.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalFSM.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalFSM.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalFSM.g:119:3: ( rule__State__Group__0 )
            // InternalFSM.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFSM.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalFSM.g:129:1: ( ruleTransition EOF )
            // InternalFSM.g:130:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFSM.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalFSM.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalFSM.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalFSM.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalFSM.g:144:3: ( rule__Transition__Group__0 )
            // InternalFSM.g:144:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalFSM.g:153:1: entryRuleEnumerationType : ruleEnumerationType EOF ;
    public final void entryRuleEnumerationType() throws RecognitionException {
        try {
            // InternalFSM.g:154:1: ( ruleEnumerationType EOF )
            // InternalFSM.g:155:1: ruleEnumerationType EOF
            {
             before(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationType();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalFSM.g:162:1: ruleEnumerationType : ( ( rule__EnumerationType__Group__0 ) ) ;
    public final void ruleEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:166:2: ( ( ( rule__EnumerationType__Group__0 ) ) )
            // InternalFSM.g:167:2: ( ( rule__EnumerationType__Group__0 ) )
            {
            // InternalFSM.g:167:2: ( ( rule__EnumerationType__Group__0 ) )
            // InternalFSM.g:168:3: ( rule__EnumerationType__Group__0 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup()); 
            // InternalFSM.g:169:3: ( rule__EnumerationType__Group__0 )
            // InternalFSM.g:169:4: rule__EnumerationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalFSM.g:178:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalFSM.g:179:1: ( ruleEnumerationLiteral EOF )
            // InternalFSM.g:180:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalFSM.g:187:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__NameAssignment ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:191:2: ( ( ( rule__EnumerationLiteral__NameAssignment ) ) )
            // InternalFSM.g:192:2: ( ( rule__EnumerationLiteral__NameAssignment ) )
            {
            // InternalFSM.g:192:2: ( ( rule__EnumerationLiteral__NameAssignment ) )
            // InternalFSM.g:193:3: ( rule__EnumerationLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); 
            // InternalFSM.g:194:3: ( rule__EnumerationLiteral__NameAssignment )
            // InternalFSM.g:194:4: rule__EnumerationLiteral__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleQualifiedID"
    // InternalFSM.g:203:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalFSM.g:204:1: ( ruleQualifiedID EOF )
            // InternalFSM.g:205:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalFSM.g:212:1: ruleQualifiedID : ( ( rule__QualifiedID__Alternatives ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:216:2: ( ( ( rule__QualifiedID__Alternatives ) ) )
            // InternalFSM.g:217:2: ( ( rule__QualifiedID__Alternatives ) )
            {
            // InternalFSM.g:217:2: ( ( rule__QualifiedID__Alternatives ) )
            // InternalFSM.g:218:3: ( rule__QualifiedID__Alternatives )
            {
             before(grammarAccess.getQualifiedIDAccess().getAlternatives()); 
            // InternalFSM.g:219:3: ( rule__QualifiedID__Alternatives )
            // InternalFSM.g:219:4: rule__QualifiedID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "rule__QualifiedID__Alternatives"
    // InternalFSM.g:227:1: rule__QualifiedID__Alternatives : ( ( RULE_ID ) | ( RULE_QUALIFIED_ID ) );
    public final void rule__QualifiedID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:231:1: ( ( RULE_ID ) | ( RULE_QUALIFIED_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_QUALIFIED_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFSM.g:232:2: ( RULE_ID )
                    {
                    // InternalFSM.g:232:2: ( RULE_ID )
                    // InternalFSM.g:233:3: RULE_ID
                    {
                     before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFSM.g:238:2: ( RULE_QUALIFIED_ID )
                    {
                    // InternalFSM.g:238:2: ( RULE_QUALIFIED_ID )
                    // InternalFSM.g:239:3: RULE_QUALIFIED_ID
                    {
                     before(grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); 
                    match(input,RULE_QUALIFIED_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFSM.g:248:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:252:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFSM.g:253:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalFSM.g:260:1: rule__Model__Group__0__Impl : ( ( rule__Model__TypesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:264:1: ( ( ( rule__Model__TypesAssignment_0 )* ) )
            // InternalFSM.g:265:1: ( ( rule__Model__TypesAssignment_0 )* )
            {
            // InternalFSM.g:265:1: ( ( rule__Model__TypesAssignment_0 )* )
            // InternalFSM.g:266:2: ( rule__Model__TypesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
            // InternalFSM.g:267:2: ( rule__Model__TypesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFSM.g:267:3: rule__Model__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalFSM.g:275:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:279:1: ( rule__Model__Group__1__Impl )
            // InternalFSM.g:280:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalFSM.g:286:1: rule__Model__Group__1__Impl : ( ( rule__Model__FsmAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:290:1: ( ( ( rule__Model__FsmAssignment_1 )* ) )
            // InternalFSM.g:291:1: ( ( rule__Model__FsmAssignment_1 )* )
            {
            // InternalFSM.g:291:1: ( ( rule__Model__FsmAssignment_1 )* )
            // InternalFSM.g:292:2: ( rule__Model__FsmAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getFsmAssignment_1()); 
            // InternalFSM.g:293:2: ( rule__Model__FsmAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFSM.g:293:3: rule__Model__FsmAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__FsmAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFsmAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__FSM__Group__0"
    // InternalFSM.g:302:1: rule__FSM__Group__0 : rule__FSM__Group__0__Impl rule__FSM__Group__1 ;
    public final void rule__FSM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:306:1: ( rule__FSM__Group__0__Impl rule__FSM__Group__1 )
            // InternalFSM.g:307:2: rule__FSM__Group__0__Impl rule__FSM__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FSM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__0"


    // $ANTLR start "rule__FSM__Group__0__Impl"
    // InternalFSM.g:314:1: rule__FSM__Group__0__Impl : ( 'FSM' ) ;
    public final void rule__FSM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:318:1: ( ( 'FSM' ) )
            // InternalFSM.g:319:1: ( 'FSM' )
            {
            // InternalFSM.g:319:1: ( 'FSM' )
            // InternalFSM.g:320:2: 'FSM'
            {
             before(grammarAccess.getFSMAccess().getFSMKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getFSMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__0__Impl"


    // $ANTLR start "rule__FSM__Group__1"
    // InternalFSM.g:329:1: rule__FSM__Group__1 : rule__FSM__Group__1__Impl rule__FSM__Group__2 ;
    public final void rule__FSM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:333:1: ( rule__FSM__Group__1__Impl rule__FSM__Group__2 )
            // InternalFSM.g:334:2: rule__FSM__Group__1__Impl rule__FSM__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FSM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__1"


    // $ANTLR start "rule__FSM__Group__1__Impl"
    // InternalFSM.g:341:1: rule__FSM__Group__1__Impl : ( '{' ) ;
    public final void rule__FSM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:345:1: ( ( '{' ) )
            // InternalFSM.g:346:1: ( '{' )
            {
            // InternalFSM.g:346:1: ( '{' )
            // InternalFSM.g:347:2: '{'
            {
             before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__1__Impl"


    // $ANTLR start "rule__FSM__Group__2"
    // InternalFSM.g:356:1: rule__FSM__Group__2 : rule__FSM__Group__2__Impl rule__FSM__Group__3 ;
    public final void rule__FSM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:360:1: ( rule__FSM__Group__2__Impl rule__FSM__Group__3 )
            // InternalFSM.g:361:2: rule__FSM__Group__2__Impl rule__FSM__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FSM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__2"


    // $ANTLR start "rule__FSM__Group__2__Impl"
    // InternalFSM.g:368:1: rule__FSM__Group__2__Impl : ( 'type' ) ;
    public final void rule__FSM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:372:1: ( ( 'type' ) )
            // InternalFSM.g:373:1: ( 'type' )
            {
            // InternalFSM.g:373:1: ( 'type' )
            // InternalFSM.g:374:2: 'type'
            {
             before(grammarAccess.getFSMAccess().getTypeKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__2__Impl"


    // $ANTLR start "rule__FSM__Group__3"
    // InternalFSM.g:383:1: rule__FSM__Group__3 : rule__FSM__Group__3__Impl rule__FSM__Group__4 ;
    public final void rule__FSM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:387:1: ( rule__FSM__Group__3__Impl rule__FSM__Group__4 )
            // InternalFSM.g:388:2: rule__FSM__Group__3__Impl rule__FSM__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FSM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__3"


    // $ANTLR start "rule__FSM__Group__3__Impl"
    // InternalFSM.g:395:1: rule__FSM__Group__3__Impl : ( ( rule__FSM__TypeAssignment_3 ) ) ;
    public final void rule__FSM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:399:1: ( ( ( rule__FSM__TypeAssignment_3 ) ) )
            // InternalFSM.g:400:1: ( ( rule__FSM__TypeAssignment_3 ) )
            {
            // InternalFSM.g:400:1: ( ( rule__FSM__TypeAssignment_3 ) )
            // InternalFSM.g:401:2: ( rule__FSM__TypeAssignment_3 )
            {
             before(grammarAccess.getFSMAccess().getTypeAssignment_3()); 
            // InternalFSM.g:402:2: ( rule__FSM__TypeAssignment_3 )
            // InternalFSM.g:402:3: rule__FSM__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FSM__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFSMAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__3__Impl"


    // $ANTLR start "rule__FSM__Group__4"
    // InternalFSM.g:410:1: rule__FSM__Group__4 : rule__FSM__Group__4__Impl rule__FSM__Group__5 ;
    public final void rule__FSM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:414:1: ( rule__FSM__Group__4__Impl rule__FSM__Group__5 )
            // InternalFSM.g:415:2: rule__FSM__Group__4__Impl rule__FSM__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FSM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__4"


    // $ANTLR start "rule__FSM__Group__4__Impl"
    // InternalFSM.g:422:1: rule__FSM__Group__4__Impl : ( ( rule__FSM__OwnedStateAssignment_4 )* ) ;
    public final void rule__FSM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:426:1: ( ( ( rule__FSM__OwnedStateAssignment_4 )* ) )
            // InternalFSM.g:427:1: ( ( rule__FSM__OwnedStateAssignment_4 )* )
            {
            // InternalFSM.g:427:1: ( ( rule__FSM__OwnedStateAssignment_4 )* )
            // InternalFSM.g:428:2: ( rule__FSM__OwnedStateAssignment_4 )*
            {
             before(grammarAccess.getFSMAccess().getOwnedStateAssignment_4()); 
            // InternalFSM.g:429:2: ( rule__FSM__OwnedStateAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFSM.g:429:3: rule__FSM__OwnedStateAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FSM__OwnedStateAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFSMAccess().getOwnedStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__4__Impl"


    // $ANTLR start "rule__FSM__Group__5"
    // InternalFSM.g:437:1: rule__FSM__Group__5 : rule__FSM__Group__5__Impl ;
    public final void rule__FSM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:441:1: ( rule__FSM__Group__5__Impl )
            // InternalFSM.g:442:2: rule__FSM__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FSM__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__5"


    // $ANTLR start "rule__FSM__Group__5__Impl"
    // InternalFSM.g:448:1: rule__FSM__Group__5__Impl : ( '}' ) ;
    public final void rule__FSM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:452:1: ( ( '}' ) )
            // InternalFSM.g:453:1: ( '}' )
            {
            // InternalFSM.g:453:1: ( '}' )
            // InternalFSM.g:454:2: '}'
            {
             before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__5__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalFSM.g:464:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:468:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalFSM.g:469:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalFSM.g:476:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:480:1: ( ( 'State' ) )
            // InternalFSM.g:481:1: ( 'State' )
            {
            // InternalFSM.g:481:1: ( 'State' )
            // InternalFSM.g:482:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalFSM.g:491:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:495:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalFSM.g:496:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalFSM.g:503:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:507:1: ( ( '{' ) )
            // InternalFSM.g:508:1: ( '{' )
            {
            // InternalFSM.g:508:1: ( '{' )
            // InternalFSM.g:509:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalFSM.g:518:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:522:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalFSM.g:523:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalFSM.g:530:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:534:1: ( ( ( rule__State__Group_2__0 ) ) )
            // InternalFSM.g:535:1: ( ( rule__State__Group_2__0 ) )
            {
            // InternalFSM.g:535:1: ( ( rule__State__Group_2__0 ) )
            // InternalFSM.g:536:2: ( rule__State__Group_2__0 )
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // InternalFSM.g:537:2: ( rule__State__Group_2__0 )
            // InternalFSM.g:537:3: rule__State__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalFSM.g:545:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:549:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalFSM.g:550:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalFSM.g:557:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:561:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalFSM.g:562:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalFSM.g:562:1: ( ( rule__State__Group_3__0 )? )
            // InternalFSM.g:563:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalFSM.g:564:2: ( rule__State__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFSM.g:564:3: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalFSM.g:572:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:576:1: ( rule__State__Group__4__Impl )
            // InternalFSM.g:577:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalFSM.g:583:1: rule__State__Group__4__Impl : ( '}' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:587:1: ( ( '}' ) )
            // InternalFSM.g:588:1: ( '}' )
            {
            // InternalFSM.g:588:1: ( '}' )
            // InternalFSM.g:589:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // InternalFSM.g:599:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:603:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // InternalFSM.g:604:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // InternalFSM.g:611:1: rule__State__Group_2__0__Impl : ( 'literal' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:615:1: ( ( 'literal' ) )
            // InternalFSM.g:616:1: ( 'literal' )
            {
            // InternalFSM.g:616:1: ( 'literal' )
            // InternalFSM.g:617:2: 'literal'
            {
             before(grammarAccess.getStateAccess().getLiteralKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLiteralKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // InternalFSM.g:626:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:630:1: ( rule__State__Group_2__1__Impl )
            // InternalFSM.g:631:2: rule__State__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // InternalFSM.g:637:1: rule__State__Group_2__1__Impl : ( ( rule__State__LiteralAssignment_2_1 ) ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:641:1: ( ( ( rule__State__LiteralAssignment_2_1 ) ) )
            // InternalFSM.g:642:1: ( ( rule__State__LiteralAssignment_2_1 ) )
            {
            // InternalFSM.g:642:1: ( ( rule__State__LiteralAssignment_2_1 ) )
            // InternalFSM.g:643:2: ( rule__State__LiteralAssignment_2_1 )
            {
             before(grammarAccess.getStateAccess().getLiteralAssignment_2_1()); 
            // InternalFSM.g:644:2: ( rule__State__LiteralAssignment_2_1 )
            // InternalFSM.g:644:3: rule__State__LiteralAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__State__LiteralAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getLiteralAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalFSM.g:653:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:657:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalFSM.g:658:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // InternalFSM.g:665:1: rule__State__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:669:1: ( ( 'transitions' ) )
            // InternalFSM.g:670:1: ( 'transitions' )
            {
            // InternalFSM.g:670:1: ( 'transitions' )
            // InternalFSM.g:671:2: 'transitions'
            {
             before(grammarAccess.getStateAccess().getTransitionsKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getTransitionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // InternalFSM.g:680:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:684:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalFSM.g:685:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // InternalFSM.g:692:1: rule__State__Group_3__1__Impl : ( '(' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:696:1: ( ( '(' ) )
            // InternalFSM.g:697:1: ( '(' )
            {
            // InternalFSM.g:697:1: ( '(' )
            // InternalFSM.g:698:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_3__2"
    // InternalFSM.g:707:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl rule__State__Group_3__3 ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:711:1: ( rule__State__Group_3__2__Impl rule__State__Group_3__3 )
            // InternalFSM.g:712:2: rule__State__Group_3__2__Impl rule__State__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__State__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2"


    // $ANTLR start "rule__State__Group_3__2__Impl"
    // InternalFSM.g:719:1: rule__State__Group_3__2__Impl : ( ( rule__State__OutgoingTransitionAssignment_3_2 )* ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:723:1: ( ( ( rule__State__OutgoingTransitionAssignment_3_2 )* ) )
            // InternalFSM.g:724:1: ( ( rule__State__OutgoingTransitionAssignment_3_2 )* )
            {
            // InternalFSM.g:724:1: ( ( rule__State__OutgoingTransitionAssignment_3_2 )* )
            // InternalFSM.g:725:2: ( rule__State__OutgoingTransitionAssignment_3_2 )*
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_3_2()); 
            // InternalFSM.g:726:2: ( rule__State__OutgoingTransitionAssignment_3_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFSM.g:726:3: rule__State__OutgoingTransitionAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__State__OutgoingTransitionAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2__Impl"


    // $ANTLR start "rule__State__Group_3__3"
    // InternalFSM.g:734:1: rule__State__Group_3__3 : rule__State__Group_3__3__Impl ;
    public final void rule__State__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:738:1: ( rule__State__Group_3__3__Impl )
            // InternalFSM.g:739:2: rule__State__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3"


    // $ANTLR start "rule__State__Group_3__3__Impl"
    // InternalFSM.g:745:1: rule__State__Group_3__3__Impl : ( ')' ) ;
    public final void rule__State__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:749:1: ( ( ')' ) )
            // InternalFSM.g:750:1: ( ')' )
            {
            // InternalFSM.g:750:1: ( ')' )
            // InternalFSM.g:751:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_3_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalFSM.g:761:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:765:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalFSM.g:766:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalFSM.g:773:1: rule__Transition__Group__0__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:777:1: ( ( 'to' ) )
            // InternalFSM.g:778:1: ( 'to' )
            {
            // InternalFSM.g:778:1: ( 'to' )
            // InternalFSM.g:779:2: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalFSM.g:788:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:792:1: ( rule__Transition__Group__1__Impl )
            // InternalFSM.g:793:2: rule__Transition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalFSM.g:799:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TargetAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:803:1: ( ( ( rule__Transition__TargetAssignment_1 ) ) )
            // InternalFSM.g:804:1: ( ( rule__Transition__TargetAssignment_1 ) )
            {
            // InternalFSM.g:804:1: ( ( rule__Transition__TargetAssignment_1 ) )
            // InternalFSM.g:805:2: ( rule__Transition__TargetAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 
            // InternalFSM.g:806:2: ( rule__Transition__TargetAssignment_1 )
            // InternalFSM.g:806:3: rule__Transition__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__0"
    // InternalFSM.g:815:1: rule__EnumerationType__Group__0 : rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 ;
    public final void rule__EnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:819:1: ( rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 )
            // InternalFSM.g:820:2: rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EnumerationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0"


    // $ANTLR start "rule__EnumerationType__Group__0__Impl"
    // InternalFSM.g:827:1: rule__EnumerationType__Group__0__Impl : ( 'EnumerationType' ) ;
    public final void rule__EnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:831:1: ( ( 'EnumerationType' ) )
            // InternalFSM.g:832:1: ( 'EnumerationType' )
            {
            // InternalFSM.g:832:1: ( 'EnumerationType' )
            // InternalFSM.g:833:2: 'EnumerationType'
            {
             before(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group__1"
    // InternalFSM.g:842:1: rule__EnumerationType__Group__1 : rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 ;
    public final void rule__EnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:846:1: ( rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 )
            // InternalFSM.g:847:2: rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EnumerationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1"


    // $ANTLR start "rule__EnumerationType__Group__1__Impl"
    // InternalFSM.g:854:1: rule__EnumerationType__Group__1__Impl : ( ( rule__EnumerationType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:858:1: ( ( ( rule__EnumerationType__NameAssignment_1 ) ) )
            // InternalFSM.g:859:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            {
            // InternalFSM.g:859:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            // InternalFSM.g:860:2: ( rule__EnumerationType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 
            // InternalFSM.g:861:2: ( rule__EnumerationType__NameAssignment_1 )
            // InternalFSM.g:861:3: rule__EnumerationType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__2"
    // InternalFSM.g:869:1: rule__EnumerationType__Group__2 : rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 ;
    public final void rule__EnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:873:1: ( rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 )
            // InternalFSM.g:874:2: rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EnumerationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2"


    // $ANTLR start "rule__EnumerationType__Group__2__Impl"
    // InternalFSM.g:881:1: rule__EnumerationType__Group__2__Impl : ( 'literals' ) ;
    public final void rule__EnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:885:1: ( ( 'literals' ) )
            // InternalFSM.g:886:1: ( 'literals' )
            {
            // InternalFSM.g:886:1: ( 'literals' )
            // InternalFSM.g:887:2: 'literals'
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationType__Group__3"
    // InternalFSM.g:896:1: rule__EnumerationType__Group__3 : rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 ;
    public final void rule__EnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:900:1: ( rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 )
            // InternalFSM.g:901:2: rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__EnumerationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3"


    // $ANTLR start "rule__EnumerationType__Group__3__Impl"
    // InternalFSM.g:908:1: rule__EnumerationType__Group__3__Impl : ( '(' ) ;
    public final void rule__EnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:912:1: ( ( '(' ) )
            // InternalFSM.g:913:1: ( '(' )
            {
            // InternalFSM.g:913:1: ( '(' )
            // InternalFSM.g:914:2: '('
            {
             before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationType__Group__4"
    // InternalFSM.g:923:1: rule__EnumerationType__Group__4 : rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 ;
    public final void rule__EnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:927:1: ( rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 )
            // InternalFSM.g:928:2: rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__EnumerationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4"


    // $ANTLR start "rule__EnumerationType__Group__4__Impl"
    // InternalFSM.g:935:1: rule__EnumerationType__Group__4__Impl : ( ( rule__EnumerationType__LiteralsAssignment_4 ) ) ;
    public final void rule__EnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:939:1: ( ( ( rule__EnumerationType__LiteralsAssignment_4 ) ) )
            // InternalFSM.g:940:1: ( ( rule__EnumerationType__LiteralsAssignment_4 ) )
            {
            // InternalFSM.g:940:1: ( ( rule__EnumerationType__LiteralsAssignment_4 ) )
            // InternalFSM.g:941:2: ( rule__EnumerationType__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); 
            // InternalFSM.g:942:2: ( rule__EnumerationType__LiteralsAssignment_4 )
            // InternalFSM.g:942:3: rule__EnumerationType__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationType__Group__5"
    // InternalFSM.g:950:1: rule__EnumerationType__Group__5 : rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 ;
    public final void rule__EnumerationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:954:1: ( rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 )
            // InternalFSM.g:955:2: rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__EnumerationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5"


    // $ANTLR start "rule__EnumerationType__Group__5__Impl"
    // InternalFSM.g:962:1: rule__EnumerationType__Group__5__Impl : ( ( rule__EnumerationType__Group_5__0 )* ) ;
    public final void rule__EnumerationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:966:1: ( ( ( rule__EnumerationType__Group_5__0 )* ) )
            // InternalFSM.g:967:1: ( ( rule__EnumerationType__Group_5__0 )* )
            {
            // InternalFSM.g:967:1: ( ( rule__EnumerationType__Group_5__0 )* )
            // InternalFSM.g:968:2: ( rule__EnumerationType__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_5()); 
            // InternalFSM.g:969:2: ( rule__EnumerationType__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFSM.g:969:3: rule__EnumerationType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EnumerationType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEnumerationTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5__Impl"


    // $ANTLR start "rule__EnumerationType__Group__6"
    // InternalFSM.g:977:1: rule__EnumerationType__Group__6 : rule__EnumerationType__Group__6__Impl ;
    public final void rule__EnumerationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:981:1: ( rule__EnumerationType__Group__6__Impl )
            // InternalFSM.g:982:2: rule__EnumerationType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6"


    // $ANTLR start "rule__EnumerationType__Group__6__Impl"
    // InternalFSM.g:988:1: rule__EnumerationType__Group__6__Impl : ( ')' ) ;
    public final void rule__EnumerationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:992:1: ( ( ')' ) )
            // InternalFSM.g:993:1: ( ')' )
            {
            // InternalFSM.g:993:1: ( ')' )
            // InternalFSM.g:994:2: ')'
            {
             before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6__Impl"


    // $ANTLR start "rule__EnumerationType__Group_5__0"
    // InternalFSM.g:1004:1: rule__EnumerationType__Group_5__0 : rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1 ;
    public final void rule__EnumerationType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1008:1: ( rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1 )
            // InternalFSM.g:1009:2: rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__EnumerationType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__0"


    // $ANTLR start "rule__EnumerationType__Group_5__0__Impl"
    // InternalFSM.g:1016:1: rule__EnumerationType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnumerationType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1020:1: ( ( ',' ) )
            // InternalFSM.g:1021:1: ( ',' )
            {
            // InternalFSM.g:1021:1: ( ',' )
            // InternalFSM.g:1022:2: ','
            {
             before(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_5__1"
    // InternalFSM.g:1031:1: rule__EnumerationType__Group_5__1 : rule__EnumerationType__Group_5__1__Impl ;
    public final void rule__EnumerationType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1035:1: ( rule__EnumerationType__Group_5__1__Impl )
            // InternalFSM.g:1036:2: rule__EnumerationType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__1"


    // $ANTLR start "rule__EnumerationType__Group_5__1__Impl"
    // InternalFSM.g:1042:1: rule__EnumerationType__Group_5__1__Impl : ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) ) ;
    public final void rule__EnumerationType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1046:1: ( ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) ) )
            // InternalFSM.g:1047:1: ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) )
            {
            // InternalFSM.g:1047:1: ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) )
            // InternalFSM.g:1048:2: ( rule__EnumerationType__LiteralsAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); 
            // InternalFSM.g:1049:2: ( rule__EnumerationType__LiteralsAssignment_5_1 )
            // InternalFSM.g:1049:3: rule__EnumerationType__LiteralsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__LiteralsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__1__Impl"


    // $ANTLR start "rule__Model__TypesAssignment_0"
    // InternalFSM.g:1058:1: rule__Model__TypesAssignment_0 : ( ruleEnumerationType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1062:1: ( ( ruleEnumerationType ) )
            // InternalFSM.g:1063:2: ( ruleEnumerationType )
            {
            // InternalFSM.g:1063:2: ( ruleEnumerationType )
            // InternalFSM.g:1064:3: ruleEnumerationType
            {
             before(grammarAccess.getModelAccess().getTypesEnumerationTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesEnumerationTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_0"


    // $ANTLR start "rule__Model__FsmAssignment_1"
    // InternalFSM.g:1073:1: rule__Model__FsmAssignment_1 : ( ruleFSM ) ;
    public final void rule__Model__FsmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1077:1: ( ( ruleFSM ) )
            // InternalFSM.g:1078:2: ( ruleFSM )
            {
            // InternalFSM.g:1078:2: ( ruleFSM )
            // InternalFSM.g:1079:3: ruleFSM
            {
             before(grammarAccess.getModelAccess().getFsmFSMParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFSM();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFsmFSMParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FsmAssignment_1"


    // $ANTLR start "rule__FSM__TypeAssignment_3"
    // InternalFSM.g:1088:1: rule__FSM__TypeAssignment_3 : ( ( ruleQualifiedID ) ) ;
    public final void rule__FSM__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1092:1: ( ( ( ruleQualifiedID ) ) )
            // InternalFSM.g:1093:2: ( ( ruleQualifiedID ) )
            {
            // InternalFSM.g:1093:2: ( ( ruleQualifiedID ) )
            // InternalFSM.g:1094:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getFSMAccess().getTypeEnumerationTypeCrossReference_3_0()); 
            // InternalFSM.g:1095:3: ( ruleQualifiedID )
            // InternalFSM.g:1096:4: ruleQualifiedID
            {
             before(grammarAccess.getFSMAccess().getTypeEnumerationTypeQualifiedIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getFSMAccess().getTypeEnumerationTypeQualifiedIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFSMAccess().getTypeEnumerationTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__TypeAssignment_3"


    // $ANTLR start "rule__FSM__OwnedStateAssignment_4"
    // InternalFSM.g:1107:1: rule__FSM__OwnedStateAssignment_4 : ( ruleState ) ;
    public final void rule__FSM__OwnedStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1111:1: ( ( ruleState ) )
            // InternalFSM.g:1112:2: ( ruleState )
            {
            // InternalFSM.g:1112:2: ( ruleState )
            // InternalFSM.g:1113:3: ruleState
            {
             before(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__OwnedStateAssignment_4"


    // $ANTLR start "rule__State__LiteralAssignment_2_1"
    // InternalFSM.g:1122:1: rule__State__LiteralAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__State__LiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1126:1: ( ( ( ruleQualifiedID ) ) )
            // InternalFSM.g:1127:2: ( ( ruleQualifiedID ) )
            {
            // InternalFSM.g:1127:2: ( ( ruleQualifiedID ) )
            // InternalFSM.g:1128:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_2_1_0()); 
            // InternalFSM.g:1129:3: ( ruleQualifiedID )
            // InternalFSM.g:1130:4: ruleQualifiedID
            {
             before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralQualifiedIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getStateAccess().getLiteralEnumerationLiteralQualifiedIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__LiteralAssignment_2_1"


    // $ANTLR start "rule__State__OutgoingTransitionAssignment_3_2"
    // InternalFSM.g:1141:1: rule__State__OutgoingTransitionAssignment_3_2 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1145:1: ( ( ruleTransition ) )
            // InternalFSM.g:1146:2: ( ruleTransition )
            {
            // InternalFSM.g:1146:2: ( ruleTransition )
            // InternalFSM.g:1147:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingTransitionAssignment_3_2"


    // $ANTLR start "rule__Transition__TargetAssignment_1"
    // InternalFSM.g:1156:1: rule__Transition__TargetAssignment_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Transition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1160:1: ( ( ( ruleQualifiedID ) ) )
            // InternalFSM.g:1161:2: ( ( ruleQualifiedID ) )
            {
            // InternalFSM.g:1161:2: ( ( ruleQualifiedID ) )
            // InternalFSM.g:1162:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            // InternalFSM.g:1163:3: ( ruleQualifiedID )
            // InternalFSM.g:1164:4: ruleQualifiedID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateQualifiedIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateQualifiedIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_1"


    // $ANTLR start "rule__EnumerationType__NameAssignment_1"
    // InternalFSM.g:1175:1: rule__EnumerationType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1179:1: ( ( RULE_ID ) )
            // InternalFSM.g:1180:2: ( RULE_ID )
            {
            // InternalFSM.g:1180:2: ( RULE_ID )
            // InternalFSM.g:1181:3: RULE_ID
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__NameAssignment_1"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_4"
    // InternalFSM.g:1190:1: rule__EnumerationType__LiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1194:1: ( ( ruleEnumerationLiteral ) )
            // InternalFSM.g:1195:2: ( ruleEnumerationLiteral )
            {
            // InternalFSM.g:1195:2: ( ruleEnumerationLiteral )
            // InternalFSM.g:1196:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_4"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_5_1"
    // InternalFSM.g:1205:1: rule__EnumerationType__LiteralsAssignment_5_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1209:1: ( ( ruleEnumerationLiteral ) )
            // InternalFSM.g:1210:2: ( ruleEnumerationLiteral )
            {
            // InternalFSM.g:1210:2: ( ruleEnumerationLiteral )
            // InternalFSM.g:1211:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_5_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment"
    // InternalFSM.g:1220:1: rule__EnumerationLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFSM.g:1224:1: ( ( RULE_ID ) )
            // InternalFSM.g:1225:2: ( RULE_ID )
            {
            // InternalFSM.g:1225:2: ( RULE_ID )
            // InternalFSM.g:1226:3: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});

}