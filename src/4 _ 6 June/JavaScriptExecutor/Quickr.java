import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;

import com.graphbuilder.curve.Point;

public class Quickr {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Actions act = new Actions(driver);
		
		driver.get("https://unacademy.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)", "");
        
		
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div/div[1]/div[2]/div[6]/div/a[5]"))).build().perform();
		/*List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"__next\"]/footer/div/div[1]/div[2]/div/div/a"));
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("About us"))
			{
		
				list.get(i).click();
				break;
			}
		}*/
		
		
		
			
		}
}
