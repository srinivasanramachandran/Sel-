package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealDay2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		driver.findElement(By.name("username")).sendKeys("srini@gmail.com");
		

	}

}
