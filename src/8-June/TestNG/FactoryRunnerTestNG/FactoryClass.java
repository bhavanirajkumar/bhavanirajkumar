package FactoryRunnerTestNG;

import org.testng.annotations.Factory;

public class FactoryClass {

	@Factory
	public Object[] getInstance()
	{
		// class obj = new class();
		Object[] Obj = new Object[] {
				new FactoryTest("User1", "Password1"),
				new FactoryTest("User2", "Password2"),
				new FactoryTest("User3", "Password3")};
		return Obj;
	}
}

