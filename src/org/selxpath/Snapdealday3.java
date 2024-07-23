package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealday3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
	    WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
	    
	    search.sendKeys("headphones");
	    
	    driver.findElement(By.xpath("//span[text()='Search']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//p[text()='Portronics - Wireless Bluetooth Headset']")).click();
	    driver.close();
	    
	    
	    
	}

}
