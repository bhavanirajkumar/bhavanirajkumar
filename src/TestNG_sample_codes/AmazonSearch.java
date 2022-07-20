package TestNG_sample_codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonSearch 
{
		public static WebDriver driver;
		
		@BeforeTest
	    public void Browsersetup()
		{
			String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
	    }
		
		@Test
		public  void SearchProduct()
		{
			AmazonSearchProduct ksp = new AmazonSearchProduct(driver);
			ksp.SearchTextAmazon().sendKeys("Bharivale Shoes");
			ksp.searchIconAmazon().click();
		}
		
		
	}
