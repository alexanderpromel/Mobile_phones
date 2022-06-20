package com.flipkart.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchase {
	static WebDriver driver;
		
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Msi\\eclipse-workspace\\ModelProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	/*
	@AfterClass
	public static void exit() {
		driver.close();
	}*/
	
	@Before
	public void beforeMethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	
	@After
	public void afterMethod() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	}
	
	@Test
	public void login() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	
	@Test
	public void mobileSearch() {
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("redmi mobiles", Keys.ENTER);
	}
	
	@Test
	public void price() {
		WebElement amt = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		Select s = new Select(amt);
		s.selectByValue("10000");
	}
	/*
	@Test
	public void dragandDrop() {
		WebElement simple = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		Select s = new Select(simple);
		s.selectByValue("10000");
	}*/
	
	@Test
	public void newWindows() {
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
	}
	/*
	@Test
	public void windowsHandling() {
		String parentID = driver.getWindowHandle();
		Set<String> childID = driver.getWindowHandles();
	}*/
}
































