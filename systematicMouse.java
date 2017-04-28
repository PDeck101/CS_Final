import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;

public abstract class systematicMouse extends mouse
{
	private int n = 0;
	//private String direction;
	private int x = 0;
	private int y = 0;
	private final int TIME_DELAY = 30;
	private final int HEIGHT = 10;
	private final int WIDTH = 10;
	private Timer timer;
	private ArrayList<Integer> direction = new ArrayList<Integer> ();
	
	// WallFollower.java 
	public systematicMouse()
	{
		//timer = new Timer(TIME_DELAY, new TimerListener());
		//timer.start();
		Random rnd = new Random();
		n = rnd.nextInt(4);
	}
	
	/**public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillRect(x, y, WIDTH, HEIGHT);
		
		
		//if(g.getColor().equals(Color.BLACK))
		//{
			//g.setColor(Color.WHITE);
			//g.fillRect(0,0,10,10);
		//}
		
	}
	*/
	
	@Override
	public void search()
	{
		//Random rnd = new Random();
		//n = rnd.nextInt(4);
		
		//if(getColor().equals(Color.BLACK))
		//{
			// Direction to move
			switch(n)
			{
				case 0:
					// North
					currentPositionX = x;
					currentPositionY = 10;
					break;
				case 1:
					// East
					currentPositionX = 10;
					currentPositionY = y;
					break;
				case 2:
					// South
					currentPositionX = x;
					currentPositionY = -10;
					break;
				case 3:
					// West
					currentPositionX = -10;
					currentPositionY = y;
					break;
				default:
					break;
			}
	}
	
	/**private class TimerListener implements ActionListener
	{
		public void ActionPerformed(ActionEvent e)
		{
			repaint();
			x = direction.get(0);
			y = direction.get(1);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	*/
	//public ArrayList<Integer> getDirection()
	//{
		//Random rnd = new Random();
		//x = rnd.nextInt(4);
		
		//if(getColor().equals(Color.BLACK))
		//{
			// Direction to move
			/**switch(n)
			{
				case 0:
					// North
					direction.add(x);
					direction.add(10);
					break;
				case 1:
					// East
					direction.add(10);
					direction.add(y);
					break;
				case 2:
					// South
					direction.add(x);
					direction.add(-10);
					break;
				case 3:
					// West
					direction.add(-10);
					direction.add(y);
					break;
				default:
					break;
			}
		//}
		
		return direction;
		*/
	//}
	
}
