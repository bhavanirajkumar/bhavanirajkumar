import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	static By from = By.id("stationFrom");
	
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.air.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(from).sendKeys("hyd");
		
		Thread.sleep(2000);
		List<WebElement> from = driver.findElements(By.className("ui-menu-item"));
		for (int i=0; i<from.size(); i++)
		{
			if(from.get(i).getText().contains("HYD"))
			{
				from.get(i).click();
				break;
			}
			
		}
				
		driver.findElement(By.id("stationTo")).sendKeys("pune");
		Thread.sleep(2000);
		List<WebElement> to = driver.findElements(By.className("ui-menu-item"));
		for (int i=0; i<to.size(); i++)
		{
			if(to.get(i).getText().contains("PNQ"))
			{
				to.get(i).click();
				break;
			}
			
		}
			
		Thread.sleep(2000);
		List<WebElement> departure = driver.findElements(By.xpath("//*[@id=\"carouselExampleInterval\"]/div[1]/div/div/div[2]/form/div[3]/datepickermodifi/div/div[2]/div[2]/table/tbody/tr/td/span"));
		for (int i=0; i<departure.size(); i++)
		{
			if(departure.get(i).getAttribute("class").equals("act active-red"))
			{
				departure.get(i).click();
				break;
			}
		}
	}

}
