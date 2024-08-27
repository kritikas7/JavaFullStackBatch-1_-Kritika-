package com.verizon1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;
import junit.framework.*;
class App {

	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void verifyTitle() {
		driver =new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		Assert.assertEquals(driver.getTitle(),"Most Reliable App & Cross "
				+ "Browser Testing Platform | BrowserStack");
	driver.quit();
		}
	
	}


