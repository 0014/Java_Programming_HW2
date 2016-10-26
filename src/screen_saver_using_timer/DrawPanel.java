package screen_saver_using_timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
//Fig. 3.16: DrawPanel.java
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.security.SecureRandom;
import java.text.AttributedCharacterIterator;

import javax.swing.JComponent;
import javax.swing.JPanel;

// Using drawLine to connect the corners of a panel.
public class DrawPanel extends JPanel
{
	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();
		
	private int width, height;
	private Graphics graph;
		
	
	public DrawPanel()
	{
		
	}
	// draws an X from the corners of the panel
	public void paintComponent(Graphics g)
	{
		// call paintComponent to ensure the panel displays correctly
		graph = g;
				
		super.paintComponent(graph);
		
		width = getWidth(); // total width
		height = getHeight(); // total height
		
		DrawRandomLine();
	 }
	
	public void DrawRandomLine()
	{
		int randomX1= 1 + randomNumbers.nextInt(width); // first die roll
		int randomX2= 1 + randomNumbers.nextInt(width); // first die roll
		int randomY1= 1 + randomNumbers.nextInt(height); // first die roll
		int randomY2= 1 + randomNumbers.nextInt(height); // first die roll
		
		// draw a line from the upper-left to the lower-right
		graph.drawLine(randomX1, randomY1, randomX2, randomY2);
		//graph.drawLine(0, 0, width, height);
	}
} // end class DrawPanel








