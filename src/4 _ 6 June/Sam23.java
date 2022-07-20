import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam23 {
	// ListBox And Date Calendar
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		String pickupDate = "25";
		String pickupMonth = "December";
		String pickupYear = "2022";
		
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	
		//https://www.cleartrip.com/
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//div[@class='sc-bkkeKt gAqCbJ fswFld ']")).click();	
		driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/input")).sendKeys("USA");

	List<WebElement> fromList = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		System.out.println(fromList.size()); 
	
		for(int i=0; i<fromList.size(); i++)
		{
			String fromText = fromList.get(i).getText(); 		//<Text>
			System.out.println(fromText);
			if(fromText.contains("ATL")) 
			{
				fromList.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='sc-cidDSM dOEpbS']/input")).sendKeys("uk");
		List<WebElement> toList = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		for(int i=0; i<toList.size(); i++)
		{
			String toText = toList.get(i).getText(); 		//<Text>
			System.out.println(toText);
			if(toText.contains("UKA")) 
			{
				toList.get(i).click();
				break;
			}
		}
		
		selectDate (pickupDate, pickupMonth, pickupYear);		//20 Feabruary 2023
	}

	public static String[] getMonthYear(String monthyearValue) //June 2022
	{										//[0] = June
		return monthyearValue.split(" ");	//[1] = 2022
	}
	
	public static void selectDate(String exDay, String exMonth, String exYear) throws Exception
	{
		String monthyearValue = null;
		//if(exMonth.equalsIgnoreCase(exMonth) && Integer.parseInt(exDay)<=30)
		//{			//April == April  								//31<= 30
		
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div"));
																
			monthyearValue = monthYear.getText();	//June 2022
			Thread.sleep(2000);
			System.out.println("Text: " + monthyearValue);
					//June 2022
					//(!(T))  (F)
			while (!(getMonthYear(monthyearValue)[0].equals(exMonth) && getMonthYear(monthyearValue)[1].equals(exYear)))
			{				//February           February							2023	       2023
				WebElement monthNavigationPath = driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
				monthNavigationPath.click();
				monthyearValue = monthYear.getText();			
			}		//February 2023
			
			
			//div[@class="DayPicker-Body"]/div/div[@class="DayPicker-Day"]/div[@class="calDate"]
			List<WebElement> dateList = driver.findElements(By.className("DayPicker-Day"));
			System.out.println(dateList.size());//28
			for(int i=0; i<dateList.size(); i++)
			{
				String dateText = dateList.get(i).getText(); //20
				if(dateText.equals(exDay)) // 20
				{
					dateList.get(i).click();
					driver.findElement(By.xpath("//div[@class='sc-iNGGcK jnsUlO']/span[2]")).click();
					break;
				}
			}
		}
		//else
			//System.out.println("Wrong Date...");*/
	//}		
}


