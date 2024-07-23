package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdropdowneven {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clk.click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		
		boolean ml = s.isMultiple();
        if (ml) {
			
        	System.out.println("multiple");
		} else {
			System.out.println("single");

		} 

        List<WebElement> options = s.getOptions();
		System.out.println("alloptions");
		System.out.println("Even values");
		for (int i = 0; i < options.size(); i++) {
			
			if (i % 2 != 0) {
				String tx = options.get(i).getText();
				System.out.println(tx);
				
			}
			
		}
		
	}

}
