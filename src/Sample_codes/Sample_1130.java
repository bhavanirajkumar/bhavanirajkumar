package Sample_codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample_1130 
{
	private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webwait.until(ExpectedConditions.titleIs("Google"));
		
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("java");
		Thread.sleep(2000);
		googleSearch.sendKeys(Keys.ENTER);
		System.out.println("Ho gaya");
		driver.quit();
		
	}

}
