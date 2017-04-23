import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class displays a drawing panel and a set of check boxes that allow the user to select which mouse will attempt the maze. The mouse's path and time is displayed on the drawing panel.
 * @author Peter
 *
 */
public class DeckerFinal extends JFrame
{
	private MicePanel micePanel;
	private MazePanel mazePanel;
	/**
	 * Constructor
	 */
	public DeckerFinal()
	{
		// Display a title.
		setTitle("Maze Simulator");

		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a BorderLayoutManager.
		setLayout(new BorderLayout());

		//Create the custom panels.
		micePanel = new MicePanel();
		mazePanel = new MazePanel();

		// Add the components to the content pane.
		add(micePanel, BorderLayout.EAST);
		add(mazePanel, BorderLayout.CENTER);

		//Pack the contents of the window and display it
		pack();
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new DeckerFinal();
	}
}
