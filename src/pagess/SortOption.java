package pagess;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortOption extends Login_Page
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Login_Page pg = new Login_Page();
		pg.Login_pg();
		sortoption();
		Thread.sleep(1000);
		driver.quit();

	}
	public static void sortoption() throws InterruptedException
	{
		 try
		 {
			 for(int i=0; i<=3; i++)
			 {
				
				 Select se = new Select(driver.findElement(By.className("product_sort_container")));
				 Thread.sleep(1000);
				se.selectByIndex(i);
				 Thread.sleep(1000);
				 WebElement a = driver.findElement(By.className("product_sort_container"));
				 a.click();
				 Thread.sleep(1000);
				 a.click();
			 }
		}
			 catch (Exception e)
			 {
				 e.printStackTrace();
				 System.out.println("Kuchh to error hai..!");
			 }
	}
}
