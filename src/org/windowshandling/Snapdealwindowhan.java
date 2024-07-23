package org.windowshandling;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealwindowhan {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	
	    WebElement srh = driver.findElement(By.id("inputValEnter"));
	    srh.sendKeys("watch");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	    driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
	    
	    Set<String> allwin = driver.getWindowHandles();
	    
	    System.out.println(allwin);
	    
	    List<String> l = new ArrayList<>();
	    l.addAll(allwin);
	     
	    driver.switchTo().window(l.get(1));
	    driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	    
	    WebElement price = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
	    System.out.println(price.getText());
	  

	}

}
