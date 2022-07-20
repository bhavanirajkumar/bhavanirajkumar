package qsp;

import java.awt.AWTException;
import java.awt.Robot;



public class Rob143 {


	public static void main(String[] args) throws AWTException, InterruptedException {
	    
		Robot r1 = new Robot();
		int x=100, y=200;
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			r1.mouseMove(x, y);
			x=x+50;
//			y=y+20;
			Thread.sleep(500);
		}

	}

}
