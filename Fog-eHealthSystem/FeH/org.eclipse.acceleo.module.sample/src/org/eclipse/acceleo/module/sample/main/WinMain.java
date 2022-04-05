package org.eclipse.acceleo.module.sample.main;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import org.eclipse.acceleo.module.sample.Java.JavaServices;
import org.eclipse.acceleo.module.sample.main.Launcher;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Window;
import javax.swing.ImageIcon;
import java.awt.Button;

public class WinMain
{
	private JFrame frmFeHTransformationEngine;
	private JTextField inputFileField;
	private JTextField destField;
	private JCheckBox openFileCheck;
	private JTextArea msgTextArea;
	private Launcher launcher;
	public static String SelectionMethod;
	/**
	 * Create the application.
	 */
	public WinMain(Launcher launcher)
	{
		this.launcher = launcher;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					frmFeHTransformationEngine = new JFrame();
					frmFeHTransformationEngine.setTitle("MFeHTE");
					frmFeHTransformationEngine.setBounds(100, 100, 795, 497);
					frmFeHTransformationEngine.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					initialize();
					frmFeHTransformationEngine.setVisible(true);
					inputFileField.requestFocusInWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		frmFeHTransformationEngine.getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);
		centerPanel.requestFocusInWindow();
		
		JButton aboutButton = new JButton("i");
		aboutButton.setForeground(new Color(0, 0, 0));
		aboutButton.setRequestFocusEnabled(false);
		aboutButton.setOpaque(false);
		aboutButton.setBackground(new Color(255, 204, 255));
		aboutButton.setMargin(new Insets(2, 2, 2, 2));
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Transformation Engine Version: "+
						Launcher.SVOCL_ENGINE_VER+"\n sample-CG Build: "+Launcher.SVOCL_BUILD, "About",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		aboutButton.setToolTipText("About");
		aboutButton.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		aboutButton.setBounds(730, 11, 26, 23);
		centerPanel.add(aboutButton);
		JLabel inputFileLabel = new JLabel("Input Model:");
		inputFileLabel.setForeground(SystemColor.WHITE);
		inputFileLabel.setFont(new Font("Thoma", Font.PLAIN, 14));
		inputFileLabel.setBounds(20, 26, 166, 20);
		centerPanel.add(inputFileLabel);
		
		inputFileField = new JTextField();
		inputFileField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		inputFileField.setBounds(186, 25, 355, 24);
		centerPanel.add(inputFileField);
		inputFileField.setColumns(10);
					
		destField = new JTextField();
		destField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		destField.setColumns(10);
		destField.setBounds(186, 75, 355, 24);
		centerPanel.add(destField);
		
		JLabel destFolderLabel = new JLabel("Destination Folder:");
		destFolderLabel.setForeground(SystemColor.WHITE);
		destFolderLabel.setFont(new Font("Thoma", Font.PLAIN, 14));
		destFolderLabel.setBounds(20, 80, 121, 14);
		centerPanel.add(destFolderLabel);
		
		JPanel msgPanel = new JPanel();
		msgPanel.setForeground(SystemColor.textHighlight);
		FlowLayout flowLayout = (FlowLayout) msgPanel.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setHgap(2);
		msgPanel.setFont(new Font("Thoma", Font.PLAIN, 14));
		msgPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Transformation Status", TitledBorder.LEADING, TitledBorder.TOP,
				new Font("Vernada", Font.BOLD, 14), Color.BLACK));
		msgPanel.setBackground(Color.WHITE);
		msgPanel.setPreferredSize(new Dimension(40, 140));
		msgPanel.setBounds(38, 222, 623, 108);
		centerPanel.add(msgPanel);
		
		msgTextArea = new JTextArea();
		msgPanel.add(msgTextArea);
		msgTextArea.setFocusable(false);
		msgTextArea.setForeground(Color.BLACK);
		msgTextArea.setFont(new Font("Dialog", Font.PLAIN, 14));
		msgTextArea.setBackground(Color.WHITE);
		msgTextArea.setEditable(false);
		msgTextArea.setPreferredSize(new Dimension(583, 55));
		
		openFileCheck = new JCheckBox("Open Generated Files");
		openFileCheck.setBackground(Color.WHITE);
		openFileCheck.setForeground(SystemColor.desktop);
		openFileCheck.setSelected(true);
		openFileCheck.setFont(new Font("Thoma", Font.PLAIN, 14));
		openFileCheck.setBounds(38, 184, 233, 23);
		centerPanel.add(openFileCheck);
		
	
		Button inputmodel = new Button("Browse");
		inputmodel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileFilter(new FileNameExtensionFilter("uml", "uml"));
				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("xmi", "xmi"));
				if (fileChooser.showOpenDialog(frmFeHTransformationEngine) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					inputFileField.setText(file.getPath());
				}
			}
		});
		inputmodel.setFont(new Font("Dialog", Font.PLAIN, 16));
		inputmodel.setForeground(Color.BLACK);
		inputmodel.setBackground(Color.WHITE);
		inputmodel.setBounds(553, 25, 100, 25);
		centerPanel.add(inputmodel);
		
		
		
		Button destination = new Button("Browse");
		destination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (fileChooser.showOpenDialog(frmFeHTransformationEngine) == JFileChooser.APPROVE_OPTION) {
				  File file = fileChooser.getSelectedFile();
				  destField.setText(file.getPath());
				  // load from file
				}
			}
		});
		destination.setFont(new Font("Dialog", Font.PLAIN, 16));
		destination.setForeground(Color.BLACK);
		destination.setBackground(Color.WHITE);
		destination.setBounds(553, 75, 105, 25);
		centerPanel.add(destination);
		
		Button resetbtn = new Button("Reset");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputFileField.setText("");
				destField.setText("");
				openFileCheck.setSelected(true);
				msgTextArea.setText("");
			}
		});
		resetbtn.setForeground(Color.BLACK);
		resetbtn.setFont(new Font("Dialog", Font.PLAIN, 16));
		resetbtn.setBackground(Color.WHITE);
		resetbtn.setBounds(365, 162, 140, 40);
		centerPanel.add(resetbtn);
		
		Button generateBtn = new Button("Generate");
		generateBtn.setFont(new Font("Dialog", Font.PLAIN, 16));
		generateBtn.setForeground(Color.BLACK);
		generateBtn.setBackground(Color.WHITE);
	
		generateBtn.setBounds(520, 162, 140, 40);
		centerPanel.add(generateBtn);
		generateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//msgTextArea.setText("Model to Text Transformation is in process, please wait....");
				
			      System.out.println("Engine Start Time: " + new Date().toString());
				
				boolean launch = true;
					if (launch){
						msgTextArea.setText("Model to Text Transformation is in process, please wait....");
						msgTextArea.update(msgTextArea.getGraphics());
						String args[] = new String[2];
						args[0] = getInputPath().replace('\\', '/');
						args[1] = getDestFolder().replace('\\', '/');
						getFileStatus();
						//msgTextArea.setText("Model to Text Transformation is in process, please wait....");
						JavaServices.reset();
						JavaServices.setDesignFileName(args[0]);
						System.out.println("Engine Start_1 Time: " + new Date().toString());
						Generate.main(args);
						System.out.println("Engine Start_2 Time: " + new Date().toString());
						//msgTextArea.setText("Model to Text Transformation completed.");
						JavaServices js=new JavaServices();
												
						if(isOpenFiles()==true)
						{
						openAllFilesFromFolder();
						}
					}
					//msgTextArea.setText("Model to Text Transformation completed.");
					msgTextArea.setText("Model to Text Transformation completed");
					msgTextArea.update(msgTextArea.getGraphics());
					 System.out.println("Engine End Time: " + new Date().toString());
				}
		});
		
		Button button_4 = new Button("Open Folder");
		button_4.addActionListener(new ActionListener() {
			String path = null;
			public void actionPerformed(ActionEvent event) {
				
				path = getDestFolder()+"\\";
				if(path != null && (new File(path)).exists()) {
					try {
						Runtime.getRuntime().exec("explorer.exe " + path);
					} catch (IOException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				}
			}
		});
		
		button_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		button_4.setForeground(Color.BLACK);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(530, 341, 130, 25);
		centerPanel.add(button_4);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(WinMain.class.getResource("/org/eclipse/acceleo/module/sample/main/img6.jpg")));
		lblNewLabel.setBounds(10, 6, 759, 441);
		centerPanel.add(lblNewLabel);
		
		destField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				textChangedAction();
			}
			public void removeUpdate(DocumentEvent e) {
				textChangedAction();
			}
			public void insertUpdate(DocumentEvent e) {
				textChangedAction();
			}
			
			public void textChangedAction() {
				refreshGenerateBtnStatus();
			}
			private void refreshGenerateBtnStatus() {
				// TODO Auto-generated method stub
				
			}
		});
		
		inputFileField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				textChangedAction();
			}
			public void removeUpdate(DocumentEvent e) {
				textChangedAction();
			}
			public void insertUpdate(DocumentEvent e) {
				textChangedAction();
			}
			
			public void textChangedAction() {
				String fname = inputFileField.getText();
				if (!fname.isEmpty()){
					int ind = fname.lastIndexOf('\\');
					if(ind != -1) {
						fname = fname.substring(ind+1);
					}
					ind = fname.lastIndexOf('.');
					if(ind != -1) {
						fname = fname.substring(0, ind);
					}
					
				}
				refreshGenerateBtnStatus();
			}
			private void refreshGenerateBtnStatus() {
				// TODO Auto-generated method stub
				
			}
		});
		
				
		refreshGenerateBtnStatus();
	}
	private void refreshGenerateBtnStatus() {
		// TODO Auto-generated method stub
		
	}
	public void openAllFilesFromFolder()
	{
		String path=getDestFolder()+"\\";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i=0; i<listOfFiles.length; i++)
		{
			File file = listOfFiles[i]; 
		    if (file.isFile()) {
		    	try {
		    		int index = file.getName().lastIndexOf(".");

		    		if (index > 0 && file.getName().substring(index).equalsIgnoreCase(".java")) {
					Runtime.getRuntime().exec("Notepad.exe " + file.getPath());
		    		}
				} catch (IOException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
		    }
		}
	}
	
	public String getInputPath()
	{
		return inputFileField.getText();
	}
	
	private boolean fileExistsInDest()
	{
		boolean checkfile=false;
		
		String path=getDestFolder()+"\\";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for (int i=0; i<listOfFiles.length; i++)
		{
			File file = listOfFiles[i]; 
		    if (file.isFile()) {
	    		int index = file.getName().lastIndexOf(".");
	    		if (index > 0 && file.getName().substring(index).equalsIgnoreCase(".java")) {
	    		checkfile=true;
	    		}
		    }
		}
		return checkfile;
	}
	private boolean getFileStatus()
	{
		boolean status = true;
		if(fileExistsInDest()) {
			int op = JOptionPane.showConfirmDialog(frmFeHTransformationEngine,"File already exists.\nDo you want to replace it?", "",JOptionPane.YES_NO_OPTION);
			if(op == JOptionPane.YES_OPTION) {
				if(fileExistsInDest()) {
					String path=getDestFolder()+"\\";
					File folder = new File(path);
					File[] listOfFiles = folder.listFiles();
					for (int i=0; i<listOfFiles.length; i++)
					{
						File file = listOfFiles[i]; 
					    if (file.isFile()) {
					    		int index = file.getName().lastIndexOf(".");

					    		if (index > 0 && file.getName().substring(index).equalsIgnoreCase(".java")) {
					    		file.delete();
					    		}
					    }
					}
					if(fileExistsInDest()) {
						status = false;
						JOptionPane.showMessageDialog(frmFeHTransformationEngine," Some files are opened, please close it first.",
						   "", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else {
				status = false;
			}
		}
		return status;
	}
	public String getDestFolder()
	{
		return destField.getText();
	}
	public boolean isOpenFiles()
	{
		return openFileCheck.isSelected();
	}
	public void setMessage(String msg)
	{
		msgTextArea.setText(msg);
		msgTextArea.update(msgTextArea.getGraphics());
	}
}
