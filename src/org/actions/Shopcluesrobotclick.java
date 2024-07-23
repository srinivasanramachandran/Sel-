package org.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Shopcluesrobotclick {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Refurbished Mobile']"));
		Actions a = new Actions(driver);
		
        a.contextClick(click).perform();//rightclickmouse
        
        Robot r = new Robot();
        for (int i = 0; i < 6; i++) {
        	 r.keyPress(KeyEvent.VK_DOWN);
             r.keyRelease(KeyEvent.VK_DOWN);
             
		}
         r.keyPress(KeyEvent.VK_ENTER);
		

	}

}
