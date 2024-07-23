package org.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgangehrmDay2 {

	public static void main(String[] args) {
		//upcasting
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		//get browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("Admin");
	    WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("Admin123");
	    
	    
	}
	

}
