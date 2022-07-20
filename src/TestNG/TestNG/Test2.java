package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test2 {
	// Suite
	@BeforeSuite
    public void beforeSuite() {
       System.out.println("in Before Suite");
    }
	@BeforeTest
	public void beforeTest() {
	    System.out.println("in Before Test");
	}
	@BeforeClass
	public void beforeClass() {
	     System.out.println("in Before Class");
	}
	
	@BeforeMethod
    public void beforeMethod() {
       System.out.println("in Before Method");
    }
	// Test Case 1
    @Test
    public void testCase1() {
       System.out.println("in Test Case 1");
    } 
    // Test Case 2
    @Test
    public void testCase2() {
       System.out.println("in Test Case 2");
    }

    @AfterMethod
    public void afterMethod() {
       System.out.println("in After Method");
    }
    
    @AfterClass
    public void afterClass() {
       System.out.println("in After Class");
    }

    @AfterTest
    public void afterTest() {
       System.out.println("in After Test");
    }
   
     @AfterSuite
    public void afterSuite() {
       System.out.println("in After Suite");
    }
 }

