import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author Peter
 *
 */
public class MicePanel extends JPanel
{
	private JPanel micePanel;
	private JCheckBox[] checkBoxes;
	private String[] checkBoxTitles = {"Mouse_1", "Mouse_2", "Mouse_3", "Mouse_4", "Mouse_5"}; // Add a popup tool tip that displays a blerb about each mouse, hinting at how it will run through the maze. Change check box names to mouse names
	
	/**
	 * Constructor
	 */
	public MicePanel()
	{
		//micePanel = new JPanel();
		//micePanel.setLayout(new GridLayout(5,1));
		setLayout(new GridLayout(5,1));
		checkBoxes = new JCheckBox[5];
		
		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Mice"));
		
		buildMicePanel();
	}
	/**
	 * The buildCheckBoxPanel
	 */
	private void buildMicePanel()
	{
		for(int i = 0; i < checkBoxes.length; i++)
		{
			checkBoxes[i] = new JCheckBox(checkBoxTitles[i]);
			switch(i)
			{
				case 0:
					checkBoxes[i].setForeground(Color.BLUE);
					break;
				case 1:
					checkBoxes[i].setForeground(Color.RED);
					break;
				case 2:
					checkBoxes[i].setForeground(Color.ORANGE);
					break;
				case 3:
					checkBoxes[i].setForeground(Color.GREEN);
					break;
				case 4:
					checkBoxes[i].setForeground(Color.MAGENTA);
					break;
			}
			add(checkBoxes[i]);
		}
	}
}
