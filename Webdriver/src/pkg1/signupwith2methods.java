package pkg1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class signupwith2methods {
		 
		public static void main(String[] args) {
			
			signupwith2methods a= new signupwith2methods();
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("input#u_0_j")).sendKeys("Aakash");    //by css -- TagName#Idvalue.
		    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("khatter"); //by css -- Tagname[attrname=attrvalue] or we can use //by css -- Tagname.classvalue if value of first name is diffrent than lastname in inspect field.
		    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("09878987675"); //by css -- Tagname[attrname=attrvalue]
		    driver.findElement(By.cssSelector("input#u_0_v")).sendKeys("aakash@90909"); 
		    //by css -- Tagname.classvalue[attrname=attrvalue]
		    
		    WebElement drop= driver.findElement(By.cssSelector("select[name='birthday_day']")); 
		  //by css -- Tagname[attrname=attrvalue]
		    a.dropdown(drop, "5");
			
			WebElement drop2= driver.findElement(By.cssSelector("select#month")); 
			//by css -- TagName#Idvalue.
			a.dropdown(drop2, "Aug");
			
			WebElement drop3= driver.findElement(By.cssSelector("select[title='Year']"));
			//by css -- Tagname[attrname=attrvalue]
			a.dropdown(drop3, "1998");
			
			driver.findElement(By.cssSelector("label[for='u_0_9']")).click();
			driver.findElement(By.cssSelector("button[name='websubmit']")).click();
			
		}
		
		public void dropdown(WebElement element, String text)
		
		{
			Select s = new Select(element);
			//s.selectByValue(text);	
			s.selectByVisibleText(text);
		}

	}


