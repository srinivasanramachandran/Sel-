package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class youtubeSs {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\susmitha\\eclipse-workspace\\Sriniselenium\\screenshot\\yt.png");
		
		FileUtils.copyFile(screenshotAs, f);
		
		
		
		

	}

}
