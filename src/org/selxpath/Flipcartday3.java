package org.selxpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartday3 {

	public static void main(String[] args) throws InterruptedException {
		//upcasting chromedriver
		WebDriver driver = new ChromeDriver();
		
		//geturl
		driver.get("https://www.flipkart.com/");
		//findelement xpath
	//	WebElement loginbutton = driver.findElement(By.xpath("//img[@class='-dOa_b L_FVxe']"));
		Thread.sleep(5000);
		WebElement loginbutton = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		loginbutton.click();
		WebElement keys = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		
		keys.sendKeys("srini@gmail.com");
		driver.close();
		
		
		
		
		
		
		
		
		
		
		// WebElement until = mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_1jKL3b']")));
		
	     //until.click();
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginbutton);
		//loginbutton.click();
		

	}

}
