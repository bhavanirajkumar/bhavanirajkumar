package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AsianPaint 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.asianpaints.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[3]/div[3]/nav/div[2]/div[1]/ul/li[5]"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).perform();
		
		WebElement we = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[3]/div[3]/nav/div[3]/div[5]/div[2]/div/div/div[1]/div/div/a/span"));
		we.getText();
		Thread.sleep(2000);
		we.click();	
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.quit();
	}
}
