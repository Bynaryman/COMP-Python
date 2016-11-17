package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LC", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_name_0_0= ruleProgramme ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_name_0_0= ruleProgramme ) ) )
            // InternalMyDsl.g:78:2: ( (lv_name_0_0= ruleProgramme ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_name_0_0= ruleProgramme ) )
            // InternalMyDsl.g:79:3: (lv_name_0_0= ruleProgramme )
            {
            // InternalMyDsl.g:79:3: (lv_name_0_0= ruleProgramme )
            // InternalMyDsl.g:80:4: lv_name_0_0= ruleProgramme
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getNameProgrammeParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleProgramme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getModelRule());
              				}
              				add(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.xtext.example.mydsl.MyDsl.Programme");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:100:1: entryRuleProgramme returns [String current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final String entryRuleProgramme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProgramme = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalMyDsl.g:101:2: iv_ruleProgramme= ruleProgramme EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgrammeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgramme.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:107:1: ruleProgramme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Fonction_0= ruleFonction )* ;
    public final AntlrDatatypeRuleToken ruleProgramme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Fonction_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Fonction_0= ruleFonction )* )
            // InternalMyDsl.g:114:2: (this_Fonction_0= ruleFonction )*
            {
            // InternalMyDsl.g:114:2: (this_Fonction_0= ruleFonction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:115:3: this_Fonction_0= ruleFonction
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getProgrammeAccess().getFonctionParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_3);
            	    this_Fonction_0=ruleFonction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Fonction_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleFonction"
    // InternalMyDsl.g:129:1: entryRuleFonction returns [String current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final String entryRuleFonction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFonction = null;


        try {
            // InternalMyDsl.g:129:48: (iv_ruleFonction= ruleFonction EOF )
            // InternalMyDsl.g:130:2: iv_ruleFonction= ruleFonction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFonctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFonction=ruleFonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFonction.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // InternalMyDsl.g:136:1: ruleFonction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'function' this_LC_1= RULE_LC this_SYMBOL_2= RULE_SYMBOL kw= ':' this_LC_4= RULE_LC this_Definition_5= ruleDefinition ) ;
    public final AntlrDatatypeRuleToken ruleFonction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        Token this_SYMBOL_2=null;
        Token this_LC_4=null;
        AntlrDatatypeRuleToken this_Definition_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:142:2: ( (kw= 'function' this_LC_1= RULE_LC this_SYMBOL_2= RULE_SYMBOL kw= ':' this_LC_4= RULE_LC this_Definition_5= ruleDefinition ) )
            // InternalMyDsl.g:143:2: (kw= 'function' this_LC_1= RULE_LC this_SYMBOL_2= RULE_SYMBOL kw= ':' this_LC_4= RULE_LC this_Definition_5= ruleDefinition )
            {
            // InternalMyDsl.g:143:2: (kw= 'function' this_LC_1= RULE_LC this_SYMBOL_2= RULE_SYMBOL kw= ':' this_LC_4= RULE_LC this_Definition_5= ruleDefinition )
            // InternalMyDsl.g:144:3: kw= 'function' this_LC_1= RULE_LC this_SYMBOL_2= RULE_SYMBOL kw= ':' this_LC_4= RULE_LC this_Definition_5= ruleDefinition
            {
            kw=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFonctionAccess().getFunctionKeyword_0());
              		
            }
            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_1, grammarAccess.getFonctionAccess().getLCTerminalRuleCall_1());
              		
            }
            this_SYMBOL_2=(Token)match(input,RULE_SYMBOL,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SYMBOL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SYMBOL_2, grammarAccess.getFonctionAccess().getSYMBOLTerminalRuleCall_2());
              		
            }
            kw=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFonctionAccess().getColonKeyword_3());
              		
            }
            this_LC_4=(Token)match(input,RULE_LC,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_4, grammarAccess.getFonctionAccess().getLCTerminalRuleCall_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFonctionAccess().getDefinitionParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_Definition_5=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Definition_5);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:189:1: entryRuleDefinition returns [String current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final String entryRuleDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:189:50: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:190:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:196:1: ruleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'read' this_LC_1= RULE_LC this_Input_2= ruleInput this_LC_3= RULE_LC kw= '%' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= '%' this_LC_9= RULE_LC kw= 'write' this_LC_11= RULE_LC this_Output_12= ruleOutput ) ;
    public final AntlrDatatypeRuleToken ruleDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        Token this_LC_3=null;
        Token this_LC_5=null;
        Token this_LC_7=null;
        Token this_LC_9=null;
        Token this_LC_11=null;
        AntlrDatatypeRuleToken this_Input_2 = null;

        AntlrDatatypeRuleToken this_Commands_6 = null;

        AntlrDatatypeRuleToken this_Output_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:202:2: ( (kw= 'read' this_LC_1= RULE_LC this_Input_2= ruleInput this_LC_3= RULE_LC kw= '%' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= '%' this_LC_9= RULE_LC kw= 'write' this_LC_11= RULE_LC this_Output_12= ruleOutput ) )
            // InternalMyDsl.g:203:2: (kw= 'read' this_LC_1= RULE_LC this_Input_2= ruleInput this_LC_3= RULE_LC kw= '%' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= '%' this_LC_9= RULE_LC kw= 'write' this_LC_11= RULE_LC this_Output_12= ruleOutput )
            {
            // InternalMyDsl.g:203:2: (kw= 'read' this_LC_1= RULE_LC this_Input_2= ruleInput this_LC_3= RULE_LC kw= '%' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= '%' this_LC_9= RULE_LC kw= 'write' this_LC_11= RULE_LC this_Output_12= ruleOutput )
            // InternalMyDsl.g:204:3: kw= 'read' this_LC_1= RULE_LC this_Input_2= ruleInput this_LC_3= RULE_LC kw= '%' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= '%' this_LC_9= RULE_LC kw= 'write' this_LC_11= RULE_LC this_Output_12= ruleOutput
            {
            kw=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_1, grammarAccess.getDefinitionAccess().getLCTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getInputParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_Input_2=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Input_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_3, grammarAccess.getDefinitionAccess().getLCTerminalRuleCall_3());
              		
            }
            kw=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            this_LC_5=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_5, grammarAccess.getDefinitionAccess().getLCTerminalRuleCall_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_Commands_6=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Commands_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_7=(Token)match(input,RULE_LC,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_7);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_7, grammarAccess.getDefinitionAccess().getLCTerminalRuleCall_7());
              		
            }
            kw=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefinitionAccess().getPercentSignKeyword_8());
              		
            }
            this_LC_9=(Token)match(input,RULE_LC,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_9);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_9, grammarAccess.getDefinitionAccess().getLCTerminalRuleCall_9());
              		
            }
            kw=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDefinitionAccess().getWriteKeyword_10());
              		
            }
            this_LC_11=(Token)match(input,RULE_LC,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_11);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_11, grammarAccess.getDefinitionAccess().getLCTerminalRuleCall_11());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getOutputParserRuleCall_12());
              		
            }
            pushFollow(FOLLOW_2);
            this_Output_12=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Output_12);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalMyDsl.g:300:1: entryRuleInput returns [String current=null] : iv_ruleInput= ruleInput EOF ;
    public final String entryRuleInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInput = null;


        try {
            // InternalMyDsl.g:300:45: (iv_ruleInput= ruleInput EOF )
            // InternalMyDsl.g:301:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalMyDsl.g:307:1: ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* ) ;
    public final AntlrDatatypeRuleToken ruleInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token kw=null;
        Token this_LC_2=null;
        Token this_VARIABLE_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:313:2: ( (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* ) )
            // InternalMyDsl.g:314:2: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* )
            {
            // InternalMyDsl.g:314:2: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* )
            // InternalMyDsl.g:315:3: this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )*
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VARIABLE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_VARIABLE_0, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:322:3: (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:323:4: kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE
            	    {
            	    kw=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_LC_2=(Token)match(input,RULE_LC,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_2, grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1());
            	      			
            	    }
            	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VARIABLE_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_VARIABLE_3, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalMyDsl.g:347:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // InternalMyDsl.g:347:46: (iv_ruleOutput= ruleOutput EOF )
            // InternalMyDsl.g:348:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalMyDsl.g:354:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* ) ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token kw=null;
        Token this_LC_2=null;
        Token this_VARIABLE_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:360:2: ( (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* ) )
            // InternalMyDsl.g:361:2: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* )
            {
            // InternalMyDsl.g:361:2: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )* )
            // InternalMyDsl.g:362:3: this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )*
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VARIABLE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_VARIABLE_0, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:369:3: (kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:370:4: kw= ',' this_LC_2= RULE_LC this_VARIABLE_3= RULE_VARIABLE
            	    {
            	    kw=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_LC_2=(Token)match(input,RULE_LC,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_2, grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1());
            	      			
            	    }
            	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VARIABLE_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_VARIABLE_3, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalMyDsl.g:394:1: entryRuleCommands returns [String current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final String entryRuleCommands() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommands = null;


        try {
            // InternalMyDsl.g:394:48: (iv_ruleCommands= ruleCommands EOF )
            // InternalMyDsl.g:395:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalMyDsl.g:401:1: ruleCommands returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Command_0= ruleCommand (kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand )* ) ;
    public final AntlrDatatypeRuleToken ruleCommands() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_2=null;
        AntlrDatatypeRuleToken this_Command_0 = null;

        AntlrDatatypeRuleToken this_Command_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:407:2: ( (this_Command_0= ruleCommand (kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand )* ) )
            // InternalMyDsl.g:408:2: (this_Command_0= ruleCommand (kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand )* )
            {
            // InternalMyDsl.g:408:2: (this_Command_0= ruleCommand (kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand )* )
            // InternalMyDsl.g:409:3: this_Command_0= ruleCommand (kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommandsAccess().getCommandParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_Command_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Command_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:419:3: (kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:420:4: kw= ';' this_LC_2= RULE_LC this_Command_3= ruleCommand
            	    {
            	    kw=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    this_LC_2=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_2, grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCommandsAccess().getCommandParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_13);
            	    this_Command_3=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Command_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:447:1: entryRuleCommand returns [String current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final String entryRuleCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:447:47: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:448:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:454:1: ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'nop' )=>kw= 'nop' ) | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( ( 'while' )=>this_While_4= ruleWhile ) | ( ( 'if' )=>this_Ifelse_5= ruleIfelse ) | ( ( 'for' )=>this_For_6= ruleFor ) | ( ( 'foreach' )=>this_Foreach_7= ruleForeach ) ) ;
    public final AntlrDatatypeRuleToken ruleCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Vars_1 = null;

        AntlrDatatypeRuleToken this_Exprs_3 = null;

        AntlrDatatypeRuleToken this_While_4 = null;

        AntlrDatatypeRuleToken this_Ifelse_5 = null;

        AntlrDatatypeRuleToken this_For_6 = null;

        AntlrDatatypeRuleToken this_Foreach_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:460:2: ( ( ( ( 'nop' )=>kw= 'nop' ) | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( ( 'while' )=>this_While_4= ruleWhile ) | ( ( 'if' )=>this_Ifelse_5= ruleIfelse ) | ( ( 'for' )=>this_For_6= ruleFor ) | ( ( 'foreach' )=>this_Foreach_7= ruleForeach ) ) )
            // InternalMyDsl.g:461:2: ( ( ( 'nop' )=>kw= 'nop' ) | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( ( 'while' )=>this_While_4= ruleWhile ) | ( ( 'if' )=>this_Ifelse_5= ruleIfelse ) | ( ( 'for' )=>this_For_6= ruleFor ) | ( ( 'foreach' )=>this_Foreach_7= ruleForeach ) )
            {
            // InternalMyDsl.g:461:2: ( ( ( 'nop' )=>kw= 'nop' ) | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( ( 'while' )=>this_While_4= ruleWhile ) | ( ( 'if' )=>this_Ifelse_5= ruleIfelse ) | ( ( 'for' )=>this_For_6= ruleFor ) | ( ( 'foreach' )=>this_Foreach_7= ruleForeach ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) && (synpred1_InternalMyDsl())) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_VARIABLE) ) {
                alt5=2;
            }
            else if ( (LA5_0==23) && (synpred2_InternalMyDsl())) {
                alt5=3;
            }
            else if ( (LA5_0==26) && (synpred3_InternalMyDsl())) {
                alt5=4;
            }
            else if ( (LA5_0==30) && (synpred4_InternalMyDsl())) {
                alt5=5;
            }
            else if ( (LA5_0==31) && (synpred5_InternalMyDsl())) {
                alt5=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:462:3: ( ( 'nop' )=>kw= 'nop' )
                    {
                    // InternalMyDsl.g:462:3: ( ( 'nop' )=>kw= 'nop' )
                    // InternalMyDsl.g:463:4: ( 'nop' )=>kw= 'nop'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommandAccess().getNopKeyword_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:471:3: (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs )
                    {
                    // InternalMyDsl.g:471:3: (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs )
                    // InternalMyDsl.g:472:4: this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Vars_1=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Vars_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getExprsParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Exprs_3=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exprs_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:499:3: ( ( 'while' )=>this_While_4= ruleWhile )
                    {
                    // InternalMyDsl.g:499:3: ( ( 'while' )=>this_While_4= ruleWhile )
                    // InternalMyDsl.g:500:4: ( 'while' )=>this_While_4= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getWhileParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_While_4=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_While_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:513:3: ( ( 'if' )=>this_Ifelse_5= ruleIfelse )
                    {
                    // InternalMyDsl.g:513:3: ( ( 'if' )=>this_Ifelse_5= ruleIfelse )
                    // InternalMyDsl.g:514:4: ( 'if' )=>this_Ifelse_5= ruleIfelse
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getIfelseParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Ifelse_5=ruleIfelse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ifelse_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:527:3: ( ( 'for' )=>this_For_6= ruleFor )
                    {
                    // InternalMyDsl.g:527:3: ( ( 'for' )=>this_For_6= ruleFor )
                    // InternalMyDsl.g:528:4: ( 'for' )=>this_For_6= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getForParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_For_6=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_For_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:541:3: ( ( 'foreach' )=>this_Foreach_7= ruleForeach )
                    {
                    // InternalMyDsl.g:541:3: ( ( 'foreach' )=>this_Foreach_7= ruleForeach )
                    // InternalMyDsl.g:542:4: ( 'foreach' )=>this_Foreach_7= ruleForeach
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getForeachParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Foreach_7=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Foreach_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleWhile"
    // InternalMyDsl.g:558:1: entryRuleWhile returns [String current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final String entryRuleWhile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWhile = null;


        try {
            // InternalMyDsl.g:558:45: (iv_ruleWhile= ruleWhile EOF )
            // InternalMyDsl.g:559:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalMyDsl.g:565:1: ruleWhile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'while' )=>kw= 'while' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' ) ;
    public final AntlrDatatypeRuleToken ruleWhile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        Token this_LC_3=null;
        Token this_LC_5=null;
        Token this_LC_7=null;
        AntlrDatatypeRuleToken this_Expr_2 = null;

        AntlrDatatypeRuleToken this_Commands_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:571:2: ( ( ( ( 'while' )=>kw= 'while' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' ) )
            // InternalMyDsl.g:572:2: ( ( ( 'while' )=>kw= 'while' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' )
            {
            // InternalMyDsl.g:572:2: ( ( ( 'while' )=>kw= 'while' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' )
            // InternalMyDsl.g:573:3: ( ( 'while' )=>kw= 'while' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od'
            {
            // InternalMyDsl.g:573:3: ( ( 'while' )=>kw= 'while' )
            // InternalMyDsl.g:574:4: ( 'while' )=>kw= 'while'
            {
            kw=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getWhileAccess().getWhileKeyword_0());
              			
            }

            }

            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_1, grammarAccess.getWhileAccess().getLCTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileAccess().getExprParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_Expr_2=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_3, grammarAccess.getWhileAccess().getLCTerminalRuleCall_3());
              		
            }
            kw=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getWhileAccess().getDoKeyword_4());
              		
            }
            this_LC_5=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_5, grammarAccess.getWhileAccess().getLCTerminalRuleCall_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileAccess().getCommandsParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_Commands_6=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Commands_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_7=(Token)match(input,RULE_LC,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_7);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_7, grammarAccess.getWhileAccess().getLCTerminalRuleCall_7());
              		
            }
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getWhileAccess().getOdKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleIfelse"
    // InternalMyDsl.g:643:1: entryRuleIfelse returns [String current=null] : iv_ruleIfelse= ruleIfelse EOF ;
    public final String entryRuleIfelse() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfelse = null;


        try {
            // InternalMyDsl.g:643:46: (iv_ruleIfelse= ruleIfelse EOF )
            // InternalMyDsl.g:644:2: iv_ruleIfelse= ruleIfelse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfelseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfelse=ruleIfelse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfelse.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfelse"


    // $ANTLR start "ruleIfelse"
    // InternalMyDsl.g:650:1: ruleIfelse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'if' )=>kw= 'if' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'then' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC ( (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' ) | kw= 'fi' ) ) ;
    public final AntlrDatatypeRuleToken ruleIfelse() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        Token this_LC_3=null;
        Token this_LC_5=null;
        Token this_LC_7=null;
        Token this_LC_9=null;
        Token this_LC_11=null;
        AntlrDatatypeRuleToken this_Expr_2 = null;

        AntlrDatatypeRuleToken this_Commands_6 = null;

        AntlrDatatypeRuleToken this_Commands_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:656:2: ( ( ( ( 'if' )=>kw= 'if' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'then' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC ( (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' ) | kw= 'fi' ) ) )
            // InternalMyDsl.g:657:2: ( ( ( 'if' )=>kw= 'if' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'then' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC ( (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' ) | kw= 'fi' ) )
            {
            // InternalMyDsl.g:657:2: ( ( ( 'if' )=>kw= 'if' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'then' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC ( (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' ) | kw= 'fi' ) )
            // InternalMyDsl.g:658:3: ( ( 'if' )=>kw= 'if' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'then' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC ( (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' ) | kw= 'fi' )
            {
            // InternalMyDsl.g:658:3: ( ( 'if' )=>kw= 'if' )
            // InternalMyDsl.g:659:4: ( 'if' )=>kw= 'if'
            {
            kw=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getIfelseAccess().getIfKeyword_0());
              			
            }

            }

            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_1, grammarAccess.getIfelseAccess().getLCTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfelseAccess().getExprParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_Expr_2=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_3, grammarAccess.getIfelseAccess().getLCTerminalRuleCall_3());
              		
            }
            kw=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIfelseAccess().getThenKeyword_4());
              		
            }
            this_LC_5=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_5, grammarAccess.getIfelseAccess().getLCTerminalRuleCall_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfelseAccess().getCommandsParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_Commands_6=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Commands_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_7=(Token)match(input,RULE_LC,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_7);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_7, grammarAccess.getIfelseAccess().getLCTerminalRuleCall_7());
              		
            }
            // InternalMyDsl.g:719:3: ( (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' ) | kw= 'fi' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:720:4: (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' )
                    {
                    // InternalMyDsl.g:720:4: (kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi' )
                    // InternalMyDsl.g:721:5: kw= 'else' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'fi'
                    {
                    kw=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getIfelseAccess().getElseKeyword_8_0_0());
                      				
                    }
                    this_LC_9=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_LC_9);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_LC_9, grammarAccess.getIfelseAccess().getLCTerminalRuleCall_8_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIfelseAccess().getCommandsParserRuleCall_8_0_2());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    this_Commands_10=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Commands_10);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    this_LC_11=(Token)match(input,RULE_LC,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_LC_11);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_LC_11, grammarAccess.getIfelseAccess().getLCTerminalRuleCall_8_0_3());
                      				
                    }
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getIfelseAccess().getFiKeyword_8_0_4());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:757:4: kw= 'fi'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIfelseAccess().getFiKeyword_8_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfelse"


    // $ANTLR start "entryRuleFor"
    // InternalMyDsl.g:767:1: entryRuleFor returns [String current=null] : iv_ruleFor= ruleFor EOF ;
    public final String entryRuleFor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFor = null;


        try {
            // InternalMyDsl.g:767:43: (iv_ruleFor= ruleFor EOF )
            // InternalMyDsl.g:768:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalMyDsl.g:774:1: ruleFor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'for' )=>kw= 'for' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' ) ;
    public final AntlrDatatypeRuleToken ruleFor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        Token this_LC_3=null;
        Token this_LC_5=null;
        Token this_LC_7=null;
        AntlrDatatypeRuleToken this_Expr_2 = null;

        AntlrDatatypeRuleToken this_Commands_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:780:2: ( ( ( ( 'for' )=>kw= 'for' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' ) )
            // InternalMyDsl.g:781:2: ( ( ( 'for' )=>kw= 'for' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' )
            {
            // InternalMyDsl.g:781:2: ( ( ( 'for' )=>kw= 'for' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od' )
            // InternalMyDsl.g:782:3: ( ( 'for' )=>kw= 'for' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'do' this_LC_5= RULE_LC this_Commands_6= ruleCommands this_LC_7= RULE_LC kw= 'od'
            {
            // InternalMyDsl.g:782:3: ( ( 'for' )=>kw= 'for' )
            // InternalMyDsl.g:783:4: ( 'for' )=>kw= 'for'
            {
            kw=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getForAccess().getForKeyword_0());
              			
            }

            }

            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_1, grammarAccess.getForAccess().getLCTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForAccess().getExprParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_Expr_2=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_3, grammarAccess.getForAccess().getLCTerminalRuleCall_3());
              		
            }
            kw=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForAccess().getDoKeyword_4());
              		
            }
            this_LC_5=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_5, grammarAccess.getForAccess().getLCTerminalRuleCall_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForAccess().getCommandsParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_Commands_6=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Commands_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_7=(Token)match(input,RULE_LC,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_7);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_7, grammarAccess.getForAccess().getLCTerminalRuleCall_7());
              		
            }
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForAccess().getOdKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForeach"
    // InternalMyDsl.g:852:1: entryRuleForeach returns [String current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final String entryRuleForeach() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForeach = null;


        try {
            // InternalMyDsl.g:852:47: (iv_ruleForeach= ruleForeach EOF )
            // InternalMyDsl.g:853:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // InternalMyDsl.g:859:1: ruleForeach returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'foreach' )=>kw= 'foreach' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'in' this_LC_5= RULE_LC this_Expr_6= ruleExpr this_LC_7= RULE_LC kw= 'do' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'od' ) ;
    public final AntlrDatatypeRuleToken ruleForeach() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        Token this_LC_3=null;
        Token this_LC_5=null;
        Token this_LC_7=null;
        Token this_LC_9=null;
        Token this_LC_11=null;
        AntlrDatatypeRuleToken this_Expr_2 = null;

        AntlrDatatypeRuleToken this_Expr_6 = null;

        AntlrDatatypeRuleToken this_Commands_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:865:2: ( ( ( ( 'foreach' )=>kw= 'foreach' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'in' this_LC_5= RULE_LC this_Expr_6= ruleExpr this_LC_7= RULE_LC kw= 'do' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'od' ) )
            // InternalMyDsl.g:866:2: ( ( ( 'foreach' )=>kw= 'foreach' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'in' this_LC_5= RULE_LC this_Expr_6= ruleExpr this_LC_7= RULE_LC kw= 'do' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'od' )
            {
            // InternalMyDsl.g:866:2: ( ( ( 'foreach' )=>kw= 'foreach' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'in' this_LC_5= RULE_LC this_Expr_6= ruleExpr this_LC_7= RULE_LC kw= 'do' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'od' )
            // InternalMyDsl.g:867:3: ( ( 'foreach' )=>kw= 'foreach' ) this_LC_1= RULE_LC this_Expr_2= ruleExpr this_LC_3= RULE_LC kw= 'in' this_LC_5= RULE_LC this_Expr_6= ruleExpr this_LC_7= RULE_LC kw= 'do' this_LC_9= RULE_LC this_Commands_10= ruleCommands this_LC_11= RULE_LC kw= 'od'
            {
            // InternalMyDsl.g:867:3: ( ( 'foreach' )=>kw= 'foreach' )
            // InternalMyDsl.g:868:4: ( 'foreach' )=>kw= 'foreach'
            {
            kw=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getForeachAccess().getForeachKeyword_0());
              			
            }

            }

            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_1, grammarAccess.getForeachAccess().getLCTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachAccess().getExprParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_Expr_2=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_3, grammarAccess.getForeachAccess().getLCTerminalRuleCall_3());
              		
            }
            kw=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForeachAccess().getInKeyword_4());
              		
            }
            this_LC_5=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_5, grammarAccess.getForeachAccess().getLCTerminalRuleCall_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachAccess().getExprParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_Expr_6=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expr_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_7=(Token)match(input,RULE_LC,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_7);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_7, grammarAccess.getForeachAccess().getLCTerminalRuleCall_7());
              		
            }
            kw=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForeachAccess().getDoKeyword_8());
              		
            }
            this_LC_9=(Token)match(input,RULE_LC,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_9);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_9, grammarAccess.getForeachAccess().getLCTerminalRuleCall_9());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachAccess().getCommandsParserRuleCall_10());
              		
            }
            pushFollow(FOLLOW_4);
            this_Commands_10=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Commands_10);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_LC_11=(Token)match(input,RULE_LC,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LC_11);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LC_11, grammarAccess.getForeachAccess().getLCTerminalRuleCall_11());
              		
            }
            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForeachAccess().getOdKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleVars"
    // InternalMyDsl.g:966:1: entryRuleVars returns [String current=null] : iv_ruleVars= ruleVars EOF ;
    public final String entryRuleVars() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVars = null;


        try {
            // InternalMyDsl.g:966:44: (iv_ruleVars= ruleVars EOF )
            // InternalMyDsl.g:967:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalMyDsl.g:973:1: ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_VARIABLE_2= RULE_VARIABLE )* ) ;
    public final AntlrDatatypeRuleToken ruleVars() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token kw=null;
        Token this_VARIABLE_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:979:2: ( (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_VARIABLE_2= RULE_VARIABLE )* ) )
            // InternalMyDsl.g:980:2: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_VARIABLE_2= RULE_VARIABLE )* )
            {
            // InternalMyDsl.g:980:2: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_VARIABLE_2= RULE_VARIABLE )* )
            // InternalMyDsl.g:981:3: this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_VARIABLE_2= RULE_VARIABLE )*
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VARIABLE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_VARIABLE_0, grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:988:3: (kw= ',' this_VARIABLE_2= RULE_VARIABLE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:989:4: kw= ',' this_VARIABLE_2= RULE_VARIABLE
            	    {
            	    kw=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_VARIABLE_2=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VARIABLE_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_VARIABLE_2, grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // InternalMyDsl.g:1006:1: entryRuleExprs returns [String current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final String entryRuleExprs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprs = null;


        try {
            // InternalMyDsl.g:1006:45: (iv_ruleExprs= ruleExprs EOF )
            // InternalMyDsl.g:1007:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalMyDsl.g:1013:1: ruleExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleExprs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expr_0 = null;

        AntlrDatatypeRuleToken this_Expr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1019:2: ( (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* ) )
            // InternalMyDsl.g:1020:2: (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* )
            {
            // InternalMyDsl.g:1020:2: (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* )
            // InternalMyDsl.g:1021:3: this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_Expr_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expr_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1031:3: (kw= ',' this_Expr_2= ruleExpr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1032:4: kw= ',' this_Expr_2= ruleExpr
            	    {
            	    kw=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
            	    this_Expr_2=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Expr_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // InternalMyDsl.g:1052:1: entryRuleExpr returns [String current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final String entryRuleExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr = null;


        try {
            // InternalMyDsl.g:1052:44: (iv_ruleExpr= ruleExpr EOF )
            // InternalMyDsl.g:1053:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMyDsl.g:1059:1: ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple ) | this_ExprAnd_1= ruleExprAnd ) ;
    public final AntlrDatatypeRuleToken ruleExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExprSimple_0 = null;

        AntlrDatatypeRuleToken this_ExprAnd_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1065:2: ( ( ( ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple ) | this_ExprAnd_1= ruleExprAnd ) )
            // InternalMyDsl.g:1066:2: ( ( ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple ) | this_ExprAnd_1= ruleExprAnd )
            {
            // InternalMyDsl.g:1066:2: ( ( ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple ) | this_ExprAnd_1= ruleExprAnd )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred10_InternalMyDsl()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred10_InternalMyDsl()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred10_InternalMyDsl()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred10_InternalMyDsl()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1067:3: ( ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple )
                    {
                    // InternalMyDsl.g:1067:3: ( ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple )
                    // InternalMyDsl.g:1068:4: ( ruleExprSimple )=>this_ExprSimple_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExprSimple_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExprSimple_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1081:3: this_ExprAnd_1= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExprAccess().getExprAndParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExprAnd_1=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ExprAnd_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // InternalMyDsl.g:1095:1: entryRuleExprSimple returns [String current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final String entryRuleExprSimple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSimple = null;


        try {
            // InternalMyDsl.g:1095:50: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalMyDsl.g:1096:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalMyDsl.g:1102:1: ruleExprSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOL_2= RULE_SYMBOL | (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' ) | (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' ) | (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' ) | (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleExprSimple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VARIABLE_1=null;
        Token this_SYMBOL_2=null;
        Token this_LC_13=null;
        Token this_LC_18=null;
        Token this_SYMBOL_22=null;
        AntlrDatatypeRuleToken this_LExpr_5 = null;

        AntlrDatatypeRuleToken this_LExpr_9 = null;

        AntlrDatatypeRuleToken this_Expr_14 = null;

        AntlrDatatypeRuleToken this_Expr_19 = null;

        AntlrDatatypeRuleToken this_LExpr_23 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1108:2: ( (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOL_2= RULE_SYMBOL | (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' ) | (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' ) | (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' ) | (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' ) ) )
            // InternalMyDsl.g:1109:2: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOL_2= RULE_SYMBOL | (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' ) | (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' ) | (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' ) | (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' ) )
            {
            // InternalMyDsl.g:1109:2: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOL_2= RULE_SYMBOL | (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' ) | (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' ) | (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' ) | (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1110:3: kw= 'nil'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExprSimpleAccess().getNilKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1116:3: this_VARIABLE_1= RULE_VARIABLE
                    {
                    this_VARIABLE_1=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VARIABLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_VARIABLE_1, grammarAccess.getExprSimpleAccess().getVARIABLETerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1124:3: this_SYMBOL_2= RULE_SYMBOL
                    {
                    this_SYMBOL_2=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SYMBOL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SYMBOL_2, grammarAccess.getExprSimpleAccess().getSYMBOLTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1132:3: (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' )
                    {
                    // InternalMyDsl.g:1132:3: (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' )
                    // InternalMyDsl.g:1133:4: kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    kw=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_LExpr_5=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LExpr_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1160:3: (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' )
                    {
                    // InternalMyDsl.g:1160:3: (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' )
                    // InternalMyDsl.g:1161:4: kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    kw=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getListKeyword_4_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_LExpr_9=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LExpr_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1188:3: (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' )
                    {
                    // InternalMyDsl.g:1188:3: (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' )
                    // InternalMyDsl.g:1189:4: kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    kw=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1());
                      			
                    }
                    this_LC_13=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LC_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_LC_13, grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_5_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_5_3());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_Expr_14=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expr_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_4());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1223:3: (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' )
                    {
                    // InternalMyDsl.g:1223:3: (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' )
                    // InternalMyDsl.g:1224:4: kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    kw=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1());
                      			
                    }
                    this_LC_18=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LC_18);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_LC_18, grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_6_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_6_3());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_Expr_19=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expr_19);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1258:3: (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' )
                    {
                    // InternalMyDsl.g:1258:3: (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' )
                    // InternalMyDsl.g:1259:4: kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    this_SYMBOL_22=(Token)match(input,RULE_SYMBOL,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SYMBOL_22);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SYMBOL_22, grammarAccess.getExprSimpleAccess().getSYMBOLTerminalRuleCall_7_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_7_2());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_LExpr_23=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LExpr_23);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_7_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLExpr"
    // InternalMyDsl.g:1291:1: entryRuleLExpr returns [String current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final String entryRuleLExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLExpr = null;


        try {
            // InternalMyDsl.g:1291:45: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalMyDsl.g:1292:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalMyDsl.g:1298:1: ruleLExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+ ;
    public final AntlrDatatypeRuleToken ruleLExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_0=null;
        AntlrDatatypeRuleToken this_Expr_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1304:2: ( (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+ )
            // InternalMyDsl.g:1305:2: (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+
            {
            // InternalMyDsl.g:1305:2: (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_LC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1306:3: this_LC_0= RULE_LC this_Expr_1= ruleExpr
            	    {
            	    this_LC_0=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_LC_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_LC_0, grammarAccess.getLExprAccess().getLCTerminalRuleCall_0());
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getLExprAccess().getExprParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FOLLOW_27);
            	    this_Expr_1=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Expr_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprAnd"
    // InternalMyDsl.g:1327:1: entryRuleExprAnd returns [String current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final String entryRuleExprAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprAnd = null;


        try {
            // InternalMyDsl.g:1327:47: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalMyDsl.g:1328:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // InternalMyDsl.g:1334:1: ruleExprAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprOr_0= ruleExprOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr )* ) ;
    public final AntlrDatatypeRuleToken ruleExprAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_1=null;
        Token kw=null;
        Token this_LC_3=null;
        AntlrDatatypeRuleToken this_ExprOr_0 = null;

        AntlrDatatypeRuleToken this_ExprOr_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1340:2: ( (this_ExprOr_0= ruleExprOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr )* ) )
            // InternalMyDsl.g:1341:2: (this_ExprOr_0= ruleExprOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr )* )
            {
            // InternalMyDsl.g:1341:2: (this_ExprOr_0= ruleExprOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr )* )
            // InternalMyDsl.g:1342:3: this_ExprOr_0= ruleExprOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExprOr_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1352:3: (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_LC) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==40) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1353:4: this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_ExprOr_4= ruleExprOr
            	    {
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_1, grammarAccess.getExprAndAccess().getLCTerminalRuleCall_1_0());
            	      			
            	    }
            	    kw=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExprAndAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    this_LC_3=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_3, grammarAccess.getExprAndAccess().getLCTerminalRuleCall_1_2());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_1_3());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
            	    this_ExprOr_4=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ExprOr_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // InternalMyDsl.g:1387:1: entryRuleExprOr returns [String current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final String entryRuleExprOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprOr = null;


        try {
            // InternalMyDsl.g:1387:46: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalMyDsl.g:1388:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // InternalMyDsl.g:1394:1: ruleExprOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprNot_0= ruleExprNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot )* ) ;
    public final AntlrDatatypeRuleToken ruleExprOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_1=null;
        Token kw=null;
        Token this_LC_3=null;
        AntlrDatatypeRuleToken this_ExprNot_0 = null;

        AntlrDatatypeRuleToken this_ExprNot_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1400:2: ( (this_ExprNot_0= ruleExprNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot )* ) )
            // InternalMyDsl.g:1401:2: (this_ExprNot_0= ruleExprNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot )* )
            {
            // InternalMyDsl.g:1401:2: (this_ExprNot_0= ruleExprNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot )* )
            // InternalMyDsl.g:1402:3: this_ExprNot_0= ruleExprNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprOrAccess().getExprNotParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_ExprNot_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExprNot_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1412:3: (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_LC) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==41) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1413:4: this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_ExprNot_4= ruleExprNot
            	    {
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_1, grammarAccess.getExprOrAccess().getLCTerminalRuleCall_1_0());
            	      			
            	    }
            	    kw=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExprOrAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    this_LC_3=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LC_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LC_3, grammarAccess.getExprOrAccess().getLCTerminalRuleCall_1_2());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprOrAccess().getExprNotParserRuleCall_1_3());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
            	    this_ExprNot_4=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ExprNot_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // InternalMyDsl.g:1447:1: entryRuleExprNot returns [String current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final String entryRuleExprNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprNot = null;


        try {
            // InternalMyDsl.g:1447:47: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalMyDsl.g:1448:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // InternalMyDsl.g:1454:1: ruleExprNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq ) | this_ExprEq_3= ruleExprEq ) ;
    public final AntlrDatatypeRuleToken ruleExprNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        AntlrDatatypeRuleToken this_ExprEq_2 = null;

        AntlrDatatypeRuleToken this_ExprEq_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1460:2: ( ( (kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq ) | this_ExprEq_3= ruleExprEq ) )
            // InternalMyDsl.g:1461:2: ( (kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq ) | this_ExprEq_3= ruleExprEq )
            {
            // InternalMyDsl.g:1461:2: ( (kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq ) | this_ExprEq_3= ruleExprEq )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_SYMBOL && LA14_0<=RULE_VARIABLE)||(LA14_0>=33 && LA14_0<=34)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1462:3: (kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq )
                    {
                    // InternalMyDsl.g:1462:3: (kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq )
                    // InternalMyDsl.g:1463:4: kw= 'not' this_LC_1= RULE_LC this_ExprEq_2= ruleExprEq
                    {
                    kw=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprNotAccess().getNotKeyword_0_0());
                      			
                    }
                    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LC_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_LC_1, grammarAccess.getExprNotAccess().getLCTerminalRuleCall_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprNotAccess().getExprEqParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExprEq_2=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExprEq_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1487:3: this_ExprEq_3= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExprNotAccess().getExprEqParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExprEq_3=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ExprEq_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // InternalMyDsl.g:1501:1: entryRuleExprEq returns [String current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final String entryRuleExprEq() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprEq = null;


        try {
            // InternalMyDsl.g:1501:46: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalMyDsl.g:1502:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // InternalMyDsl.g:1508:1: ruleExprEq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (kw= '(' this_Expr_4= ruleExpr kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleExprEq() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprSimple_0 = null;

        AntlrDatatypeRuleToken this_ExprSimple_2 = null;

        AntlrDatatypeRuleToken this_Expr_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1514:2: ( ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (kw= '(' this_Expr_4= ruleExpr kw= ')' ) ) )
            // InternalMyDsl.g:1515:2: ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (kw= '(' this_Expr_4= ruleExpr kw= ')' ) )
            {
            // InternalMyDsl.g:1515:2: ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (kw= '(' this_Expr_4= ruleExpr kw= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_SYMBOL && LA15_0<=RULE_VARIABLE)||LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                switch ( input.LA(2) ) {
                case 35:
                case 37:
                case 38:
                case 39:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_VARIABLE:
                case 33:
                case 34:
                case 42:
                    {
                    alt15=2;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA15_4 = input.LA(3);

                    if ( (LA15_4==36||LA15_4==43) ) {
                        alt15=2;
                    }
                    else if ( (LA15_4==RULE_LC) ) {
                        alt15=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1516:3: (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple )
                    {
                    // InternalMyDsl.g:1516:3: (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple )
                    // InternalMyDsl.g:1517:4: this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprEqAccess().getExprSimpleParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_ExprSimple_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExprSimple_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprEqAccess().getExprSimpleParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExprSimple_2=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExprSimple_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1544:3: (kw= '(' this_Expr_4= ruleExpr kw= ')' )
                    {
                    // InternalMyDsl.g:1544:3: (kw= '(' this_Expr_4= ruleExpr kw= ')' )
                    // InternalMyDsl.g:1545:4: kw= '(' this_Expr_4= ruleExpr kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprEqAccess().getExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_Expr_4=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expr_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExprEq"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:463:4: ( 'nop' )
        // InternalMyDsl.g:463:5: 'nop'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:500:4: ( 'while' )
        // InternalMyDsl.g:500:5: 'while'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:514:4: ( 'if' )
        // InternalMyDsl.g:514:5: 'if'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:528:4: ( 'for' )
        // InternalMyDsl.g:528:5: 'for'
        {
        match(input,30,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMyDsl

    // $ANTLR start synpred5_InternalMyDsl
    public final void synpred5_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:542:4: ( 'foreach' )
        // InternalMyDsl.g:542:5: 'foreach'
        {
        match(input,31,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred10_InternalMyDsl
    public final void synpred10_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1068:4: ( ruleExprSimple )
        // InternalMyDsl.g:1068:5: ruleExprSimple
        {
        pushFollow(FOLLOW_2);
        ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalMyDsl

    // Delegated rules

    public final boolean synpred10_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\3\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\42\3\uffff\1\47\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\10\1\7\1\6\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\32\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\6\35\uffff\1\11\1\uffff\1\5\1\10\1\7",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1109:2: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOL_2= RULE_SYMBOL | (kw= '(' kw= 'cons' this_LExpr_5= ruleLExpr kw= ')' ) | (kw= '(' kw= 'list' this_LExpr_9= ruleLExpr kw= ')' ) | (kw= '(' kw= 'hd' this_LC_13= RULE_LC this_Expr_14= ruleExpr kw= ')' ) | (kw= '(' kw= 'tl' this_LC_18= RULE_LC this_Expr_19= ruleExpr kw= ')' ) | (kw= '(' this_SYMBOL_22= RULE_SYMBOL this_LExpr_23= ruleLExpr kw= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C4A00040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040600000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000600000060L});

}