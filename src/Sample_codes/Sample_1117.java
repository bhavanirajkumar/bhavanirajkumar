package Sample_codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1117 {

	public static void main(String[] args) throws InterruptedException 
	{
		String driverPath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.className("gb_d"));
		System.out.println(links.size());
		for(int j=0; j<links.size(); j++)
		{
			String str = links.get(j).getText();
			if(str.equalsIgnoreCase("Gmail"))
			{
				links.get(j).click();
				break;
			}
		}

	}

}
