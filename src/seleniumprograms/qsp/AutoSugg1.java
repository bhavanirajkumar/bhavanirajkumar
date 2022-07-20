package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open browser
		WebDriver driver = new ChromeDriver();
		//go to google
		driver.get("http://www.google.com");
		//type java in the search box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);//very important
		//count the no of auto suggestions and print it.
		String xp="//span[contains(text(),'ava') and not(contains(.,'eerava'))]";
		List<WebElement> allAutoSuggs = driver.findElements(By.xpath(xp));
		System.out.println("Total auto suggestions: "+allAutoSuggs.size());
		//print every auto sugg
		System.out.println("========================================");
		for(int i=0;i<allAutoSuggs.size();i++) {
			System.out.println(allAutoSuggs.get(i).getText());
		}
		//close browser
		driver.close();
	}

}
