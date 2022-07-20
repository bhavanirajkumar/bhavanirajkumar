package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/OneDrive/Desktop/2CSA4%20html%20programs/Hotel.html");
		WebElement tajLb = driver.findElement(By.id("taj"));
		Select s1 = new Select(tajLb);
		Thread.sleep(2000);
		s1.selectByIndex(0);//chicken tandoori
		Thread.sleep(2000);
		s1.selectByValue("fcb");// fodni cha bhat
		Thread.sleep(2000);
		s1.selectByVisibleText("Jhunka Bhakri");//Jhunka Bhakri
		Thread.sleep(3000);
		System.out.println("First selected option: "+s1.getFirstSelectedOption().getText());
		System.out.println("all Selected Options: ");
		List<WebElement> selectedOptions = s1.getAllSelectedOptions();
		for(int i=0;i<selectedOptions.size();i++) {
			System.out.println(selectedOptions.get(i).getText());
		}
		System.out.println("=================================");
//		s1.deselectByIndex(2);
//		Thread.sleep(2000);
//		s1.deselectByValue("jb");
//		Thread.sleep(2000);
//		s1.deselectByVisibleText("Chicken Tandoori");
		s1.deselectAll();
		System.out.println("all Options: ");
		List<WebElement> allOptions = s1.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
