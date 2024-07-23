package org.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonwindowshand {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		 
		WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
         src.sendKeys("iphones 14 pro");
         driver.findElement(By.id("nav-search-submit-button")).click();
         WebElement clk = driver.findElement(By.xpath("(//img[@class='s-image s-image-optimized-rendering'])[1]"));
        
        Actions a = new Actions(driver);
        a.contextClick(clk).perform();
        
        Robot r = new Robot();
        for (int i = 0; i < 2; i++) {
        	 r.keyPress(KeyEvent.VK_DOWN);
             r.keyRelease(KeyEvent.VK_DOWN);
             
		}
         r.keyPress(KeyEvent.VK_ENTER);
         String parentwindow = driver.getWindowHandle();
         System.out.println("parent window id:"+ parentwindow);
         
         Set<String> allwindows = driver.getWindowHandles();
         
         List<String> l = new ArrayList<>();
         l.addAll(allwindows);
         String childwindow = l.get(1);
         System.out.println("childwindow id:"+ childwindow);
         driver.switchTo().window(childwindow);
         WebElement price = driver.findElement(By.xpath("(//span[text()='$4.98'])[1]"));
         System.out.println(price.getText());
         
         
         
         
		
	}

}
