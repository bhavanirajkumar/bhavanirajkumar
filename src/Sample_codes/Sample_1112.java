package Sample_codes;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import FileHandling.ReadExcel;
import FileHandling.XSSFSheet;
import FileHandling.XSSFWorkbook;

public class Sample_1112
{
	public static void main(String[] args)  throws Exception
	{
//		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.kohls.com/");
//
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("search")).sendKeys("tuxedo");
//		driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
//		
//		WebElement searchBox = driver.findElement(By.name("serach"));
//		searchBox.sendKeys("tuxedo");
//		searchBox.sendKeys(Keys.ENTER);
//		driver.quit();
		
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("Java");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(Sample_1112.readExcel(0, 1));
	}
	public static String readExcel(int row, int column) 
	{
		String testData=null;
		try 
		{
								//D:\eclipse-workspace\Besant\Excel\InputData.xlsx
			String filePath = System.getProperty("user.dir")+"//Excel//Input.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);  
			XSSFSheet ws = wb.getSheetAt(0); //Sheet1
			testData = String.valueOf(ws.getRow(row).getCell(column)); //0   1
			wb.close();	
		}
		catch(Exception e)
		{
			System.out.println("Excel Read" + e);
		}
		return testData;
	}
}	