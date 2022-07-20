package Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sam20 {
	//Double & Right Click - Action Commands
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
				
		driver.navigate().to("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		//act.doubleClick(doubleClickButton).build().perform();
		//Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();           //Click OK in Alert

		
		act.contextClick(rightClickButton).build().perform();
	}

}
