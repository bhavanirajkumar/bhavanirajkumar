package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("abcd");
		Thread.sleep(1000);
		l1.setPassword("1234");
		Thread.sleep(1000);
		l1.clickLogin();	
		Thread.sleep(4000);
		l1.setUsername("admin");
		Thread.sleep(1000);
		l1.setPassword("manager");
		Thread.sleep(1000);
		l1.clickLogin();
	}

}
