import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam11 {
	//Image Click
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/devops-certification-courses");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
		
		
	//click on the "Edureka" logo on the upper left portion
	//driver.findElement(By.xpath("//i[@class='icon-logo edu-logo-style']")).click(); 
									
	//driver.findElement(By.cssSelector("body > header > nav > div.navbar-headerw > a > i")).click();
	driver.findElement(By.cssSelector("i[class='icon-logo edu-logo-style']")).click();
										
	//driver.quit();
	}
}
