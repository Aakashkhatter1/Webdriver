package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("AakashKhatter"); //uniquely identify + action
		
		WebElement password = driver.findElement(By.name("pass")); //uniquely identify 
		password.sendKeys("Aakash@890"); //action
		
		WebElement login = driver.findElement(By.cssSelector("label#loginbutton"));
		login.click();
	}
}
