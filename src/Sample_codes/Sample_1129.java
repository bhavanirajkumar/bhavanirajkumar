package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

public class Sample_1129 
{
	public static void main(String[] args) throws Exception 
	{
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("promptexample")).click();
		

		Thread.sleep(2000);
		
//		Alert alert = driver.switchTo().alert(); // switch to alert
		
//		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
		
//		System.out.println(alertMessage); // Print Alert Message
		
//		Thread.sleep(2000);
//		alert.sendKeys("Yes");
//		Thread.sleep(2000);
//		alert.accept(); 
		
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
}
}