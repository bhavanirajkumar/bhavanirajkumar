
public class Sam3 {
	public static void main(String[] args) throws Exception {
	String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();

	WebDriverWait wait = new WebDriverWait(driver, 15);
   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    wait.until(ExpectedConditions.textToBePresentInElement((WebElement) By.className("gb_d"), "Gmail"));
    
    WebElement googleSearch = driver.findElement(By.name("q"));
    if(googleSearch.isDisplayed())
    {
    	googleSearch.sendKeys("Selenium");
    }
    else
    {
    	System.out.println("Element is not found");
    }
   }
}