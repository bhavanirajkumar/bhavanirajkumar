import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sam3 {
	public static void main(String[] args) throws Exception {
	String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();

	
	/*driver.findElement(By.name("q")).sendKeys("java");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
	
    WebElement googleSearch = driver.findElement(By.name("q"));
    googleSearch.sendKeys("java");
    googleSearch.sendKeys(Keys.ENTER);
    
   /* if(googleSearch.isDisplayed())
    {
    	googleSearch.sendKeys("Selenium");
    }
    else
    {
    	System.out.println("Element is not found");
    }*/
   }
}