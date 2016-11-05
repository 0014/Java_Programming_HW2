package team_questions.screen_saver_using_timer;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.util.ArrayList;

import javax.swing.JPanel;

// Using drawLine to connect the corners of a panel.
public class DrawPanel extends JPanel
{
	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// the maximum amount of lines that the draw-panel can contain
	public int MAX_LINES = 100;
	
	// the length and width of the draw-panel
	private int width, height;
	// the array which holds all the lines
	private ArrayList<Line> lines;
	
	public DrawPanel()
	{
		// initialize the lines array
		lines = new ArrayList<Line>();
	}
	
	// set the maximum lines the the draw-panel can contain
	public void setMaximumLines(int maxLines)
	{
		MAX_LINES = maxLines;
	}
	
	// draws an X from the corners of the panel
	public void paintComponent(Graphics g)
	{
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		width = getWidth(); // total width
		height = getHeight(); // total height
		
		// every time this method is invoked, add a random line
		addRandomLine();
		
		// draw all the lines
		if(lines.size() == MAX_LINES)
		{
			lines.clear(); // clears all the lines inside the array
		}
		
		for(Line l : lines)
		{
			g.setColor(l.getColor()); // set the color of the line
			g.drawLine(l.getX1(), l.getY1(), l.getX2(), l.getY2()); // set the coordinates of the line 
		}
	 }
	
	// add line to the array that is randomly initialized
	private void addRandomLine()
	{
		// create random coordinates
		int randomX1= 1 + randomNumbers.nextInt(width); 
		int randomX2= 1 + randomNumbers.nextInt(width);
		int randomY1= 1 + randomNumbers.nextInt(height);
		int randomY2= 1 + randomNumbers.nextInt(height);
		
		// add the randomly initialized line into the array
		lines.add(new Line(randomX1, randomY1, randomX2, randomY2, Color.BLACK));
	}
} // end class DrawPanel








