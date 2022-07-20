public class Sam9 {
	public static void main(String[] args) throws Exception {
		//Mouse hover and Radio Button
		
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();		

		String baseurl="https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebElement move = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();
																
		WebElement radioButton = driver.findElement(By.name("software"));
		
		boolean rb = radioButton.isSelected();
		System.out.println(rb);
		if(rb == false)
		{
			radioButton.click();
		}
		
		//driver.quit();
	}
}
