package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement untb = driver.findElement(By.name("username"));
		untb.sendKeys("admin");
		Thread.sleep(2000);
		WebElement pwtb = driver.findElement(By.name("pwd"));
		pwtb.sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
