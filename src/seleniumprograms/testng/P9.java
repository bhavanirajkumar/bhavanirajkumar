package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P9 {
	
	@BeforeMethod
	public void apple() {
		System.out.println("@before method");
	}
	
	@Test
	public void mango() {
		System.out.println("Test begins");
		SoftAssert s1 = new SoftAssert();
		s1.fail();
		System.out.println("Test ends");
		s1.assertAll();
	}
	
	
	@AfterMethod
	public void banana() {
		System.out.println("@After method");
	}

}
