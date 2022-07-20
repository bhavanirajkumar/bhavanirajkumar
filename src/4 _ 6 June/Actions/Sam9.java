package Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Sam9 {
	public static void main(String[] args) throws Exception {
		//Mouse hover and Radio Button
		String baseurl="https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml";
		
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		WebElement move = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(move).build().perform();
		Thread.sleep(2000);
																
		WebElement radioButton = driver.findElement(By.name("software"));
	//	boolean rb = radioButton.isSelected();
	//	System.out.println(rb);
	//	if(rb == false)
	//	{
			radioButton.click();
	//	}
		//Thread.sleep(2000);   //to Show radio button is selected
		
		/*driver.findElement(By.xpath("//*[@id='align']/span[5]/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='align']/span[6]/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='align']/span[7]/input")).click();*/
		
		//driver.quit();
	}
}
