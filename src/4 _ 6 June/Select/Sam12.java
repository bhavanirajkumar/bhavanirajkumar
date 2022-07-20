
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
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
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
		
		/*Select selectDay = new Select(day);
		//selectDay.selectByVisibleText("20");	
		selectDay.selectByIndex(19);			//20
		//selectDay.selectByValue("20");*/
				
	/*	Select selectMonth = new Select(month);
		selectMonth.selectByValue("4");
		//selectMonth.selectByVisibleText("Apr");
		//selectMonth.selectByIndex(3);    	 //April
				
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("2000");*/
		
		/*WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='month']"));
									//select[@id="month"]/option		
										//monthdropdown.//option
		String monthXpath = ".//option";
		String monthValue = "Apr";*/
		
		//select[@id="day"]/option
						
		List<WebElement> dateList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dateList.size());   //31
		
		for(int i=0; i<dateList.size(); i++)
		{
			String dayValue = dateList.get(i).getText();  //20
			System.out.println(dayValue);
			if(dayValue.equals("15"))   //20
			{
				dateList.get(i).click();
				System.out.println(dateList.get(i).isSelected());
				break;
			}
		}
		
	//	selectDOB(monthdropdown, monthXpath, monthValue);
		
		
		
		/*selectDOB(day, "20");
		selectDOB(month, "Apr");
		selectDOB(year, "2000");*/
		
	/*	String dob = "25-Apr-2020";
		
		String dobArr[] = dob.split("-");
		
		selectDOB(day, dobArr[0]);
		Thread.sleep(1000);
		//selectDOB(month, dobArr[1]);
		//Thread.sleep(1000);
		selectDOB(year, dobArr[2]);*/
}
						
public static void selectDOB(WebElement element, String path, String value) 
{									//monthdropdown.//option
	List<WebElement> monthList = element.findElements(By.xpath(path));
	System.out.println(monthList.size());
	
	for(int i=0; i<monthList.size();i++)
	{
		String dayValue = monthList.get(i).getText();
		System.out.println(dayValue);
		if(dayValue.equals(value))   //Apr
		{
			monthList.get(i).click();
			System.out.println(monthList.get(i).isSelected());
			break;
		}
	}
}

/*public static void selectDOB(WebElement element, String value)
{
	Select select = new Select(element);
	select.selectByVisibleText(value);
}*/
}

