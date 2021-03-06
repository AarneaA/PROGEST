

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ASTclasses.ArvLiteraal;
import ASTclasses.AvaldisLause;
import ASTclasses.FunktsiooniKutse;
import ASTclasses.IgaLause;
import ASTclasses.KuiLause;
import ASTclasses.KuniLause;
import ASTclasses.LauseteJada;
import ASTclasses.Literaal;
import ASTclasses.MurdArvLiteraal;
import ASTclasses.Muutuja;
import ASTclasses.Omistamine;
import ASTclasses.PuuTipp;
import ASTclasses.SoneLiteraal;

import parser.PROGESTLexer;
import parser.PROGESTParser;
import parser.PROGESTParser.AdditionSubtractionContext;
import parser.PROGESTParser.AssignmentContext;
import parser.PROGESTParser.ComparisonContext;
import parser.PROGESTParser.ForSentenceContext;
import parser.PROGESTParser.FunctionCallContext;
import parser.PROGESTParser.IfSentenceContext;
import parser.PROGESTParser.MultiplicationDivisionContext;
import parser.PROGESTParser.NegativesContext;
import parser.PROGESTParser.NumberLiteralContext;
import parser.PROGESTParser.ProgramContext;
import parser.PROGESTParser.RangeContext;
import parser.PROGESTParser.SentenceContext;
import parser.PROGESTParser.SentencesContext;
import parser.PROGESTParser.StringLiteralContext;
import parser.PROGESTParser.VariableLiteralContext;
import parser.PROGESTParser.WhileSentenceContext;

public class PROGESTi {
	private static ParseTree createParseTree(String program) {
	    ANTLRInputStream antlrInput = new ANTLRInputStream(program);
	    PROGESTLexer lexer = new PROGESTLexer(antlrInput);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    PROGESTParser parser = new PROGESTParser(tokens);
	    ParseTree tree = parser.program();
	    return tree;
	}
	
	private static PuuTipp parseTreeToAst(ParseTree tree){
		if (tree instanceof StringLiteralContext) {
				String stringlit = (String) tree.getText().substring(1, tree.getText().length()-1);
			return new SoneLiteraal(stringlit);
		}
		else if(tree instanceof NumberLiteralContext) {
			if(tree.getText().contains(".")){
				return new MurdArvLiteraal(Double.parseDouble(tree.getText()));
			}
			else {
				return new ArvLiteraal(Integer.parseInt(tree.getText()));
			}
		}
		else if(tree instanceof VariableLiteralContext) {
			return new Muutuja(tree.getText());
		}
		else if(tree instanceof FunctionCallContext){
			List<PuuTipp> argumendid = new ArrayList<PuuTipp>();
			if(tree.getChildCount() > 3){
			for(int i = 0; i < tree.getChildCount(); i++){

				if(i%2 == 0 && i != 0) {
					PuuTipp argument = (PuuTipp) parseTreeToAst(tree.getChild(i));
					argumendid.add(argument);
				}
			}
			}
			return new FunktsiooniKutse(tree.getChild(0).getText(), argumendid);
		}
		else if(tree instanceof NegativesContext){
			List argumendid = new ArrayList();
			argumendid.add(parseTreeToAst(tree.getChild(0).getChild(1)));

			return new FunktsiooniKutse("-", argumendid);
		}
		else if(tree instanceof MultiplicationDivisionContext 
				|| tree instanceof AdditionSubtractionContext
				|| tree instanceof ComparisonContext
				|| tree instanceof RangeContext){
			String op = tree.getChild(1).getText();
			 PuuTipp left =(PuuTipp) parseTreeToAst(tree.getChild(0));
			 PuuTipp right = (PuuTipp) parseTreeToAst(tree.getChild(2));
			 return new FunktsiooniKutse(op, Arrays.asList(left, right));
		}
		else if(tree instanceof AssignmentContext){
			String muutuja = tree.getChild(0).getText();
			PuuTipp value = (PuuTipp) parseTreeToAst(tree.getChild(2));
			return new Omistamine(muutuja, value);
		}
		else if(tree instanceof ForSentenceContext){
			PuuTipp variable = (PuuTipp) parseTreeToAst(tree.getChild(1));
			PuuTipp range = (PuuTipp) parseTreeToAst(tree.getChild(3));
			PuuTipp body = parseTreeToAst(tree.getChild(5));
			return new IgaLause(variable, range, body);
		}
		else if(tree instanceof WhileSentenceContext){
			if(tree.getChild(1) instanceof ComparisonContext){
				PuuTipp tingimus = (PuuTipp) parseTreeToAst(tree.getChild(1));
				PuuTipp stmt = (PuuTipp) parseTreeToAst(tree.getChild(3));
				return new KuniLause(tingimus, stmt);
			}
			else{
				PuuTipp tingimus = (PuuTipp) parseTreeToAst(tree.getChild(3));
				PuuTipp stmt = (PuuTipp) parseTreeToAst(tree.getChild(1));
				return new KuniLause(tingimus, stmt);
			}
		}
		else if (tree instanceof IfSentenceContext){
			PuuTipp tingimus = (PuuTipp) parseTreeToAst(tree.getChild(1));
			PuuTipp thenBranch = (PuuTipp) parseTreeToAst(tree.getChild(4));
			PuuTipp elseBranch = (PuuTipp) parseTreeToAst(tree.getChild(8));
			return new KuiLause(tingimus, thenBranch, elseBranch);
		}
		else if (tree instanceof SentenceContext){
			if (tree.getChildCount() == 1) {
				PuuTipp child = parseTreeToAst(tree.getChild(0));
	            if (child instanceof PuuTipp) {
	                return new AvaldisLause((PuuTipp) child);
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
			List<PuuTipp> laused = new ArrayList<PuuTipp>();
			 for(int i = 0; i<tree.getChildCount(); i++){
				 if((i+1)%2==1){
					 laused.add((PuuTipp) parseTreeToAst(tree.getChild(i)));	 
				 }
			 }
			 return new LauseteJada(laused);
		}
		else if(tree instanceof ProgramContext) {
			return parseTreeToAst(tree.getChild(0));
		}
		else{
			System.out.println("Viga koodis: Tundmatu meetod!");
			System.out.println(tree.getClass());
			System.out.println(tree.getText());
		return null;
		}
	}
	
	public static PuuTipp generateAST(String Code){
		PuuTipp AST = parseTreeToAst(createParseTree(Code));
		return AST;
	}
	static Map<String,Object> variableMap = new HashMap<String, Object>();
	public static Object interpretElement(PuuTipp tree){
		if(tree instanceof ArvLiteraal){
			return ((ArvLiteraal) tree).getValue();
		}
		else if(tree instanceof Muutuja){
			return ((Literaal) variableMap.get(((Muutuja) tree).getName())).getValue();
		}
		else if(tree instanceof FunktsiooniKutse){
			int left = (int) interpretElement(((FunktsiooniKutse) tree).getArguments().get(0));
			int right = (int) interpretElement(((FunktsiooniKutse) tree).getArguments().get(1));
		if(((FunktsiooniKutse) tree).getFunctionName().equals("+")){
			return left+right;
		}
		else if(((FunktsiooniKutse) tree).getFunctionName().equals("-")){
			return left - right;
		}
		else if(((FunktsiooniKutse) tree).getFunctionName().equals("*")){
			return left * right;
		}
		else if(((FunktsiooniKutse) tree).getFunctionName().equals("/")){
			return left / right;
		}
		else{
		return null;
		}
		}
		else if(tree instanceof Literaal){
			return ((Literaal<Integer>) tree).getValue();
		}
		else{
		List<Object> treeList = tree.getChildren();
		for(int i = 0; i< treeList.size(); i++){
			Object currentNode = treeList.get(i);
			if(currentNode instanceof AvaldisLause){
				interpretElement((AvaldisLause) currentNode);
			}
			else if(currentNode instanceof KuniLause){
				while((boolean) interpretElement(((KuniLause) currentNode))){
					interpretElement(((KuniLause) currentNode).getBody());
				}
			}
			else if(currentNode instanceof KuiLause){
				if((boolean) interpretElement(((KuiLause) currentNode))){
					interpretElement(((KuiLause) currentNode).getSiis());
				}
				else{
					interpretElement(((KuiLause) currentNode).getMuidu());
				}
			}
			else if(currentNode instanceof IgaLause){
				
				int start = (int) interpretElement((PuuTipp) ((IgaLause) currentNode).getRange().getChildren().get(1));
				int end = (int) interpretElement((PuuTipp) ((IgaLause) currentNode).getRange().getChildren().get(2));	
				for(int o = start; o < end; o++){
					variableMap.put(((Muutuja) ((IgaLause) currentNode).getVariable()).getName(),new ArvLiteraal(o));
					interpretElement(((IgaLause) currentNode).getBody());
			}
			}
			else if(currentNode instanceof FunktsiooniKutse){
				List<PuuTipp> currentArguments = ((FunktsiooniKutse) currentNode).getArguments();
				if(((FunktsiooniKutse) currentNode).getFunctionName().equals("prindi")){
					if(((FunktsiooniKutse) currentNode).getArguments().get(0) instanceof SoneLiteraal || 
							((FunktsiooniKutse) currentNode).getArguments().get(0) instanceof ArvLiteraal || 
							((FunktsiooniKutse) currentNode).getArguments().get(0) instanceof MurdArvLiteraal){
						System.out.println(((FunktsiooniKutse) currentNode).getArguments().get(0).getChildren().get(0).toString());
					}
					else if(((FunktsiooniKutse) currentNode).getArguments().get(0) instanceof Muutuja){
						System.out.println(((Literaal<Object>) variableMap.get(((FunktsiooniKutse) currentNode).getArguments().get(0).getChildren().get(0))).getValue());
					}
					else if(((FunktsiooniKutse) currentNode).getArguments().get(0) instanceof FunktsiooniKutse){

						System.out.println(interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)));
					}
					}
					else if(((FunktsiooniKutse) currentNode).getFunctionName().equals("<")){
						if((int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)) < (int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(1))){
						return true;
						}
					}
					else if(((FunktsiooniKutse) currentNode).getFunctionName().equals(">")){
						if((int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)) > (int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(1))){
							return true;
							}
					}
					else if(((FunktsiooniKutse) currentNode).getFunctionName().equals("==")){
						if((int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)) == (int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(1))){
							return true;
							}
					}
					else if(((FunktsiooniKutse) currentNode).getFunctionName().equals("<=")){
						if((int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)) <= (int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(1))){
							return true;
							}
					}
					else if(((FunktsiooniKutse) currentNode).getFunctionName().equals(">=")){
						if((int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)) >= (int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(1))){
							return true;
							}
					}
					else if(((FunktsiooniKutse) currentNode).getFunctionName().equals("!=")){
						if((int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(0)) != (int) interpretElement(((FunktsiooniKutse) currentNode).getArguments().get(1))){
							return true;
							}
					}
					return false;
				}

				else if (currentNode instanceof Omistamine){
					variableMap.put(((Omistamine) currentNode).getMuutujaNimi(), new Literaal((interpretElement(((Omistamine) currentNode).getAvaldis()))));
				}
			}
		
		return treeList;
		}
	}
	
	public static void runProgram(PuuTipp tree){
		variableMap.clear();
		interpretElement(tree);
	}
	
}
