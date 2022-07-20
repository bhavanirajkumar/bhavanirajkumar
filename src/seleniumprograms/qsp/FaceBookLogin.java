package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("gyujgyuj");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("cghcgh");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		String xp = "img[class='s45kfl79 emlxlaya bkmhp75w spb7xbtv']";
		driver.findElement(By.cssSelector(xp)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
