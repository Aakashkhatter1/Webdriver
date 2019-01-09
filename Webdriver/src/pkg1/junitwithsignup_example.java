

	package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

	public class junitwithsignup_example {
		
		//jUNIT IS a unit testing tool which is used to run the classes which dont have main method.
		//it is based on annotations.
		//annotations will be applied on the methods.
		//@Test --- mandatory annotation.
		//@before and @after
		
		//Before and after will executed with each Test annotation. (Suppose we have 2 Test annotation -- Test1 and Test2.
		//@BeforeClass and @Afterclass will be exected only once.
		
		
		ChromeDriver driver; //global driver.
		
		@Before
		public void testcase() 
		
		{ 
			//Browser launch + url
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver(); //object of chrome driver
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
		}
		
		@Test
		public void b()
		{
		 
			//Signup code
			//Write code here
		}
		l
		@After
		public void c()
		{
			//Browser close.
		}
	}

