package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//to handle this popup
		for(int i=1;i<=7;i++) {
			r1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
		}
		r1.keyPress(KeyEvent.VK_ENTER);
		//r1.keyPress(KeyEvent.VK_ESCAPE);// to press cancel button
		Thread.sleep(5000);
		driver.close();
	}

}
