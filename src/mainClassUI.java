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


public class mainClassUI {
	public static void initUI() {
		JFrame mainWindow = new JFrame();
		
		setUpMenus(mainWindow);
		setUpTextAreas(mainWindow);
		setUpMainWindow(mainWindow);
	}
	
	public static void setUpMenus(JFrame mainWindow) {
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("Fail");
		JMenuItem save = new JMenuItem("Salvesta");
		JMenuItem load = new JMenuItem("Laadi");
		
		file.add(save);
		file.add(load);
		menu.add(file);
		
		JMenu code = new JMenu("Kood");
		JMenuItem run = new JMenuItem("Jooksuta");
		JMenuItem clean = new JMenuItem("Tühjenda");
		
		code.add(run);
		code.add(clean);
		menu.add(code);
		
		mainWindow.setJMenuBar(menu);
	}
	
	public static void setUpTextAreas(JFrame mainWindow) {
		JPanel upper = new JPanel();
		JPanel lower = new JPanel();
		mainWindow.getContentPane().add(upper, "North");
		mainWindow.getContentPane().add(lower, "South");
		
		JTextArea input = new JTextArea("Tere", 25, 70);
		input.setLineWrap(true);
		upper.add(input);
		
		JTextArea output = new JTextArea("Tere", 25, 70);
		output.setLineWrap(false);
		lower.add(output);
	}
	
	public static void setUpMainWindow(JFrame mainWindow) {
		mainWindow.setTitle("PROGEST IDE");
		mainWindow.setSize(960, 1000);
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.pack();
		mainWindow.setResizable(false);
		mainWindow.setVisible(true);
	}

}
