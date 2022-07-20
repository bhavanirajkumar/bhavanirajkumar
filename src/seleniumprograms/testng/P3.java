package testng;

import org.testng.annotations.Test;

public class P3 {

	@Test(invocationCount = 6, priority = 50)
	public void dj() {
		System.out.println("maganey");
	}

	@Test(priority = 100, invocationCount = 8)
	public void vinay() {
		System.out.println("maccha");
	}

	@Test(invocationCount = 14, priority = 1)
	public void javed() {
		System.out.println("listen");
	}

}
