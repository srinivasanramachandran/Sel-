package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applitoolsday3 {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.applitools.com/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		
	}

}
