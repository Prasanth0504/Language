package com.Junitpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitBaseclass {
	
	static WebDriver driver;

	public static void browserLaunchSetup(String Url) {

		driver = new ChromeDriver();
		driver.get(Url);
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public WebElement findbyid(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;

	}

	public WebElement findbyname(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}

	public WebElement findbyclass(String className) {

		WebElement findElement = driver.findElement(By.className(className));
		return findElement;

	}

	public WebElement findbyxpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;

	}
	
	public WebElement SorcepgSS(String xpath) throws IOException {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		File sorce = findElement.getScreenshotAs(OutputType.FILE);
		File Dest = new File("D:\\Software\\Screenshot\\source.png");
		FileUtils.copyFile(sorce, Dest);
		return findElement;
		

	}
	
	
	public WebElement DestpgSS(String xpath) throws IOException {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		File sorce = findElement.getScreenshotAs(OutputType.FILE);
		File Dest = new File("D:\\Software\\Screenshot\\Dest.png");
		FileUtils.copyFile(sorce, Dest);
		return findElement;
		

	}

	
	
	public String gettext(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		String text = findElement.getText();
		return text;
		

	}
	
	public void Entertext(WebElement element, String text) {
		element.sendKeys(text);

	}

	public void close(WebDriver driver) {
		driver.close();

	}

	
	public void click(WebElement element) {
		element.click();

	}
	
	

}
