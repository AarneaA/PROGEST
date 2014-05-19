// Generated from /Users/taavikala/kool/PROGEST/src/parser/PROGEST.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PROGESTParser}.
 */
public interface PROGESTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PROGESTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PROGESTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PROGESTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PROGESTParser.ExpressionContext ctx);

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