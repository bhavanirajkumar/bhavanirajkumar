package TestNG_sample_codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestNg_sample2 
{
	WebDriver driver;
	@DataProvider(name = "Kalpesh_Kashivale")
	public Object[][] Kalp() 
	{
		return new Object[][] {{"https://www.youtube.com/", "Kalpesh Kashivale"}};
	}
	@BeforeTest
    public void setup()
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
    }
	@Test(dataProvider = "Kalpesh_Kashivale") 
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
	@Test(dataProvider = "Kalpesh_Kashivale") 
	public void Test2(String a, String b)
	{
		try
		{
			String c= driver.getTitle();
			System.out.println(c);
			Pattern ptr = Pattern.compile("[A-Za-z]*[ ][A-Za-z]*.*?");	
//			System.out.println(ptr);
			Matcher mtr = ptr.matcher(b);
			System.out.println(mtr.matches());
		}
		catch(Exception e)
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


