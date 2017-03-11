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
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_INFINITY=5;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=7;
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
    public static final int RULE_INTEGER_LITERAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
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

    // $ANTLR start "RULE_INTEGER_LITERAL"
    public final void mRULE_INTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:1372:22: ( RULE_INT )
            // InternalFeatureResults.g:1372:24: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_LITERAL"

    // $ANTLR start "RULE_INFINITY"
    public final void mRULE_INFINITY() throws RecognitionException {
        try {
            int _type = RULE_INFINITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFeatureResults.g:1374:15: ( ( '-' )? 'Inf' )
            // InternalFeatureResults.g:1374:17: ( '-' )? 'Inf'
            {
            // InternalFeatureResults.g:1374:17: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFeatureResults.g:1374:17: '-'
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
            // InternalFeatureResults.g:1376:17: ( RULE_ID )
            // InternalFeatureResults.g:1376:19: RULE_ID
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
            // InternalFeatureResults.g:1378:21: ( '\\'' ( RULE_STRING_BODY )* '\\'' )
            // InternalFeatureResults.g:1378:23: '\\'' ( RULE_STRING_BODY )* '\\''
            {
            match('\''); 
            // InternalFeatureResults.g:1378:28: ( RULE_STRING_BODY )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\u01FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFeatureResults.g:1378:28: RULE_STRING_BODY
            	    {
            	    mRULE_STRING_BODY(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalFeatureResults.g:1380:27: ( ( '\\u0000' .. '&' | '(' .. '\\u01FF' | RULE_ESCAPED_APOSTROPHE ) )
            // InternalFeatureResults.g:1380:29: ( '\\u0000' .. '&' | '(' .. '\\u01FF' | RULE_ESCAPED_APOSTROPHE )
            {
            // InternalFeatureResults.g:1380:29: ( '\\u0000' .. '&' | '(' .. '\\u01FF' | RULE_ESCAPED_APOSTROPHE )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='\u0000' && LA3_0<='&')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='\\') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='\'') ) {
                    alt3=3;
                }
                else {
                    alt3=2;}
            }
            else if ( ((LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\u01FF')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureResults.g:1380:30: '\\u0000' .. '&'
                    {
                    matchRange('\u0000','&'); 

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:1380:44: '(' .. '\\u01FF'
                    {
                    matchRange('(','\u01FF'); 

                    }
                    break;
                case 3 :
                    // InternalFeatureResults.g:1380:58: RULE_ESCAPED_APOSTROPHE
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
            // InternalFeatureResults.g:1382:34: ( '\\\\\\'' )
            // InternalFeatureResults.g:1382:36: '\\\\\\''
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
            // InternalFeatureResults.g:1384:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFeatureResults.g:1384:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFeatureResults.g:1384:20: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureResults.g:1384:20: '^'
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

            // InternalFeatureResults.g:1384:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // InternalFeatureResults.g:1386:10: ( ( '0' .. '9' )+ )
            // InternalFeatureResults.g:1386:12: ( '0' .. '9' )+
            {
            // InternalFeatureResults.g:1386:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFeatureResults.g:1386:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalFeatureResults.g:1388:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFeatureResults.g:1388:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFeatureResults.g:1388:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureResults.g:1388:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFeatureResults.g:1388:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFeatureResults.g:1388:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFeatureResults.g:1388:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:1388:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFeatureResults.g:1388:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFeatureResults.g:1388:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFeatureResults.g:1388:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalFeatureResults.g:1390:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFeatureResults.g:1390:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFeatureResults.g:1390:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFeatureResults.g:1390:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalFeatureResults.g:1392:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFeatureResults.g:1392:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFeatureResults.g:1392:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFeatureResults.g:1392:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalFeatureResults.g:1392:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureResults.g:1392:41: ( '\\r' )? '\\n'
                    {
                    // InternalFeatureResults.g:1392:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFeatureResults.g:1392:41: '\\r'
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
            // InternalFeatureResults.g:1394:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFeatureResults.g:1394:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFeatureResults.g:1394:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalFeatureResults.g:1396:16: ( . )
            // InternalFeatureResults.g:1396:18: .
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
        // InternalFeatureResults.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_INTEGER_LITERAL | RULE_INFINITY | RULE_IDENTIFIER | RULE_STRING_LITERAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=26;
        alt15 = dfa15.predict(input);
        switch (alt15) {
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
                // InternalFeatureResults.g:1:106: RULE_INTEGER_LITERAL
                {
                mRULE_INTEGER_LITERAL(); 

                }
                break;
            case 18 :
                // InternalFeatureResults.g:1:127: RULE_INFINITY
                {
                mRULE_INFINITY(); 

                }
                break;
            case 19 :
                // InternalFeatureResults.g:1:141: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 20 :
                // InternalFeatureResults.g:1:157: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 21 :
                // InternalFeatureResults.g:1:177: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalFeatureResults.g:1:186: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalFeatureResults.g:1:198: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalFeatureResults.g:1:214: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalFeatureResults.g:1:230: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalFeatureResults.g:1:238: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\5\uffff\1\35\1\uffff\1\41\3\43\4\uffff\1\52\1\43\1\27\1\uffff\3\27\14\uffff\1\43\1\uffff\2\43\5\uffff\1\52\1\43\10\uffff\3\43\1\40\1\75\4\uffff\1\102\1\43\1\104\2\uffff\1\105\2\uffff";
    static final String DFA15_eofS =
        "\106\uffff";
    static final String DFA15_minS =
        "\1\0\4\uffff\1\55\1\uffff\1\76\1\162\1\141\1\165\4\uffff\1\60\1\156\1\101\1\uffff\2\0\1\52\14\uffff\1\165\1\uffff\2\154\5\uffff\1\60\1\146\3\0\5\uffff\1\145\1\163\1\154\1\60\4\0\1\uffff\1\60\1\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\4\uffff\1\55\1\uffff\1\111\1\162\1\141\1\165\4\uffff\1\71\1\156\1\172\1\uffff\2\uffff\1\57\14\uffff\1\165\1\uffff\2\154\5\uffff\1\71\1\146\3\uffff\5\uffff\1\145\1\163\1\154\1\172\4\uffff\1\uffff\1\172\1\145\1\172\2\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\4\uffff\1\15\1\16\1\17\1\20\3\uffff\1\23\3\uffff\1\31\1\32\1\1\1\2\1\3\1\4\1\11\1\5\1\6\1\10\1\22\1\7\1\uffff\1\23\2\uffff\1\15\1\16\1\17\1\20\1\21\5\uffff\1\24\1\26\1\27\1\30\1\31\10\uffff\1\24\3\uffff\1\24\1\12\1\uffff\1\14\1\13";
    static final String DFA15_specialS =
        "\1\10\22\uffff\1\4\1\5\30\uffff\1\2\1\6\1\3\11\uffff\1\11\1\0\1\7\1\1\11\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\24\4\27\1\23\1\1\1\2\2\27\1\13\1\7\1\27\1\25\12\17\1\16\1\27\1\5\1\27\1\6\2\27\10\22\1\20\21\22\1\3\1\27\1\4\1\21\1\22\1\27\5\22\1\11\7\22\1\12\5\22\1\10\6\22\1\14\1\27\1\15\uff82\27",
            "",
            "",
            "",
            "",
            "\1\34",
            "",
            "\1\37\12\uffff\1\40",
            "\1\42",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "",
            "\12\53",
            "\1\54",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\47\55\1\60\64\57\1\56\u01a3\57\ufe00\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
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
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "\12\53",
            "\1\70",
            "\47\55\1\60\64\57\1\56\u01a3\57\ufe00\61",
            "\47\72\1\71\64\74\1\73\u01a3\74\ufe00\61",
            "\47\55\1\60\64\57\1\56\u01a3\57\ufe00\61",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\47\55\1\60\64\57\1\56\u01a3\57\ufe00\61",
            "\47\55\1\60\64\57\1\56\u01a3\57\ufe00\61",
            "\47\55\1\101\64\57\1\56\u01a3\57\ufe00\61",
            "\47\55\1\60\64\57\1\56\u01a3\57\ufe00\61",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\103",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_INTEGER_LITERAL | RULE_INFINITY | RULE_IDENTIFIER | RULE_STRING_LITERAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_58 = input.LA(1);

                        s = -1;
                        if ( (LA15_58=='\'') ) {s = 48;}

                        else if ( ((LA15_58>='\u0000' && LA15_58<='&')) ) {s = 45;}

                        else if ( (LA15_58=='\\') ) {s = 46;}

                        else if ( ((LA15_58>='(' && LA15_58<='[')||(LA15_58>=']' && LA15_58<='\u01FF')) ) {s = 47;}

                        else if ( ((LA15_58>='\u0200' && LA15_58<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_60 = input.LA(1);

                        s = -1;
                        if ( (LA15_60=='\'') ) {s = 48;}

                        else if ( ((LA15_60>='\u0000' && LA15_60<='&')) ) {s = 45;}

                        else if ( (LA15_60=='\\') ) {s = 46;}

                        else if ( ((LA15_60>='(' && LA15_60<='[')||(LA15_60>=']' && LA15_60<='\u01FF')) ) {s = 47;}

                        else if ( ((LA15_60>='\u0200' && LA15_60<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_45 = input.LA(1);

                        s = -1;
                        if ( (LA15_45=='\'') ) {s = 48;}

                        else if ( (LA15_45=='\\') ) {s = 46;}

                        else if ( ((LA15_45>='\u0000' && LA15_45<='&')) ) {s = 45;}

                        else if ( ((LA15_45>='(' && LA15_45<='[')||(LA15_45>=']' && LA15_45<='\u01FF')) ) {s = 47;}

                        else if ( ((LA15_45>='\u0200' && LA15_45<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_47 = input.LA(1);

                        s = -1;
                        if ( (LA15_47=='\'') ) {s = 48;}

                        else if ( (LA15_47=='\\') ) {s = 46;}

                        else if ( ((LA15_47>='\u0000' && LA15_47<='&')) ) {s = 45;}

                        else if ( ((LA15_47>='(' && LA15_47<='[')||(LA15_47>=']' && LA15_47<='\u01FF')) ) {s = 47;}

                        else if ( ((LA15_47>='\u0200' && LA15_47<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_19 = input.LA(1);

                        s = -1;
                        if ( ((LA15_19>='\u0000' && LA15_19<='&')) ) {s = 45;}

                        else if ( (LA15_19=='\\') ) {s = 46;}

                        else if ( ((LA15_19>='(' && LA15_19<='[')||(LA15_19>=']' && LA15_19<='\u01FF')) ) {s = 47;}

                        else if ( (LA15_19=='\'') ) {s = 48;}

                        else if ( ((LA15_19>='\u0200' && LA15_19<='\uFFFF')) ) {s = 49;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_20 = input.LA(1);

                        s = -1;
                        if ( ((LA15_20>='\u0000' && LA15_20<='\uFFFF')) ) {s = 49;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_46 = input.LA(1);

                        s = -1;
                        if ( (LA15_46=='\'') ) {s = 57;}

                        else if ( ((LA15_46>='\u0000' && LA15_46<='&')) ) {s = 58;}

                        else if ( (LA15_46=='\\') ) {s = 59;}

                        else if ( ((LA15_46>='\u0200' && LA15_46<='\uFFFF')) ) {s = 49;}

                        else if ( ((LA15_46>='(' && LA15_46<='[')||(LA15_46>=']' && LA15_46<='\u01FF')) ) {s = 60;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_59 = input.LA(1);

                        s = -1;
                        if ( (LA15_59=='\'') ) {s = 65;}

                        else if ( ((LA15_59>='\u0000' && LA15_59<='&')) ) {s = 45;}

                        else if ( (LA15_59=='\\') ) {s = 46;}

                        else if ( ((LA15_59>='(' && LA15_59<='[')||(LA15_59>=']' && LA15_59<='\u01FF')) ) {s = 47;}

                        else if ( ((LA15_59>='\u0200' && LA15_59<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='(') ) {s = 1;}

                        else if ( (LA15_0==')') ) {s = 2;}

                        else if ( (LA15_0=='[') ) {s = 3;}

                        else if ( (LA15_0==']') ) {s = 4;}

                        else if ( (LA15_0=='<') ) {s = 5;}

                        else if ( (LA15_0=='>') ) {s = 6;}

                        else if ( (LA15_0=='-') ) {s = 7;}

                        else if ( (LA15_0=='t') ) {s = 8;}

                        else if ( (LA15_0=='f') ) {s = 9;}

                        else if ( (LA15_0=='n') ) {s = 10;}

                        else if ( (LA15_0==',') ) {s = 11;}

                        else if ( (LA15_0=='{') ) {s = 12;}

                        else if ( (LA15_0=='}') ) {s = 13;}

                        else if ( (LA15_0==':') ) {s = 14;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 15;}

                        else if ( (LA15_0=='I') ) {s = 16;}

                        else if ( (LA15_0=='^') ) {s = 17;}

                        else if ( ((LA15_0>='A' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='m')||(LA15_0>='o' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 18;}

                        else if ( (LA15_0=='\'') ) {s = 19;}

                        else if ( (LA15_0=='\"') ) {s = 20;}

                        else if ( (LA15_0=='/') ) {s = 21;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 22;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='.'||LA15_0==';'||LA15_0=='='||(LA15_0>='?' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_57 = input.LA(1);

                        s = -1;
                        if ( (LA15_57=='\'') ) {s = 48;}

                        else if ( ((LA15_57>='\u0000' && LA15_57<='&')) ) {s = 45;}

                        else if ( (LA15_57=='\\') ) {s = 46;}

                        else if ( ((LA15_57>='(' && LA15_57<='[')||(LA15_57>=']' && LA15_57<='\u01FF')) ) {s = 47;}

                        else if ( ((LA15_57>='\u0200' && LA15_57<='\uFFFF')) ) {s = 49;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}