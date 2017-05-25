package org.xtext.example.mydsl3.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMLexer extends Lexer {
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

    public InternalFSMLexer() {;} 
    public InternalFSMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFSMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFSM.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:11:7: ( 'FSM' )
            // InternalFSM.g:11:9: 'FSM'
            {
            match("FSM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:12:7: ( '{' )
            // InternalFSM.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:13:7: ( 'type' )
            // InternalFSM.g:13:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:14:7: ( '}' )
            // InternalFSM.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:15:7: ( 'State' )
            // InternalFSM.g:15:9: 'State'
            {
            match("State"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:16:7: ( 'literal' )
            // InternalFSM.g:16:9: 'literal'
            {
            match("literal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:17:7: ( 'transitions' )
            // InternalFSM.g:17:9: 'transitions'
            {
            match("transitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:18:7: ( '(' )
            // InternalFSM.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:19:7: ( ')' )
            // InternalFSM.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:20:7: ( 'to' )
            // InternalFSM.g:20:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:21:7: ( 'EnumerationType' )
            // InternalFSM.g:21:9: 'EnumerationType'
            {
            match("EnumerationType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:22:7: ( 'literals' )
            // InternalFSM.g:22:9: 'literals'
            {
            match("literals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:23:7: ( ',' )
            // InternalFSM.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_QUALIFIED_ID"
    public final void mRULE_QUALIFIED_ID() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1235:19: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )* )
            // InternalFSM.g:1235:21: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )*
            {
            // InternalFSM.g:1235:21: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFSM.g:1235:21: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFSM.g:1235:50: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFSM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFSM.g:1235:112: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFSM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalFSM.g:1235:146: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFSM.g:1235:147: '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            	    {
            	    match('.'); 
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    // InternalFSM.g:1235:175: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalFSM.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIED_ID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1237:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFSM.g:1237:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFSM.g:1237:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFSM.g:1237:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFSM.g:1237:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFSM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1239:10: ( ( '0' .. '9' )+ )
            // InternalFSM.g:1239:12: ( '0' .. '9' )+
            {
            // InternalFSM.g:1239:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFSM.g:1239:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1241:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFSM.g:1241:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFSM.g:1241:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFSM.g:1241:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFSM.g:1241:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFSM.g:1241:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFSM.g:1241:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFSM.g:1241:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFSM.g:1241:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalFSM.g:1241:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFSM.g:1241:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1243:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFSM.g:1243:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFSM.g:1243:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFSM.g:1243:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1245:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFSM.g:1245:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFSM.g:1245:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFSM.g:1245:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalFSM.g:1245:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFSM.g:1245:41: ( '\\r' )? '\\n'
                    {
                    // InternalFSM.g:1245:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalFSM.g:1245:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1247:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFSM.g:1247:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFSM.g:1247:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFSM.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFSM.g:1249:16: ( . )
            // InternalFSM.g:1249:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalFSM.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_QUALIFIED_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=21;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalFSM.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalFSM.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalFSM.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalFSM.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalFSM.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalFSM.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalFSM.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalFSM.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalFSM.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalFSM.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalFSM.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalFSM.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalFSM.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalFSM.g:1:88: RULE_QUALIFIED_ID
                {
                mRULE_QUALIFIED_ID(); 

                }
                break;
            case 15 :
                // InternalFSM.g:1:106: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalFSM.g:1:114: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // InternalFSM.g:1:123: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // InternalFSM.g:1:135: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // InternalFSM.g:1:151: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // InternalFSM.g:1:167: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // InternalFSM.g:1:175: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\25\1\uffff\1\25\1\uffff\2\25\2\uffff\1\25\1\uffff\1\22\1\25\1\uffff\3\22\2\uffff\2\25\3\uffff\2\25\1\53\1\uffff\2\25\2\uffff\1\25\1\uffff\1\25\5\uffff\1\57\2\25\1\uffff\3\25\1\uffff\1\65\4\25\1\uffff\1\25\1\73\3\25\1\uffff\3\25\1\103\2\25\1\106\1\uffff\2\25\1\uffff\3\25\1\114\1\25\1\uffff\3\25\1\121\1\uffff";
    static final String DFA17_eofS =
        "\122\uffff";
    static final String DFA17_minS =
        "\1\0\1\56\1\uffff\1\56\1\uffff\2\56\2\uffff\1\56\1\uffff\1\101\1\56\1\uffff\2\0\1\52\2\uffff\2\56\3\uffff\3\56\1\uffff\2\56\2\uffff\1\56\1\uffff\1\56\5\uffff\3\56\1\uffff\3\56\1\uffff\5\56\1\uffff\5\56\1\uffff\7\56\1\uffff\2\56\1\uffff\5\56\1\uffff\4\56\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\1\172\1\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\2\172\3\uffff\3\172\1\uffff\2\172\2\uffff\1\172\1\uffff\1\172\5\uffff\3\172\1\uffff\3\172\1\uffff\5\172\1\uffff\5\172\1\uffff\7\172\1\uffff\2\172\1\uffff\5\172\1\uffff\4\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\10\1\11\1\uffff\1\15\2\uffff\1\20\3\uffff\1\24\1\25\2\uffff\1\17\1\16\1\2\3\uffff\1\4\2\uffff\1\10\1\11\1\uffff\1\15\1\uffff\1\20\1\21\1\22\1\23\1\24\3\uffff\1\12\3\uffff\1\1\5\uffff\1\3\5\uffff\1\5\7\uffff\1\6\2\uffff\1\14\5\uffff\1\7\4\uffff\1\13";
    static final String DFA17_specialS =
        "\1\0\15\uffff\1\1\1\2\102\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\1\7\1\10\2\22\1\12\2\22\1\20\12\15\7\22\4\14\1\11\1\1\14\14\1\5\7\14\3\22\1\13\1\14\1\22\13\14\1\6\7\14\1\3\6\14\1\2\1\22\1\4\uff82\22",
            "\1\26\1\uffff\12\24\7\uffff\22\24\1\23\7\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\16\24\1\32\2\24\1\31\6\24\1\30\1\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\23\24\1\34\6\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\10\24\1\35\21\24",
            "",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\40\14\24",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\0\44",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\26\1\uffff\12\24\7\uffff\14\24\1\50\15\24\4\uffff\1\24\1\uffff\32\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\17\24\1\51\12\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\1\52\31\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\1\54\31\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\23\24\1\55\6\24",
            "",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\24\24\1\56\5\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\60\25\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\61\14\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\23\24\1\62\6\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\63\25\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\14\24\1\64\15\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\22\24\1\66\7\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\67\25\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\21\24\1\70\10\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\71\25\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\10\24\1\72\21\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\1\74\31\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\21\24\1\75\10\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\23\24\1\76\6\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\13\24\1\77\16\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\1\100\31\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\10\24\1\101\21\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\22\24\1\102\7\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\23\24\1\104\6\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\16\24\1\105\13\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\10\24\1\107\21\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\110\14\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\16\24\1\111\13\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\22\24\1\112\7\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\113\14\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\26\1\uffff\12\24\7\uffff\23\24\1\115\6\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\30\24\1\116\1\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\17\24\1\117\12\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\120\25\24",
            "\1\26\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_QUALIFIED_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='F') ) {s = 1;}

                        else if ( (LA17_0=='{') ) {s = 2;}

                        else if ( (LA17_0=='t') ) {s = 3;}

                        else if ( (LA17_0=='}') ) {s = 4;}

                        else if ( (LA17_0=='S') ) {s = 5;}

                        else if ( (LA17_0=='l') ) {s = 6;}

                        else if ( (LA17_0=='(') ) {s = 7;}

                        else if ( (LA17_0==')') ) {s = 8;}

                        else if ( (LA17_0=='E') ) {s = 9;}

                        else if ( (LA17_0==',') ) {s = 10;}

                        else if ( (LA17_0=='^') ) {s = 11;}

                        else if ( ((LA17_0>='A' && LA17_0<='D')||(LA17_0>='G' && LA17_0<='R')||(LA17_0>='T' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='k')||(LA17_0>='m' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 12;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 13;}

                        else if ( (LA17_0=='\"') ) {s = 14;}

                        else if ( (LA17_0=='\'') ) {s = 15;}

                        else if ( (LA17_0=='/') ) {s = 16;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 17;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='*' && LA17_0<='+')||(LA17_0>='-' && LA17_0<='.')||(LA17_0>=':' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_14 = input.LA(1);

                        s = -1;
                        if ( ((LA17_14>='\u0000' && LA17_14<='\uFFFF')) ) {s = 36;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_15 = input.LA(1);

                        s = -1;
                        if ( ((LA17_15>='\u0000' && LA17_15<='\uFFFF')) ) {s = 36;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}