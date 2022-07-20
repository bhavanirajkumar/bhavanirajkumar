package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rupesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Hule");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]")).sendKeys("8898769947");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("DINGI143");
		Thread.sleep(2000);
		WebElement dayLB = driver.findElement(By.id("day"));
		Select s1 = new Select(dayLB);
		s1.selectByValue("18");
		Thread.sleep(2000);
		WebElement monthLB = driver.findElement(By.id("month"));
		Select s2 = new Select(monthLB);
		s2.selectByVisibleText("Mar");
		Thread.sleep(2000);
		WebElement yearLB = driver.findElement(By.id("year"));
		Select s3 = new Select(yearLB);
		s3.selectByVisibleText("2001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
