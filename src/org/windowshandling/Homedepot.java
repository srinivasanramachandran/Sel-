package org.windowshandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		src.sendKeys("hand sanitizer");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		List<String> l = new ArrayList<>();
		l.addAll(allwin);
		String child = l.get(1);
		System.out.println(child);
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		
		
		
		
		
		
	}

}
