package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartripday3 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement from = driver.findElement(By.xpath("//input [@title='From station']"));
		
		from.sendKeys("coimbatore");
		WebElement to = driver.findElement(By.xpath("//input [@title='To station']"));
		
		to.sendKeys("chennai");
		
		driver.findElement(By.xpath("//button[text()='Search trains']")).click();
		
	}

}
