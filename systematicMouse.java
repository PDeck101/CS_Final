import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class systematicMouse 
{
	private int x = 0;
	
	public systematicMouse()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(0, 0, 10, 10);
		
		// repaint up here? after the calling the direction
		if(g.getColor().equals(Color.BLACK))
		{
			g.repaint();
			g.setColor(Color.WHITE);
			g.fillRect(0,0,10,10);
		}
		
	}
	
	
	public int getCurrentLocation()
	{
		
		return 0;
	}
	
	public int getDirection()
	{
		
		if(getColor().equals(Color.BLACK))
		{
			// Direction to move
			switch(x)
			{
				case 0:
					// North
					break;
				case 1:
					// East
					break;
				case 2:
					// South
					break;
				case 3:
					// West
					break;
				default:
					break;
			}
			
			
			
			
			
			
		}
		
		return 0;
	}
}
