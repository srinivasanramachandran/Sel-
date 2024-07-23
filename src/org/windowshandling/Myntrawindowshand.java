package org.windowshandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntrawindowshand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement srh = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		srh.sendKeys("toys");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@title='Hot Wheels Kids 5 Pcs 64 Scale Vehicles Cars']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		
		System.out.println(allwin);
		
		List<String> l = new ArrayList<>();
		l.addAll(allwin);
		String child = l.get(1);
		System.out.println(child);
		driver.switchTo().window(child);	
		WebElement price = driver.findElement(By.xpath("//strong[@class='PriceInfo-price']"));
		System.out.println(price.getText());
		
		
		

	}

}
