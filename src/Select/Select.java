
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sam12 {
public static void main(String[] args) throws Exception {
		// Handling ListBox through "Select" command.
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Create Account
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement day = driver.findElement(By.id("day")); 
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectDay = new Select(day);
		//selectDay.selectByVisibleText("20");	
		selectDay.selectByIndex(19);			//20
		//selectDay.selectByValue("20");
				
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("4");
		//selectMonth.selectByVisibleText("Apr");
		//selectMonth.selectByIndex(3);    	 //April
				
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("2000");
		
				
		/*List<WebElement> dateList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dateList.size());   //31
		
		for(int i=0; i<dateList.size(); i++)
		{
			String dayValue = dateList.get(i).getText();  //20
			System.out.println(dayValue);
			if(dayValue.equals("10"))   //20
			{
				dateList.get(i).click();
				System.out.println(dateList.get(i).isSelected());
				break;
			}
		}*/
	}
}

