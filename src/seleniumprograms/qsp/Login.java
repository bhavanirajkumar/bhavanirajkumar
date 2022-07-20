package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/OneDrive/Desktop/2CSA4%20html%20programs/Login.html");
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("DINGA");
		Thread.sleep(2000);
		driver.findElement(By.id("pw")).sendKeys("DINGI");
		Thread.sleep(2000);
		driver.findElement(By.linkText("forgot password???")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("lg")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cl")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
