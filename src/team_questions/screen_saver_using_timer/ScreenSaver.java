package team_questions.screen_saver_using_timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class ScreenSaver {

	public int TIMER_INTERVAL = 1000;
	
	private ActionListener taskPerformer;
	private DrawPanel panel;
	
	public ScreenSaver()
	{
		// create a panel that contains our drawing
		panel = new DrawPanel();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); // add the panel to the frame
		application.setSize(500, 500); // set the size of the frame
		application.setVisible(true); // make the frame visible
		
		taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform this task when timer event is fired
                panel.repaint(); // draw the all lines
            }
        };
	}
	
	// sets the interval for the timer
	public void setTimerInterval(int interval)
	{
		TIMER_INTERVAL = interval;
	}
	
	// sets the maximum amount of lines that draw-panel will hold
	public void setMaximumLines(int maxLines)
	{
		panel.setMaximumLines(maxLines);
	}
	
	// starts the screen saver
	public void startScreenSaver()
	{
		// define the timer
		Timer timer = new Timer(TIMER_INTERVAL ,taskPerformer); // define the timer interval
        timer.setRepeats(true); // enable the timer to repeat
        timer.start(); // start the timer
	}
}
