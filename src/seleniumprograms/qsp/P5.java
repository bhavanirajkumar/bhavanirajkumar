package qsp;


import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		String address = driver.getWindowHandle();
		System.out.println(address);
		driver.close();

	}

}
