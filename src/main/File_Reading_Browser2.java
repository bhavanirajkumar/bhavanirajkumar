package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class File_Reading_Browser2
{
	public static WebDriver driver= null;
	
//	public static void main(String[]args) throws Exception
//	{
////		File_Reading_Browser2 abcd = new File_Reading_Browser2();
//		
////		abcd.Browser_Driver();
////		abcd.Website_URL();
////		abcd.Trainee_name();
////		abcd.Trainee_LOC();
////		
////		System.out.println("==========================================================");
////		System.out.println("Everything is Done....Sleep now!");
//	}
	
	public static String ReadProp(String ReqData) throws IOException
	{
		String out_Data = null;
		String find_Data = ReqData;
		
			String file_location = System.getProperty("user.dir") + "\\files\\Configure.properties";
			File file = new File(file_location);
			FileInputStream file_input = new FileInputStream(file);
			Properties prop_file = new Properties();
			prop_file.load(file_input);
			out_Data = prop_file.getProperty(find_Data);
//			System.out.println(out_Data);
		return out_Data;
	}
	
	public WebDriver Browser_Driver() throws IOException 
	{
			String B_Name = File_Reading_Browser2.ReadProp("Browser_Name");
			
			
			switch(B_Name)
			{
			case "Google_Chrome_103":
				driver = Google_ChromeDriver();
				break;
				
			case "Microsoft_Edge_103":
				driver = Microsoft_EdgeDriver();
				break;
			
			default :
				System.out.println("Browser Name is Invalid/ Input Data is Wrong");
			}
			
//			if (B_Name == "Google_Chrome_103") 
//			{
//				driver = Google_ChromeDriver();
//				
//			}
//			else if (B_Name == "Microsoft_Edge_103") 
//			{
//				driver = Microsoft_EdgeDriver();
//			} 
//			else 
//			{ 
//				System.out.println("Browser Name is Invalid/ Input Data is Wrong");
//			}
			
//			System.out.println("Following Data availble in the Properties file:  ");
//			System.out.println("==========================================================");
//			
//			System.out.println("Browser_Name:     "+B_Name);
		return driver;
	}
//	
	public static WebDriver Google_ChromeDriver() 
	{
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver Microsoft_EdgeDriver() 
	{
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverPath);
			driver = new EdgeDriver();
		return driver;
	}
//	
//	public WebDriver Website_URL() throws Exception 
//	{
//		String url = File_Reading_Browser2.ReadProp("Website_URL");
//		System.out.println("Website_URL:     "+url);
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		Comm_Code();
//		return driver;
//	}
	
//	public static void Comm_Code() throws InterruptedException
//	{
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
//		
//	}
//	
//	public void Trainee_name() throws IOException
//	{
//		String t_name = File_Reading_Browser2.ReadProp("Trainee_Name");
//		System.out.println("Trainee_Name:     "+t_name);
//	}
//	
//	public void Trainee_LOC() throws IOException
//	{
//		String t_LOC = File_Reading_Browser2.ReadProp("Trainee_LOC");
//		System.out.println("Trainee_LOC:     "+t_LOC);
//	}
}