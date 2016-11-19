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
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
					put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
					put(grammarAccess.getWhAccess().getElementsAssignment(), "rule__Wh__ElementsAssignment");
					put(grammarAccess.getProgramAccess().getNameAssignment_2(), "rule__Program__NameAssignment_2");
					put(grammarAccess.getProgramAccess().getDefinitionAssignment_6(), "rule__Program__DefinitionAssignment_6");
					put(grammarAccess.getDefinitionAccess().getInputAssignment_2(), "rule__Definition__InputAssignment_2");
					put(grammarAccess.getDefinitionAccess().getCommandAssignment_6(), "rule__Definition__CommandAssignment_6");
					put(grammarAccess.getDefinitionAccess().getOutputAssignment_12(), "rule__Definition__OutputAssignment_12");
					put(grammarAccess.getCommandsAccess().getCommandsAssignment_0(), "rule__Commands__CommandsAssignment_0");
					put(grammarAccess.getCommandsAccess().getCommandsAssignment_1_2(), "rule__Commands__CommandsAssignment_1_2");
					put(grammarAccess.getCommandAccess().getCmdAssignment(), "rule__Command__CmdAssignment");
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