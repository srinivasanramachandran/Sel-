package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onlinesbialert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	    
	    driver.manage().window().maximize();
	    
	    WebElement clk = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
	    clk.click();
	    WebElement clk1 = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
	    clk1.click();
	    
	    Alert a = driver.switchTo().alert();
	    String text = a.getText();
        System.out.println(text);
	    a.accept();
	    
	    

	}

}
