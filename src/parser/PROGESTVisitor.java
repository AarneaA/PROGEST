package parser;

// Generated from /Users/taavikala/kool/PROGEST/src/parser/PROGEST.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PROGESTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PROGESTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PROGESTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PROGESTParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull PROGESTParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull PROGESTParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PROGESTParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#whileSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSentence(@NotNull PROGESTParser.WhileSentenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(@NotNull PROGESTParser.SentenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(@NotNull PROGESTParser.SentencesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PROGESTParser#ifSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSentence(@NotNull PROGESTParser.IfSentenceContext ctx);
}