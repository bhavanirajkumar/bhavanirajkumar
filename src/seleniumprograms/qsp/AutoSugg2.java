package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ban");
		Thread.sleep(2000);
		List<WebElement> allAutoSuggs = driver.findElements(By.xpath("//p[contains(.'Ban',)]"));
		System.out.println("Total Auto Suggestions: "+allAutoSuggs.size());
		System.out.println("========================");
		for(int i=0;i<allAutoSuggs.size();i++) {
			System.out.println(allAutoSuggs.get(i).getText());
		}
		driver.close();
	}

}
