
public class Sam4 {
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\Webdriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.kohls.com/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search")));
		
		
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("tuxedo");
		search.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.name("submit-search")).click();
		//driver.quit();
	}
}