package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyDay2 {

	public static void main(String[] args) {
		//chromeDriver upcasting
		WebDriver driver = new ChromeDriver();
		//launch url 
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("_3odgy")).click();
		WebElement sendkey = driver.findElement(By.xpath("//input[@placeholder='Search for area, street name..']"));
		sendkey.sendKeys("chennai");
		

	}

}
