package com.Junitpractice;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JunitPractice extends JunitBaseclass{

	@BeforeClass
	public static void url() {
		browserLaunchSetup("https://adactinhotelapp.com/");
		maximize();
		
	}
	
	@AfterClass
	public static void testcase2() {
		driver.close();
	}

	@Before
	public void BeginSS() throws IOException {
		
		SorcepgSS("//img[@alt='Hotel Image 3']");
		System.out.println("Beginning screenshot done");
	}
	
	@Test
	public void login() throws IOException, InterruptedException {
		
		findbyid("username").sendKeys("Prasanth5");
		findbyid("password").sendKeys("MN51S8");
		findbyid("login").click();
		WebElement search = findbyxpath("//td[contains(text(),'Search Hotel ')]");
		boolean searchdisplayed = search.isDisplayed();
		WebElement location =findbyname("location");
		Select locat =new Select(location);
		locat.selectByValue("Melbourne");
	
		WebElement hotels = findbyid("hotels");
		Select hotel = new Select(hotels);
		hotel.selectByValue("Hotel Hervey");
		
		WebElement Roomtype = findbyid("room_type");
		Select room = new Select(Roomtype);
		room.selectByValue("Super Deluxe");
		
		WebElement roomno = findbyid("room_nos");
		Select roomnos = new Select(roomno);
		roomnos.selectByValue("3");
		
		WebElement CheckIn = findbyid("datepick_in");
		CheckIn.sendKeys("15/05/2023");
		
		WebElement Checkout =findbyid("datepick_out");
		Checkout.sendKeys("16/06/2023");
		
		WebElement Adultroom = findbyid("adult_room");
		Select Adultno = new Select(Adultroom);
		Adultno.selectByVisibleText("4 - Four");
		
		WebElement Childroom = findbyid("child_room");
		Select Childno = new Select(Childroom);
		Childno.selectByValue("2");
		
		WebElement Searchbutton = findbyid("Submit");
		
		Assert.assertTrue("check search button diplayed", searchdisplayed);
		
		click(Searchbutton);
	
		WebElement radiobtn = findbyid("radiobutton_0");
		click(radiobtn);
		WebElement Selecthotel = findbyxpath("//td[contains(text(),'Select Hotel')]");
		String text = Selecthotel.getText();
		WebElement Continuebtn = findbyid("continue");
		Assert.assertEquals("Select Hotel", text);
		click(Continuebtn);
		System.out.println("Assert Passed");

		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Prasanth");
		
		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("Bala");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("London");
		
		WebElement CCnum = driver.findElement(By.id("cc_num"));
		CCnum.sendKeys("1234567890123456");
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select cctype = new Select(cc_type);
		
		cctype.selectByValue("MAST");
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		Select ccexpmonth = new Select(cc_exp_month);
		
		ccexpmonth.selectByValue("7");
		
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		
		Select ccexpyear = new Select(cc_exp_year);
		ccexpyear.selectByValue("2026");
		
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys("678");
		
		WebElement book_now = driver.findElement(By.id("book_now"));
		book_now.click();
		
		Thread.sleep(5000);
		
		WebElement order_no = driver.findElement(By.id("order_no"));
		
		String orderno = order_no.getAttribute("value");
		System.out.println("My Order Number is:" + orderno);
		
		
	}
	
	@After
	public void closeSS() throws IOException {
	DestpgSS("//form[@id='booking_form']");
		System.out.println("Closing screenshot done");

	}
	
	}
	
	
