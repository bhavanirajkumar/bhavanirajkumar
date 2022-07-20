package testng;

import org.testng.annotations.Test;

public class P2 {
	
	@Test(priority=0)
	public void sheep() {
		System.out.println("mehehehe");
	}
	
	@Test(priority=-2)
	public void cat() {
		System.out.println("meowwwww");
	}
	
	@Test
	public void dog() {
		System.out.println("awwwwwwww");
	}
	
	@Test(priority=4)
	public void cow() {
		System.out.println("mooooo");
	}

}
