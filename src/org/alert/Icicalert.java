package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicalert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		
		clk.click();
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		
		user.sendKeys("122");
		
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}
	

	}

