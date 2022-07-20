import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam6 {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		/*WebElement gmailLink = driver.findElement(By.className("gb_f"));
		System.out.println(gmailLink.getText());
		System.out.println();*/

		
		/*List<WebElement> links = driver.findElements(By.className("gb_f"));
		System.out.println(links.size()); //storing the size of the links 
		
		for(int j=0; j<links.size(); j++)//Printing the links 
		{              
		 String str = links.get(j).getText(); 	//  2
		 if(str.equalsIgnoreCase("Images"))
		 {
			 links.get(j).click();
			 break;
		 }
		}*/
	}
}
