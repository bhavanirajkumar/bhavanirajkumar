package Sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sam1 {
	@Before		//Before Each Test
	public void beforeTest(){
	System.out.println("Running before test");
	}
	 
	@Test
	public void Test1(){
	System.out.println("Running first Junit test");
	}
	 
	@Test
	public void Test2(){
	System.out.println("Running second Junit test");
	}
	
	@After			//After Each Test
	public void afterTest(){
		System.out.println("Running after test");
	}
}
