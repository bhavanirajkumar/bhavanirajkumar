package KeywordDriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeywords {
static WebDriver driver;
public static void openbrowser()
{
	String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
}

public static void navigate()
{
	driver.get("https://google.com");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

public static void click(String data)
{
	//driver.findElement(By.linkText("Gmail")).click();
	String identifier = data;
	driver.findElement(By.xpath(identifier)).click();
}
}
