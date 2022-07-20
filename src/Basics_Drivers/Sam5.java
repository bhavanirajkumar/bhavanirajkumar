import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam5 {

	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
				
		//driver.findElement(By.className("gb_d")).click();
		List <WebElement> link = driver.findElements(By.className("gb_d"));
		for(int i=0; i<link.size();i++)		
		{
			String value = link.get(i).getText();
			System.out.println(value);
			if (value.equals("Images"))
			{	link.get(i).click();	}
		}
		

		//driver.findElement(By.linkText("Gmail")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("For")).click();  //For Work*/
		
	}
}
