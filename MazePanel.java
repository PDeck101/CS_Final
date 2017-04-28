import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class MazePanel extends JPanel
{
	private int yAxis = -55;
	private File mazeFile;
	private String fileName = "D:\\eclipse\\jee-neon\\workspace\\Final_Project\\src\\Maze.txt";
	private String line;
	private Scanner inputFile;
	private int SUB_DIVIDE = 2;
	private int subSize = 0;
	private int[] x = {0,0,0,20};
	private int[] y = {0,10,20,30};
	private int x1 = 10;
	private int y1 = 10;
	private int mousePositionX = 0;
	private int mousePositionY = 0;
	private final int WINDOW_WIDTH = 600;
    private final int WINDOW_HEIGHT = 600;

	// Need a method to keep track of mouse's current position. 
    
    /**
	 * Constructor
	 */
	public MazePanel()
	{
		subSize = WINDOW_WIDTH /SUB_DIVIDE;

		// Set the background color to white.
		setBackground(Color.cyan);

		// Add a GridLayout manager to the content pane.
		setLayout(new GridLayout(200, 200));

		// Set the preferred size of the panel
		//setPreferredSize(new Dimension(600, 600));
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}

	/**
	 * paint method
	 * @param
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Color backGround = getBackground();

		//int[][] coordinates = new int[][];

		// Slow maybe use recursion?
		for(int i = 0; i <= 60; i++)
		{
			g.setColor(Color.BLUE);
			g.drawLine(0, i * 10, 600, i * 10);
			g.drawLine(i * 10, 0, i * 10, 600);
		}
		if(g.getColor().equals(Color.BLUE))
		{
			//g.setColor(Color.WHITE);
			g.setColor(backGround);
			g.drawLine(10, 10, 600, 10);
		}
		//https://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html
		//https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
		//https://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html#getBounds(
		//https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html
		//g.drawLine(i, j * 20, WINDOW_WIDTH, j); this looks amazing but not what I need

		for(int i = 0; i < x.length; i++)
		{
			// Super important do not delete
			g.setColor(Color.BLACK);
			g.fillRect(x[i], y[i], x1, y1);
			//g.fillRect(0, 0, 10, 10);
		}
		
		// paint cheese
		g.setColor(Color.yellow);
		g.fillRect(50+2, 60+2, x1-3, y1-3);
			

		// Super important do not delete
		/**if(g.getColor().equals(Color.BLACK))
		{
			g.setColor(Color.WHITE);
			g.fillRect(0,0,10,10);
		}
		*/
		/**
		// Attempt to open the file containing the maze layout
		try
		{
			mazeFile = new File(fileName);
			inputFile = new Scanner(mazeFile);

			while(inputFile.hasNext())
			{
				line = inputFile.nextLine();
				line = line.replace("0","  ");

				g.setFont(new Font("arial", Font.ITALIC, 14));
				g.drawString(line, 10, yAxis);

				yAxis = yAxis+=10;
			}
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File not found.");
		}

		//System.exit(0);

		// Close the file.
		inputFile.close();
		*/
	}
	public int mousePositionX(int x)
	{
		return mousePositionX; // Change this to something other than x
	}
	
	public int mousePositionY(int y)
	{
		return mousePositionY;
	}
	public boolean cheaseFound()
	{
		return false systematicMouse.getCurrentLocation; //cheesePosX == mouse.currentPosX && cheesePosY == mouse.currentPosY;
														// mousePositionX == cheasePositionY && mousePositionY == cheasePositionY;
	}
}
