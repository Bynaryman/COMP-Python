/*
 * generated by Xtext 2.10.0
 */
grammar InternalWh;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.comp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleWh
entryRuleWh returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhRule()); }
	iv_ruleWh=ruleWh
	{ $current=$iv_ruleWh.current; }
	EOF;

// Rule Wh
ruleWh returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0());
			}
			lv_elements_0_0=ruleProgram
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getWhRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.comp.Wh.Program");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_SYMBOL
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameSYMBOLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.comp.Wh.SYMBOL");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_3_0());
				}
				lv_definition_3_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"definition",
						lv_definition_3_0,
						"org.xtext.comp.Wh.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='read'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
				}
				lv_input_1_0=ruleInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"input",
						lv_input_1_0,
						"org.xtext.comp.Wh.Input");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='%'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandCommandsParserRuleCall_3_0());
				}
				lv_command_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"command",
						lv_command_3_0,
						"org.xtext.comp.Wh.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='%'
		{
			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
		}
		otherlv_5='write'
		{
			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
				}
				lv_output_6_0=ruleOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"output",
						lv_output_6_0,
						"org.xtext.comp.Wh.Output");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_vars_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.comp.Wh.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_vars_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInputRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.comp.Wh.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_vars_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.comp.Wh.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_vars_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOutputRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.comp.Wh.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
				}
				lv_commands_0_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandsRule());
					}
					add(
						$current,
						"commands",
						lv_commands_0_0,
						"org.xtext.comp.Wh.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
					}
					lv_commands_2_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						add(
							$current,
							"commands",
							lv_commands_2_0,
							"org.xtext.comp.Wh.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0());
				}
				lv_cmd_0_1=ruleNop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_1,
						"org.xtext.comp.Wh.Nop");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1());
				}
				lv_cmd_0_2=ruleAffect
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_2,
						"org.xtext.comp.Wh.Affect");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNop
entryRuleNop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNopRule()); }
	iv_ruleNop=ruleNop
	{ $current=$iv_ruleNop.current; }
	EOF;

// Rule Nop
ruleNop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_nop_0_0='nop'
			{
				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNopRule());
				}
				setWithLastConsumed($current, "nop", lv_nop_0_0, "nop");
			}
		)
	)
;

// Entry rule entryRuleAffect
entryRuleAffect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAffectRule()); }
	iv_ruleAffect=ruleAffect
	{ $current=$iv_ruleAffect.current; }
	EOF;

// Rule Affect
ruleAffect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAffectAccess().getVarsVarsParserRuleCall_0_0());
				}
				lv_vars_0_0=ruleVars
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAffectRule());
					}
					set(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.comp.Wh.Vars");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getAffectAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAffectAccess().getExpExprsParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExprs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAffectRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.xtext.comp.Wh.Exprs");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVars
entryRuleVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarsRule()); }
	iv_ruleVars=ruleVars
	{ $current=$iv_ruleVars.current; }
	EOF;

// Rule Vars
ruleVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_vars_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_vars_0_0, grammarAccess.getVarsAccess().getVarsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarsRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.comp.Wh.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_vars_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_vars_2_0, grammarAccess.getVarsAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVarsRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.comp.Wh.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExprs
entryRuleExprs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprsRule()); }
	iv_ruleExprs=ruleExprs
	{ $current=$iv_ruleExprs.current; }
	EOF;

// Rule Exprs
ruleExprs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_0_0());
				}
				lv_exprs_0_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprsRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_0_0,
						"org.xtext.comp.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_1_1_0());
					}
					lv_exprs_2_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprsRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_2_0,
							"org.xtext.comp.Wh.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	iv_ruleExpr=ruleExpr
	{ $current=$iv_ruleExpr.current; }
	EOF;

// Rule Expr
ruleExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0());
		}
		this_ExprSimple_0=ruleExprSimple
		{
			$current = $this_ExprSimple_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExprAccess().getExprAndParserRuleCall_1());
		}
		ruleExprAnd
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	iv_ruleExprSimple=ruleExprSimple
	{ $current=$iv_ruleExprSimple.current; }
	EOF;

// Rule ExprSimple
ruleExprSimple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='nil'
		{
			newLeafNode(otherlv_0, grammarAccess.getExprSimpleAccess().getNilKeyword_0());
		}
		    |
		this_VARIABLE_1=RULE_VARIABLE
		{
			newLeafNode(this_VARIABLE_1, grammarAccess.getExprSimpleAccess().getVARIABLETerminalRuleCall_1());
		}
		    |
		this_SYMBOL_2=RULE_SYMBOL
		{
			newLeafNode(this_SYMBOL_2, grammarAccess.getExprSimpleAccess().getSYMBOLTerminalRuleCall_2());
		}
		    |
		{
			newCompositeNode(grammarAccess.getExprSimpleAccess().getConsParserRuleCall_3());
		}
		this_cons_3=rulecons
		{
			$current = $this_cons_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulecons
entryRulecons returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConsRule()); }
	iv_rulecons=rulecons
	{ $current=$iv_rulecons.current; }
	EOF;

// Rule cons
rulecons returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getConsAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='cons'
		{
			newLeafNode(otherlv_1, grammarAccess.getConsAccess().getConsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConsAccess().getListListExprParserRuleCall_2_0());
				}
				lv_list_2_0=ruleListExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConsRule());
					}
					set(
						$current,
						"list",
						lv_list_2_0,
						"org.xtext.comp.Wh.ListExpr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getConsAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleListExpr
entryRuleListExpr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getListExprRule()); }
	iv_ruleListExpr=ruleListExpr
	{ $current=$iv_ruleListExpr.current.getText(); }
	EOF;

// Rule ListExpr
ruleListExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='TODO'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getListExprAccess().getTODOKeyword());
	}
;

// Entry rule entryRuleExprAnd
entryRuleExprAnd returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprAndRule()); }
	iv_ruleExprAnd=ruleExprAnd
	{ $current=$iv_ruleExprAnd.current.getText(); }
	EOF;

// Rule ExprAnd
ruleExprAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='TODO'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getExprAndAccess().getTODOKeyword());
	}
;

RULE_VARIABLE : 'A'..'Z' ('0'..'9'|'a'..'z'|'A'..'Z')* ((('-'|'+'|'.'|'/'|'_'|'&')|'->') ('0'..'9'|'a'..'z'|'A'..'Z')+)* ('?'|'!')?;

RULE_SYMBOL : 'a'..'z' ('0'..'9'|'a'..'z'|'A'..'Z')* ((('-'|'+'|'.'|'/'|'_'|'&')|'->') ('0'..'9'|'a'..'z'|'A'..'Z')+)* ('?'|'!')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
