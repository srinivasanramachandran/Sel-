package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlisticDay2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		driver.findElement(By.name("firstname")).sendKeys("srini");
		driver.findElement(By.name("lastname")).sendKeys("ram");
		
		
		

	}

}
