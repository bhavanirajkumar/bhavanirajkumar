
public class Sam5 {

	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
				

		List <WebElement> link = driver.findElements(By.className("gb_d"));
		for(int i=0; i<link.size();i++)
		{
		System.out.println(link.get(i).getText());
		}
		
	}
}
