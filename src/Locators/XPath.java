
public class Sam7 {
	//Auto Suggest
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") +"\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");     
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");

		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("java");
	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/div/ul/li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{						
			String searchText = list.get(i).getText();  
			System.out.println(searchText);
		
			if(searchText.equalsIgnoreCase("selenium tutorial"))
			{	
				list.get(i).click();
				break;
			}
		}
	}
}
