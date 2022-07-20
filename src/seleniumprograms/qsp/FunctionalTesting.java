package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		LoginPage l1 = new LoginPage(driver);
		String path="./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<=5;i++) {
			String un = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			l1.setUsername(un);
			String pw = wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			l1.setPassword(pw);
			l1.clickLogin();		
		}
		Thread.sleep(6000);
		driver.close();
	}

}
