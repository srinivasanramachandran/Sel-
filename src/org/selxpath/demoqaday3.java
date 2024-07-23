package org.selxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaday3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("srini");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("sriniram@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][1]")).click();
	}

}
