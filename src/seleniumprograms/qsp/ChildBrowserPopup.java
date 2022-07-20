package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://demo.actitime.com/login.do");
		String parentWindow = driver.getWindowHandle();	
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String v:allWindowHandles) {
			if(v.equals(parentWindow)) {
				
			}
			else {
				WebDriver childWindow = driver.switchTo().window(v);
				childWindow.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		driver.close();
	}

}
