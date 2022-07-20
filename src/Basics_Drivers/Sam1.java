
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class Sam1 {
	public static void main(String[] args) throws InterruptedException {

		//D:\eclipse-workspace\Selenium\May21 + "\\Drivers\\chromedriver.exe";
		
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver(); // Initialize  //class obj = new class();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	       driver.quit();
		
		/*String driverPath = System.getProperty("user.dir") + "\\Driver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.gmail.com/");
		driver.quit();*/

	}
}
