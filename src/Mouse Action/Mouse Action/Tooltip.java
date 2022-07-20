public class Sam26 {
	//Tool Tip
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/tool-tips/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement hoverButton = driver.findElement(By.id("toolTipButton"));
		System.out.println("Button : " +hoverButton.getText());
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverButton).build().perform();

		Thread.sleep(2000);
		
		WebElement toolTipText = driver.findElement(By.className("tooltip-inner"));
		System.out.println("Tool tip : " +toolTipText.getText()); 
		
		driver.quit();
	}
}
