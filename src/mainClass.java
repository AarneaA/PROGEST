import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ASTclasses.PuuTipp;

public class mainClass extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public mainClass() {
		initUI();
	}
	
	public void initUI() {
		JPanel upper = new JPanel();
		JPanel lower = new JPanel();
		getContentPane().add(upper, "North");
		getContentPane().add(lower, "South");
		
		JTextArea input = new JTextArea("Tere", 25, 70);
		input.setLineWrap(true);
		upper.add(input);
		
		JTextArea output = new JTextArea("Tere", 25, 70);
		output.setLineWrap(false);
		lower.add(output);
		
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("Fail");
		JMenuItem save = new JMenuItem("Salvesta");
		JMenuItem load = new JMenuItem("Laadi");
		
		file.add(save);
		file.add(load);
		menu.add(file);
		
		setJMenuBar(menu);
		
		setTitle("PROGEST IDE");
		setSize(960, 1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException {
        mainClass ex = new mainClass();
        ex.setVisible(true);
		
		BufferedReader reader = new BufferedReader(new FileReader("sample_syntax.est"));
		String code = "";
		String line;
		while ((line = reader.readLine()) != null) {
			code += line;
		}
		//System.out.println(code);
		reader.close();
		PuuTipp astree = PROGESTi.generateAST(code); 
		PROGESTi.runProgram(astree);
	
	/*for(int i = 0; i<astree.getChildren().size(); i++){
		System.out.println(astree.getChildren().get(i));
	}*/
	
	}
}