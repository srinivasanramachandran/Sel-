package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlerobot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement txt = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		txt.sendKeys("srini");
		Actions a = new Actions(driver);
		
		a.doubleClick(txt).perform();

	}

}
