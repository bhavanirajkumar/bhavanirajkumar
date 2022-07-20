package Sample_codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1118 {

	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			String searchText = list.get(i).getText();
			System.out.println(searchText);
			if(searchText.equalsIgnoreCase("javatpoint"))
			{
				list.get(i).click();
				break;
			}
		}
	}
}


