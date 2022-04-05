package org.eclipse.acceleo.module.sample.main;
import javax.swing.JFrame;
import org.eclipse.acceleo.module.sample.main.WinMain;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.acceleo.module.sample.main.Launcher;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class MainScreen
{
	private JFrame frmFeHTransformationEngine;
	private Launcher launcher;
	public static String SelectionMethod;
	/**
	 * Create the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public MainScreen(Launcher launcher) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{
		
		this.launcher = launcher;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					frmFeHTransformationEngine = new JFrame();
					frmFeHTransformationEngine.getContentPane().setBackground(Color.WHITE);
					frmFeHTransformationEngine.setTitle("MFeHTE");
					frmFeHTransformationEngine.setBounds(100, 100, 835, 560);
					frmFeHTransformationEngine.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frmFeHTransformationEngine.getContentPane().setLayout(null);
					
					JPanel panel = new JPanel();
					panel.setBounds(0, 0, 1, 458);
					panel.setBackground(Color.WHITE);
					frmFeHTransformationEngine.getContentPane().add(panel);
					panel.setLayout(null);
					
					JButton btnTransformationEngine = new JButton("Transformation Engine");
					btnTransformationEngine.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							WinMain MainScreenobject = new WinMain(launcher);
						}
					});
					btnTransformationEngine.setBorder(new LineBorder(Color.BLUE));
					btnTransformationEngine.setIcon(new ImageIcon(MainScreen.class.getResource("/org/eclipse/acceleo/module/sample/main/img3.png")));
					btnTransformationEngine.setFont(new Font("Tahoma", Font.PLAIN, 14));
					btnTransformationEngine.setBackground(Color.WHITE);
					btnTransformationEngine.setBounds(277, 214, 293, 58);
					frmFeHTransformationEngine.getContentPane().add(btnTransformationEngine);
							
					JLabel emelogo = new JLabel("");
					emelogo.setForeground(Color.WHITE);
					emelogo.setIcon(new ImageIcon(MainScreen.class.getResource("/org/eclipse/acceleo/module/sample/main/img6.png")));
					emelogo.setBounds(690, 11, 121, 130);
					frmFeHTransformationEngine.getContentPane().add(emelogo);
					
					JButton btnHelp = new JButton("User Manual");
					btnHelp.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "src\\Acceleo-User-Guide.pdf");
					        builder.redirectErrorStream(true);
					        try {
								Process p = builder.start();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					btnHelp.setIcon(new ImageIcon(MainScreen.class.getResource("/org/eclipse/acceleo/module/sample/main/img4.png")));
					btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
					btnHelp.setBorder(new LineBorder(Color.BLUE));
					btnHelp.setBackground(Color.WHITE);
					btnHelp.setBounds(277, 285, 293, 58);
					frmFeHTransformationEngine.getContentPane().add(btnHelp);
					
					JLabel EngineIcon = new JLabel("");
					EngineIcon.setBounds(226, 201, 46, 14);
					frmFeHTransformationEngine.getContentPane().add(EngineIcon);
					
					JLabel HelpIcon = new JLabel("");
					HelpIcon.setBounds(226, 331, 46, 14);
					frmFeHTransformationEngine.getContentPane().add(HelpIcon);
					
					JLabel RTLIcon = new JLabel("");
					RTLIcon.setIcon(null);
					RTLIcon.setBounds(226, 271, 46, 49);
					frmFeHTransformationEngine.getContentPane().add(RTLIcon);
					
					JLabel topheading = new JLabel("Model-driven Fog based eHealth Transformation Engine (MFeHTE)");
					topheading.setHorizontalAlignment(SwingConstants.TRAILING);
					topheading.setBounds(120, 50, 546, 49);
					topheading.setFont(new Font("Roboto", Font.BOLD, 16));
					topheading.setForeground(Color.WHITE);
					frmFeHTransformationEngine.getContentPane().add(topheading);
					
					JLabel NUSTLOGO = new JLabel("New label");
					NUSTLOGO.setIcon(new ImageIcon(MainScreen.class.getResource("/org/eclipse/acceleo/module/sample/main/img1.png")));
					NUSTLOGO.setBounds(30, 35, 109, 100);
					frmFeHTransformationEngine.getContentPane().add(NUSTLOGO);
					
					JLabel lblNewLabel = new JLabel("College of E&ME, National University of Sciences and Technology(NUST), Pakistan");
					lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
					lblNewLabel.setBounds(147, 400, 528, 49);
					lblNewLabel.setForeground(Color.WHITE);
					frmFeHTransformationEngine.getContentPane().add(lblNewLabel);
					
					JButton btnNewButton = new JButton("System Modeler");
					btnNewButton.setFocusable(false);
					btnNewButton.setFocusPainted(false);
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "src\\eclipse\\eclipse.exe");
					        builder.redirectErrorStream(true);
					        try {
								Process p = builder.start();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					btnNewButton.setBorder(new LineBorder(Color.BLUE));
					btnNewButton.setIcon(new ImageIcon(MainScreen.class.getResource("/org/eclipse/acceleo/module/sample/main/img2.png")));
					btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
					btnNewButton.setBackground(Color.WHITE);
					btnNewButton.setBounds(277, 145, 293, 58);
					frmFeHTransformationEngine.getContentPane().add(btnNewButton);
					
					JLabel Background = new JLabel("");
					Background.setOpaque(true);
					Background.setBackground(Color.WHITE);
					Background.setFont(new Font("Tahoma", Font.PLAIN, 11));
					Background.setBounds(11, 11, 798, 501);
					Background.setIcon(new ImageIcon(MainScreen.class.getResource("/org/eclipse/acceleo/module/sample/main/img6.jpg")));
					frmFeHTransformationEngine.getContentPane().add(Background);
					
					initialize();
					frmFeHTransformationEngine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException
	{	
	}
}