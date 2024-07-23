package org.dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clk.click();
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s = new Select(yr);
		
		boolean ml = s.isMultiple();
        if (ml) {
			
        	System.out.println("multiple");
		} else {
			System.out.println("single");

		} 
        
        List<WebElement> options = s.getOptions();
		System.out.println("alloptions");
		for (int i = 0; i < options.size(); i++) {
			String attribute = options.get(i).getAttribute("value");
			System.out.println(attribute);
		//	String text = options.get(i).getText();
			//System.out.println(text);
			
		}
		
	}

}
