package org.sel;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeDay2 {

	public static void main(String[] args) throws InterruptedException {
		//chromedriver upcasting
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launch browser
		driver.get("https://www.demoblaze.com/");
		WebElement login = driver.findElement(By.id("login2"));
		login.click();
		//Thread.sleep(10);
		driver.findElement(By.id("loginusername")).sendKeys("abc");
		driver.findElement(By.id("loginpassword")).sendKeys("123");
		driver.close();
		
		
		
		

	}

}
