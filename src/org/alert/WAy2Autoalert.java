package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WAy2Autoalert {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='alert/simple-alert.html']")));
		WebElement click = driver.findElement(By.xpath("//button[text()='Click the button to display an alert box:']"));
		click.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Input Alert']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='alert/input-alert.html']")));
		WebElement click2 = driver.findElement(By.xpath("//button[text()='Click the button to demonstrate the Input box.']"));
		click2.click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("srini");
		System.out.println(a1.getText());
		a1.dismiss();
		

	}

}
