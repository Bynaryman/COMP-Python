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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'nil'", "'('", "'cons'", "')'", "'and'", "'or'", "'not'", "'=?'"
    };
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
    public static final int T__20=20;
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
    // InternalWh.g:448:1: ruleCommand returns [EObject current=null] : ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_cmd_0_1 = null;

        EObject lv_cmd_0_2 = null;



        	enterRule();

        try {
            // InternalWh.g:454:2: ( ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) ) )
            // InternalWh.g:455:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) )
            {
            // InternalWh.g:455:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) )
            // InternalWh.g:456:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) )
            {
            // InternalWh.g:456:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) )
            // InternalWh.g:457:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect )
            {
            // InternalWh.g:457:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_VARIABLE) ) {
                alt5=2;
            }
            else {
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


    // $ANTLR start "entryRuleNop"
    // InternalWh.g:495:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalWh.g:495:44: (iv_ruleNop= ruleNop EOF )
            // InternalWh.g:496:2: iv_ruleNop= ruleNop EOF
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
    // InternalWh.g:502:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalWh.g:508:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalWh.g:509:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalWh.g:509:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalWh.g:510:3: (lv_nop_0_0= 'nop' )
            {
            // InternalWh.g:510:3: (lv_nop_0_0= 'nop' )
            // InternalWh.g:511:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalWh.g:526:1: entryRuleAffect returns [EObject current=null] : iv_ruleAffect= ruleAffect EOF ;
    public final EObject entryRuleAffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffect = null;


        try {
            // InternalWh.g:526:47: (iv_ruleAffect= ruleAffect EOF )
            // InternalWh.g:527:2: iv_ruleAffect= ruleAffect EOF
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
    // InternalWh.g:533:1: ruleAffect returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:539:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) )
            // InternalWh.g:540:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            {
            // InternalWh.g:540:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            // InternalWh.g:541:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) )
            {
            // InternalWh.g:541:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalWh.g:542:4: (lv_vars_0_0= ruleVars )
            {
            // InternalWh.g:542:4: (lv_vars_0_0= ruleVars )
            // InternalWh.g:543:5: lv_vars_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectAccess().getVarsVarsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAffectAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalWh.g:564:3: ( (lv_exp_2_0= ruleExprs ) )
            // InternalWh.g:565:4: (lv_exp_2_0= ruleExprs )
            {
            // InternalWh.g:565:4: (lv_exp_2_0= ruleExprs )
            // InternalWh.g:566:5: lv_exp_2_0= ruleExprs
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
    // InternalWh.g:587:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWh.g:587:45: (iv_ruleVars= ruleVars EOF )
            // InternalWh.g:588:2: iv_ruleVars= ruleVars EOF
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
    // InternalWh.g:594:1: ruleVars returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:600:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:601:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:601:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:602:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:602:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:603:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:603:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:604:5: lv_vars_0_0= RULE_VARIABLE
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

            // InternalWh.g:620:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWh.g:621:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:625:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:626:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:626:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:627:6: lv_vars_2_0= RULE_VARIABLE
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
            	    break loop6;
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
    // InternalWh.g:648:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWh.g:648:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWh.g:649:2: iv_ruleExprs= ruleExprs EOF
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
    // InternalWh.g:655:1: ruleExprs returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:661:2: ( ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) )
            // InternalWh.g:662:2: ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            {
            // InternalWh.g:662:2: ( ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            // InternalWh.g:663:3: ( (lv_exprs_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            {
            // InternalWh.g:663:3: ( (lv_exprs_0_0= ruleExpr ) )
            // InternalWh.g:664:4: (lv_exprs_0_0= ruleExpr )
            {
            // InternalWh.g:664:4: (lv_exprs_0_0= ruleExpr )
            // InternalWh.g:665:5: lv_exprs_0_0= ruleExpr
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

            // InternalWh.g:682:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWh.g:683:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:687:4: ( (lv_exprs_2_0= ruleExpr ) )
            	    // InternalWh.g:688:5: (lv_exprs_2_0= ruleExpr )
            	    {
            	    // InternalWh.g:688:5: (lv_exprs_2_0= ruleExpr )
            	    // InternalWh.g:689:6: lv_exprs_2_0= ruleExpr
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
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // InternalWh.g:711:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWh.g:711:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWh.g:712:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalWh.g:718:1: ruleExpr returns [EObject current=null] : ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:724:2: ( ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) ) )
            // InternalWh.g:725:2: ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) )
            {
            // InternalWh.g:725:2: ( ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprSimple ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) && (synpred1_InternalWh())) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                int LA8_2 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_VARIABLE) ) {
                int LA8_3 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_SYMBOL) ) {
                int LA8_4 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==23) ) {
                int LA8_5 = input.LA(2);

                if ( (synpred1_InternalWh()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWh.g:726:3: ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) )
                    {
                    // InternalWh.g:726:3: ( ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd ) )
                    // InternalWh.g:727:4: ( ( ruleExprAnd ) )=> (lv_expr_0_0= ruleExprAnd )
                    {
                    // InternalWh.g:731:4: (lv_expr_0_0= ruleExprAnd )
                    // InternalWh.g:732:5: lv_expr_0_0= ruleExprAnd
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
                    // InternalWh.g:750:3: ( (lv_expr_1_0= ruleExprSimple ) )
                    {
                    // InternalWh.g:750:3: ( (lv_expr_1_0= ruleExprSimple ) )
                    // InternalWh.g:751:4: (lv_expr_1_0= ruleExprSimple )
                    {
                    // InternalWh.g:751:4: (lv_expr_1_0= ruleExprSimple )
                    // InternalWh.g:752:5: lv_expr_1_0= ruleExprSimple
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
    // InternalWh.g:773:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWh.g:773:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWh.g:774:2: iv_ruleExprSimple= ruleExprSimple EOF
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
    // InternalWh.g:780:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_str_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_str_1_0=null;
        Token lv_str_2_0=null;
        EObject lv_cons_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:786:2: ( ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_str_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) ) )
            // InternalWh.g:787:2: ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_str_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) )
            {
            // InternalWh.g:787:2: ( ( (lv_str_0_0= 'nil' ) ) | ( (lv_str_1_0= RULE_VARIABLE ) ) | ( (lv_str_2_0= RULE_SYMBOL ) ) | ( (lv_cons_3_0= ruleCons ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt9=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
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
                    // InternalWh.g:788:3: ( (lv_str_0_0= 'nil' ) )
                    {
                    // InternalWh.g:788:3: ( (lv_str_0_0= 'nil' ) )
                    // InternalWh.g:789:4: (lv_str_0_0= 'nil' )
                    {
                    // InternalWh.g:789:4: (lv_str_0_0= 'nil' )
                    // InternalWh.g:790:5: lv_str_0_0= 'nil'
                    {
                    lv_str_0_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
                    // InternalWh.g:803:3: ( (lv_str_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWh.g:803:3: ( (lv_str_1_0= RULE_VARIABLE ) )
                    // InternalWh.g:804:4: (lv_str_1_0= RULE_VARIABLE )
                    {
                    // InternalWh.g:804:4: (lv_str_1_0= RULE_VARIABLE )
                    // InternalWh.g:805:5: lv_str_1_0= RULE_VARIABLE
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
                    // InternalWh.g:822:3: ( (lv_str_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWh.g:822:3: ( (lv_str_2_0= RULE_SYMBOL ) )
                    // InternalWh.g:823:4: (lv_str_2_0= RULE_SYMBOL )
                    {
                    // InternalWh.g:823:4: (lv_str_2_0= RULE_SYMBOL )
                    // InternalWh.g:824:5: lv_str_2_0= RULE_SYMBOL
                    {
                    lv_str_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_str_2_0, grammarAccess.getExprSimpleAccess().getStrSYMBOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"str",
                      						lv_str_2_0,
                      						"org.xtext.comp.Wh.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWh.g:841:3: ( (lv_cons_3_0= ruleCons ) )
                    {
                    // InternalWh.g:841:3: ( (lv_cons_3_0= ruleCons ) )
                    // InternalWh.g:842:4: (lv_cons_3_0= ruleCons )
                    {
                    // InternalWh.g:842:4: (lv_cons_3_0= ruleCons )
                    // InternalWh.g:843:5: lv_cons_3_0= ruleCons
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
    // InternalWh.g:864:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalWh.g:864:45: (iv_ruleCons= ruleCons EOF )
            // InternalWh.g:865:2: iv_ruleCons= ruleCons EOF
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
    // InternalWh.g:871:1: ruleCons returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleCons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:877:2: ( (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' ) )
            // InternalWh.g:878:2: (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' )
            {
            // InternalWh.g:878:2: (otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')' )
            // InternalWh.g:879:3: otherlv_0= '(' otherlv_1= 'cons' ( (lv_list_2_0= ruleListExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConsAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConsAccess().getConsKeyword_1());
              		
            }
            // InternalWh.g:887:3: ( (lv_list_2_0= ruleListExpr ) )
            // InternalWh.g:888:4: (lv_list_2_0= ruleListExpr )
            {
            // InternalWh.g:888:4: (lv_list_2_0= ruleListExpr )
            // InternalWh.g:889:5: lv_list_2_0= ruleListExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConsAccess().getListListExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalWh.g:914:1: entryRuleListExpr returns [EObject current=null] : iv_ruleListExpr= ruleListExpr EOF ;
    public final EObject entryRuleListExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpr = null;


        try {
            // InternalWh.g:914:49: (iv_ruleListExpr= ruleListExpr EOF )
            // InternalWh.g:915:2: iv_ruleListExpr= ruleListExpr EOF
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
    // InternalWh.g:921:1: ruleListExpr returns [EObject current=null] : ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* ) ;
    public final EObject ruleListExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprs_0_0 = null;

        EObject lv_exprs_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:927:2: ( ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* ) )
            // InternalWh.g:928:2: ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* )
            {
            // InternalWh.g:928:2: ( ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )* )
            // InternalWh.g:929:3: ( (lv_exprs_0_0= ruleExpr ) ) ( (lv_exprs_1_0= ruleExpr ) )*
            {
            // InternalWh.g:929:3: ( (lv_exprs_0_0= ruleExpr ) )
            // InternalWh.g:930:4: (lv_exprs_0_0= ruleExpr )
            {
            // InternalWh.g:930:4: (lv_exprs_0_0= ruleExpr )
            // InternalWh.g:931:5: lv_exprs_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListExprAccess().getExprsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalWh.g:948:3: ( (lv_exprs_1_0= ruleExpr ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_SYMBOL && LA10_0<=RULE_VARIABLE)||(LA10_0>=22 && LA10_0<=23)||LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWh.g:949:4: (lv_exprs_1_0= ruleExpr )
            	    {
            	    // InternalWh.g:949:4: (lv_exprs_1_0= ruleExpr )
            	    // InternalWh.g:950:5: lv_exprs_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getListExprAccess().getExprsExprParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break loop10;
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
    // InternalWh.g:971:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWh.g:971:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWh.g:972:2: iv_ruleExprAnd= ruleExprAnd EOF
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
    // InternalWh.g:978:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprOr1_0_0 = null;

        EObject lv_exprOrX_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:984:2: ( ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* ) )
            // InternalWh.g:985:2: ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* )
            {
            // InternalWh.g:985:2: ( ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )* )
            // InternalWh.g:986:3: ( (lv_exprOr1_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )*
            {
            // InternalWh.g:986:3: ( (lv_exprOr1_0_0= ruleExprOr ) )
            // InternalWh.g:987:4: (lv_exprOr1_0_0= ruleExprOr )
            {
            // InternalWh.g:987:4: (lv_exprOr1_0_0= ruleExprOr )
            // InternalWh.g:988:5: lv_exprOr1_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getExprOr1ExprOrParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
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

            // InternalWh.g:1005:3: (otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWh.g:1006:4: otherlv_1= 'and' ( (lv_exprOrX_2_0= ruleExprOr ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1010:4: ( (lv_exprOrX_2_0= ruleExprOr ) )
            	    // InternalWh.g:1011:5: (lv_exprOrX_2_0= ruleExprOr )
            	    {
            	    // InternalWh.g:1011:5: (lv_exprOrX_2_0= ruleExprOr )
            	    // InternalWh.g:1012:6: lv_exprOrX_2_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprAndAccess().getExprOrXExprOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // InternalWh.g:1034:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWh.g:1034:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWh.g:1035:2: iv_ruleExprOr= ruleExprOr EOF
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
    // InternalWh.g:1041:1: ruleExprOr returns [EObject current=null] : ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprNot1_0_0 = null;

        EObject lv_exprNotX_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1047:2: ( ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* ) )
            // InternalWh.g:1048:2: ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* )
            {
            // InternalWh.g:1048:2: ( ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )* )
            // InternalWh.g:1049:3: ( (lv_exprNot1_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )*
            {
            // InternalWh.g:1049:3: ( (lv_exprNot1_0_0= ruleExprNot ) )
            // InternalWh.g:1050:4: (lv_exprNot1_0_0= ruleExprNot )
            {
            // InternalWh.g:1050:4: (lv_exprNot1_0_0= ruleExprNot )
            // InternalWh.g:1051:5: lv_exprNot1_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getExprNot1ExprNotParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalWh.g:1068:3: (otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWh.g:1069:4: otherlv_1= 'or' ( (lv_exprNotX_2_0= ruleExprNot ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1073:4: ( (lv_exprNotX_2_0= ruleExprNot ) )
            	    // InternalWh.g:1074:5: (lv_exprNotX_2_0= ruleExprNot )
            	    {
            	    // InternalWh.g:1074:5: (lv_exprNotX_2_0= ruleExprNot )
            	    // InternalWh.g:1075:6: lv_exprNotX_2_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprOrAccess().getExprNotXExprNotParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // InternalWh.g:1097:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWh.g:1097:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWh.g:1098:2: iv_ruleExprNot= ruleExprNot EOF
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
    // InternalWh.g:1104:1: ruleExprNot returns [EObject current=null] : ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1110:2: ( ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) ) )
            // InternalWh.g:1111:2: ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) )
            {
            // InternalWh.g:1111:2: ( ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) ) )
            // InternalWh.g:1112:3: ( (lv_not_0_0= 'not' ) )? ( (lv_expr_1_0= ruleExprEq ) )
            {
            // InternalWh.g:1112:3: ( (lv_not_0_0= 'not' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWh.g:1113:4: (lv_not_0_0= 'not' )
                    {
                    // InternalWh.g:1113:4: (lv_not_0_0= 'not' )
                    // InternalWh.g:1114:5: lv_not_0_0= 'not'
                    {
                    lv_not_0_0=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
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

            // InternalWh.g:1126:3: ( (lv_expr_1_0= ruleExprEq ) )
            // InternalWh.g:1127:4: (lv_expr_1_0= ruleExprEq )
            {
            // InternalWh.g:1127:4: (lv_expr_1_0= ruleExprEq )
            // InternalWh.g:1128:5: lv_expr_1_0= ruleExprEq
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
    // InternalWh.g:1149:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWh.g:1149:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWh.g:1150:2: iv_ruleExprEq= ruleExprEq EOF
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
    // InternalWh.g:1156:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) ;
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
            // InternalWh.g:1162:2: ( ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) ) )
            // InternalWh.g:1163:2: ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            {
            // InternalWh.g:1163:2: ( ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) ) | (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SYMBOL && LA14_0<=RULE_VARIABLE)||LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==24) ) {
                    alt14=1;
                }
                else if ( ((LA14_2>=RULE_SYMBOL && LA14_2<=RULE_VARIABLE)||(LA14_2>=22 && LA14_2<=23)||LA14_2==28) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalWh.g:1164:3: ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) )
                    {
                    // InternalWh.g:1164:3: ( ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) ) )
                    // InternalWh.g:1165:4: ( (lv_exprSimp1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_exprSimp2_2_0= ruleExprSimple ) )
                    {
                    // InternalWh.g:1165:4: ( (lv_exprSimp1_0_0= ruleExprSimple ) )
                    // InternalWh.g:1166:5: (lv_exprSimp1_0_0= ruleExprSimple )
                    {
                    // InternalWh.g:1166:5: (lv_exprSimp1_0_0= ruleExprSimple )
                    // InternalWh.g:1167:6: lv_exprSimp1_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprSimp1ExprSimpleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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

                    otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                      			
                    }
                    // InternalWh.g:1188:4: ( (lv_exprSimp2_2_0= ruleExprSimple ) )
                    // InternalWh.g:1189:5: (lv_exprSimp2_2_0= ruleExprSimple )
                    {
                    // InternalWh.g:1189:5: (lv_exprSimp2_2_0= ruleExprSimple )
                    // InternalWh.g:1190:6: lv_exprSimp2_2_0= ruleExprSimple
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
                    // InternalWh.g:1209:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    {
                    // InternalWh.g:1209:3: (otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')' )
                    // InternalWh.g:1210:4: otherlv_3= '(' ( (lv_expr_4_0= ruleExpr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalWh.g:1214:4: ( (lv_expr_4_0= ruleExpr ) )
                    // InternalWh.g:1215:5: (lv_expr_4_0= ruleExpr )
                    {
                    // InternalWh.g:1215:5: (lv_expr_4_0= ruleExpr )
                    // InternalWh.g:1216:6: lv_expr_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
        // InternalWh.g:727:4: ( ( ruleExprAnd ) )
        // InternalWh.g:727:5: ( ruleExprAnd )
        {
        // InternalWh.g:727:5: ( ruleExprAnd )
        // InternalWh.g:728:5: ruleExprAnd
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010C00030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010C00032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00030L});

}