package Frames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class Sam27 {
	public static void main(String[] args) {
		//Handling frames 
			String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();
		
			driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//Switch to particular frame 
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("ChromeDriverService.Builder")).click();
			
			//driver.quit();
	}
}



