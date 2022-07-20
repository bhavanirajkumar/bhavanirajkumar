import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sam25 {
	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		String value1 = "java";
		WebElement radioButton = driver.findElement(By.xpath("//div[@style='text-align: left;']"));
		List<WebElement> list1 = radioButton.findElements(By.xpath(".//input[@name='lang' and @type='radio']"));
		System.out.println(list1.size());
		for(int i=0; i<list1.size();i++)
		{
			String languageValue = list1.get(i).getAttribute("value");
			System.out.println(languageValue);
			if(languageValue.equalsIgnoreCase(value1))
			{   
				list1.get(i).click();
				break;
			}
		}
	
		String value2 = "code";
		WebElement checkBox = driver.findElement(By.xpath("//div[@id='post-body-4966932485064487229']"));
		List<WebElement> list2 = checkBox.findElements(By.xpath(".//input[@name='lang' and @type='checkbox']"));
		System.out.println(list2.size());
		for(int i=0; i<list2.size();i++)
		{
			WebElement hobbies = list2.get(i);
			String hobbiesValue = hobbies.getAttribute("id");
			System.out.println(hobbiesValue);
			if(hobbiesValue.equalsIgnoreCase(value2))
			{  
				if(list2.get(i).isSelected()==false)
				{
				hobbies.click();
			   	 break;
				}
			}
		}
	}
}

	


