import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam10 {

	public static void main(String[] args) {
		//Check Box & Radio Button 
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);	
	
		WebElement checkBox1 = driver.findElement(By.cssSelector("input#vfb-6-0"));
		if(checkBox1.isDisplayed())	//Element is present in the page
		{
			if(checkBox1.isEnabled())
			{
				if (checkBox1.isSelected())  //Element is checked or selected
					System.out.println("Checkbox is Toggled On");					
				else 
					checkBox1.click();
			}
		}
        
		WebElement radioButton1 = driver.findElement(By.id("vfb-7-1"));
		if (radioButton1.isSelected())
			System.out.println("RadioButton is Toggled On");	
		else
			radioButton1.click();
		
	}
}
