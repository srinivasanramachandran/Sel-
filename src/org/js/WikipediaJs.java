package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaJs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Software_testing");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement automatedtest = driver.findElement(By.xpath("//span[@id ='Automated_testing'] "));
		
		js.executeScript("arguments[0].scrollIntoView()", automatedtest);
	
		Object es = js.executeScript("return arguments[0].textContent", automatedtest);
		System.out.println(es);
	     
		
		

	}

}
