package screen_saver_using_timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class SS_Timer {

	public final int TIMER_INTERVAL = 1000;
	
	private ActionListener taskPerformer;
	private DrawPanel panel;
	
	public SS_Timer()
	{
		// create a panel that contains our drawing
		panel = new DrawPanel();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); // add the panel to the frame
		application.setSize(250, 250); // set the size of the frame
		application.setVisible(true); // make the frame visible
		
		taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
                panel.repaint();
                System.out.printf("Timer fired !");
            }
        };
	}
	
	public void StartScreenSaver()
	{
		Timer timer = new Timer(TIMER_INTERVAL ,taskPerformer);
        timer.setRepeats(true);
        timer.start();

        try {
			Thread.sleep(TIMER_INTERVAL * 100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
