package team_questions.screen_saver_using_timer;

public class Test_ScreenSaver {
	public static void main(String[] args)
	{
		// initialize the screen saver
		ScreenSaver ss = new ScreenSaver();
		// define the settings for the screen saver
		ss.setMaximumLines(100);
		ss.setTimerInterval(100);
		// start the screen saver
		ss.startScreenSaver();
	} 
}
