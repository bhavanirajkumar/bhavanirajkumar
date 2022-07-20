package Sample_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_1123 {
	//Drag & Drop, ClickAndHold & MoveToElement
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 Actions builder = new Actions(driver);
		//builder.dragAndDrop(source, target).build().perform();

		builder.clickAndHold(source).moveToElement(target).release(source).build().perform();
		 
		 String textTo = target.getText();
		 
		 if(textTo.equals("Dropped!")) 
			 System.out.println("PASS: Source is dropped to target as expected"); 
		 else 
			 System.out.println("FAIL: Source couldn't be dropped to target as expected");
		
		 driver.quit();
	}
}
