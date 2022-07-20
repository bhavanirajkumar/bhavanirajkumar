package Sample_codes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Sample_1120 {
	//Tool Tip
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/tool-tips/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		WebElement hoverButton = driver.findElement(By.id("toolTipButton"));
		System.out.println("Button : " +hoverButton.getText());
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverButton).build().perform();

		Thread.sleep(2000);
		
		WebElement toolTipText = driver.findElement(By.className("tooltip-inner"));
		System.out.println("Tool tip : " +toolTipText.getText()); 
		
		//driver.quit();
	}
}
