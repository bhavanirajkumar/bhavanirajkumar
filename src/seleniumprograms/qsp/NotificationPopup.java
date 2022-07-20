package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("9987447769");
		driver.findElement(By.id("pass")).sendKeys("78604321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.xpath("(//span[.='Log Out'])[2]")).click();
	
		
		
		
		
		
		
	}

}
