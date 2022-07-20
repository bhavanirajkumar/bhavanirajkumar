package FactoryRunnerTestNG;

import org.testng.annotations.Test;

public class FactoryTest {
	String username;	//Global Variable
	String password;
	//Constructor
	public FactoryTest(String username, String password)  //Instance Variable//Setter
	{
		this.username = username;
		this.password = password;
	}
	@Test
	public void method1()
	{
		System.out.println("UserName : " +username+" Password : " +password);
		
	}
}
