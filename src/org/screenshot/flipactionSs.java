package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipactionSs {

	public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement move = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(move).perform();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File ss = tk.getScreenshotAs(OutputType.FILE);
		
	    File f = new File("C:\\\\Users\\\\susmitha\\\\eclipse-workspace\\\\Sriniselenium\\\\screenshot\\\\fp1.png");
	    
	    FileUtils.copyFile(ss, f);
		
		
		
		
	}

}
