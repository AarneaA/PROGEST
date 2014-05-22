

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PROGESTLexer;
import parser.PROGESTParser;
import parser.PROGESTParser.AdditionSubtractionContext;
import parser.PROGESTParser.AssignmentContext;
import parser.PROGESTParser.ComparisonContext;
import parser.PROGESTParser.DeclarationContext;
import parser.PROGESTParser.FunctionCallContext;
import parser.PROGESTParser.IfSentenceContext;
import parser.PROGESTParser.ExpressionsContext;
import parser.PROGESTParser.MultiplicationDivisionContext;
import parser.PROGESTParser.NegativesContext;
import parser.PROGESTParser.NumberLiteralContext;
import parser.PROGESTParser.ProgramContext;
import parser.PROGESTParser.SentenceContext;
import parser.PROGESTParser.SentencesContext;
import parser.PROGESTParser.StringLiteralContext;
import parser.PROGESTParser.VariableLiteralContext;
import parser.PROGESTParser.WhileSentenceContext;

import ee.ut.cs.akt.aktk.ast.Assignment;
import ee.ut.cs.akt.aktk.ast.AstNode;
import ee.ut.cs.akt.aktk.ast.Block;
import ee.ut.cs.akt.aktk.ast.Expression;
import ee.ut.cs.akt.aktk.ast.ExpressionStatement;
import ee.ut.cs.akt.aktk.ast.FloatingPointLiteral;
import ee.ut.cs.akt.aktk.ast.FunctionCall;
import ee.ut.cs.akt.aktk.ast.IfStatement;
import ee.ut.cs.akt.aktk.ast.IntegerLiteral;
import ee.ut.cs.akt.aktk.ast.Statement;
import ee.ut.cs.akt.aktk.ast.StringLiteral;
import ee.ut.cs.akt.aktk.ast.Variable;
import ee.ut.cs.akt.aktk.ast.VariableDeclaration;
import ee.ut.cs.akt.aktk.ast.WhileStatement;



public class PROGESTi {
	private static ParseTree createParseTree(String program) {
		//Private 
	    ANTLRInputStream antlrInput = new ANTLRInputStream(program);
	    PROGESTLexer lexer = new PROGESTLexer(antlrInput);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    PROGESTParser parser = new PROGESTParser(tokens);
	    ParseTree tree = parser.program();
	    //System.out.println(tree.toStringTree(parser));
	    return tree;
	}
	
	private static AstNode parseTreeToAst(ParseTree tree){
		if (tree instanceof StringLiteralContext) {
			String stringlit = tree.getText().substring(1, tree.getText().length()-1);
			return new StringLiteral(stringlit);
		}
		else if(tree instanceof NumberLiteralContext) {
			if(tree.getText().contains(".")){
				return new FloatingPointLiteral(Double.parseDouble(tree.getText()));
			}
			else {
				return new IntegerLiteral(Integer.parseInt(tree.getText()));
			}
		}
		else if(tree instanceof VariableLiteralContext) {
			return new Variable(tree.getText());
		}
		else if(tree instanceof FunctionCallContext){
			List<Expression> argumendid = new ArrayList<Expression>();
			if(tree.getChildCount() > 3){
			for(int i = 0; i < tree.getChildCount(); i++){

				if(i%2 == 0 && i != 0) {
					Expression argument = (Expression) parseTreeToAst(tree.getChild(i));
					argumendid.add(argument);
				}
			}
			}
			return new FunctionCall(tree.getChild(0).getText(), argumendid);
		}
		else if(tree instanceof NegativesContext){
			List argumendid = new ArrayList();
			argumendid.add(parseTreeToAst(tree.getChild(0).getChild(1)));
			System.out.println(tree.getChild(0).getChild(1).getText());
			return new FunctionCall("-", argumendid);
		}
		else if(tree instanceof MultiplicationDivisionContext 
				|| tree instanceof AdditionSubtractionContext
				|| tree instanceof ComparisonContext){
			String op = tree.getChild(1).getText();
			 Expression left =(Expression) parseTreeToAst(tree.getChild(0));
			 Expression right = (Expression) parseTreeToAst(tree.getChild(2));
			 return new FunctionCall(op, Arrays.asList(left, right));
		}
		else if(tree instanceof DeclarationContext){
			String muutuja = tree.getChild(1).getText();
			 if(tree.getChildCount() >= 4){
			 Expression initializer = (Expression) parseTreeToAst(tree.getChild(3));
			 return new VariableDeclaration(muutuja, initializer);
			 }
			 else {
				 Expression initializer = null;
				 return new VariableDeclaration(muutuja, initializer);
			 }
		}
		else if(tree instanceof AssignmentContext){
			String muutuja = tree.getChild(0).getText();
			Expression value = (Expression) parseTreeToAst(tree.getChild(2));
			return new Assignment(muutuja, value);
		}
		else if(tree instanceof WhileSentenceContext){
			//TODO: need to handle when statement is before expression
			Expression tingimus = (Expression) parseTreeToAst(tree.getChild(1));
			Statement stmt = (Statement) parseTreeToAst(tree.getChild(3));
			return new WhileStatement(tingimus, stmt);
		}
		else if (tree instanceof IfSentenceContext){
			Expression tingimus = (Expression) parseTreeToAst(tree.getChild(1));
			Statement thenBranch = (Statement) parseTreeToAst(tree.getChild(3));
			Statement elseBranch = (Statement) parseTreeToAst(tree.getChild(5));
			return new IfStatement(tingimus, thenBranch, elseBranch);
		}
		else if (tree instanceof SentenceContext){
			if (tree.getChildCount() == 1) {
	            AstNode child = parseTreeToAst(tree.getChild(0));
	            if (child instanceof Expression) {
	                return new ExpressionStatement((Expression) child);
	            }
	            else {
	                return child;
	            }
	        }
	        else {
	            assert tree.getChildCount() == 3;
	            return parseTreeToAst(tree.getChild(1));
	        }
		}
		else if (tree instanceof SentencesContext){
			List<Statement> laused = new ArrayList<Statement>();
			 for(int i = 0; i<tree.getChildCount(); i++){
				 if((i+1)%2==1){
					 laused.add((Statement) parseTreeToAst(tree.getChild(i)));	 
				 }
			 }
			 return new Block(laused);
		}
		else if(tree instanceof ProgramContext) {
			return parseTreeToAst(tree.getChild(0));
		}
		else{
			System.out.println("Unhandled nodetype");
			System.out.println(tree.getClass());
			System.out.println(tree.getText());
		return null;
		}
	}
	
	public static AstNode generateAST(String Code){
		System.out.println(createParseTree(Code).getText());
		AstNode AST = parseTreeToAst(createParseTree(Code));
		return AST;
	}
	
}
