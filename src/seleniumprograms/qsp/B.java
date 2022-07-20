package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/OneDrive/Desktop/2CSA4%20html%20programs/B.html");
		WebElement t1 = driver.findElement(By.className("h1"));
		t1.sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.linkText("LINK-1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("h2")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.linkText("BHANUPRAKASHA")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();

	}

}
