import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Sam2 
{
public static void main(String[] args) throws Exception 
{
		
String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", driverPath);
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();	//Maximize the window or browser

System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println(driver.findElement(By.className("gb_d")).getText());
System.out.println(driver.findElement(By.className("gb_d")).getAttribute("href"));
System.out.println(driver.findElement(By.name("q")).getSize());


driver.quit();
}
}