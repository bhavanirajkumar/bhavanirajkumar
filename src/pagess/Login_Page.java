package pagess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.File_Reading_Browser2;

public class Login_Page  extends File_Reading_Browser2
{
	static By username = By.id("user-name");
	static By password = By.id("password");
	static String userId;
	static String passId;
	
	public static void Login_pg() throws IOException, InterruptedException 
	{
		browser_opening();
		website_opening();
		UsernamePassword();
		login_Button();
	}
	public static void browser_opening() throws IOException, InterruptedException
	{
		File_Reading_Browser2 abcd = new File_Reading_Browser2();
		abcd.Browser_Driver();
	}
	public static void website_opening() throws InterruptedException
	{
		Thread.sleep(500);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(500);
	}
	public static void UsernamePassword() 
	{
		try
		{
			WebElement usr = driver.findElement(username);
			WebElement pass = driver.findElement(password);
			Thread.sleep(500);
			userId = readExcelFile(1, 0);
			usr.sendKeys(userId);
			Thread.sleep(500);
			passId = readExcelFile(1, 1);
			pass.sendKeys(passId);
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String readExcelFile(int row, int column)  
	{
		String outData=null;
		try {
			String filePath = System.getProperty("user.dir")+"//Excel//loginData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);  
			XSSFSheet ws = wb.getSheetAt(0); //Sheet1
			outData = String.valueOf(ws.getRow(row).getCell(column)); //0   1
			wb.close();	
		}catch(Exception e)
		{
			System.out.println("Excel Read" + e);
		}
		return outData;
	}
	public static void login_Button() throws InterruptedException
	{
		try
		{
			Thread.sleep(500);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
