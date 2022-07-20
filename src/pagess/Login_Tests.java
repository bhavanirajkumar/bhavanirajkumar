package pagess;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Tests extends Login_Page 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		try
		{
			Login_Page lp = new Login_Page();
			lp.Login_pg();
			Thread.sleep(300);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			Logout_steps();
			Thread.sleep(300);
			Diff_users1();
			Thread.sleep(300);
			Diff_users2();
			Thread.sleep(300);
			Diff_users3();
			Thread.sleep(300);
			driver.quit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout_steps() throws InterruptedException 
	{
		try
		{
			Menu_Icon();
			Thread.sleep(300);
			Log_out();
			Thread.sleep(300);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Diff_users1() throws IOException, InterruptedException 
	{
		try
		{
			WebElement usr = driver.findElement(username);
			WebElement pass = driver.findElement(password);
			Thread.sleep(300);
			userId = Login_Page.readExcelFile(2, 0);
			usr.sendKeys(userId);
			Thread.sleep(300);
			pass.sendKeys(passId);
			Thread.sleep(300);
			Logout_steps_new_users();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Diff_users2() throws IOException, InterruptedException 
	{
		try
		{
			WebElement usr = driver.findElement(username);
			WebElement pass = driver.findElement(password);
			Thread.sleep(300);
			userId = Login_Page.readExcelFile(3, 0);
			usr.sendKeys(userId);
			Thread.sleep(300);
			pass.sendKeys(passId);
			Thread.sleep(300);
			Logout_steps_new_users();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Diff_users3() throws IOException, InterruptedException 
	{
		try
		{
			WebElement usr = driver.findElement(username);
			WebElement pass = driver.findElement(password);
			Thread.sleep(300);
			userId = Login_Page.readExcelFile(4, 0);
			usr.sendKeys(userId);
			Thread.sleep(300);
			pass.sendKeys(passId);
			Thread.sleep(300);
			Login_Page.login_Button();
			Thread.sleep(300);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout_steps_new_users() throws InterruptedException 
	{
		try
		{
			Login_Page.login_Button();
			Thread.sleep(300);
			Menu_Icon();
			Thread.sleep(300);
			Log_out();
			Thread.sleep(300);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void Menu_Icon()
	{
		try
		{
			WebElement menuicon = driver.findElement(By.id("react-burger-menu-btn"));
			menuicon.click();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Log_out() 
	{
		try
		{
			WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
			logout.click();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
