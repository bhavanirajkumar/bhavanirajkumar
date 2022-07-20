package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/qspid/OneDrive/Desktop/2CSA4%20html%20programs/E.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='600']")).click();

	}

}
