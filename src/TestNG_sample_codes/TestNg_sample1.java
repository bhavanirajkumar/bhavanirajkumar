package TestNG_sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_sample1 {
	WebDriver driver;

	@DataProvider(name = "Kalpesh")
	public Object[][] Kalp() 
	{
		return new Object[][] {{"https://www.youtube.com/", "Kalpesh Kashivale"}};
	}
	
	@BeforeTest
    public void setup(){
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
    }
	
	@Test(dataProvider = "Kalpesh") 
	public void Test1(String a, String b) throws InterruptedException 
	{
		try
		{
			driver.get(a);
			Thread.sleep(1000);
			driver.manage().window().maximize();
			WebElement abcd =driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
			abcd.sendKeys(b);
			Thread.sleep(1000);
			abcd.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@AfterTest
	public void test3()
	{
		driver.quit();
	}
}
