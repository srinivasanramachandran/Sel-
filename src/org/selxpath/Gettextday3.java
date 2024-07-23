package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextday3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://compendiumdev.co.uk/");
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Books published')]"));
        System.out.println(txt.getText());
        driver.findElement(By.xpath("//a[text()='Software Blog'][1]")).click();
        WebElement print = driver.findElement(By.xpath("//strong[text()='Featured Books']"));
        System.out.println(print.getText());
        
        WebElement details = driver.findElement(By.xpath("//a[text()='Java For Testers']"));
        System.out.println(details.getText());
        
	}

}
