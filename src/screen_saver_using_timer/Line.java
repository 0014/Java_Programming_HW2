package screen_saver_using_timer;

import java.awt.Color;

public class Line
{
	private int x1, x2, y1, y2;
	private Color color;
	
    // call default superclass constructor
	public Line()
	{
		super();
	} // end MyLine no-argument constructor

    // call superclass constructor passing parameters
    public Line(int x1, int y1, int x2, int y2, Color color)
    {
       this.setX1(x1);
       this.setY1(y1);
       this.setX2(x2);
       this.setY2(y2);
      
       this.setColor(color);
      
    } // end MyLine constructor

    // define getter and setters
    public int getX1() {
		return x1;
	}
	
	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	public int getX2() {
		return x2;
	}
	
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	public int getY1() {
		return y1;
	}
	
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	public int getY2() {
		return y2;
	}
	
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

} // end class MyLine