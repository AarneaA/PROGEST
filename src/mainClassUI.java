import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;


public class mainClassUI {

    private static JFrame mainWindow;
    private static JTextArea input;
    private static JTextArea output;

	public static void initUI() {
		mainWindow = new JFrame();
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.PAGE_AXIS));
        mainWindow.add(innerPanel);
		
		setUpMenus(mainWindow);
		setUpTextAreas(innerPanel);
		setUpMainWindow(mainWindow);
	}
	
	public static void setUpMenus(JFrame mainWindow) {
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("Fail");
		JMenuItem save = new JMenuItem("Salvesta");
		JMenuItem load = new JMenuItem("Laadi");

        save.addActionListener(new SaveAction());
		file.add(save);
        load.addActionListener(new LoadAction());
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
	
	public static void setUpTextAreas(JPanel innerPanel) {
		JPanel upper = new JPanel();
		JPanel lower = new JPanel();
        JLabel upper_label = new JLabel("Input");
        JLabel lower_label = new JLabel("Output");
        innerPanel.add(upper_label);
		innerPanel.add(upper);
        innerPanel.add(lower_label);
		innerPanel.add(lower);
		
		input = new JTextArea("", 25, 70);
		input.setLineWrap(true);
		upper.add(input);
		
		output = new JTextArea("", 25, 70);
		output.setLineWrap(false);
        output.setEditable(false);
		lower.add(output);
	}

    public static class SaveAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            FileDialog fd = new FileDialog(mainWindow, "Save", FileDialog.SAVE);
            fd.setVisible(true);
            String code = input.getText();
            String path = fd.getDirectory() + fd.getFile();
            try (PrintStream out = new PrintStream(new FileOutputStream(path))) {
                out.print(code);
            } catch (FileNotFoundException ex) {
                System.out.println("An Error occurred while saving the file: " + ex.getMessage());
            }
        }
    }

    public static class LoadAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            FileDialog fd = new FileDialog(mainWindow, "Load", FileDialog.LOAD);
            fd.setVisible(true);
            String path = fd.getDirectory() + fd.getFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String code = "";
                String line;
                while ((line = reader.readLine()) != null) {
                    code += line;
                }
                input.setText(code);
            } catch (FileNotFoundException ex) {
                System.out.println("An error occurred while loading the file : " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("An error occurred while loading the file: " + ex.getMessage());
            }
        }
    }
	
	public static void setUpMainWindow(JFrame mainWindow) {
		mainWindow.setTitle("PROGEST IDE");
		mainWindow.setSize(960, 1000);
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainWindow.pack();
		mainWindow.setResizable(false);
		mainWindow.setVisible(true);
	}

}
