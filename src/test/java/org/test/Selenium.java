package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Selenium {
	public void primeNumber() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Msi\\eclipse-workspace\\ModelProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		WebElement clse = driver.findElement(By.xpath("//button[text()='✕']"));
		clse.click();
		
		WebElement user = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		user.sendKeys("realme mobiles",Keys.ENTER );
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement simple = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		Select s = new Select(simple);
		s.selectByValue("10000");
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		File f = new File("C:\\Users\\Msi\\eclipse-workspace\\ModelProject\\src\\test\\resources\\Book1.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sheet = w.createSheet("Realme mobiles");
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0; i<list.size(); i++) {
			WebElement element = list.get(i);
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
		}	
		w.write(f1);
		
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement mobile = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]"));
		mobile.click();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		/*
		WebElement down = driver.findElement(By.xpath("//span[contains(text(), 'Add 2 Items to Cart')]"));
		WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		js.executeScript("argument[0].scrollIntoView(false)", price);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		driver.close();
	}
		
	public static void main(String[]args) throws Exception{
		Selenium s = new Selenium();
		s.primeNumber();
	}

}
