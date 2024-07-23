package org.screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlicartSs {

	public static void main(String[] args) throws IOException, AWTException {
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement srh = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		srh.sendKeys("watch");
		
		
		

		
		
		WebElement clk = driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
		
		//js.executeScript("arguments[0].click();", clk);
		
		//clk.click();
		
	/*	Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		js.executeScript("arguments[0].click();", clk);
		*/
		TakesScreenshot tk = (TakesScreenshot)driver;
		

		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\susmitha\\eclipse-workspace\\Sriniselenium\\screenshot\\fp.png");
		
		FileUtils.copyFile(screenshotAs, f);
	}

}
