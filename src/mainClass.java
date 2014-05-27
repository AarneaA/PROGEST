import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ASTclasses.PuuTipp;

public class mainClass {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("sample_syntax.est"));
		String code = "";
		String line;
		while ((line = reader.readLine()) != null) {
			code += line;
		}
		System.out.println(code);
		reader.close();
		PuuTipp astree = PROGESTi.generateAST(code); 
		PROGESTi.runProgram(astree);
	
	/*for(int i = 0; i<astree.getChildren().size(); i++){
		System.out.println(astree.getChildren().get(i));
	}*/
	
	}
}