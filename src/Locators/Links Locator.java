
public class Sam5 {

	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("For")).click();  //For Work
		
	}
}
