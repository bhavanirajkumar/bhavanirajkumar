package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDiv2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("9898989898");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement monthLb = driver.findElement(By.xpath("(//select)[1]"));
		Select s1 = new Select(monthLb);
		s1.selectByValue("7");
		Thread.sleep(2000);
		WebElement yearLb = driver.findElement(By.xpath("(//select)[2]"));
		Select s2 = new Select(yearLb);
		s2.selectByVisibleText("1947");
		Thread.sleep(2000);
		driver.findElement(By.linkText("15")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
