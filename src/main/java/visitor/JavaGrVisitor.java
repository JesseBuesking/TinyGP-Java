// Generated from /Users/bartosz/IdeaProjects/TinyGP/src/main/java/antlr/JavaGr.g4 by ANTLR 4.10.1
package visitor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(JavaGrParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(JavaGrParser.Numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#text_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_type(JavaGrParser.Text_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(JavaGrParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_val(JavaGrParser.Bool_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#num_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_val(JavaGrParser.Num_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#declaration_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_var(JavaGrParser.Declaration_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#input_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_vars(JavaGrParser.Input_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#function_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_in(JavaGrParser.Function_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#input_vars_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_vars_2(JavaGrParser.Input_vars_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#function_in_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_in_2(JavaGrParser.Function_in_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#function_to_ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_to_ret(JavaGrParser.Function_to_retContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(JavaGrParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_statement(JavaGrParser.Elif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(JavaGrParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#instruction_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_general(JavaGrParser.Instruction_generalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(JavaGrParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JavaGrParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(JavaGrParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(JavaGrParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#math_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_symbol(JavaGrParser.Math_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#add_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_equals(JavaGrParser.Add_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#subtract_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract_equals(JavaGrParser.Subtract_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#multiply_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_equals(JavaGrParser.Multiply_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#divide_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_equals(JavaGrParser.Divide_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#modulo_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo_equals(JavaGrParser.Modulo_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#math_modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_modification(JavaGrParser.Math_modificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(JavaGrParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#comma_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_identifier(JavaGrParser.Comma_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JavaGrParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaGrParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#add_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_double(JavaGrParser.Add_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#equal_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_double(JavaGrParser.Equal_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#subtract_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract_double(JavaGrParser.Subtract_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#modification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModification(JavaGrParser.ModificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(JavaGrParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JavaGrParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#logic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_statement(JavaGrParser.Logic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#logic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator(JavaGrParser.Logic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#logic_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_condition(JavaGrParser.Logic_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JavaGrParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(JavaGrParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(JavaGrParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(JavaGrParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(JavaGrParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrParser#import_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_op(JavaGrParser.Import_opContext ctx);
}