package MultiWindow;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Windows Handler

public class WindowHandler {
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		// Parent Window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow); //1
		// Parent Window and All Child Windows
		Set<String> s1 = driver.getWindowHandles(); // Parent Window & Child Windows
		Iterator<String> i1 = s1.iterator();  		//1 & 2
		while (i1.hasNext()) {		
			String childWindow = i1.next(); //2
			System.out.println(childWindow);
			if (!parentWindow.equals(childWindow)) {   //(!1==2)  (!F)   (T)
				driver.switchTo().window(childWindow);  //2
				driver.findElement(By.name("emailid")).sendKeys("franky22j@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close(); // driver.quit();
			}
		}
		driver.switchTo().window(parentWindow);//1
		driver.quit();
	}
}