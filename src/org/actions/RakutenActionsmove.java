package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RakutenActionsmove {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://corp.rakuten.co.in/");
		driver.manage().window().maximize();
		WebElement move = driver.findElement(By.xpath("//a[text()='Our Culture']"));
		
		//mouseover actions class
		Actions a =new Actions(driver);
		//method
		a.moveToElement(move).perform();
		
		driver.findElement(By.xpath("(//a[text()='Awards & Recognition'])[1]")).click();
		

	}

}
