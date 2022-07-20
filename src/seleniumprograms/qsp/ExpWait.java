package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		wait.until(ExpectedConditions.titleContains("Enter"));
		driver.findElement(By.id("logoutLink")).click();
		
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		System.out.println("test is passed");
		driver.close();
	}

}
