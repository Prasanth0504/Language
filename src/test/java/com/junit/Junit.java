package com.junit;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class Junit extends BaseClass {

	@BeforeClass
	public static void browser() {
		browserLaunch("https://www.facebook.com/");

	}

	@AfterClass
	public static void monthend() {
		closeBrowser();
	}

	@Before
	public void jan() throws IOException {
		screenshot();
		System.out.println("Before ss done");
	}

	@Test
	public void monthm() {
		entertxt(findbyid("pass"), "Password");

	}

	@Test
	public void z() {
		WebElement findbyx = findbyname("login");
		boolean displayed = findbyx.isDisplayed();
		Assert.assertTrue("button visible", displayed);
		findbyx.click();
		}
		


	@Test
	public void monthj() {
		entertxt(findbyid("email"), "XXXXXXX");

	}

	@After

	public void monthd() throws IOException {
		screenshot();
		System.out.println("After ss done");
	}

	@Ignore
	@Test
	public void week() {
		WebElement findbyid = findbyid("email");
		findbyid.sendKeys("name");
	}

}
