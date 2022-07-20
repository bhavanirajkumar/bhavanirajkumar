package Sample_codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Alert

public class Sample_1128 {
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

//		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//
//		driver.findElement(By.name("cusid")).sendKeys("53920");
//		driver.findElement(By.name("submit")).submit(); // Click()
//		
//		driver.findElement(By.id("promptexample")).click();
//		Thread.sleep(1000);
		/*System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();*/
//		
//		Alert alert = driver.switchTo().alert(); // Object
//		System.out.println(alert.getText());
//		alert.dismiss();
//		alert.getText();
//		alert.sendKeys("Selenium");
//		Thread.sleep(1000);
		//Press the OK button
//		alert.accept();
		// alert.accept();
		// driver.quit();
//		System.out.println(driver.switchTo().alert());
//
//		driver.switchTo().alert().sendKeys("Yes");
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
		 /*System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().dismiss();*/
//		 Alert promptAlert  = driver.switchTo().alert();
//		   String alertText = promptAlert.getText();
//		   System.out.println("Alert text is " + alertText);
//		  //Send some text to the alert
//		   promptAlert.sendKeys("Test User");
//		   promptAlert.accept();

	}
}
