package org.xtext.comp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalWhLexer() {;} 
    public InternalWhLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWh.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:11:7: ( 'TODO' )
            // InternalWh.g:11:9: 'TODO'
            {
            match("TODO"); 


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
            // InternalWh.g:12:7: ( 'nil' )
            // InternalWh.g:12:9: 'nil'
            {
            match("nil"); 


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
            // InternalWh.g:13:7: ( 'function' )
            // InternalWh.g:13:9: 'function'
            {
            match("function"); 


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
            // InternalWh.g:14:7: ( ':' )
            // InternalWh.g:14:9: ':'
            {
            match(':'); 

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
            // InternalWh.g:15:7: ( 'read' )
            // InternalWh.g:15:9: 'read'
            {
            match("read"); 


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
            // InternalWh.g:16:7: ( '%' )
            // InternalWh.g:16:9: '%'
            {
            match('%'); 

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
            // InternalWh.g:17:7: ( 'write' )
            // InternalWh.g:17:9: 'write'
            {
            match("write"); 


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
            // InternalWh.g:18:7: ( ',' )
            // InternalWh.g:18:9: ','
            {
            match(','); 

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
            // InternalWh.g:19:7: ( ';' )
            // InternalWh.g:19:9: ';'
            {
            match(';'); 

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
            // InternalWh.g:20:7: ( ':=' )
            // InternalWh.g:20:9: ':='
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
            // InternalWh.g:21:7: ( '(' )
            // InternalWh.g:21:9: '('
            {
            match('('); 

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
            // InternalWh.g:22:7: ( 'cons' )
            // InternalWh.g:22:9: 'cons'
            {
            match("cons"); 


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
            // InternalWh.g:23:7: ( ')' )
            // InternalWh.g:23:9: ')'
            {
            match(')'); 

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
            // InternalWh.g:24:7: ( 'nop' )
            // InternalWh.g:24:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1872:15: ( 'A' .. 'Z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )? )
            // InternalWh.g:1872:17: 'A' .. 'Z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )?
            {
            matchRange('A','Z'); 
            // InternalWh.g:1872:26: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:
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

            // InternalWh.g:1872:56: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='&'||LA4_0=='+'||(LA4_0>='-' && LA4_0<='/')||LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWh.g:1872:57: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    {
            	    // InternalWh.g:1872:57: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='-') ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1=='>') ) {
            	            alt2=2;
            	        }
            	        else if ( ((LA2_1>='0' && LA2_1<='9')||(LA2_1>='A' && LA2_1<='Z')||(LA2_1>='a' && LA2_1<='z')) ) {
            	            alt2=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 2, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA2_0=='&'||LA2_0=='+'||(LA2_0>='.' && LA2_0<='/')||LA2_0=='_') ) {
            	        alt2=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalWh.g:1872:58: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalWh.g:1872:84: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalWh.g:1872:90: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalWh.g:
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
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalWh.g:1872:122: ( '?' | '!' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='!'||LA5_0=='?') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWh.g:
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

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1874:13: ( 'a' .. 'z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )? )
            // InternalWh.g:1874:15: 'a' .. 'z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )?
            {
            matchRange('a','z'); 
            // InternalWh.g:1874:24: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWh.g:
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
            	    break loop6;
                }
            } while (true);

            // InternalWh.g:1874:54: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='&'||LA9_0=='+'||(LA9_0>='-' && LA9_0<='/')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWh.g:1874:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    {
            	    // InternalWh.g:1874:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0=='-') ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1=='>') ) {
            	            alt7=2;
            	        }
            	        else if ( ((LA7_1>='0' && LA7_1<='9')||(LA7_1>='A' && LA7_1<='Z')||(LA7_1>='a' && LA7_1<='z')) ) {
            	            alt7=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA7_0=='&'||LA7_0=='+'||(LA7_0>='.' && LA7_0<='/')||LA7_0=='_') ) {
            	        alt7=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalWh.g:1874:56: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalWh.g:1874:82: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalWh.g:1874:88: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalWh.g:
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
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalWh.g:1874:120: ( '?' | '!' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='!'||LA10_0=='?') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWh.g:
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
            // InternalWh.g:1876:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWh.g:1876:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWh.g:1876:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWh.g:1876:11: '^'
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

            // InternalWh.g:1876:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWh.g:
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
            	    break loop12;
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
            // InternalWh.g:1878:10: ( ( '0' .. '9' )+ )
            // InternalWh.g:1878:12: ( '0' .. '9' )+
            {
            // InternalWh.g:1878:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWh.g:1878:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalWh.g:1880:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWh.g:1880:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWh.g:1880:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalWh.g:1880:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWh.g:1880:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalWh.g:1880:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWh.g:1880:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWh.g:1880:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWh.g:1880:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalWh.g:1880:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWh.g:1880:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalWh.g:1882:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWh.g:1882:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWh.g:1882:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWh.g:1882:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalWh.g:1884:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWh.g:1884:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWh.g:1884:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWh.g:1884:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // InternalWh.g:1884:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalWh.g:1884:41: ( '\\r' )? '\\n'
                    {
                    // InternalWh.g:1884:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalWh.g:1884:41: '\\r'
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
            // InternalWh.g:1886:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWh.g:1886:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWh.g:1886:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWh.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // InternalWh.g:1888:16: ( . )
            // InternalWh.g:1888:18: .
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
        // InternalWh.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_VARIABLE | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=23;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalWh.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalWh.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalWh.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalWh.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalWh.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalWh.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalWh.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalWh.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalWh.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalWh.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalWh.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalWh.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalWh.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalWh.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalWh.g:1:94: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 16 :
                // InternalWh.g:1:108: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 17 :
                // InternalWh.g:1:120: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalWh.g:1:128: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalWh.g:1:137: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalWh.g:1:149: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalWh.g:1:165: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalWh.g:1:181: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalWh.g:1:189: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\31\2\36\1\42\1\36\1\uffff\1\36\3\uffff\1\36\1\uffff\1\31\1\36\1\26\2\uffff\3\26\2\uffff\2\31\1\uffff\1\53\3\36\1\uffff\1\53\1\36\2\uffff\1\36\1\uffff\1\36\3\uffff\1\36\7\uffff\2\31\1\73\1\74\5\36\1\101\2\uffff\1\36\1\103\1\36\1\105\1\uffff\1\36\1\uffff\1\107\1\uffff\1\36\1\uffff\1\36\1\112\1\uffff";
    static final String DFA22_eofS =
        "\113\uffff";
    static final String DFA22_minS =
        "\1\0\3\60\1\75\1\60\1\uffff\1\60\3\uffff\1\60\1\uffff\2\60\1\101\2\uffff\2\0\1\52\2\uffff\2\60\1\uffff\4\60\1\uffff\2\60\2\uffff\1\60\1\uffff\1\60\3\uffff\1\60\7\uffff\2\60\2\41\5\60\1\41\2\uffff\1\60\1\41\1\60\1\41\1\uffff\1\60\1\uffff\1\41\1\uffff\1\60\1\uffff\1\60\1\41\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\3\172\1\75\1\172\1\uffff\1\172\3\uffff\1\172\1\uffff\3\172\2\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\4\172\1\uffff\2\172\2\uffff\1\172\1\uffff\1\172\3\uffff\1\172\7\uffff\12\172\2\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA22_acceptS =
        "\6\uffff\1\6\1\uffff\1\10\1\11\1\13\1\uffff\1\15\3\uffff\1\21\1\22\3\uffff\1\26\1\27\2\uffff\1\17\4\uffff\1\20\2\uffff\1\12\1\4\1\uffff\1\6\1\uffff\1\10\1\11\1\13\1\uffff\1\15\1\21\1\22\1\23\1\24\1\25\1\26\12\uffff\1\2\1\16\4\uffff\1\1\1\uffff\1\5\1\uffff\1\14\1\uffff\1\7\2\uffff\1\3";
    static final String DFA22_specialS =
        "\1\1\21\uffff\1\0\1\2\67\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\2\26\1\6\1\26\1\23\1\12\1\14\2\26\1\10\2\26\1\24\12\21\1\4\1\11\5\26\23\15\1\1\6\15\3\26\1\17\1\20\1\26\2\16\1\13\2\16\1\3\7\16\1\2\3\16\1\5\4\16\1\7\3\16\uff85\26",
            "\12\30\7\uffff\16\30\1\27\13\30\4\uffff\1\32\1\uffff\32\30",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\10\35\1\33\5\35\1\34\13\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\24\35\1\40\5\35",
            "\1\41",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\4\35\1\43\25\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\21\35\1\45\10\35",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\16\35\1\51\13\35",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\32\1\uffff\32\30",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\12\30\7\uffff\3\30\1\61\26\30\4\uffff\1\32\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\32\1\uffff\32\30",
            "",
            "\12\62\7\uffff\32\62\6\uffff\32\62",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\13\35\1\63\16\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\17\35\1\64\12\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "",
            "\12\65\7\uffff\32\65\6\uffff\32\65",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\15\35\1\66\14\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\1\67\31\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\10\35\1\70\21\35",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\15\35\1\71\14\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\16\30\1\72\13\30\4\uffff\1\32\1\uffff\32\30",
            "\12\62\7\uffff\32\62\4\uffff\1\32\1\uffff\32\62",
            "\1\36\4\uffff\1\36\4\uffff\1\36\1\uffff\3\36\12\35\5\uffff\1\36\1\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "\1\36\4\uffff\1\36\4\uffff\1\36\1\uffff\3\36\12\35\5\uffff\1\36\1\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "\12\65\7\uffff\32\65\4\uffff\1\37\1\uffff\32\65",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\2\35\1\75\27\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\3\35\1\76\26\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\23\35\1\77\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\22\35\1\100\7\35",
            "\1\31\4\uffff\1\31\4\uffff\1\31\1\uffff\3\31\12\30\5\uffff\1\31\1\uffff\32\30\4\uffff\1\32\1\uffff\32\30",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\23\35\1\102\6\35",
            "\1\36\4\uffff\1\36\4\uffff\1\36\1\uffff\3\36\12\35\5\uffff\1\36\1\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\4\35\1\104\25\35",
            "\1\36\4\uffff\1\36\4\uffff\1\36\1\uffff\3\36\12\35\5\uffff\1\36\1\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\10\35\1\106\21\35",
            "",
            "\1\36\4\uffff\1\36\4\uffff\1\36\1\uffff\3\36\12\35\5\uffff\1\36\1\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\16\35\1\110\13\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\37\1\uffff\15\35\1\111\14\35",
            "\1\36\4\uffff\1\36\4\uffff\1\36\1\uffff\3\36\12\35\5\uffff\1\36\1\uffff\32\35\4\uffff\1\37\1\uffff\32\35",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_VARIABLE | RULE_SYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_18 = input.LA(1);

                        s = -1;
                        if ( ((LA22_18>='\u0000' && LA22_18<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='T') ) {s = 1;}

                        else if ( (LA22_0=='n') ) {s = 2;}

                        else if ( (LA22_0=='f') ) {s = 3;}

                        else if ( (LA22_0==':') ) {s = 4;}

                        else if ( (LA22_0=='r') ) {s = 5;}

                        else if ( (LA22_0=='%') ) {s = 6;}

                        else if ( (LA22_0=='w') ) {s = 7;}

                        else if ( (LA22_0==',') ) {s = 8;}

                        else if ( (LA22_0==';') ) {s = 9;}

                        else if ( (LA22_0=='(') ) {s = 10;}

                        else if ( (LA22_0=='c') ) {s = 11;}

                        else if ( (LA22_0==')') ) {s = 12;}

                        else if ( ((LA22_0>='A' && LA22_0<='S')||(LA22_0>='U' && LA22_0<='Z')) ) {s = 13;}

                        else if ( ((LA22_0>='a' && LA22_0<='b')||(LA22_0>='d' && LA22_0<='e')||(LA22_0>='g' && LA22_0<='m')||(LA22_0>='o' && LA22_0<='q')||(LA22_0>='s' && LA22_0<='v')||(LA22_0>='x' && LA22_0<='z')) ) {s = 14;}

                        else if ( (LA22_0=='^') ) {s = 15;}

                        else if ( (LA22_0=='_') ) {s = 16;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 17;}

                        else if ( (LA22_0=='\"') ) {s = 18;}

                        else if ( (LA22_0=='\'') ) {s = 19;}

                        else if ( (LA22_0=='/') ) {s = 20;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 21;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='$')||LA22_0=='&'||(LA22_0>='*' && LA22_0<='+')||(LA22_0>='-' && LA22_0<='.')||(LA22_0>='<' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_19 = input.LA(1);

                        s = -1;
                        if ( ((LA22_19>='\u0000' && LA22_19<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}