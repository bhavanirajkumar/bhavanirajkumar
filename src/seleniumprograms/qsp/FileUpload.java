package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/OneDrive/Desktop/2CSA4%20html%20programs/G.html");
		Thread.sleep(3000);
		File f = new File("./cv/RupeshTalekar.txt");
		String path = f.getAbsolutePath();
		//System.out.println(path);
		driver.findElement(By.id("f1")).sendKeys(path);
		Thread.sleep(3000);
		driver.close();

	}

}
