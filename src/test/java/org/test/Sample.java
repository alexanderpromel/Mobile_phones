package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public void primeNumber() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Msi\\eclipse-workspace\\ModelProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement down = driver.findElement(By.linkText("Careers"));
		js.executeScript("argument[0].scrollIntoView(true)", down);
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		js.executeScript("arguement[0].scrollIntoView(false", user);
		
		
		
		
		
	}
	public static void main(String[]args) throws AWTException {
		Sample s = new Sample();
		s.primeNumber();
		
	}
}


























