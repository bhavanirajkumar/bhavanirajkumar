package Alert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Alert

public class HandlingAlert {
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit(); // Click()

		Alert alert = driver.switchTo().alert(); // Object
		System.out.println(alert.getText());
		//Thread.sleep(2000);
		alert.dismiss();

		// alert.accept();
		// driver.quit();

		
		 /*System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().dismiss();*/
		 

	}
}
