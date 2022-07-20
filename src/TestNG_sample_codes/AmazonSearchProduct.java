package TestNG_sample_codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchProduct 
{
	public static WebDriver driver;
	
	public AmazonSearchProduct(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchTextAmazon;
	public WebElement SearchTextAmazon()
	{
		return SearchTextAmazon;
	}
	
	@FindBy (id="nav-search-submit-button")
	WebElement searchIconAmazon;
	public WebElement searchIconAmazon() 
	{
		return searchIconAmazon;
	}
}
