package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	static WebDriver driver;
	public static void browserLaunch(String url) {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public WebElement findbyid(String id) {
		WebElement byid = driver.findElement(By.id(id));
		return byid;
	}
	
	public static void entertxt(WebElement element, String text) {
		element.sendKeys(text);

	}
	
	public static WebElement findbyname(String name) {
		WebElement byname = driver.findElement(By.name(name));
		return byname;
	}
	
	
	public WebElement findbyxpath(String xpath) {
		WebElement byxpath = driver.findElement(By.xpath(xpath));
		return byxpath;
	}
	
	public static void screenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Software\\Screenshot\\FB.png");
		FileUtils.copyFile(source,dest);

	}
	
	
	public static void closeBrowser() {
		/*if (driver!=null) {
			driver.close();
		}
*/
		driver.close();
	}
	
	public static void sendkey(WebElement element, String text) {
		element.sendKeys(text);

	}
	
	
	
	
	
}