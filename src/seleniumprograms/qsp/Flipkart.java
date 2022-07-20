package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.flipkart.com");
		String parentTab = driver.getWindowHandle();
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("poco x3 pro");
		driver.findElement(By.xpath("(//button)[1]")).click();
		driver.findElement(By.xpath("(//div[.='POCO X3 Pro (Graphite Black, 128 GB)'])[2]")).click();
		Set<String> allTAbs = driver.getWindowHandles();
		for(String v:allTAbs) {
			if(v.equals(parentTab)) {
				
			}
			else {
				driver.switchTo().window(v);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[3]")).click();
		
	}

}
