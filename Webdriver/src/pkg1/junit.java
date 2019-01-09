package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junit {
	
	//jUNIT IS a unit testing tool which is used to run the classes which dont have main method.
	//it is based on annotations.
	//annotations will be applied on the methods.
	//@Test --- mandatory annotation.
	//@before and @after
	
	@Test
	public void testcase() 
	
	{ System.out.println("This is test case");
		
	}
	
	@Before
	public void b()
	{
		System.out.println("before test");
		
	}
	
	@After
	public void c()
	{
		System.out.println("after test");
	}
}
