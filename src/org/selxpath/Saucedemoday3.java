package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemoday3 {

	public static void main(String[] args) {
		//chromedriver upcasting
				WebDriver driver = new ChromeDriver();
				//lauch browser
				driver.get("https://www.saucedemo.com/");
				
		     	WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys("standard_user");
				WebElement pass = driver.findElement(By.xpath("//input[@data-test='password']"));
				pass.sendKeys("secret_sauce");
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				
				WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
				product.click();
				
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				
	}

}
