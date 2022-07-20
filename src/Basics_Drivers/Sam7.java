import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sam7 {
	//Auto Suggest
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");     
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		Thread.sleep(2000);			//Synchronization Wait
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{						
			String searchText = list.get(i).getText();  
			System.out.println(searchText);
			if(searchText.equalsIgnoreCase("selenium tutorial"))
			{	
				list.get(i).click();
				break;
			}
		}
		
	}
}
