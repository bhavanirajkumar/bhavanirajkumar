package TestNG;

import org.testng.annotations.Test;

public class Test3 {
	@Test (priority = 3)
	public void one() 
	{ 
	   System.out.println("First"); 
	} 
	@Test (priority = 2)
	public void two()
	{ 
	   System.out.println("Second"); 
	} 
	@Test (priority = 1)
	public void three()
	{ 
	  System.out.println("Third"); 
	 } 
}
