package Sample_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_1126 {
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://webflow.com/made-in-webflow/website/028-Tooltip");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement havame = driver.findElement(By.className("tooltip-wrapper"));
		Thread.sleep(2000);
//		havame.getText();
//		System.out.println("Button : " +havame.getText());
		
		
		
		
		
		
		Actions abcd = new Actions(driver);
		
		
		abcd.moveToElement(havame).build().perform();

		
		
		Thread.sleep(2000);
		
		
		
		
		WebElement toolTipText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]"));
		System.out.println(toolTipText.getText()); 
		
		
		
		driver.quit();
	}
}
