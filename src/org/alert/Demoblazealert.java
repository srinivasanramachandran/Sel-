package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblazealert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.id("login2"));
				
		clk.click();
		
		WebElement clk2 = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		clk2.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
				
				
				
	}

	
}
