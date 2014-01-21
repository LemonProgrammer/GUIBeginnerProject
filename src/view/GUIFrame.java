package view;

import javax.swing.JFrame;
import controller.GUIController;

/**
 * GUIFrame framework class for java GUI.
 * @author fbla1201
 *@version 1.3 Added setContentPane(basePanel)
 *
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIJPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIJPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(3020, 1020);
		this.setVisible(true);
	}
	
}
