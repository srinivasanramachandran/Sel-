package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntraday3 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();

	}

}
