package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiple {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//go to amazon
		driver.get("http://www.amazon.com");
		//count the no of links in the webpage
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links: "+allLinks.size());
		//print all the links in the webpage
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}
		//close the browser
		driver.close();
		
	}

}
