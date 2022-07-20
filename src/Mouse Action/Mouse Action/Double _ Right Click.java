public class Sam20 {
	//Double & Right Click
	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
				
		driver.navigate().to("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		//act.doubleClick(doubleClickButton).build().perform();
		
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();           //Click OK in Alert

		
		act.contextClick(rightClickButton).build().perform();
	}

}
