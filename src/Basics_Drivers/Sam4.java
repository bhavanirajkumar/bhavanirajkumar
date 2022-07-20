import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sam4 {
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search")).sendKeys("tuxedo");
		driver.findElement(By.className("input-text")).sendKeys(Keys.ENTER);
		//driver.quit();
	}
}

		
			
