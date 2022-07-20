package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.googlepage;

public class googlesearch {
	public static WebDriver driver;
	
@BeforeTest
public void initialize()
{
	String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
}

@Test
public void search()
{
	googlepage obj = new googlepage(driver);
	obj.searchText().sendKeys("PageFactoryModel");
}

}
