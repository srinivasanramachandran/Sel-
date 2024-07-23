package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealJs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("userName"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='90255637'", username);
		
		WebElement clk = driver.findElement(By.id("checkUser"));
		
		js.executeScript("arguments[0].click();", clk);
		
	}

}
