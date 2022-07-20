package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Rob2 {

	public static void main(String[] args)
			throws IOException, AWTException, InterruptedException {
		
		Runtime.getRuntime().exec("notepad");
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_Q);
		r1.keyPress(KeyEvent.VK_S);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyPress(KeyEvent.VK_SPACE);
		r1.keyPress(KeyEvent.VK_SHIFT);
		r1.keyPress(KeyEvent.VK_J);
		r1.keyPress(KeyEvent.VK_S);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_SHIFT);	
		r1.keyPress(KeyEvent.VK_D);	
		r1.keyPress(KeyEvent.VK_J);
		r1.keyPress(KeyEvent.VK_ENTER);	
		r1.keyPress(KeyEvent.VK_1);
		r1.keyPress(KeyEvent.VK_2);
		r1.keyPress(KeyEvent.VK_LEFT);
		r1.keyPress(KeyEvent.VK_3);
	}

}
