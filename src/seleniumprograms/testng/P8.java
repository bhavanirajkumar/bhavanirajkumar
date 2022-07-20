package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P8 {
	
	@BeforeMethod
	public void apple() {
		System.out.println("@before method");
	}
	
	@Test
	public void mango() {
		System.out.println("Test begins");
		//Assert.fail();//to fail the test case
		Assert.assertEquals("Google", "Mozila");
		System.out.println("Test ends");//wont execute
	}
	
	
	@AfterMethod
	public void banana() {
		System.out.println("@After method");
	}

}
