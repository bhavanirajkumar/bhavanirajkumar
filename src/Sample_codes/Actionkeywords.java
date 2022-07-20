package Sample_codes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeywords {
static WebDriver driver;
public static void openbrowser()
{
	String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
}

public static void navigate() throws InterruptedException
{
	driver.get("https://www.youtube.com/");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(2000);
}

public static void click(String data) throws InterruptedException
{
	//driver.findElement(By.linkText("Gmail")).click();
	String identifier = data;
	WebElement wb = driver.findElement(By.xpath(identifier));
	wb.sendKeys("Kalpesh Kashivale");
	wb.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	WebElement wb2 = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-channel-renderer[1]/div/div[2]/a/div[1]/ytd-channel-name/div/div/yt-formatted-string"));
	wb2.click();
	Thread.sleep(3000);
	WebElement wb3 = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/div[2]/div/div[1]/div/div[2]/div[4]/ytd-button-renderer/a/tp-yt-paper-button/yt-formatted-string"));
	wb3.click();
	Thread.sleep(3000);
	driver.quit();
}
}
