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

public class AmazonSs {

	public static void main(String[] args) throws IOException {
		
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.amazon.in/");
          driver.manage().window().maximize();
          
          WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
          
          src.sendKeys("laptop");
          
          driver.findElement(By.id("nav-search-submit-button")).click();
          
          TakesScreenshot tk = (TakesScreenshot)driver;
          
          File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
          
          File f = new File("C:\\Users\\susmitha\\eclipse-workspace\\Sriniselenium\\screenshot\\amazon.png");
          
          FileUtils.copyFile(screenshotAs, f);
       	
          
          
          
	}

}
