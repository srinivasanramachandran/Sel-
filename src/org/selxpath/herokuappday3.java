package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuappday3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='here']"));
		clickhere.click();
		WebElement doc = driver.findElement(By.xpath("//div[contains(text(),'Contact List Doc')]"));
		doc.click();
		driver.findElement(By.xpath("//div[contains(text(),'No Environment')]")).click();
		

	}

}
