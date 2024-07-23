package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BwanaActionsmove {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bwana.in/ecommerce-management.php");
        WebElement move = driver.findElement(By.xpath("(//a[text()='Services'])[1]"));
        
        Actions a = new Actions(driver);
        
        a.moveToElement(move).perform();
        
        driver.findElement(By.xpath("(//a[text()='Web Development'])[1]")).click();
	}

}
