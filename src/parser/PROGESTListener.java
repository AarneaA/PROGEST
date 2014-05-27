// Generated from PROGEST.g4 by ANTLR 4.2
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PROGESTParser}.
 */
public interface PROGESTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PROGESTParser#Negatives}.
	 * @param ctx the parse tree
	 */
	void enterNegatives(@NotNull PROGESTParser.NegativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#Negatives}.
	 * @param ctx the parse tree
	 */
	void exitNegatives(@NotNull PROGESTParser.NegativesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#StringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull PROGESTParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#StringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull PROGESTParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#Range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull PROGESTParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#Range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull PROGESTParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull PROGESTParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull PROGESTParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#Expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(@NotNull PROGESTParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#Expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(@NotNull PROGESTParser.ExpressionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#expressionNegatives}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegatives(@NotNull PROGESTParser.ExpressionNegativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#expressionNegatives}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegatives(@NotNull PROGESTParser.ExpressionNegativesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#AdditionSubtraction}.
	 * @param ctx the parse tree
	 */
	void enterAdditionSubtraction(@NotNull PROGESTParser.AdditionSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#AdditionSubtraction}.
	 * @param ctx the parse tree
	 */
	void exitAdditionSubtraction(@NotNull PROGESTParser.AdditionSubtractionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(@NotNull PROGESTParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(@NotNull PROGESTParser.SentencesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull PROGESTParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull PROGESTParser.SentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#NumberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(@NotNull PROGESTParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#NumberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(@NotNull PROGESTParser.NumberLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#forSentence}.
	 * @param ctx the parse tree
	 */
	void enterForSentence(@NotNull PROGESTParser.ForSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#forSentence}.
	 * @param ctx the parse tree
	 */
	void exitForSentence(@NotNull PROGESTParser.ForSentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#FunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PROGESTParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#FunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PROGESTParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#MultiplicationDivision}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationDivision(@NotNull PROGESTParser.MultiplicationDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#MultiplicationDivision}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationDivision(@NotNull PROGESTParser.MultiplicationDivisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#Comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull PROGESTParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#Comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull PROGESTParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PROGESTParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PROGESTParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PROGESTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PROGESTParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#whileSentence}.
	 * @param ctx the parse tree
	 */
	void enterWhileSentence(@NotNull PROGESTParser.WhileSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#whileSentence}.
	 * @param ctx the parse tree
	 */
	void exitWhileSentence(@NotNull PROGESTParser.WhileSentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#VariableLiteral}.
	 * @param ctx the parse tree
	 */
	void enterVariableLiteral(@NotNull PROGESTParser.VariableLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#VariableLiteral}.
	 * @param ctx the parse tree
	 */
	void exitVariableLiteral(@NotNull PROGESTParser.VariableLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PROGESTParser#ifSentence}.
	 * @param ctx the parse tree
	 */
	void enterIfSentence(@NotNull PROGESTParser.IfSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#ifSentence}.
	 * @param ctx the parse tree
	 */
	void exitIfSentence(@NotNull PROGESTParser.IfSentenceContext ctx);
}