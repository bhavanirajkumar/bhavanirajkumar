package Sample_codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_1125 {
	//Keyboard - Action Commands
	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		
		WebElement googleSearch = driver.findElement(By.xpath("//input[@Class='gLFyf gsfi']"));

		//Shift + Testing
		//act.keyDown(googleSearch,Keys.SHIFT).sendKeys("testing").build().perform();
		
		//Shift + Testing <Shift Release> Ctrl+a
		/*act.keyDown(googleSearch,Keys.SHIFT).sendKeys("testing")    
		.keyUp(googleSearch, Keys.SHIFT)		
		.keyDown(googleSearch, Keys.CONTROL) 	
		.sendKeys("a").build().perform();*/

		//Shift + Testing <Shift Release> Ctrl+a Ctrl+x 
		act.keyDown(googleSearch,Keys.SHIFT).sendKeys("Testing")
		.keyUp(googleSearch, Keys.SHIFT)
		.keyDown(googleSearch, Keys.CONTROL).sendKeys("a").sendKeys("x").sendKeys("v")
		.keyUp(googleSearch, Keys.CONTROL)
		.build().perform();
		
		/*Action action =
		act.keyDown(googleSearch,Keys.SHIFT).sendKeys("Testing")
		.keyUp(googleSearch, Keys.SHIFT)
		.keyDown(googleSearch, Keys.CONTROL).sendKeys("a")
		//.keyDown(googleSearch, Keys.CONTROL).sendKeys("x")
		.sendKeys("x")
		.sendKeys("v")		
		.build();
		
		action.perform();*/
		
		/*Action action =
		act.keyDown(googleSearch,Keys.SHIFT).sendKeys("Testing")
		.keyUp(googleSearch, Keys.SHIFT)
		.keyDown(googleSearch, Keys.CONTROL).sendKeys("a")
		.sendKeys("x").sendKeys("v").sendKeys(Keys.ENTER)		
		.build();
		action.perform();*/
	}
}
