package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P5 {
	
	@AfterClass
	public void ramphal() {
		System.out.println("After class P5");
	}
	
	@BeforeClass
	public void sitaphal() {
		System.out.println("Before class P5");
	}
	
	@Test
	public void carrot() {
		
		Reporter.log("carrot",true);
	}
	
	@Test
	public void tomato() {
		
		Reporter.log("tomato");
	}
	
	@Test
	public void bhindi() {
		
		Reporter.log("bhindi",false);
	}

}
