package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookday3 {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
     user.sendKeys("abc@gmail.com");
     WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
     pass.sendKeys("123");
     String attribute1 = user.getAttribute("value");
     System.out.println(attribute1);
	}

}
