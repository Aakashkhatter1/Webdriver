package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_30dec {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //object of chrome driver
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Drop down:-
		//If drop down is in Select tag -- then select class will be used.
		// If drop down is in other tag  --- then keyword arrow-down key is used.
		
		//Three methods for select class
		//Selectbyindex(), selectbyValue() and selectbyvisibletext()
		
		WebElement drop= driver.findElement(By.cssSelector("select[name='birthday_day']")); //using css -- tag with attribute -
		Select s = new Select(drop);
		s.selectByIndex(5);
		
		WebElement drop2= driver.findElement(By.cssSelector("select#month")); //using css -- tag with id.
		Select s2=new Select(drop2);
		s2.selectByVisibleText("Aug");
		
		WebElement drop3= driver.findElement(By.cssSelector("select[title='Year']"));
		Select s3=new Select(drop3);
		s3.selectByValue("2018");
		
	}
}
