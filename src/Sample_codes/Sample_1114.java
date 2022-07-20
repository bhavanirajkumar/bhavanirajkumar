package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1114 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.co.in/");
//		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
//		Thread.sleep(3000);
//		driver.quit();
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Java");
		
//		driver.get("https://www.kohls.com/");
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div/form/fieldset/input[2]")).sendKeys("Kapade");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Kapade");
//		WebElement input = driver.findElement(By.xpath("//input[@class='input-text']"));
//		Thread.sleep(3000);
//		driver.quit();
		System.out.println(driver.getTitle());
		
		
	}

}
