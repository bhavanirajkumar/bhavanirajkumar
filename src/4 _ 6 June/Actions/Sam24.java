package Actions;
//Multi-Select Actions
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.Keys;

public class Sam24 {
	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") +"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
		List<WebElement> list = dropDown.findElements(By.xpath(".//option"));
		
		Actions act = new Actions(driver);
		Action action = act.keyDown(Keys.CONTROL)
		.click(list.get(0))
		.click(list.get(2))
		.click(list.get(4))
		.click(list.get(5))
		.keyUp(Keys.CONTROL).build();
		action.perform();
		
		driver.findElement(By.xpath("//*[@id='pickList']/div/div[2]/button[1]")).click();

	}

}
