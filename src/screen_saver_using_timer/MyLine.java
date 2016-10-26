package screen_saver_using_timer;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
	private int x1, x2, y1, y2;
	private Color color;
   // call default superclass constructor
   public MyLine()
   {
      super();
   } // end MyLine no-argument constructor

   // call superclass constructor passing parameters
   public MyLine(int x1, int y1, int x2, int y2, Color color)
   {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
      
      this.color = color;
      
   } // end MyLine constructor

   // draw line in specified color
   public void draw(Graphics g)
   {
	  
      g.setColor(color);
      g.drawLine(x1, y1, x2, y2);
   } // end method draw
} // end class MyLine