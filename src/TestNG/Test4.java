package TestNG;

import org.testng.annotations.Test;

public class Test4 {
	@Test(enabled = false, priority = 3)
	public void firstMethod()
	{
		System.out.println("1");
	}
	@Test(priority = 1)
	public void secondMethod()
	{
		System.out.println("2");
	}
	@Test(priority = 2)
	public void thirdMethod()
	{
		System.out.println("3");
	}
	@Test(priority = 4)
	public void fourthMethod()
	{
		System.out.println("fourth");
	}
}
