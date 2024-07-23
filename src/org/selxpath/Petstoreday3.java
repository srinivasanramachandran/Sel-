package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Petstoreday3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petstore.swagger.io/");
		Thread.sleep(5000);
		WebElement auth = driver.findElement(By.xpath("//span[text()='Authorize']"));
		
        auth.click();
	}

}
