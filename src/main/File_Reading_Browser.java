package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Reading_Browser 
{
	public static String wbst;

	public static String ReadProp() throws IOException 
	{
		Properties obj = new Properties();			
		String filePath = System.getProperty("user.dir")+"\\files\\Configure.properties";
//		System.out.println("Data Readed File Path:  "+filePath);
//		System.out.println("==========================================================");
		FileInputStream objfile = new FileInputStream(filePath);
		obj.load(objfile);
		String wbst = obj.getProperty("Website_URL");
//		System.out.println("Following data fetched from the file:  ");
		System.out.println("Website_URL:    "+wbst);
//		System.out.println("Browser_Name:   "+obj.getProperty("Browser_Name"));
//		System.out.println("Trainee_Name:   "+obj.getProperty("Trainee_Name"));
//		System.out.println("Trainee_LOC:    "+obj.getProperty("Trainee_LOC"));
		return wbst;
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		String a = File_Reading_Browser.ReadProp();
		driver.get(a);
//		driver.manage().window().maximize();
		Thread.sleep(2000);
//		
//		WebElement wb = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
//		wb.sendKeys("Kalpesh Kashivale");
//		Thread.sleep(3000);
//		wb.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		
//		WebElement wb2 = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-channel-renderer[1]/div/div[2]/a/div[1]/ytd-channel-name/div/div/yt-formatted-string"));
//		wb2.click();
//		Thread.sleep(3000);
//		WebElement wb3 = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/div[2]/div/div[1]/div/div[2]/div[4]/ytd-button-renderer/a/tp-yt-paper-button/yt-formatted-string"));
//		wb3.click();
//		Thread.sleep(3000);
//		driver.quit();
		
	}
}
