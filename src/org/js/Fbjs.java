package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbjs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       
        Thread.sleep(3000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        WebElement mail = driver.findElement(By.id("email"));
        
        js.executeScript("arguments[0].value='90255637'", mail);
        
        WebElement pass = driver.findElement(By.id("pass"));
        
        js.executeScript("arguments[0].setAttribute('value','123')", pass);
        
       
        
        
        
        
	}

}
