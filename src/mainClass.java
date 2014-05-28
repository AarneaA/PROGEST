import java.io.IOException;

public class mainClass{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public mainClass() {
		mainClassUI.initUI();
	}
	
	public static void main(String[] args) throws IOException {
        new mainClass();
		
//		BufferedReader reader = new BufferedReader(new FileReader("sample_syntax.est"));
//		String code = "";
//		String line;
//		while ((line = reader.readLine()) != null) {
//			code += line;
//		}
//		//System.out.println(code);
//		reader.close();
//		PuuTipp astree = PROGESTi.generateAST(code); 
//		PROGESTi.runProgram(astree);
	
	/*for(int i = 0; i<astree.getChildren().size(); i++){
		System.out.println(astree.getChildren().get(i));
	}*/
	
	}
}