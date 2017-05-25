package org.xtext.example.mydsl3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl3.services.FSMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMParser extends AbstractInternalAntlrParser {
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

        public InternalFSMParser(TokenStream input, FSMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FSMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFSM.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFSM.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalFSM.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFSM.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_types_0_0= ruleEnumerationType ) )* ( (lv_fsm_1_0= ruleFSM ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_fsm_1_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:77:2: ( ( ( (lv_types_0_0= ruleEnumerationType ) )* ( (lv_fsm_1_0= ruleFSM ) )* ) )
            // InternalFSM.g:78:2: ( ( (lv_types_0_0= ruleEnumerationType ) )* ( (lv_fsm_1_0= ruleFSM ) )* )
            {
            // InternalFSM.g:78:2: ( ( (lv_types_0_0= ruleEnumerationType ) )* ( (lv_fsm_1_0= ruleFSM ) )* )
            // InternalFSM.g:79:3: ( (lv_types_0_0= ruleEnumerationType ) )* ( (lv_fsm_1_0= ruleFSM ) )*
            {
            // InternalFSM.g:79:3: ( (lv_types_0_0= ruleEnumerationType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFSM.g:80:4: (lv_types_0_0= ruleEnumerationType )
            	    {
            	    // InternalFSM.g:80:4: (lv_types_0_0= ruleEnumerationType )
            	    // InternalFSM.g:81:5: lv_types_0_0= ruleEnumerationType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTypesEnumerationTypeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleEnumerationType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_0_0,
            	    						"org.xtext.example.mydsl3.FSM.EnumerationType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFSM.g:98:3: ( (lv_fsm_1_0= ruleFSM ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFSM.g:99:4: (lv_fsm_1_0= ruleFSM )
            	    {
            	    // InternalFSM.g:99:4: (lv_fsm_1_0= ruleFSM )
            	    // InternalFSM.g:100:5: lv_fsm_1_0= ruleFSM
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFsmFSMParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_fsm_1_0=ruleFSM();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fsm",
            	    						lv_fsm_1_0,
            	    						"org.xtext.example.mydsl3.FSM.FSM");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFSM"
    // InternalFSM.g:121:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalFSM.g:121:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalFSM.g:122:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalFSM.g:128:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'type' ( ( ruleQualifiedID ) ) ( (lv_ownedState_4_0= ruleState ) )* otherlv_5= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedState_4_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:134:2: ( (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'type' ( ( ruleQualifiedID ) ) ( (lv_ownedState_4_0= ruleState ) )* otherlv_5= '}' ) )
            // InternalFSM.g:135:2: (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'type' ( ( ruleQualifiedID ) ) ( (lv_ownedState_4_0= ruleState ) )* otherlv_5= '}' )
            {
            // InternalFSM.g:135:2: (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'type' ( ( ruleQualifiedID ) ) ( (lv_ownedState_4_0= ruleState ) )* otherlv_5= '}' )
            // InternalFSM.g:136:3: otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'type' ( ( ruleQualifiedID ) ) ( (lv_ownedState_4_0= ruleState ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getTypeKeyword_2());
            		
            // InternalFSM.g:148:3: ( ( ruleQualifiedID ) )
            // InternalFSM.g:149:4: ( ruleQualifiedID )
            {
            // InternalFSM.g:149:4: ( ruleQualifiedID )
            // InternalFSM.g:150:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getTypeEnumerationTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:164:3: ( (lv_ownedState_4_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFSM.g:165:4: (lv_ownedState_4_0= ruleState )
            	    {
            	    // InternalFSM.g:165:4: (lv_ownedState_4_0= ruleState )
            	    // InternalFSM.g:166:5: lv_ownedState_4_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ownedState_4_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFSMRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedState",
            	    						lv_ownedState_4_0,
            	    						"org.xtext.example.mydsl3.FSM.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalFSM.g:191:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFSM.g:191:46: (iv_ruleState= ruleState EOF )
            // InternalFSM.g:192:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFSM.g:198:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' otherlv_1= '{' (otherlv_2= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')' )? otherlv_8= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_outgoingTransition_6_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:204:2: ( (otherlv_0= 'State' otherlv_1= '{' (otherlv_2= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')' )? otherlv_8= '}' ) )
            // InternalFSM.g:205:2: (otherlv_0= 'State' otherlv_1= '{' (otherlv_2= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')' )? otherlv_8= '}' )
            {
            // InternalFSM.g:205:2: (otherlv_0= 'State' otherlv_1= '{' (otherlv_2= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')' )? otherlv_8= '}' )
            // InternalFSM.g:206:3: otherlv_0= 'State' otherlv_1= '{' (otherlv_2= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFSM.g:214:3: (otherlv_2= 'literal' ( ( ruleQualifiedID ) ) )
            // InternalFSM.g:215:4: otherlv_2= 'literal' ( ( ruleQualifiedID ) )
            {
            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLiteralKeyword_2_0());
            			
            // InternalFSM.g:219:4: ( ( ruleQualifiedID ) )
            // InternalFSM.g:220:5: ( ruleQualifiedID )
            {
            // InternalFSM.g:220:5: ( ruleQualifiedID )
            // InternalFSM.g:221:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStateRule());
            						}
            					

            						newCompositeNode(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_10);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalFSM.g:236:3: (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFSM.g:237:4: otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) )* otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getTransitionsKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalFSM.g:245:4: ( (lv_outgoingTransition_6_0= ruleTransition ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFSM.g:246:5: (lv_outgoingTransition_6_0= ruleTransition )
                    	    {
                    	    // InternalFSM.g:246:5: (lv_outgoingTransition_6_0= ruleTransition )
                    	    // InternalFSM.g:247:6: lv_outgoingTransition_6_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_outgoingTransition_6_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outgoingTransition",
                    	    							lv_outgoingTransition_6_0,
                    	    							"org.xtext.example.mydsl3.FSM.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFSM.g:277:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFSM.g:277:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFSM.g:278:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFSM.g:284:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFSM.g:290:2: ( (otherlv_0= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalFSM.g:291:2: (otherlv_0= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalFSM.g:291:2: (otherlv_0= 'to' ( ( ruleQualifiedID ) ) )
            // InternalFSM.g:292:3: otherlv_0= 'to' ( ( ruleQualifiedID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getToKeyword_0());
            		
            // InternalFSM.g:296:3: ( ( ruleQualifiedID ) )
            // InternalFSM.g:297:4: ( ruleQualifiedID )
            {
            // InternalFSM.g:297:4: ( ruleQualifiedID )
            // InternalFSM.g:298:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalFSM.g:316:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalFSM.g:316:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalFSM.g:317:2: iv_ruleEnumerationType= ruleEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationType=ruleEnumerationType();

            state._fsp--;

             current =iv_ruleEnumerationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalFSM.g:323:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_literals_4_0 = null;

        EObject lv_literals_6_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:329:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' ) )
            // InternalFSM.g:330:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' )
            {
            // InternalFSM.g:330:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' )
            // InternalFSM.g:331:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalFSM.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFSM.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFSM.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalFSM.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFSM.g:361:3: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
            // InternalFSM.g:362:4: (lv_literals_4_0= ruleEnumerationLiteral )
            {
            // InternalFSM.g:362:4: (lv_literals_4_0= ruleEnumerationLiteral )
            // InternalFSM.g:363:5: lv_literals_4_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_literals_4_0=ruleEnumerationLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_4_0,
            						"org.xtext.example.mydsl3.FSM.EnumerationLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFSM.g:380:3: (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFSM.g:381:4: otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFSM.g:385:4: ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    // InternalFSM.g:386:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    {
            	    // InternalFSM.g:386:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    // InternalFSM.g:387:6: lv_literals_6_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_literals_6_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_6_0,
            	    							"org.xtext.example.mydsl3.FSM.EnumerationLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalFSM.g:413:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalFSM.g:413:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalFSM.g:414:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalFSM.g:420:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFSM.g:426:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFSM.g:427:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFSM.g:427:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFSM.g:428:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFSM.g:428:3: (lv_name_0_0= RULE_ID )
            // InternalFSM.g:429:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleQualifiedID"
    // InternalFSM.g:448:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalFSM.g:448:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalFSM.g:449:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalFSM.g:455:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;


        	enterRule();

        try {
            // InternalFSM.g:461:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID ) )
            // InternalFSM.g:462:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID )
            {
            // InternalFSM.g:462:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_QUALIFIED_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFSM.g:463:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFSM.g:471:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000401002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001100000L});

}