package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/OneDrive/Desktop/2CSA4%20html%20programs/Hotel.html");
		Thread.sleep(2000);
		WebElement oberoiLB = driver.findElement(By.id("ob"));
		Select s1 = new Select(oberoiLB);
		s1.selectByIndex(3);//Santra
		Thread.sleep(2000);
		s1.selectByValue("tm");//tadi madi
		Thread.sleep(2000);
		s1.deselectByValue("tm");//UnsupportedOperationException
		Thread.sleep(2000);
		driver.close();
	}

}
