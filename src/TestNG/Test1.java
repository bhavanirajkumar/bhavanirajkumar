package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	@DataProvider(name = "param") // 2 Sets of data
	public Object[][] dpMethod() {
		return new Object[][] { { 2, 3, 5 }, { 5, 7, 10 } };
	}

	@Test(dataProvider = "param") 
	public void myTest(int a, int b, int result) //5	7	10	
	{
	//	try {
			int sum = a + b; //5 + 7(12) = Sum
			Assert.assertEquals(result, sum); //10 == 12   ER == AR
		
		//	System.out.println("Test Passed");
			//} 
		//catch (AssertionError e) {		//Exception
			//System.out.println("Test Failed" + e);
	//	}
	}
}
