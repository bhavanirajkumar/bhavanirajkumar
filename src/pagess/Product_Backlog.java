package pagess;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Product_Backlog extends Login_Page
{
	public static void Product_Bclg() throws IOException, InterruptedException 
	{
		Successfull_login();
		AddToCart();
		Thread.sleep(500);
	}
	
	public static void Successfull_login() throws IOException, InterruptedException
	{
		Login_Page lp = new Login_Page();
		lp.Login_pg();
		Thread.sleep(500);
	}
	
	public static void AddToCart() throws InterruptedException
	{
		try
		{
			WebElement adtcrt = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			adtcrt.click();
			Thread.sleep(500);
			WebElement adtcrt1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
			adtcrt1.click();
			Thread.sleep(500);
			WebElement adtcrt2 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
			adtcrt2.click();
			Thread.sleep(500);
			WebElement adtcrt3 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
			adtcrt3.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(500);
			WebElement adtcrt4 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
			adtcrt4.click();
			Thread.sleep(500);
			WebElement adtcrt5 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
			adtcrt5.click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}

