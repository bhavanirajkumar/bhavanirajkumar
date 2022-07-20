package Sample;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class  Sam2 {
	public String name;
	public int age;
	
	public Sam2(String name,int age){
	this.name=name;
	this.age=age;
	}
	 
	@Test
	public void testMethod(){
	System.out.println("Name is: "+name +" and age is: "+age);
	}
	 
	@Parameters
	public static Collection<Object[]> parameter(){
	Object[][] tData=new Object[2][2];
	tData[0][0]="Dinesh";
	tData[0][1]=30;
	tData[1][0]="Kiruba";
	tData[1][1]=40;
	return Arrays.asList(tData);
	}
}

