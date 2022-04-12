/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.serializer;

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
import uk.ac.kcl.inf.group19.easySql.easySql.Delete;
import uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage;
import uk.ac.kcl.inf.group19.easySql.easySql.Equation;
import uk.ac.kcl.inf.group19.easySql.easySql.Insert;
import uk.ac.kcl.inf.group19.easySql.easySql.JoinQuery;
import uk.ac.kcl.inf.group19.easySql.easySql.MultiEquation;
import uk.ac.kcl.inf.group19.easySql.easySql.NestedQuery;
import uk.ac.kcl.inf.group19.easySql.easySql.NumLiteral;
import uk.ac.kcl.inf.group19.easySql.easySql.RinLiteral;
import uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery;
import uk.ac.kcl.inf.group19.easySql.easySql.SingleSelectDeclaration;
import uk.ac.kcl.inf.group19.easySql.easySql.SqlProgram;
import uk.ac.kcl.inf.group19.easySql.easySql.StrLiteral;
import uk.ac.kcl.inf.group19.easySql.easySql.TableDeclaration;
import uk.ac.kcl.inf.group19.easySql.easySql.Update;
import uk.ac.kcl.inf.group19.easySql.easySql.Value;
import uk.ac.kcl.inf.group19.easySql.easySql.Vvalue;
import uk.ac.kcl.inf.group19.easySql.services.EasySqlGrammarAccess;

@SuppressWarnings("all")
public class EasySqlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EasySqlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EasySqlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EasySqlPackage.DELETE:
				sequence_Delete(context, (Delete) semanticObject); 
				return; 
			case EasySqlPackage.EQUATION:
				sequence_Equation(context, (Equation) semanticObject); 
				return; 
			case EasySqlPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case EasySqlPackage.JOIN_QUERY:
				sequence_JoinQuery(context, (JoinQuery) semanticObject); 
				return; 
			case EasySqlPackage.MULTI_EQUATION:
				sequence_MultiEquation(context, (MultiEquation) semanticObject); 
				return; 
			case EasySqlPackage.NESTED_QUERY:
				sequence_NestedQuery(context, (NestedQuery) semanticObject); 
				return; 
			case EasySqlPackage.NUM_LITERAL:
				sequence_NumLiteral(context, (NumLiteral) semanticObject); 
				return; 
			case EasySqlPackage.RIN_LITERAL:
				sequence_RinLiteral(context, (RinLiteral) semanticObject); 
				return; 
			case EasySqlPackage.SIMPLE_SELECT_QUERY:
				sequence_SimpleSelectQuery(context, (SimpleSelectQuery) semanticObject); 
				return; 
			case EasySqlPackage.SINGLE_SELECT_DECLARATION:
				sequence_SingleSelectDeclaration(context, (SingleSelectDeclaration) semanticObject); 
				return; 
			case EasySqlPackage.SQL_PROGRAM:
				sequence_SqlProgram(context, (SqlProgram) semanticObject); 
				return; 
			case EasySqlPackage.STR_LITERAL:
				sequence_StrLiteral(context, (StrLiteral) semanticObject); 
				return; 
			case EasySqlPackage.TABLE_DECLARATION:
				sequence_TableDeclaration(context, (TableDeclaration) semanticObject); 
				return; 
			case EasySqlPackage.UPDATE:
				sequence_Update(context, (Update) semanticObject); 
				return; 
			case EasySqlPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case EasySqlPackage.VVALUE:
				sequence_Vvalue(context, (Vvalue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Delete
	 *     ManipulateStatement returns Delete
	 *     Delete returns Delete
	 *
	 * Constraint:
	 *     (table=[TableDeclaration|ID] deletecondition+=Equation*)
	 */
	protected void sequence_Delete(ISerializationContext context, Delete semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Equation returns Equation
	 *
	 * Constraint:
	 *     (attribute=ID operator=Operator value=MultiType separation+=','*)
	 */
	protected void sequence_Equation(ISerializationContext context, Equation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Insert
	 *     ManipulateStatement returns Insert
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     (table=[TableDeclaration|ID] insert_data+=Value*)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns JoinQuery
	 *     QueryStatement returns JoinQuery
	 *     JoinQuery returns JoinQuery
	 *
	 * Constraint:
	 *     (Jtable1=[TableDeclaration|ID] Jattributes+=Vvalue* jointype=Join Jtable2=[TableDeclaration|ID] joincondition+=MultiEquation*)
	 */
	protected void sequence_JoinQuery(ISerializationContext context, JoinQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiEquation returns MultiEquation
	 *
	 * Constraint:
	 *     (EquationLeft=Vvalue operator=Operator EquationRight=Vvalue)
	 */
	protected void sequence_MultiEquation(ISerializationContext context, MultiEquation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.MULTI_EQUATION__EQUATION_LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.MULTI_EQUATION__EQUATION_LEFT));
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.MULTI_EQUATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.MULTI_EQUATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.MULTI_EQUATION__EQUATION_RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.MULTI_EQUATION__EQUATION_RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiEquationAccess().getEquationLeftVvalueParserRuleCall_0_0(), semanticObject.getEquationLeft());
		feeder.accept(grammarAccess.getMultiEquationAccess().getOperatorOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getMultiEquationAccess().getEquationRightVvalueParserRuleCall_2_0(), semanticObject.getEquationRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns NestedQuery
	 *     QueryStatement returns NestedQuery
	 *     NestedQuery returns NestedQuery
	 *
	 * Constraint:
	 *     (Ntable=[TableDeclaration|ID] Nattributes+=Value* Nattributes1+=Value* subselectquery=[SingleSelectDeclaration|ID])
	 */
	protected void sequence_NestedQuery(ISerializationContext context, NestedQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiType returns NumLiteral
	 *     NumLiteral returns NumLiteral
	 *
	 * Constraint:
	 *     var=INT
	 */
	protected void sequence_NumLiteral(ISerializationContext context, NumLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.NUM_LITERAL__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.NUM_LITERAL__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumLiteralAccess().getVarINTTerminalRuleCall_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MultiType returns RinLiteral
	 *     RinLiteral returns RinLiteral
	 *
	 * Constraint:
	 *     var=STRING
	 */
	protected void sequence_RinLiteral(ISerializationContext context, RinLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.RIN_LITERAL__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.RIN_LITERAL__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRinLiteralAccess().getVarSTRINGTerminalRuleCall_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SimpleSelectQuery
	 *     QueryStatement returns SimpleSelectQuery
	 *     SimpleSelectQuery returns SimpleSelectQuery
	 *
	 * Constraint:
	 *     (
	 *         Stable=[TableDeclaration|ID] 
	 *         Sattributes+=Value* 
	 *         simplecondition+=Equation* 
	 *         removeDup+='.RemoveDuplication()'? 
	 *         (ordertype=Order SCattributes+=Value*)?
	 *     )
	 */
	protected void sequence_SimpleSelectQuery(ISerializationContext context, SimpleSelectQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SingleSelectDeclaration
	 *     SingleSelectDeclaration returns SingleSelectDeclaration
	 *
	 * Constraint:
	 *     (name=ID singleSelect=SimpleSelectQuery)
	 */
	protected void sequence_SingleSelectDeclaration(ISerializationContext context, SingleSelectDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.SINGLE_SELECT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.SINGLE_SELECT_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.SINGLE_SELECT_DECLARATION__SINGLE_SELECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.SINGLE_SELECT_DECLARATION__SINGLE_SELECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleSelectDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSingleSelectDeclarationAccess().getSingleSelectSimpleSelectQueryParserRuleCall_3_0(), semanticObject.getSingleSelect());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SqlProgram returns SqlProgram
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_SqlProgram(ISerializationContext context, SqlProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiType returns StrLiteral
	 *     StrLiteral returns StrLiteral
	 *
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_StrLiteral(ISerializationContext context, StrLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.STR_LITERAL__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.STR_LITERAL__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStrLiteralAccess().getVarIDTerminalRuleCall_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns TableDeclaration
	 *     TableDeclaration returns TableDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TableDeclaration(ISerializationContext context, TableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EasySqlPackage.Literals.TABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EasySqlPackage.Literals.TABLE_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Update
	 *     ManipulateStatement returns Update
	 *     Update returns Update
	 *
	 * Constraint:
	 *     (table=[TableDeclaration|ID] modification+=Equation* updatecondition+=Equation*)
	 */
	protected void sequence_Update(ISerializationContext context, Update semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Value
	 *
	 * Constraint:
	 *     (value=MultiType separation+=','*)
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Vvalue returns Vvalue
	 *
	 * Constraint:
	 *     (table=[TableDeclaration|ID] attribute=MultiType separation+=','*)
	 */
	protected void sequence_Vvalue(ISerializationContext context, Vvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
