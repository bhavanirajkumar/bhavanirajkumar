package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1115 {

	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.name("emailid")).click();
		driver.findElement(By.name("emailid")).sendKeys("shrawankashivale@gmail.com");
		driver.findElement(By.name("btnLogin")).click();

	}

}
