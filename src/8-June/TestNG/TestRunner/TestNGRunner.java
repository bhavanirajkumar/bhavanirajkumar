package TestRunner;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;

public class TestNGRunner {
	public static void main(String[] args) throws Exception {

	TestNG Obj = new TestNG();
	
	List<String> suites = new ArrayList<String>();
	suites.add("D:\\eclipse-workspace\\Selenium\\May21\\test1.xml");
	suites.add("D:\\eclipse-workspace\\Selenium\\May21\\test2.xml");
	
	Obj.setTestSuites(suites);
	Obj.run();
}
}