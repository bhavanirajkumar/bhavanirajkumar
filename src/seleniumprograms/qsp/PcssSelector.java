package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PcssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement untb = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		untb.sendKeys("admin");
		WebElement pwtb = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		pwtb.sendKeys("manager");
		driver.findElement(By.cssSelector("a[class='initial']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("a[class='logout']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
