package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.vtiger.com");
		Thread.sleep(3000);
		WebElement res = driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(res).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
		WebElement contactNo = driver.findElement
			(By.xpath("//p[contains(.,'Bengaluru, India')]/following-sibling::p"));
		System.out.println(contactNo.getText());
		Thread.sleep(3000);
		driver.close();
	}

}
