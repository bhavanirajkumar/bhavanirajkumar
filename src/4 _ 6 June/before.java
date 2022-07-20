import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class before {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.magicbricks.com/homeloan/home?inc=desktop_homeloan_menu_linkage");
			
	WebElement checkBox = driver.findElement(By.cssSelector("label.home-loan__main-form__tnc--label"));
	System.out.println(checkBox.getSize());
	
	Actions build = new Actions(driver);
	build.moveToElement(checkBox).moveByOffset(124, 0).click().build().perform();
		

	}

}
