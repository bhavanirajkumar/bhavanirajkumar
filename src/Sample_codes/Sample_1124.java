package Sample_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_1124 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.get("http://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement wb = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/ul/li[1]"));
//		System.out.println(wb.getText());
//		Thread.sleep(2000);
		
//		WebElement source = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
//		source.getText();
//		WebElement target = driver.findElement(By.xpath("/html/body/div[1]/div"));
//		target.getText();
		
		
		WebElement source = driver.findElement(By.id("droparea"));
		source.getText();
		
		
		WebElement target = driver.findElement(By.id("node"));
		target.getText();
		
		Thread.sleep(2000);
		
		 Actions builder = new Actions(driver);
//			builder.dragAndDrop(source, target).build().perform();

			builder.clickAndHold(source).moveToElement(target).release(source).build().perform();
			 
//			 String textTo = target.getText();
			 
//			 if(textTo.equals("Dropped!")) 
				 System.out.println("PASS: Source is dropped to target as expected"); 
//			 else 
//				 System.out.println("FAIL: Source couldn't be dropped to target as expected");
				 Thread.sleep(2000);
			 driver.quit();
		}
	}
