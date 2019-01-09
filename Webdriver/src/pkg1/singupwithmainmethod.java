package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singupwithmainmethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#u_o_j")).sendKeys("Aakash");    //by css -- TagName#Idvalue.
	    driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-")).sendKeys("khatter"); //by css -- Tagname.classvalue
	    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("aakashk2690@gmail.com"); //by css -- Tagname[attrname=attrvalue]
	    driver.findElement(By.cssSelector("input.inputtext _58mg _5dba _2ph-[name='reg_passwd__']")).sendKeys("aakash@90909"); 
	    //by css -- Tagname.classvalue[attrname=attrvalue]
	    
	    WebElement drop= driver.findElement(By.cssSelector("select[name='birthday_day']")); 
	  //by css -- Tagname[attrname=attrvalue]
		Select s = new Select(drop);
		s.selectByIndex(5);
		
		WebElement drop2= driver.findElement(By.cssSelector("select#month")); 
		//by css -- TagName#Idvalue.
		Select s2=new Select(drop2);
		s2.selectByVisibleText("Aug");
		
		WebElement drop3= driver.findElement(By.cssSelector("select[title='year']"));
		Select s3=new Select(drop3);
		s3.selectByValue("2018");
		
		driver.findElement(By.cssSelector("label[for='u_0_9']")).click();
		driver.findElement(By.cssSelector("button._6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
		
	}

}
