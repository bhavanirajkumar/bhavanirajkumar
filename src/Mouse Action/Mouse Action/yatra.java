import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleDemo {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
				
		List <WebElement> links = driver.findElements(By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[4]/div[2]/div/ul/li"));
		for (int i=0; i<links.size(); i++)
		{
			String linkText = links.get(i).getText();
			System.out.println(linkText);
			if(linkText.equals("Offers"))
			{
				Actions act = new Actions(driver);
				act.moveToElement(links.get(i)).build().perform();
				//links.get(i).click();
				break;
			}
		}
	}

}
