package qsp;

import java.awt.AWTException;
import java.awt.Robot;

public class Rob1 {

	public static void main(String[] args)
			throws AWTException, InterruptedException {
		System.out.println("try to terminate the program within 25 counts");
		Robot r1 = new Robot();
		int x=50,y=100;
		for(int i=0;i<=25;i++) {
			System.out.println(i);
			r1.mouseMove(x, y);
			x=x+15;
			y=y+15;
			Thread.sleep(500);
		}
		
	}

}
