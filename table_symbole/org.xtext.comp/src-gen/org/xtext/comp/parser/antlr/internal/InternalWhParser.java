package org.xtext.comp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.comp.services.WhGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'foreach'", "'in'", "'do'", "'od'", "'for'", "'while'", "'if'", "'then'", "'else'", "'fi'", "'nop'", "':='", "'nil'", "'('", "'list'", "')'", "'hd'", "'tl'", "'cons'", "'and'", "'or'", "'not'", "'=?'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWhParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWh.g"; }



     	private WhGrammarAccess grammarAccess;

        public InternalWhParser(TokenStream input, WhGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Wh";
       	}

       	@Override
       	protected WhGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWh"
    // InternalWh.g:64:1: entryRuleWh returns [EObject current=null] : iv_ruleWh= ruleWh EOF ;
    public final EObject entryRuleWh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWh = null;


        try {
            // InternalWh.g:64:43: (iv_ruleWh= ruleWh EOF )
            // InternalWh.g:65:2: iv_ruleWh= ruleWh EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWh=ruleWh();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWh; 
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
    // $ANTLR end "entryRuleWh"


    // $ANTLR start "ruleWh"
    // InternalWh.g:71:1: ruleWh returns [EObject current=null] : ( (lv_elements_0_0= ruleProgram ) )* ;
    public final EObject ruleWh() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:77:2: ( ( (lv_elements_0_0= ruleProgram ) )* )
            // InternalWh.g:78:2: ( (lv_elements_0_0= ruleProgram ) )*
            {
            // InternalWh.g:78:2: ( (lv_elements_0_0= ruleProgram ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:79:3: (lv_elements_0_0= ruleProgram )
            	    {
            	    // InternalWh.g:79:3: (lv_elements_0_0= ruleProgram )
            	    // InternalWh.g:80:4: lv_elements_0_0= ruleProgram
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleProgram();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getWhRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"org.xtext.comp.Wh.Program");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

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
    // $ANTLR end "ruleWh"


    // $ANTLR start "entryRuleProgram"
    // InternalWh.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWh.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWh.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWh.g:107:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:113:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWh.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWh.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWh.g:115:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getFunctionKeyword_0());
              		
            }
            // InternalWh.g:119:3: ( (lv_name_1_0= RULE_SYMBOL ) )
            // InternalWh.g:120:4: (lv_name_1_0= RULE_SYMBOL )
            {
            // InternalWh.g:120:4: (lv_name_1_0= RULE_SYMBOL )
            // InternalWh.g:121:5: lv_name_1_0= RULE_SYMBOL
            {
            lv_name_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgramRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.comp.Wh.SYMBOL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getColonKeyword_2());
              		
            }
            // InternalWh.g:141:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWh.g:142:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWh.g:142:4: (lv_definition_3_0= ruleDefinition )
            // InternalWh.g:143:5: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_3_0,
              						"org.xtext.comp.Wh.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDefinition"
    // InternalWh.g:164:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWh.g:164:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWh.g:165:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
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
    // InternalWh.g:171:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_input_1_0 = null;

        EObject lv_command_3_0 = null;

        EObject lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalWh.g:177:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalWh.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalWh.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalWh.g:179:3: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            // InternalWh.g:183:3: ( (lv_input_1_0= ruleInput ) )
            // InternalWh.g:184:4: (lv_input_1_0= ruleInput )
            {
            // InternalWh.g:184:4: (lv_input_1_0= ruleInput )
            // InternalWh.g:185:5: lv_input_1_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_input_1_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"input",
              						lv_input_1_0,
              						"org.xtext.comp.Wh.Input");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
              		
            }
            // InternalWh.g:206:3: ( (lv_command_3_0= ruleCommands ) )
            // InternalWh.g:207:4: (lv_command_3_0= ruleCommands )
            {
            // InternalWh.g:207:4: (lv_command_3_0= ruleCommands )
            // InternalWh.g:208:5: lv_command_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_command_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"command",
              						lv_command_3_0,
              						"org.xtext.comp.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
              		
            }
            // InternalWh.g:233:3: ( (lv_output_6_0= ruleOutput ) )
            // InternalWh.g:234:4: (lv_output_6_0= ruleOutput )
            {
            // InternalWh.g:234:4: (lv_output_6_0= ruleOutput )
            // InternalWh.g:235:5: lv_output_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"output",
              						lv_output_6_0,
              						"org.xtext.comp.Wh.Output");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWh.g:256:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWh.g:256:46: (iv_ruleInput= ruleInput EOF )
            // InternalWh.g:257:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
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
    // InternalWh.g:263:1: ruleInput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:269:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:270:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:270:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:271:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:271:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:272:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:272:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:273:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.comp.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:289:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWh.g:290:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:294:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:295:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:295:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:296:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.comp.Wh.VARIABLE");
            	      					
            	    }

            	    }


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
    // InternalWh.g:317:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWh.g:317:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWh.g:318:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
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
    // InternalWh.g:324:1: ruleOutput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:330:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:331:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:331:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:332:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:332:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:333:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:333:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:334:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.comp.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:350:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWh.g:351:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:355:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:356:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:356:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:357:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.comp.Wh.VARIABLE");
            	      					
            	    }

            	    }


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
    // InternalWh.g:378:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWh.g:378:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWh.g:379:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
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
    // InternalWh.g:385:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:391:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWh.g:392:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWh.g:392:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWh.g:393:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWh.g:393:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWh.g:394:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWh.g:394:4: (lv_commands_0_0= ruleCommand )
            // InternalWh.g:395:5: lv_commands_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_commands_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"commands",
              						lv_commands_0_0,
              						"org.xtext.comp.Wh.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:412:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWh.g:413:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:417:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWh.g:418:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWh.g:418:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWh.g:419:6: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commands",
            	      							lv_commands_2_0,
            	      							"org.xtext.comp.Wh.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


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
    // InternalWh.g:441:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWh.g:441:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWh.g:442:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
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
    // InternalWh.g:448:1: ruleCommand returns [EObject current=null] : ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_cmd_0_1 = null;

        EObject lv_cmd_0_2 = null;

        EObject lv_cmd_0_3 = null;

        EObject lv_cmd_0_4 = null;

        EObject lv_cmd_0_5 = null;

        EObject lv_cmd_0_6 = null;



        	enterRule();

        try {
            // InternalWh.g:454:2: ( ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach ) ) ) )
            // InternalWh.g:455:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach ) ) )
            {
            // InternalWh.g:455:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach ) ) )
            // InternalWh.g:456:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach ) )
            {
            // InternalWh.g:456:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach ) )
            // InternalWh.g:457:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach )
            {
            // InternalWh.g:457:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleWhile | lv_cmd_0_5= ruleFor | lv_cmd_0_6= ruleForeach )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWh.g:458:5: lv_cmd_0_1= ruleNop
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_1=ruleNop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_1,
                      						"org.xtext.comp.Wh.Nop");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalWh.g:474:5: lv_cmd_0_2= ruleAffect
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_2=ruleAffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_2,
                      						"org.xtext.comp.Wh.Affect");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalWh.g:490:5: lv_cmd_0_3= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdIfParserRuleCall_0_2());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_3=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_3,
                      						"org.xtext.comp.Wh.If");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalWh.g:506:5: lv_cmd_0_4= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdWhileParserRuleCall_0_3());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_4=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_4,
                      						"org.xtext.comp.Wh.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalWh.g:522:5: lv_cmd_0_5= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdForParserRuleCall_0_4());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_5=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_5,
                      						"org.xtext.comp.Wh.For");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalWh.g:538:5: lv_cmd_0_6= ruleForeach
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdForeachParserRuleCall_0_5());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_6=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_6,
                      						"org.xtext.comp.Wh.Foreach");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleForeach"
    // InternalWh.g:559:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // InternalWh.g:559:48: (iv_ruleForeach= ruleForeach EOF )
            // InternalWh.g:560:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach; 
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
    // InternalWh.g:566:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr1_1_0 = null;

        EObject lv_expr2_3_0 = null;

        EObject lv_cmds_5_0 = null;



        	enterRule();

        try {
            // InternalWh.g:572:2: ( (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalWh.g:573:2: (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalWh.g:573:2: (otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalWh.g:574:3: otherlv_0= 'foreach' ( (lv_expr1_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_expr2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
              		
            }
            // InternalWh.g:578:3: ( (lv_expr1_1_0= ruleExpr ) )
            // InternalWh.g:579:4: (lv_expr1_1_0= ruleExpr )
            {
            // InternalWh.g:579:4: (lv_expr1_1_0= ruleExpr )
            // InternalWh.g:580:5: lv_expr1_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getExpr1ExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expr1_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"expr1",
              						lv_expr1_1_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
              		
            }
            // InternalWh.g:601:3: ( (lv_expr2_3_0= ruleExpr ) )
            // InternalWh.g:602:4: (lv_expr2_3_0= ruleExpr )
            {
            // InternalWh.g:602:4: (lv_expr2_3_0= ruleExpr )
            // InternalWh.g:603:5: lv_expr2_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getExpr2ExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expr2_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"expr2",
              						lv_expr2_3_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
              		
            }
            // InternalWh.g:624:3: ( (lv_cmds_5_0= ruleCommands ) )
            // InternalWh.g:625:4: (lv_cmds_5_0= ruleCommands )
            {
            // InternalWh.g:625:4: (lv_cmds_5_0= ruleCommands )
            // InternalWh.g:626:5: lv_cmds_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getCmdsCommandsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_cmds_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"cmds",
              						lv_cmds_5_0,
              						"org.xtext.comp.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForeachAccess().getOdKeyword_6());
              		
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


    // $ANTLR start "entryRuleFor"
    // InternalWh.g:651:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalWh.g:651:44: (iv_ruleFor= ruleFor EOF )
            // InternalWh.g:652:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
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
    // InternalWh.g:658:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_cmds_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:664:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWh.g:665:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWh.g:665:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWh.g:666:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
              		
            }
            // InternalWh.g:670:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWh.g:671:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWh.g:671:4: (lv_expr_1_0= ruleExpr )
            // InternalWh.g:672:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
              		
            }
            // InternalWh.g:693:3: ( (lv_cmds_3_0= ruleCommands ) )
            // InternalWh.g:694:4: (lv_cmds_3_0= ruleCommands )
            {
            // InternalWh.g:694:4: (lv_cmds_3_0= ruleCommands )
            // InternalWh.g:695:5: lv_cmds_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCmdsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_cmds_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"cmds",
              						lv_cmds_3_0,
              						"org.xtext.comp.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
              		
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


    // $ANTLR start "entryRuleWhile"
    // InternalWh.g:720:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalWh.g:720:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalWh.g:721:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
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
    // InternalWh.g:727:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_cmds_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:733:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWh.g:734:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWh.g:734:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWh.g:735:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalWh.g:739:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWh.g:740:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWh.g:740:4: (lv_expr_1_0= ruleExpr )
            // InternalWh.g:741:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalWh.g:762:3: ( (lv_cmds_3_0= ruleCommands ) )
            // InternalWh.g:763:4: (lv_cmds_3_0= ruleCommands )
            {
            // InternalWh.g:763:4: (lv_cmds_3_0= ruleCommands )
            // InternalWh.g:764:5: lv_cmds_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCmdsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_cmds_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"cmds",
              						lv_cmds_3_0,
              						"org.xtext.comp.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
              		
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


    // $ANTLR start "entryRuleIf"
    // InternalWh.g:789:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalWh.g:789:43: (iv_ruleIf= ruleIf EOF )
            // InternalWh.g:790:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalWh.g:796:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsTrue_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_cmdsTrue_3_0 = null;

        EObject lv_cmdsFalse_5_0 = null;



        	enterRule();

        try {
            // InternalWh.g:802:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsTrue_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalWh.g:803:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsTrue_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalWh.g:803:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsTrue_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalWh.g:804:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsTrue_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalWh.g:808:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWh.g:809:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWh.g:809:4: (lv_expr_1_0= ruleExpr )
            // InternalWh.g:810:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
              		
            }
            // InternalWh.g:831:3: ( (lv_cmdsTrue_3_0= ruleCommands ) )
            // InternalWh.g:832:4: (lv_cmdsTrue_3_0= ruleCommands )
            {
            // InternalWh.g:832:4: (lv_cmdsTrue_3_0= ruleCommands )
            // InternalWh.g:833:5: lv_cmdsTrue_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCmdsTrueCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cmdsTrue_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"cmdsTrue",
              						lv_cmdsTrue_3_0,
              						"org.xtext.comp.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:850:3: (otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWh.g:851:4: otherlv_4= 'else' ( (lv_cmdsFalse_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalWh.g:855:4: ( (lv_cmdsFalse_5_0= ruleCommands ) )
                    // InternalWh.g:856:5: (lv_cmdsFalse_5_0= ruleCommands )
                    {
                    // InternalWh.g:856:5: (lv_cmdsFalse_5_0= ruleCommands )
                    // InternalWh.g:857:6: lv_cmdsFalse_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getCmdsFalseCommandsParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_cmdsFalse_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"cmdsFalse",
                      							lv_cmdsFalse_5_0,
                      							"org.xtext.comp.Wh.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
              		
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleNop"
    // InternalWh.g:883:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalWh.g:883:44: (iv_ruleNop= ruleNop EOF )
            // InternalWh.g:884:2: iv_ruleNop= ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNop; 
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
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalWh.g:890:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalWh.g:896:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalWh.g:897:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalWh.g:897:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalWh.g:898:3: (lv_nop_0_0= 'nop' )
            {
            // InternalWh.g:898:3: (lv_nop_0_0= 'nop' )
            // InternalWh.g:899:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNopRule());
              				}
              				setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
              			
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
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleAffect"
    // InternalWh.g:914:1: entryRuleAffect returns [EObject current=null] : iv_ruleAffect= ruleAffect EOF ;
    public final EObject entryRuleAffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffect = null;


        try {
            // InternalWh.g:914:47: (iv_ruleAffect= ruleAffect EOF )
            // InternalWh.g:915:2: iv_ruleAffect= ruleAffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAffect=ruleAffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffect; 
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
    // $ANTLR end "entryRuleAffect"


    // $ANTLR start "ruleAffect"
    // InternalWh.g:921:1: ruleAffect returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:927:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) )
            // InternalWh.g:928:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            {
            // InternalWh.g:928:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            // InternalWh.g:929:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) )
            {
            // InternalWh.g:929:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalWh.g:930:4: (lv_vars_0_0= ruleVars )
            {
            // InternalWh.g:930:4: (lv_vars_0_0= ruleVars )
            // InternalWh.g:931:5: lv_vars_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectAccess().getVarsVarsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_vars_0_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAffectRule());
              					}
              					set(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.comp.Wh.Vars");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAffectAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalWh.g:952:3: ( (lv_exp_2_0= ruleExprs ) )
            // InternalWh.g:953:4: (lv_exp_2_0= ruleExprs )
            {
            // InternalWh.g:953:4: (lv_exp_2_0= ruleExprs )
            // InternalWh.g:954:5: lv_exp_2_0= ruleExprs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectAccess().getExpExprsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAffectRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"org.xtext.comp.Wh.Exprs");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleAffect"


    // $ANTLR start "entryRuleVars"
    // InternalWh.g:975:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWh.g:975:45: (iv_ruleVars= ruleVars EOF )
            // InternalWh.g:976:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
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
    // InternalWh.g:982:1: ruleVars returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:988:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:989:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:989:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:990:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:990:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:991:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:991:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:992:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getVarsAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.comp.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:1008:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWh.g:1009:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1013:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:1014:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:1014:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:1015:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getVarsAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVarsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.comp.Wh.VARIABLE");
            	      					
            	    }

            	    }


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
    // InternalWh.g:1036:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWh.g:1036:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWh.g:1037:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
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
    // InternalWh.g:1043:1: ruleExprs returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1049:2: ( ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) )
            // InternalWh.g:1050:2: ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            {
            // InternalWh.g:1050:2: ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            // InternalWh.g:1051:3: ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            {
            // InternalWh.g:1051:3: ( (lv_exprs_0_0= ruleExpr ) )
            // InternalWh.g:1052:4: (lv_exprs_0_0= ruleExpr )
            {
            // InternalWh.g:1052:4: (lv_exprs_0_0= ruleExpr )
            // InternalWh.g:1053:5: lv_exprs_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_exprs_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprsRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_0_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1070:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWh.g:1071:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1075:4: ( (lv_exprs_2_0= ruleExpr ) )
            	    // InternalWh.g:1076:5: (lv_exprs_2_0= ruleExpr )
            	    {
            	    // InternalWh.g:1076:5: (lv_exprs_2_0= ruleExpr )
            	    // InternalWh.g:1077:6: lv_exprs_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_exprs_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_2_0,
            	      							"org.xtext.comp.Wh.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


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
    // InternalWh.g:1099:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWh.g:1099:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWh.g:1100:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
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
    // InternalWh.g:1106:1: ruleExpr returns [EObject current=null] : ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1112:2: ( ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) ) )
            // InternalWh.g:1113:2: ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) )
            {
            // InternalWh.g:1113:2: ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) && (synpred1_InternalWh())) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                int LA9_2 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
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
            else if ( (LA9_0==RULE_VARIABLE) ) {
                int LA9_3 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
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
            else if ( (LA9_0==RULE_SYMBOL) ) {
                int LA9_4 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
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
            else if ( (LA9_0==33) ) {
                int LA9_5 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWh.g:1114:3: ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) )
                    {
                    // InternalWh.g:1114:3: ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) )
                    // InternalWh.g:1115:4: ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd )
                    {
                    // InternalWh.g:1119:4: (lv_expr_0_0= ruleExprAnd )
                    // InternalWh.g:1120:5: lv_expr_0_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprAndParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_0_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_0_0,
                      						"org.xtext.comp.Wh.ExprAnd");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1138:3: ( (lv_expr_1_0= ruleExprSimple ) )
                    {
                    // InternalWh.g:1138:3: ( (lv_expr_1_0= ruleExprSimple ) )
                    // InternalWh.g:1139:4: (lv_expr_1_0= ruleExprSimple )
                    {
                    // InternalWh.g:1139:4: (lv_expr_1_0= ruleExprSimple )
                    // InternalWh.g:1140:5: lv_expr_1_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprSimpleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_1_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_1_0,
                      						"org.xtext.comp.Wh.ExprSimple");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // InternalWh.g:1161:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWh.g:1161:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWh.g:1162:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
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
    // InternalWh.g:1168:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_strSymb_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) | (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' ) | (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_str_1_0=null;
        Token lv_strSymb_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_strSymb_17_0=null;
        Token otherlv_19=null;
        EObject lv_cons_3_0 = null;

        EObject lv_listExpr_6_0 = null;

        EObject lv_exprHd_10_0 = null;

        EObject lv_exprTl_14_0 = null;

        EObject lv_listExpr_18_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1174:2: ( ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_strSymb_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) | (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' ) | (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' ) ) )
            // InternalWh.g:1175:2: ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_strSymb_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) | (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' ) | (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' ) )
            {
            // InternalWh.g:1175:2: ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_strSymb_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) | (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' ) | (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalWh.g:1176:3: ( (lv_str_0_0= 'nil' ) )
                    {
                    // InternalWh.g:1176:3: ( (lv_str_0_0= 'nil' ) )
                    // InternalWh.g:1177:4: (lv_str_0_0= 'nil' )
                    {
                    // InternalWh.g:1177:4: (lv_str_0_0= 'nil' )
                    // InternalWh.g:1178:5: lv_str_0_0= 'nil'
                    {
                    lv_str_0_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_str_0_0, grammarAccess.getExprSimpleAccess().getStrNilKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(current, "str", lv_str_0_0, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1191:3: ( (lv_str_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWh.g:1191:3: ( (lv_str_1_0= RULE_VARIABLE ) )
                    // InternalWh.g:1192:4: (lv_str_1_0= RULE_VARIABLE )
                    {
                    // InternalWh.g:1192:4: (lv_str_1_0= RULE_VARIABLE )
                    // InternalWh.g:1193:5: lv_str_1_0= RULE_VARIABLE
                    {
                    lv_str_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_str_1_0, grammarAccess.getExprSimpleAccess().getStrVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"str",
                      						lv_str_1_0,
                      						"org.xtext.comp.Wh.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWh.g:1210:3: ( (lv_strSymb_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWh.g:1210:3: ( (lv_strSymb_2_0= RULE_SYMBOL ) )
                    // InternalWh.g:1211:4: (lv_strSymb_2_0= RULE_SYMBOL )
                    {
                    // InternalWh.g:1211:4: (lv_strSymb_2_0= RULE_SYMBOL )
                    // InternalWh.g:1212:5: lv_strSymb_2_0= RULE_SYMBOL
                    {
                    lv_strSymb_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_strSymb_2_0, grammarAccess.getExprSimpleAccess().getStrSymbSYMBOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"strSymb",
                      						lv_strSymb_2_0,
                      						"org.xtext.comp.Wh.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWh.g:1229:3: ( (lv_cons_3_0= ruleCons ) )
                    {
                    // InternalWh.g:1229:3: ( (lv_cons_3_0= ruleCons ) )
                    // InternalWh.g:1230:4: (lv_cons_3_0= ruleCons )
                    {
                    // InternalWh.g:1230:4: (lv_cons_3_0= ruleCons )
                    // InternalWh.g:1231:5: lv_cons_3_0= ruleCons
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cons_3_0=ruleCons();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"cons",
                      						lv_cons_3_0,
                      						"org.xtext.comp.Wh.Cons");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWh.g:1249:3: (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' )
                    {
                    // InternalWh.g:1249:3: (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' )
                    // InternalWh.g:1250:4: otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExprSimpleAccess().getListKeyword_4_1());
                      			
                    }
                    // InternalWh.g:1258:4: ( (lv_listExpr_6_0= ruleListExpr ) )
                    // InternalWh.g:1259:5: (lv_listExpr_6_0= ruleListExpr )
                    {
                    // InternalWh.g:1259:5: (lv_listExpr_6_0= ruleListExpr )
                    // InternalWh.g:1260:6: lv_listExpr_6_0= ruleListExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getListExprListExprParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_listExpr_6_0=ruleListExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"listExpr",
                      							lv_listExpr_6_0,
                      							"org.xtext.comp.Wh.ListExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWh.g:1283:3: (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' )
                    {
                    // InternalWh.g:1283:3: (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' )
                    // InternalWh.g:1284:4: otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    otherlv_9=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1());
                      			
                    }
                    // InternalWh.g:1292:4: ( (lv_exprHd_10_0= ruleExpr ) )
                    // InternalWh.g:1293:5: (lv_exprHd_10_0= ruleExpr )
                    {
                    // InternalWh.g:1293:5: (lv_exprHd_10_0= ruleExpr )
                    // InternalWh.g:1294:6: lv_exprHd_10_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprHdExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exprHd_10_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"exprHd",
                      							lv_exprHd_10_0,
                      							"org.xtext.comp.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalWh.g:1317:3: (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' )
                    {
                    // InternalWh.g:1317:3: (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' )
                    // InternalWh.g:1318:4: otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')'
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_13=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1());
                      			
                    }
                    // InternalWh.g:1326:4: ( (lv_exprTl_14_0= ruleExpr ) )
                    // InternalWh.g:1327:5: (lv_exprTl_14_0= ruleExpr )
                    {
                    // InternalWh.g:1327:5: (lv_exprTl_14_0= ruleExpr )
                    // InternalWh.g:1328:6: lv_exprTl_14_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getExprTlExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exprTl_14_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"exprTl",
                      							lv_exprTl_14_0,
                      							"org.xtext.comp.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalWh.g:1351:3: (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' )
                    {
                    // InternalWh.g:1351:3: (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' )
                    // InternalWh.g:1352:4: otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')'
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalWh.g:1356:4: ( (lv_strSymb_17_0= RULE_SYMBOL ) )
                    // InternalWh.g:1357:5: (lv_strSymb_17_0= RULE_SYMBOL )
                    {
                    // InternalWh.g:1357:5: (lv_strSymb_17_0= RULE_SYMBOL )
                    // InternalWh.g:1358:6: lv_strSymb_17_0= RULE_SYMBOL
                    {
                    lv_strSymb_17_0=(Token)match(input,RULE_SYMBOL,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_strSymb_17_0, grammarAccess.getExprSimpleAccess().getStrSymbSYMBOLTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"strSymb",
                      							lv_strSymb_17_0,
                      							"org.xtext.comp.Wh.SYMBOL");
                      					
                    }

                    }


                    }

                    // InternalWh.g:1374:4: ( (lv_listExpr_18_0= ruleListExpr ) )
                    // InternalWh.g:1375:5: (lv_listExpr_18_0= ruleListExpr )
                    {
                    // InternalWh.g:1375:5: (lv_listExpr_18_0= ruleListExpr )
                    // InternalWh.g:1376:6: lv_listExpr_18_0= ruleListExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getListExprListExprParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_listExpr_18_0=ruleListExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"listExpr",
                      							lv_listExpr_18_0,
                      							"org.xtext.comp.Wh.ListExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_7_3());
                      			
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


    // $ANTLR start "entryRuleCons"
    // InternalWh.g:1402:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalWh.g:1402:45: (iv_ruleCons= ruleCons EOF )
            // InternalWh.g:1403:2: iv_ruleCons= ruleCons EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCons=ruleCons();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCons; 
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
    // $ANTLR end "entryRuleCons"


    // $ANTLR start "ruleCons"
    // InternalWh.g:1409:1: ruleCons returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleCons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1415:2: ( (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' ) )
            // InternalWh.g:1416:2: (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' )
            {
            // InternalWh.g:1416:2: (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' )
            // InternalWh.g:1417:3: otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConsAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConsAccess().getConsKeyword_1());
              		
            }
            // InternalWh.g:1425:3: ( (lv_list_2_0= ruleListExpr ) )
            // InternalWh.g:1426:4: (lv_list_2_0= ruleListExpr )
            {
            // InternalWh.g:1426:4: (lv_list_2_0= ruleListExpr )
            // InternalWh.g:1427:5: lv_list_2_0= ruleListExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConsAccess().getListListExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_list_2_0=ruleListExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConsRule());
              					}
              					set(
              						current,
              						"list",
              						lv_list_2_0,
              						"org.xtext.comp.Wh.ListExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConsAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleCons"


    // $ANTLR start "entryRuleListExpr"
    // InternalWh.g:1452:1: entryRuleListExpr returns [EObject current=null] : iv_ruleListExpr= ruleListExpr EOF ;
    public final EObject entryRuleListExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpr = null;


        try {
            // InternalWh.g:1452:49: (iv_ruleListExpr= ruleListExpr EOF )
            // InternalWh.g:1453:2: iv_ruleListExpr= ruleListExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListExpr=ruleListExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListExpr; 
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
    // $ANTLR end "entryRuleListExpr"


    // $ANTLR start "ruleListExpr"
    // InternalWh.g:1459:1: ruleListExpr returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* ) ;
    public final EObject ruleListExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1465:2: ( ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* ) )
            // InternalWh.g:1466:2: ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* )
            {
            // InternalWh.g:1466:2: ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* )
            // InternalWh.g:1467:3: ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )*
            {
            // InternalWh.g:1467:3: ( (lv_exprs_0_0= ruleExpr ) )
            // InternalWh.g:1468:4: (lv_exprs_0_0= ruleExpr )
            {
            // InternalWh.g:1468:4: (lv_exprs_0_0= ruleExpr )
            // InternalWh.g:1469:5: lv_exprs_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListExprAccess().getExprsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_exprs_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListExprRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_0_0,
              						"org.xtext.comp.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1486:3: ( (lv_exprs_1_0= ruleExpr ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_SYMBOL && LA11_0<=RULE_VARIABLE)||(LA11_0>=32 && LA11_0<=33)||LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWh.g:1487:4: (lv_exprs_1_0= ruleExpr )
            	    {
            	    // InternalWh.g:1487:4: (lv_exprs_1_0= ruleExpr )
            	    // InternalWh.g:1488:5: lv_exprs_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getListExprAccess().getExprsExprParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_exprs_1_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getListExprRule());
            	      					}
            	      					add(
            	      						current,
            	      						"exprs",
            	      						lv_exprs_1_0,
            	      						"org.xtext.comp.Wh.Expr");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleListExpr"


    // $ANTLR start "entryRuleExprAnd"
    // InternalWh.g:1509:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWh.g:1509:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWh.g:1510:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
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
    // InternalWh.g:1516:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprOr1_0_0 = null;

        EObject lv_exprOrX_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1522:2: ( ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* ) )
            // InternalWh.g:1523:2: ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* )
            {
            // InternalWh.g:1523:2: ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* )
            // InternalWh.g:1524:3: ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )*
            {
            // InternalWh.g:1524:3: ( (lv_exprOr1_0_0= ruleExprOr ) )
            // InternalWh.g:1525:4: (lv_exprOr1_0_0= ruleExprOr )
            {
            // InternalWh.g:1525:4: (lv_exprOr1_0_0= ruleExprOr )
            // InternalWh.g:1526:5: lv_exprOr1_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getExprOr1ExprOrParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_exprOr1_0_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprAndRule());
              					}
              					set(
              						current,
              						"exprOr1",
              						lv_exprOr1_0_0,
              						"org.xtext.comp.Wh.ExprOr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1543:3: (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWh.g:1544:4: otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1548:4: ( (lv_exprOrX_2_0= ruleExprOr ) )
            	    // InternalWh.g:1549:5: (lv_exprOrX_2_0= ruleExprOr )
            	    {
            	    // InternalWh.g:1549:5: (lv_exprOrX_2_0= ruleExprOr )
            	    // InternalWh.g:1550:6: lv_exprOrX_2_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprAndAccess().getExprOrXExprOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_exprOrX_2_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprOrX",
            	      							lv_exprOrX_2_0,
            	      							"org.xtext.comp.Wh.ExprOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


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
    // InternalWh.g:1572:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWh.g:1572:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWh.g:1573:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
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
    // InternalWh.g:1579:1: ruleExprOr returns [EObject current=null] : ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprNot1_0_0 = null;

        EObject lv_exprNotX_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1585:2: ( ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* ) )
            // InternalWh.g:1586:2: ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* )
            {
            // InternalWh.g:1586:2: ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* )
            // InternalWh.g:1587:3: ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )*
            {
            // InternalWh.g:1587:3: ( (lv_exprNot1_0_0= ruleExprNot ) )
            // InternalWh.g:1588:4: (lv_exprNot1_0_0= ruleExprNot )
            {
            // InternalWh.g:1588:4: (lv_exprNot1_0_0= ruleExprNot )
            // InternalWh.g:1589:5: lv_exprNot1_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getExprNot1ExprNotParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_exprNot1_0_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprOrRule());
              					}
              					set(
              						current,
              						"exprNot1",
              						lv_exprNot1_0_0,
              						"org.xtext.comp.Wh.ExprNot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1606:3: (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWh.g:1607:4: otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1611:4: ( (lv_exprNotX_2_0= ruleExprNot ) )
            	    // InternalWh.g:1612:5: (lv_exprNotX_2_0= ruleExprNot )
            	    {
            	    // InternalWh.g:1612:5: (lv_exprNotX_2_0= ruleExprNot )
            	    // InternalWh.g:1613:6: lv_exprNotX_2_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprOrAccess().getExprNotXExprNotParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_exprNotX_2_0=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprNotX",
            	      							lv_exprNotX_2_0,
            	      							"org.xtext.comp.Wh.ExprNot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


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
    // InternalWh.g:1635:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWh.g:1635:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWh.g:1636:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
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
    // InternalWh.g:1642:1: ruleExprNot returns [EObject current=null] : ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1648:2: ( ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) ) )
            // InternalWh.g:1649:2: ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) )
            {
            // InternalWh.g:1649:2: ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) )
            // InternalWh.g:1650:3: ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) )
            {
            // InternalWh.g:1650:3: ( (lv_not_0_0= 'not' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWh.g:1651:4: (lv_not_0_0= 'not' )
                    {
                    // InternalWh.g:1651:4: (lv_not_0_0= 'not' )
                    // InternalWh.g:1652:5: lv_not_0_0= 'not'
                    {
                    lv_not_0_0=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_0_0, grammarAccess.getExprNotAccess().getNotNotKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprNotRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_0_0, "not");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalWh.g:1664:3: ( (lv_expr_1_0= ruleExprEq ) )
            // InternalWh.g:1665:4: (lv_expr_1_0= ruleExprEq )
            {
            // InternalWh.g:1665:4: (lv_expr_1_0= ruleExprEq )
            // InternalWh.g:1666:5: lv_expr_1_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprNotAccess().getExprExprEqParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprNotRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.comp.Wh.ExprEq");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // InternalWh.g:1687:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWh.g:1687:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWh.g:1688:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
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
    // InternalWh.g:1694:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprSimp1_0_0 = null;

        EObject lv_exprSimp2_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1700:2: ( ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) )
            // InternalWh.g:1701:2: ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            {
            // InternalWh.g:1701:2: ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_SYMBOL && LA15_0<=RULE_VARIABLE)||LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                switch ( input.LA(2) ) {
                case 34:
                case 36:
                case 37:
                case 38:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==35||LA15_3==42) ) {
                        alt15=2;
                    }
                    else if ( ((LA15_3>=RULE_SYMBOL && LA15_3<=RULE_VARIABLE)||(LA15_3>=32 && LA15_3<=33)||LA15_3==41) ) {
                        alt15=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                case 32:
                case 33:
                case 41:
                    {
                    alt15=2;
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
                    // InternalWh.g:1702:3: ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) )
                    {
                    // InternalWh.g:1702:3: ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) )
                    // InternalWh.g:1703:4: ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) )
                    {
                    // InternalWh.g:1703:4: ( (lv_exprSimp1_0_0= ruleExprSimple ) )
                    // InternalWh.g:1704:5: (lv_exprSimp1_0_0= ruleExprSimple )
                    {
                    // InternalWh.g:1704:5: (lv_exprSimp1_0_0= ruleExprSimple )
                    // InternalWh.g:1705:6: lv_exprSimp1_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprSimp1ExprSimpleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_exprSimp1_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"exprSimp1",
                      							lv_exprSimp1_0_0,
                      							"org.xtext.comp.Wh.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                      			
                    }
                    // InternalWh.g:1726:4: ( (lv_exprSimp2_2_0= ruleExprSimple ) )
                    // InternalWh.g:1727:5: (lv_exprSimp2_2_0= ruleExprSimple )
                    {
                    // InternalWh.g:1727:5: (lv_exprSimp2_2_0= ruleExprSimple )
                    // InternalWh.g:1728:6: lv_exprSimp2_2_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprSimp2ExprSimpleParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprSimp2_2_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"exprSimp2",
                      							lv_exprSimp2_2_0,
                      							"org.xtext.comp.Wh.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1747:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    {
                    // InternalWh.g:1747:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    // InternalWh.g:1748:4: otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalWh.g:1752:4: ( (lv_expr_4_0= ruleExpr ) )
                    // InternalWh.g:1753:5: (lv_expr_4_0= ruleExpr )
                    {
                    // InternalWh.g:1753:5: (lv_expr_4_0= ruleExpr )
                    // InternalWh.g:1754:6: lv_expr_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_expr_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_4_0,
                      							"org.xtext.comp.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2());
                      			
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

    // $ANTLR start synpred1_InternalWh
    public final void synpred1_InternalWh_fragment() throws RecognitionException {   
        // InternalWh.g:1115:4: ( ( ruleExprAnd ) )
        // InternalWh.g:1115:5: ( ruleExprAnd )
        {
        // InternalWh.g:1115:5: ( ruleExprAnd )
        // InternalWh.g:1116:5: ruleExprAnd
        {
        pushFollow(FOLLOW_2);
        ruleExprAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalWh

    // Delegated rules

    public final boolean synpred1_InternalWh() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWh_fragment(); // can never throw exception
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
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\41\3\uffff\1\46\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\4\1\10\1\6\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\32\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\7\35\uffff\1\5\1\uffff\1\10\1\11\1\6",
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
            return "1175:2: ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_strSymb_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) | (otherlv_4= '(' otherlv_5= 'list' ( (lv_listExpr_6_0= ruleListExpr ) ) otherlv_7= ')' ) | (otherlv_8= '(' otherlv_9= 'hd' ( (lv_exprHd_10_0= ruleExpr ) ) otherlv_11= ')' ) | (otherlv_12= '(' otherlv_13= 'tl' ( (lv_exprTl_14_0= ruleExpr ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_strSymb_17_0= RULE_SYMBOL ) ) ( (lv_listExpr_18_0= ruleListExpr ) ) otherlv_19= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000047100020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020300000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020300000032L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300000030L});

}