package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoDay2 {

	public static void main(String[] args) {
		//chromedriver upcasting
		WebDriver driver = new ChromeDriver();
		//lauch browser
		driver.get("https://www.saucedemo.com/");
		//enter username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("raja");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("1234");
		

	}

}
