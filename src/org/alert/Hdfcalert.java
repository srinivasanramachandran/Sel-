package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcalert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		////a[text()='CONTINUE']
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		WebElement clk = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		
		
		clk.click();
		
		
		
		
	}
	
	
	}


