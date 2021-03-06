/*
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.comp.services.WhGrammarAccess;
import org.xtext.comp.wh.Affect;
import org.xtext.comp.wh.Command;
import org.xtext.comp.wh.Commands;
import org.xtext.comp.wh.Definition;
import org.xtext.comp.wh.Exprs;
import org.xtext.comp.wh.Input;
import org.xtext.comp.wh.Nop;
import org.xtext.comp.wh.Output;
import org.xtext.comp.wh.Program;
import org.xtext.comp.wh.Vars;
import org.xtext.comp.wh.Wh;
import org.xtext.comp.wh.WhPackage;
import org.xtext.comp.wh.cons;

@SuppressWarnings("all")
public class WhSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WhGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WhPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WhPackage.AFFECT:
				sequence_Affect(context, (Affect) semanticObject); 
				return; 
			case WhPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case WhPackage.COMMANDS:
				sequence_Commands(context, (Commands) semanticObject); 
				return; 
			case WhPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case WhPackage.EXPRS:
				sequence_Exprs(context, (Exprs) semanticObject); 
				return; 
			case WhPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case WhPackage.NOP:
				sequence_Nop(context, (Nop) semanticObject); 
				return; 
			case WhPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case WhPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case WhPackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			case WhPackage.WH:
				sequence_Wh(context, (Wh) semanticObject); 
				return; 
			case WhPackage.CONS:
				sequence_cons(context, (cons) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Affect returns Affect
	 *
	 * Constraint:
	 *     (vars=Vars exp=Exprs)
	 */
	protected void sequence_Affect(ISerializationContext context, Affect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.AFFECT__VARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.AFFECT__VARS));
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.AFFECT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.AFFECT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAffectAccess().getVarsVarsParserRuleCall_0_0(), semanticObject.getVars());
		feeder.accept(grammarAccess.getAffectAccess().getExpExprsParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (cmd=Nop | cmd=Affect)
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commands returns Commands
	 *
	 * Constraint:
	 *     (commands+=Command commands+=Command*)
	 */
	protected void sequence_Commands(ISerializationContext context, Commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Definition
	 *
	 * Constraint:
	 *     (input=Input command=Commands output=Output)
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.DEFINITION__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.DEFINITION__INPUT));
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.DEFINITION__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.DEFINITION__COMMAND));
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.DEFINITION__OUTPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.DEFINITION__OUTPUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0(), semanticObject.getInput());
		feeder.accept(grammarAccess.getDefinitionAccess().getCommandCommandsParserRuleCall_3_0(), semanticObject.getCommand());
		feeder.accept(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0(), semanticObject.getOutput());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exprs returns Exprs
	 *
	 * Constraint:
	 *     (exprs+=Expr exprs+=Expr*)
	 */
	protected void sequence_Exprs(ISerializationContext context, Exprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (vars+=VARIABLE vars+=VARIABLE*)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Nop returns Nop
	 *
	 * Constraint:
	 *     nop='nop'
	 */
	protected void sequence_Nop(ISerializationContext context, Nop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.NOP__NOP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.NOP__NOP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNopAccess().getNopNopKeyword_0(), semanticObject.getNop());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (vars+=VARIABLE vars+=VARIABLE*)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (name=SYMBOL definition=Definition)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.PROGRAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.PROGRAM__NAME));
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.PROGRAM__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.PROGRAM__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramAccess().getNameSYMBOLTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_3_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vars returns Vars
	 *
	 * Constraint:
	 *     (vars+=VARIABLE vars+=VARIABLE*)
	 */
	protected void sequence_Vars(ISerializationContext context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Wh returns Wh
	 *
	 * Constraint:
	 *     elements+=Program+
	 */
	protected void sequence_Wh(ISerializationContext context, Wh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns cons
	 *     ExprSimple returns cons
	 *     cons returns cons
	 *
	 * Constraint:
	 *     list=ListExpr
	 */
	protected void sequence_cons(ISerializationContext context, cons semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhPackage.Literals.CONS__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhPackage.Literals.CONS__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConsAccess().getListListExprParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
}
