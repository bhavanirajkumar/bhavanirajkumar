package FactoryRunnerTestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterTest
{
	String username;
	String password;
	String browser;
	@BeforeClass
	@Parameters({"username", "password", "browser"})
	public void setup(String username, String password, String browser)
	{	this.username = username; //user1
		this.password = password;
		this.browser = browser;
	}
	@Test
	public void method1()
	{
		System.out.println("UserName : " +username+" Password : " +password);
		System.out.println(browser);
	}
}
		
