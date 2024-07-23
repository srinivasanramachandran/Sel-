package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goodiesdragdrop {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src1 = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement des1 = driver.findElement(By.xpath("//div[text()='Italy']"));
		WebElement src2 = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		WebElement des2 = driver.findElement(By.xpath("//div[text()='Spain']"));

		Actions a = new Actions(driver);
		
		a.dragAndDrop(src1, des1).perform();
		a.dragAndDrop(src2, des2).perform();
		
	}

}
