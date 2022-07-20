package pagess;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart extends Product_Backlog
{
	public static void cart_p() throws IOException, InterruptedException 
	{
		Product_Backlog pb = new Product_Backlog();
		pb.Product_Bclg();
		Cart_click();
	}
	public static void Cart_click() throws InterruptedException
	{
		try
		{
			WebElement cartpg = driver.findElement(By.className("shopping_cart_link"));
			cartpg.click();
			Thread.sleep(500);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,350)", "");
//			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
//	public static void main(String[] args) throws IOException, InterruptedException {
//		System.out.println();
//		cart_p();
//	}
//	public static void Cart_page()
//	{
//		
	
//	}
	

}
