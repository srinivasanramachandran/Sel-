package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartActionsmove {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
		
		//geturl
		driver.get("https://www.flipkart.com/");
		
		WebElement move = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(move).perform();
		
		driver.findElement(By.xpath("//a[text()='Bedsheets']")).click();
	}

}
