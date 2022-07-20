package GroupsTestNG;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(priority =1, groups = {"sanity"}) //Testcase or Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(groups = {"Regression"})
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority =2, groups = {"sanity","Regression"})
	public void test3()
	{
		System.out.println("Test3");
	}
	@Test
	public void test4()
	{
		System.out.println("Test4");
	}
	@Test(priority =3, groups = {"windows.Regression"})
	public void test()
	{
		System.out.println("Test5");
	}
}
