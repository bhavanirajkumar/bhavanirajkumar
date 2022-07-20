package pagess;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Checkout extends Cart{

	public static void checkout_pages() throws IOException, InterruptedException 
	{
		Cart crt = new Cart();
		crt.cart_p();
		Checkout_page();
		first_name();
		last_name();
		postal_Code();
		continue_button();

	}
	
	public static void Checkout_page() throws InterruptedException
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(500);
			WebElement cout = driver.findElement(By.id("checkout"));
			cout.click();
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void first_name() throws InterruptedException
	{
		try
		{
			Thread.sleep(500);
			WebElement first = driver.findElement(By.id("first-name"));
			first.sendKeys(Login_Page.readExcelFile(1, 3));
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void last_name() throws InterruptedException
	{
		try
		{
			Thread.sleep(500);
			WebElement last = driver.findElement(By.id("last-name"));
			last.sendKeys(Login_Page.readExcelFile(1, 4));
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void postal_Code() throws InterruptedException
	{
		try
		{
			Thread.sleep(500);
			WebElement post = driver.findElement(By.id("postal-code"));
			post.sendKeys(Login_Page.readExcelFile(1, 5));
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void continue_button() throws InterruptedException
	{
		try
		{
			Thread.sleep(500);
			WebElement cnt = driver.findElement(By.id("continue"));
			
			cnt.click();
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
