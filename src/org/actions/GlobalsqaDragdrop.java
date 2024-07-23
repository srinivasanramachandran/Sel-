package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalsqaDragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement src = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		Thread.sleep(3000);
		WebElement des = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(src, des).perform();
		

	}

}
