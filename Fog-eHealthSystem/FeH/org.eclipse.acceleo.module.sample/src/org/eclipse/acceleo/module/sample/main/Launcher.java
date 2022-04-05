/**
 * 
 */
package org.eclipse.acceleo.module.sample.main;


import org.eclipse.acceleo.module.sample.main.WinMain;

import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.acceleo.module.sample.Java.JavaServices;
import org.eclipse.acceleo.module.sample.main.MainScreen;


public class Launcher
{
	public static final long SVOCL_BUILD = 20180717L;
	public static final String SVOCL_ENGINE_VER = "1.0";
	
	private WinMain window;
	private MainScreen MainScreenobject;
	private static Launcher instance;
	public static Launcher getInstance() {
		if(instance == null) {
			instance = new Launcher();
		}
		return instance;
	}
	
	private Launcher() {
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{
		Launcher launcher = getInstance();
		launcher.launch();
		
		//args = new String[2];
		//Generate.main(args);
		//window = new WinMain();
	}

	/**
	 * @param args
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public void launch() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{
		if(window == null) {
			//System.out.println("-----  Engine version: "+SVOCL_ENGINE_VER+" ( build: "+SVOCL_BUILD+")  -----");
			MainScreenobject = new MainScreen(this);
		}
	}

	@SuppressWarnings("static-access")
	void start(String[] args, WinMain window)
	{
		window.setMessage("Model to Text Transformation is in process, please wait....");
		JavaServices.reset();
		Generate.main(args);
		window.setMessage("Model to Text Transformation completed.");
		}
}
