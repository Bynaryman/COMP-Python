/*
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.comp.ide.contentassist.antlr.internal.InternalWhParser;
import org.xtext.comp.services.WhGrammarAccess;

public class WhParser extends AbstractContentAssistParser {

	@Inject
	private WhGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalWhParser createParser() {
		InternalWhParser result = new InternalWhParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getCmdAlternatives_0(), "rule__Command__CmdAlternatives_0");
					put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getOutputAccess().getGroup_1(), "rule__Output__Group_1__0");
					put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
					put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
					put(grammarAccess.getAffectAccess().getGroup(), "rule__Affect__Group__0");
					put(grammarAccess.getVarsAccess().getGroup(), "rule__Vars__Group__0");
					put(grammarAccess.getVarsAccess().getGroup_1(), "rule__Vars__Group_1__0");
					put(grammarAccess.getExprsAccess().getGroup(), "rule__Exprs__Group__0");
					put(grammarAccess.getExprsAccess().getGroup_1(), "rule__Exprs__Group_1__0");
					put(grammarAccess.getWhAccess().getElementsAssignment(), "rule__Wh__ElementsAssignment");
					put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
					put(grammarAccess.getProgramAccess().getDefinitionAssignment_3(), "rule__Program__DefinitionAssignment_3");
					put(grammarAccess.getDefinitionAccess().getInputAssignment_1(), "rule__Definition__InputAssignment_1");
					put(grammarAccess.getDefinitionAccess().getCommandAssignment_3(), "rule__Definition__CommandAssignment_3");
					put(grammarAccess.getDefinitionAccess().getOutputAssignment_6(), "rule__Definition__OutputAssignment_6");
					put(grammarAccess.getInputAccess().getVarsAssignment_0(), "rule__Input__VarsAssignment_0");
					put(grammarAccess.getInputAccess().getVarsAssignment_1_1(), "rule__Input__VarsAssignment_1_1");
					put(grammarAccess.getOutputAccess().getVarsAssignment_0(), "rule__Output__VarsAssignment_0");
					put(grammarAccess.getOutputAccess().getVarsAssignment_1_1(), "rule__Output__VarsAssignment_1_1");
					put(grammarAccess.getCommandsAccess().getCommandsAssignment_0(), "rule__Commands__CommandsAssignment_0");
					put(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1(), "rule__Commands__CommandsAssignment_1_1");
					put(grammarAccess.getCommandAccess().getCmdAssignment(), "rule__Command__CmdAssignment");
					put(grammarAccess.getNopAccess().getNopAssignment(), "rule__Nop__NopAssignment");
					put(grammarAccess.getAffectAccess().getVarAssignment_0(), "rule__Affect__VarAssignment_0");
					put(grammarAccess.getAffectAccess().getExpAssignment_2(), "rule__Affect__ExpAssignment_2");
					put(grammarAccess.getVarsAccess().getVarsAssignment_0(), "rule__Vars__VarsAssignment_0");
					put(grammarAccess.getVarsAccess().getVarsAssignment_1_1(), "rule__Vars__VarsAssignment_1_1");
					put(grammarAccess.getExprsAccess().getExprsAssignment_0(), "rule__Exprs__ExprsAssignment_0");
					put(grammarAccess.getExprsAccess().getExprsAssignment_1_1(), "rule__Exprs__ExprsAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalWhParser typedParser = (InternalWhParser) parser;
			typedParser.entryRuleWh();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WhGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}