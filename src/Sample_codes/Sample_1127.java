package Sample_codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Alert

public class Sample_1127 {
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

//		driver.findElement(By.name("cusid")).sendKeys("53920");
//		driver.findElement(By.name("submit")).submit(); // Click()
		
		
		driver.findElement(By.id("promptAlert")).click();
		
//		driver.switchTo().alert().sendKeys("Text");

		
		/*System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();*/
		
		Alert alert = driver.switchTo().alert(); // Object
		System.out.println(alert.getText());
		
		
//		System.out.println(alert.getText());
//		alert.sendKeys("Yes");
//		
//		
		Thread.sleep(1000);
//		 alert.accept();
		 driver.quit();
//
//		
//		 /*System.out.println(driver.switchTo().alert().getText());
//		 driver.switchTo().alert().dismiss();*/
//		 

	}
}
