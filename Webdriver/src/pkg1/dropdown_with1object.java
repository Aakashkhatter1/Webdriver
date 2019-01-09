package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_with1object {

		
		public static void main(String[] args) {
			
			dropdown_with1object obj=new dropdown_with1object();
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Desktop\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver(); //object of chrome driver
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			WebElement drop= driver.findElement(By.cssSelector("select[name='birthday_day']")); //using css -- tag with attribute -
			obj.dropdownSelection(drop, "5");
			
			WebElement drop2= driver.findElement(By.cssSelector("select#month")); //using css -- tag with id.
			obj.dropdownSelection(drop2, "Aug");
			
			WebElement drop3= driver.findElement(By.cssSelector("select[title='Year']"));
		    obj.dropdownSelection(drop3, "2019");
			
		}
	

public void dropdownSelection(WebElement element, String visibletext)

{ Select s=new Select(element);
  s.selectByVisibleText(visibletext);
}
}