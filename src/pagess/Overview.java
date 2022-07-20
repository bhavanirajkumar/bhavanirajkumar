package pagess;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class Overview extends Checkout
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Checkout crtpg = new Checkout();
		crtpg.checkout_pages();
		finishpg();
		Thread.sleep(500);
		ConfirmationMsg();
		driver.quit();
	}
	public static void finishpg() throws InterruptedException 
	{
		try
		{
			Thread.sleep(1000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,350)", "");
//			Thread.sleep(500);
			driver.findElement(By.id("finish")).click();
			Thread.sleep(500);
			System.out.println("Finish Shopping");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void ConfirmationMsg() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-350)", "");
		WebElement text1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2"));
		System.out.println(text1.getText());
		System.out.println("===================================================================");
		Thread.sleep(1000);
		WebElement text2 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
		System.out.println(text2.getText());
		Thread.sleep(1000);
	}
}
