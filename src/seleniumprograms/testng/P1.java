package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class P1 {
	@BeforeSuite
	public void a1() {
		System.out.println("BeforeSuite");
	}
	@Test
	public void chickoo() {
		System.out.println("mangya");
	}
	
	@Test
	public void apple() {
		System.out.println("dinga");
	}
	
	@Test
	public void banana() {
		System.out.println("sundra");
	}	
}
