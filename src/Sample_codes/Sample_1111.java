package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1111
{
	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();
		
	}
}