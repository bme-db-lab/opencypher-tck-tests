package ingraph.cucumber.featureresult.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureResultsLexer extends Lexer {
    public static final int RULE_ESCAPED_APOSTROPHE=11;
    public static final int RULE_IDENTIFIER=7;
    public static final int RULE_INFINITY=5;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_FLOAT=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_STRING_BODY=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalFeatureResultsLexer() {;} 
    public InternalFeatureResultsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureResultsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFeatureResults.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:11:7: ( '(' )
            // InternalFeatureResults.g:11:9: '('
            {
            match('('); 

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
            // InternalFeatureResults.g:12:7: ( ')' )
            // InternalFeatureResults.g:12:9: ')'
            {
            match(')'); 

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
            // InternalFeatureResults.g:13:7: ( '[' )
            // InternalFeatureResults.g:13:9: '['
            {
            match('['); 

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
            // InternalFeatureResults.g:14:7: ( ']' )
            // InternalFeatureResults.g:14:9: ']'
            {
            match(']'); 

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
            // InternalFeatureResults.g:15:7: ( '<' )
            // InternalFeatureResults.g:15:9: '<'
            {
            match('<'); 

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
            // InternalFeatureResults.g:16:7: ( '>' )
            // InternalFeatureResults.g:16:9: '>'
            {
            match('>'); 

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
            // InternalFeatureResults.g:17:7: ( '-' )
            // InternalFeatureResults.g:17:9: '-'
            {
            match('-'); 

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
            // InternalFeatureResults.g:18:7: ( '->' )
            // InternalFeatureResults.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:19:7: ( '<-' )
            // InternalFeatureResults.g:19:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:20:7: ( 'true' )
            // InternalFeatureResults.g:20:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:21:7: ( 'false' )
            // InternalFeatureResults.g:21:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:22:7: ( 'null' )
            // InternalFeatureResults.g:22:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:23:7: ( ',' )
            // InternalFeatureResults.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:24:7: ( '{' )
            // InternalFeatureResults.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:25:7: ( '}' )
            // InternalFeatureResults.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:26:7: ( ':' )
            // InternalFeatureResults.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:1429:12: ( ( RULE_INT )? '.' RULE_INT )
            // InternalFeatureResults.g:1429:14: ( RULE_INT )? '.' RULE_INT
            {
            // InternalFeatureResults.g:1429:14: ( RULE_INT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFeatureResults.g:1429:14: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_INFINITY"
    public final void mRULE_INFINITY() throws RecognitionException {
        try {
            int _type = RULE_INFINITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:1431:15: ( ( '-' )? 'Inf' )
            // InternalFeatureResults.g:1431:17: ( '-' )? 'Inf'
            {
            // InternalFeatureResults.g:1431:17: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeatureResults.g:1431:17: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            match("Inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INFINITY"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:1433:17: ( RULE_ID )
            // InternalFeatureResults.g:1433:19: RULE_ID
            {
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:1435:21: ( '\\'' ( RULE_STRING_BODY )* '\\'' )
            // InternalFeatureResults.g:1435:23: '\\'' ( RULE_STRING_BODY )* '\\''
            {
            match('\''); 
            // InternalFeatureResults.g:1435:28: ( RULE_STRING_BODY )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\u01FF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFeatureResults.g:1435:28: RULE_STRING_BODY
            	    {
            	    mRULE_STRING_BODY(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_STRING_BODY"
    public final void mRULE_STRING_BODY() throws RecognitionException {
        try {
            // InternalFeatureResults.g:1437:27: ( ( '\\u0000' .. '&' | '(' .. '\\u01FF' | RULE_ESCAPED_APOSTROPHE ) )
            // InternalFeatureResults.g:1437:29: ( '\\u0000' .. '&' | '(' .. '\\u01FF' | RULE_ESCAPED_APOSTROPHE )
            {
            // InternalFeatureResults.g:1437:29: ( '\\u0000' .. '&' | '(' .. '\\u01FF' | RULE_ESCAPED_APOSTROPHE )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='\u0000' && LA4_0<='&')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\\') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='\'') ) {
                    alt4=3;
                }
                else {
                    alt4=2;}
            }
            else if ( ((LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\u01FF')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureResults.g:1437:30: '\\u0000' .. '&'
                    {
                    matchRange('\u0000','&'); 

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:1437:44: '(' .. '\\u01FF'
                    {
                    matchRange('(','\u01FF'); 

                    }
                    break;
                case 3 :
                    // InternalFeatureResults.g:1437:58: RULE_ESCAPED_APOSTROPHE
                    {
                    mRULE_ESCAPED_APOSTROPHE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_BODY"

    // $ANTLR start "RULE_ESCAPED_APOSTROPHE"
    public final void mRULE_ESCAPED_APOSTROPHE() throws RecognitionException {
        try {
            // InternalFeatureResults.g:1439:34: ( '\\\\\\'' )
            // InternalFeatureResults.g:1439:36: '\\\\\\''
            {
            match("\\'"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_APOSTROPHE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // InternalFeatureResults.g:1441:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFeatureResults.g:1441:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFeatureResults.g:1441:20: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureResults.g:1441:20: '^'
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

            // InternalFeatureResults.g:1441:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFeatureResults.g:
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
            	    break loop6;
                }
            } while (true);


            }

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
            // InternalFeatureResults.g:1443:10: ( ( '0' .. '9' )+ )
            // InternalFeatureResults.g:1443:12: ( '0' .. '9' )+
            {
            // InternalFeatureResults.g:1443:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFeatureResults.g:1443:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalFeatureResults.g:1445:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFeatureResults.g:1445:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFeatureResults.g:1445:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureResults.g:1445:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFeatureResults.g:1445:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFeatureResults.g:1445:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFeatureResults.g:1445:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:1445:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFeatureResults.g:1445:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFeatureResults.g:1445:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFeatureResults.g:1445:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalFeatureResults.g:1447:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFeatureResults.g:1447:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFeatureResults.g:1447:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFeatureResults.g:1447:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalFeatureResults.g:1449:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFeatureResults.g:1449:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFeatureResults.g:1449:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFeatureResults.g:1449:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalFeatureResults.g:1449:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureResults.g:1449:41: ( '\\r' )? '\\n'
                    {
                    // InternalFeatureResults.g:1449:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalFeatureResults.g:1449:41: '\\r'
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
            // InternalFeatureResults.g:1451:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFeatureResults.g:1451:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFeatureResults.g:1451:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFeatureResults.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalFeatureResults.g:1453:16: ( . )
            // InternalFeatureResults.g:1453:18: .
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
        // InternalFeatureResults.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_FLOAT | RULE_INFINITY | RULE_IDENTIFIER | RULE_STRING_LITERAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=26;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalFeatureResults.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalFeatureResults.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalFeatureResults.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalFeatureResults.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalFeatureResults.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalFeatureResults.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalFeatureResults.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalFeatureResults.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalFeatureResults.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalFeatureResults.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalFeatureResults.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalFeatureResults.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalFeatureResults.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalFeatureResults.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalFeatureResults.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalFeatureResults.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalFeatureResults.g:1:106: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 18 :
                // InternalFeatureResults.g:1:117: RULE_INFINITY
                {
                mRULE_INFINITY(); 

                }
                break;
            case 19 :
                // InternalFeatureResults.g:1:131: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 20 :
                // InternalFeatureResults.g:1:147: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 21 :
                // InternalFeatureResults.g:1:167: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalFeatureResults.g:1:176: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalFeatureResults.g:1:188: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalFeatureResults.g:1:204: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalFeatureResults.g:1:220: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalFeatureResults.g:1:228: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\5\uffff\1\36\1\uffff\1\41\3\44\4\uffff\1\53\1\30\1\44\1\30\1\uffff\3\30\14\uffff\1\44\1\uffff\2\44\6\uffff\1\53\1\44\10\uffff\3\44\1\42\1\77\4\uffff\1\104\1\44\1\106\2\uffff\1\107\2\uffff";
    static final String DFA16_eofS =
        "\110\uffff";
    static final String DFA16_minS =
        "\1\0\4\uffff\1\55\1\uffff\1\76\1\162\1\141\1\165\4\uffff\1\56\1\60\1\156\1\101\1\uffff\2\0\1\52\14\uffff\1\165\1\uffff\2\154\6\uffff\1\56\1\146\3\0\5\uffff\1\145\1\163\1\154\1\60\4\0\1\uffff\1\60\1\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\4\uffff\1\55\1\uffff\1\111\1\162\1\141\1\165\4\uffff\2\71\1\156\1\172\1\uffff\2\uffff\1\57\14\uffff\1\165\1\uffff\2\154\6\uffff\1\71\1\146\3\uffff\5\uffff\1\145\1\163\1\154\1\172\4\uffff\1\uffff\1\172\1\145\1\172\2\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\4\uffff\1\15\1\16\1\17\1\20\4\uffff\1\23\3\uffff\1\31\1\32\1\1\1\2\1\3\1\4\1\11\1\5\1\6\1\10\1\7\1\22\1\uffff\1\23\2\uffff\1\15\1\16\1\17\1\20\1\25\1\21\5\uffff\1\24\1\26\1\27\1\30\1\31\10\uffff\1\24\3\uffff\1\24\1\12\1\uffff\1\14\1\13";
    static final String DFA16_specialS =
        "\1\5\23\uffff\1\11\1\0\31\uffff\1\4\1\7\1\6\11\uffff\1\1\1\2\1\10\1\3\11\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\25\4\30\1\24\1\1\1\2\2\30\1\13\1\7\1\20\1\26\12\17\1\16\1\30\1\5\1\30\1\6\2\30\10\23\1\21\21\23\1\3\1\30\1\4\1\22\1\23\1\30\5\23\1\11\7\23\1\12\5\23\1\10\6\23\1\14\1\30\1\15\uff82\30",
            "",
            "",
            "",
            "",
            "\1\35",
            "",
            "\1\40\12\uffff\1\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\55",
            "\12\54",
            "\1\56",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\47\57\1\62\64\61\1\60\u01a3\61\ufe00\63",
            "\0\63",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\55",
            "\1\72",
            "\47\57\1\62\64\61\1\60\u01a3\61\ufe00\63",
            "\47\74\1\73\64\76\1\75\u01a3\76\ufe00\63",
            "\47\57\1\62\64\61\1\60\u01a3\61\ufe00\63",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\47\57\1\62\64\61\1\60\u01a3\61\ufe00\63",
            "\47\57\1\62\64\61\1\60\u01a3\61\ufe00\63",
            "\47\57\1\103\64\61\1\60\u01a3\61\ufe00\63",
            "\47\57\1\62\64\61\1\60\u01a3\61\ufe00\63",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\105",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_FLOAT | RULE_INFINITY | RULE_IDENTIFIER | RULE_STRING_LITERAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_21 = input.LA(1);

                        s = -1;
                        if ( ((LA16_21>='\u0000' && LA16_21<='\uFFFF')) ) {s = 51;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_59 = input.LA(1);

                        s = -1;
                        if ( (LA16_59=='\'') ) {s = 50;}

                        else if ( ((LA16_59>='\u0000' && LA16_59<='&')) ) {s = 47;}

                        else if ( (LA16_59=='\\') ) {s = 48;}

                        else if ( ((LA16_59>='(' && LA16_59<='[')||(LA16_59>=']' && LA16_59<='\u01FF')) ) {s = 49;}

                        else if ( ((LA16_59>='\u0200' && LA16_59<='\uFFFF')) ) {s = 51;}

                        else s = 63;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_60 = input.LA(1);

                        s = -1;
                        if ( (LA16_60=='\'') ) {s = 50;}

                        else if ( (LA16_60=='\\') ) {s = 48;}

                        else if ( ((LA16_60>='\u0000' && LA16_60<='&')) ) {s = 47;}

                        else if ( ((LA16_60>='(' && LA16_60<='[')||(LA16_60>=']' && LA16_60<='\u01FF')) ) {s = 49;}

                        else if ( ((LA16_60>='\u0200' && LA16_60<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_62 = input.LA(1);

                        s = -1;
                        if ( (LA16_62=='\'') ) {s = 50;}

                        else if ( (LA16_62=='\\') ) {s = 48;}

                        else if ( ((LA16_62>='\u0000' && LA16_62<='&')) ) {s = 47;}

                        else if ( ((LA16_62>='(' && LA16_62<='[')||(LA16_62>=']' && LA16_62<='\u01FF')) ) {s = 49;}

                        else if ( ((LA16_62>='\u0200' && LA16_62<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_47 = input.LA(1);

                        s = -1;
                        if ( (LA16_47=='\'') ) {s = 50;}

                        else if ( (LA16_47=='\\') ) {s = 48;}

                        else if ( ((LA16_47>='\u0000' && LA16_47<='&')) ) {s = 47;}

                        else if ( ((LA16_47>='(' && LA16_47<='[')||(LA16_47>=']' && LA16_47<='\u01FF')) ) {s = 49;}

                        else if ( ((LA16_47>='\u0200' && LA16_47<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='(') ) {s = 1;}

                        else if ( (LA16_0==')') ) {s = 2;}

                        else if ( (LA16_0=='[') ) {s = 3;}

                        else if ( (LA16_0==']') ) {s = 4;}

                        else if ( (LA16_0=='<') ) {s = 5;}

                        else if ( (LA16_0=='>') ) {s = 6;}

                        else if ( (LA16_0=='-') ) {s = 7;}

                        else if ( (LA16_0=='t') ) {s = 8;}

                        else if ( (LA16_0=='f') ) {s = 9;}

                        else if ( (LA16_0=='n') ) {s = 10;}

                        else if ( (LA16_0==',') ) {s = 11;}

                        else if ( (LA16_0=='{') ) {s = 12;}

                        else if ( (LA16_0=='}') ) {s = 13;}

                        else if ( (LA16_0==':') ) {s = 14;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 15;}

                        else if ( (LA16_0=='.') ) {s = 16;}

                        else if ( (LA16_0=='I') ) {s = 17;}

                        else if ( (LA16_0=='^') ) {s = 18;}

                        else if ( ((LA16_0>='A' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='e')||(LA16_0>='g' && LA16_0<='m')||(LA16_0>='o' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 19;}

                        else if ( (LA16_0=='\'') ) {s = 20;}

                        else if ( (LA16_0=='\"') ) {s = 21;}

                        else if ( (LA16_0=='/') ) {s = 22;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 23;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||LA16_0==';'||LA16_0=='='||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_49 = input.LA(1);

                        s = -1;
                        if ( (LA16_49=='\'') ) {s = 50;}

                        else if ( (LA16_49=='\\') ) {s = 48;}

                        else if ( ((LA16_49>='\u0000' && LA16_49<='&')) ) {s = 47;}

                        else if ( ((LA16_49>='(' && LA16_49<='[')||(LA16_49>=']' && LA16_49<='\u01FF')) ) {s = 49;}

                        else if ( ((LA16_49>='\u0200' && LA16_49<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_48 = input.LA(1);

                        s = -1;
                        if ( (LA16_48=='\'') ) {s = 59;}

                        else if ( ((LA16_48>='\u0000' && LA16_48<='&')) ) {s = 60;}

                        else if ( (LA16_48=='\\') ) {s = 61;}

                        else if ( ((LA16_48>='\u0200' && LA16_48<='\uFFFF')) ) {s = 51;}

                        else if ( ((LA16_48>='(' && LA16_48<='[')||(LA16_48>=']' && LA16_48<='\u01FF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_61 = input.LA(1);

                        s = -1;
                        if ( (LA16_61=='\'') ) {s = 67;}

                        else if ( (LA16_61=='\\') ) {s = 48;}

                        else if ( ((LA16_61>='\u0000' && LA16_61<='&')) ) {s = 47;}

                        else if ( ((LA16_61>='(' && LA16_61<='[')||(LA16_61>=']' && LA16_61<='\u01FF')) ) {s = 49;}

                        else if ( ((LA16_61>='\u0200' && LA16_61<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_20 = input.LA(1);

                        s = -1;
                        if ( ((LA16_20>='\u0000' && LA16_20<='&')) ) {s = 47;}

                        else if ( (LA16_20=='\\') ) {s = 48;}

                        else if ( ((LA16_20>='(' && LA16_20<='[')||(LA16_20>=']' && LA16_20<='\u01FF')) ) {s = 49;}

                        else if ( (LA16_20=='\'') ) {s = 50;}

                        else if ( ((LA16_20>='\u0200' && LA16_20<='\uFFFF')) ) {s = 51;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}