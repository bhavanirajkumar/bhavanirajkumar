package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TEST LEAD
public class Test {
	
	public void testfb(WebDriver driver) {
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
