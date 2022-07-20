package Sample_codes;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1113 {

	public static void main(String[] args)  throws Exception
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys(Sample_1113.readExcel(1, 0));
		googleSearch.sendKeys(Keys.ENTER);
//		System.out.println(googleSearch.getSize());
//		System.out.println(googleSearch.getText());
//		System.out.println(googleSearch.getCssValue("q"));


		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("========================================");
		System.out.println("Excel file containt:>> ");
		
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
//		
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("Java");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(Sample_1113.readExcel(0, 0));
		System.out.println(Sample_1113.readExcel(0, 1));
		System.out.println(Sample_1113.readExcel(1, 0));
		System.out.println(Sample_1113.readExcel(1, 1));
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