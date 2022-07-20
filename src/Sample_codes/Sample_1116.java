package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1116 {

	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.linkText("Gmail"));
		String c= a.getText();
		System.out.println(c);
		WebElement b = driver.findElement(By.linkText("Images"));
		String d= b.getText();
		System.out.println(d);
		

	}

}
