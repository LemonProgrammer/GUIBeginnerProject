package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.GUIController;

/**
 * 
 * @author fbla1201
 *@version 1.3 added Layout manager
 */

public class GUIJPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JButton secondButton;
	private SpringLayout baseLayout;
	
	public GUIJPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("My not so first button");
		secondButton = new JButton("This button is sexy");
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 0, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 32, SpringLayout.EAST, firstButton);
		
	}
}
