package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Test Engg-1
public class TestFirefox {
	static {
     System.setProperty("webdriver.gecko.driver",
		"./driver/geckodriver.exe");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.fb.com");
		Test t1 = new Test();
		t1.testfb(driver);

	}

}
