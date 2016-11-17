package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_LC=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'function' )
            // InternalMyDsl.g:11:9: 'function'
            {
            match("function"); 


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
            // InternalMyDsl.g:12:7: ( ':' )
            // InternalMyDsl.g:12:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:13:7: ( 'read' )
            // InternalMyDsl.g:13:9: 'read'
            {
            match("read"); 


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
            // InternalMyDsl.g:14:7: ( '%' )
            // InternalMyDsl.g:14:9: '%'
            {
            match('%'); 

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
            // InternalMyDsl.g:15:7: ( 'write' )
            // InternalMyDsl.g:15:9: 'write'
            {
            match("write"); 


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
            // InternalMyDsl.g:16:7: ( ',' )
            // InternalMyDsl.g:16:9: ','
            {
            match(','); 

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
            // InternalMyDsl.g:17:7: ( ';' )
            // InternalMyDsl.g:17:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:18:7: ( 'nop' )
            // InternalMyDsl.g:18:9: 'nop'
            {
            match("nop"); 


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
            // InternalMyDsl.g:19:7: ( ':=' )
            // InternalMyDsl.g:19:9: ':='
            {
            match(":="); 


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
            // InternalMyDsl.g:20:7: ( 'while' )
            // InternalMyDsl.g:20:9: 'while'
            {
            match("while"); 


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
            // InternalMyDsl.g:21:7: ( 'do' )
            // InternalMyDsl.g:21:9: 'do'
            {
            match("do"); 


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
            // InternalMyDsl.g:22:7: ( 'od' )
            // InternalMyDsl.g:22:9: 'od'
            {
            match("od"); 


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
            // InternalMyDsl.g:23:7: ( 'if' )
            // InternalMyDsl.g:23:9: 'if'
            {
            match("if"); 


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
            // InternalMyDsl.g:24:7: ( 'then' )
            // InternalMyDsl.g:24:9: 'then'
            {
            match("then"); 


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
            // InternalMyDsl.g:25:7: ( 'else' )
            // InternalMyDsl.g:25:9: 'else'
            {
            match("else"); 


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
            // InternalMyDsl.g:26:7: ( 'fi' )
            // InternalMyDsl.g:26:9: 'fi'
            {
            match("fi"); 


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
            // InternalMyDsl.g:27:7: ( 'for' )
            // InternalMyDsl.g:27:9: 'for'
            {
            match("for"); 


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
            // InternalMyDsl.g:28:7: ( 'foreach' )
            // InternalMyDsl.g:28:9: 'foreach'
            {
            match("foreach"); 


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
            // InternalMyDsl.g:29:7: ( 'in' )
            // InternalMyDsl.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'nil' )
            // InternalMyDsl.g:30:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( '(' )
            // InternalMyDsl.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'cons' )
            // InternalMyDsl.g:32:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( ')' )
            // InternalMyDsl.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'list' )
            // InternalMyDsl.g:34:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'hd' )
            // InternalMyDsl.g:35:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'tl' )
            // InternalMyDsl.g:36:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'and' )
            // InternalMyDsl.g:37:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'or' )
            // InternalMyDsl.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'not' )
            // InternalMyDsl.g:39:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( '=?' )
            // InternalMyDsl.g:40:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1569:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
            // InternalMyDsl.g:1569:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('A','Z'); 
            // InternalMyDsl.g:1569:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:1569:56: ( '!' | '?' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='!'||LA2_0=='?') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_LC"
    public final void mRULE_LC() throws RecognitionException {
        try {
            int _type = RULE_LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1571:9: ( ( ' ' | '\\n' | '\\t' | '\\r\\n' ) )
            // InternalMyDsl.g:1571:11: ( ' ' | '\\n' | '\\t' | '\\r\\n' )
            {
            // InternalMyDsl.g:1571:11: ( ' ' | '\\n' | '\\t' | '\\r\\n' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt3=1;
                }
                break;
            case '\n':
                {
                alt3=2;
                }
                break;
            case '\t':
                {
                alt3=3;
                }
                break;
            case '\r':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1571:12: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1571:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1571:21: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1571:26: '\\r\\n'
                    {
                    match("\r\n"); 


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
    // $ANTLR end "RULE_LC"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1573:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
            // InternalMyDsl.g:1573:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // InternalMyDsl.g:1573:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            // InternalMyDsl.g:1573:54: ( '!' | '?' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='!'||LA5_0=='?') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1575:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1575:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1575:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1575:11: '^'
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

            // InternalMyDsl.g:1575:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            // InternalMyDsl.g:1577:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1577:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1577:12: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:1577:13: '0' .. '9'
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
            // InternalMyDsl.g:1579:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1579:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1579:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMyDsl.g:1579:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1579:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyDsl.g:1579:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1579:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMyDsl.g:1579:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1579:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyDsl.g:1579:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1579:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMyDsl.g:1581:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1581:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1581:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyDsl.g:1581:52: .
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
            // InternalMyDsl.g:1583:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1583:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1583:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1583:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyDsl.g:1583:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1583:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1583:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:1583:41: '\\r'
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
            // InternalMyDsl.g:1585:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1585:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1585:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMyDsl.g:
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
            // InternalMyDsl.g:1587:16: ( . )
            // InternalMyDsl.g:1587:18: .
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
        // InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_LC | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=40;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:204: RULE_LC
                {
                mRULE_LC(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:212: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:224: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:232: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:241: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:253: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:269: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:285: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:293: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\46\1\51\1\46\1\uffff\1\46\2\uffff\6\46\1\uffff\1\46\1\uffff\3\46\1\41\1\102\3\103\1\104\1\46\1\41\2\uffff\3\41\1\uffff\1\46\1\113\2\46\4\uffff\1\46\1\uffff\2\46\2\uffff\2\46\1\123\1\124\1\125\1\126\1\127\1\46\1\131\1\46\1\uffff\1\46\1\uffff\1\46\1\135\1\46\1\uffff\1\102\3\uffff\1\103\4\uffff\1\46\1\uffff\1\141\3\46\1\145\1\146\1\147\5\uffff\1\46\1\uffff\3\46\1\uffff\1\154\2\46\1\uffff\1\157\2\46\3\uffff\1\162\1\163\1\164\1\165\1\uffff\2\46\1\uffff\1\170\1\171\4\uffff\2\46\2\uffff\1\46\1\175\1\176\2\uffff";
    static final String DFA17_eofS =
        "\177\uffff";
    static final String DFA17_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\6\60\1\uffff\1\60\1\uffff\3\60\1\77\1\60\3\11\1\12\1\60\1\101\2\uffff\2\0\1\52\1\uffff\1\60\1\41\2\60\4\uffff\1\60\1\uffff\2\60\2\uffff\2\60\5\41\1\60\1\41\1\60\1\uffff\1\60\1\uffff\1\60\1\41\1\60\1\uffff\1\60\3\uffff\1\11\4\uffff\1\60\1\uffff\1\41\3\60\3\41\5\uffff\1\60\1\uffff\3\60\1\uffff\1\41\2\60\1\uffff\1\41\2\60\3\uffff\4\41\1\uffff\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\77\1\172\3\40\1\12\2\172\2\uffff\2\uffff\1\57\1\uffff\4\172\4\uffff\1\172\1\uffff\2\172\2\uffff\12\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\3\uffff\1\40\4\uffff\1\172\1\uffff\7\172\5\uffff\1\172\1\uffff\3\172\1\uffff\3\172\1\uffff\3\172\3\uffff\4\172\1\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\25\1\uffff\1\27\13\uffff\1\42\1\43\3\uffff\1\50\4\uffff\1\41\1\42\1\11\1\2\1\uffff\1\4\2\uffff\1\6\1\7\12\uffff\1\25\1\uffff\1\27\3\uffff\1\36\1\uffff\1\37\1\40\1\47\1\uffff\1\43\1\44\1\45\1\46\1\uffff\1\20\7\uffff\1\13\1\14\1\34\1\15\1\23\1\uffff\1\32\3\uffff\1\31\3\uffff\1\21\3\uffff\1\10\1\35\1\24\4\uffff\1\33\2\uffff\1\3\2\uffff\1\16\1\17\1\26\1\30\2\uffff\1\5\1\12\3\uffff\1\22\1\1";
    static final String DFA17_specialS =
        "\1\1\35\uffff\1\0\1\2\137\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\41\1\30\1\27\2\41\1\31\22\41\1\26\1\41\1\36\2\41\1\4\1\41\1\37\1\16\1\20\2\41\1\6\2\41\1\40\12\35\1\2\1\7\1\41\1\24\3\41\32\25\3\41\1\33\1\34\1\41\1\23\1\32\1\17\1\11\1\15\1\1\1\32\1\22\1\13\2\32\1\21\1\32\1\10\1\12\2\32\1\3\1\32\1\14\2\32\1\5\3\32\uff85\41",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\10\45\1\43\5\45\1\44\5\45\1\42\5\45",
            "\1\50",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\4\45\1\52\25\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\7\45\1\55\11\45\1\54\10\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\10\45\1\61\5\45\1\60\13\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\16\45\1\62\13\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\3\45\1\63\15\45\1\64\10\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\5\45\1\65\7\45\1\66\14\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\7\45\1\67\3\45\1\70\16\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\13\45\1\71\16\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\16\45\1\73\13\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\10\45\1\75\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\3\45\1\76\26\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\15\45\1\77\14\45",
            "\1\100",
            "\12\101\7\uffff\32\101\4\uffff\1\47\1\uffff\32\101",
            "\2\104\2\uffff\1\104\22\uffff\1\104",
            "\2\104\2\uffff\1\104\22\uffff\1\104",
            "\2\104\2\uffff\1\104\22\uffff\1\104",
            "\1\105",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\107",
            "\0\107",
            "\1\110\4\uffff\1\111",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\15\45\1\112\14\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\21\45\1\114\10\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\1\115\31\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\10\45\1\116\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\10\45\1\117\21\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\17\45\1\120\3\45\1\121\6\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\13\45\1\122\16\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\4\45\1\130\25\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\22\45\1\132\7\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\15\45\1\133\14\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\22\45\1\134\7\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\3\45\1\136\26\45",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\47\1\uffff\32\101",
            "",
            "",
            "",
            "\2\104\2\uffff\1\104\22\uffff\1\104",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\2\45\1\137\27\45",
            "",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\4\45\1\140\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\3\45\1\142\26\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\23\45\1\143\6\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\13\45\1\144\16\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\15\45\1\150\14\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\4\45\1\151\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\22\45\1\152\7\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\23\45\1\153\6\45",
            "",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\23\45\1\155\6\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\1\156\31\45",
            "",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\4\45\1\160\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\4\45\1\161\25\45",
            "",
            "",
            "",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\10\45\1\166\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\2\45\1\167\27\45",
            "",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\16\45\1\172\13\45",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\7\45\1\173\22\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\47\1\uffff\15\45\1\174\14\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "\1\46\16\uffff\12\45\5\uffff\1\46\1\uffff\32\45\4\uffff\1\47\1\uffff\32\45",
            "",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_LC | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_30 = input.LA(1);

                        s = -1;
                        if ( ((LA17_30>='\u0000' && LA17_30<='\uFFFF')) ) {s = 71;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='f') ) {s = 1;}

                        else if ( (LA17_0==':') ) {s = 2;}

                        else if ( (LA17_0=='r') ) {s = 3;}

                        else if ( (LA17_0=='%') ) {s = 4;}

                        else if ( (LA17_0=='w') ) {s = 5;}

                        else if ( (LA17_0==',') ) {s = 6;}

                        else if ( (LA17_0==';') ) {s = 7;}

                        else if ( (LA17_0=='n') ) {s = 8;}

                        else if ( (LA17_0=='d') ) {s = 9;}

                        else if ( (LA17_0=='o') ) {s = 10;}

                        else if ( (LA17_0=='i') ) {s = 11;}

                        else if ( (LA17_0=='t') ) {s = 12;}

                        else if ( (LA17_0=='e') ) {s = 13;}

                        else if ( (LA17_0=='(') ) {s = 14;}

                        else if ( (LA17_0=='c') ) {s = 15;}

                        else if ( (LA17_0==')') ) {s = 16;}

                        else if ( (LA17_0=='l') ) {s = 17;}

                        else if ( (LA17_0=='h') ) {s = 18;}

                        else if ( (LA17_0=='a') ) {s = 19;}

                        else if ( (LA17_0=='=') ) {s = 20;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')) ) {s = 21;}

                        else if ( (LA17_0==' ') ) {s = 22;}

                        else if ( (LA17_0=='\n') ) {s = 23;}

                        else if ( (LA17_0=='\t') ) {s = 24;}

                        else if ( (LA17_0=='\r') ) {s = 25;}

                        else if ( (LA17_0=='b'||LA17_0=='g'||(LA17_0>='j' && LA17_0<='k')||LA17_0=='m'||(LA17_0>='p' && LA17_0<='q')||LA17_0=='s'||(LA17_0>='u' && LA17_0<='v')||(LA17_0>='x' && LA17_0<='z')) ) {s = 26;}

                        else if ( (LA17_0=='^') ) {s = 27;}

                        else if ( (LA17_0=='_') ) {s = 28;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 29;}

                        else if ( (LA17_0=='\"') ) {s = 30;}

                        else if ( (LA17_0=='\'') ) {s = 31;}

                        else if ( (LA17_0=='/') ) {s = 32;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='$')||LA17_0=='&'||(LA17_0>='*' && LA17_0<='+')||(LA17_0>='-' && LA17_0<='.')||LA17_0=='<'||(LA17_0>='>' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_31 = input.LA(1);

                        s = -1;
                        if ( ((LA17_31>='\u0000' && LA17_31<='\uFFFF')) ) {s = 71;}

                        else s = 33;

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