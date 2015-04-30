
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;

public class ClassifyNB extends JFrame {

    /**
     * The text area which is used for displaying logging information.
     */
    private JTextArea textArea;

	//private JButton buttonStart = new JButton("Start");
    //private JButton buttonClear = new JButton("Clear");
    private JButton buttonOk = new JButton("Ok");
    private PrintStream standardOut;
    private JDialog dialog = new JDialog();
    private String nameOfFile = null;
    
    public ClassifyNB(String nameOfFile) {
        
        super("Test...");
        this.nameOfFile = nameOfFile;
        textArea = new JTextArea(50, 10);
        textArea.setEditable(false);
        PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));

        // keeps reference of standard output stream
        standardOut = System.out;

        // re-assigns standard output stream and error output stream
        System.setOut(printStream);
        System.setErr(printStream);

        // creates the GUI
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;

		//add(buttonStart, constraisnts);
        constraints.gridx = 1;
        //add(buttonClear, constraints);
        add(buttonOk, constraints);
        //sadd(dialog,constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;

        add(new JScrollPane(textArea), constraints);

		// adds event handler for button Start
//		buttonStart.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent evt) {
//				printLog();
//			}
//		});
        // adds event handler for button Clear
//		buttonClear.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent evt) {
//				// clears the text area
//				try {
//					textArea.getDocument().remove(0,
//							textArea.getDocument().getLength());
//					standardOut.println("Text area cleared");
//				} catch (BadLocationException ex) {
//					ex.printStackTrace();
//				}
//			}
//		});
        this.printLog(this.nameOfFile);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 320);
        setLocationRelativeTo(null);	// centers on screen
    }

    /**
     * Prints log statements for testing in a thread
     */
    public void printLog(String finalname) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
				//while (true) {

					myproject.Classify.getWordCount1(finalname);
                                        buttonOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				//TextAreaLogProgram obj = new TextAreaLogProgram();
                                
                                home obj = new home();
                                obj.show();
                                
                                
//                               
			}
		});
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException ex) {
//						ex.printStackTrace();
//					}
                //}
            }
        });
        thread1.start();
    }

    /**
     * Runs the program
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              new ClassifyNB(null).setVisible(true);
            }
        });
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perfect
 */

