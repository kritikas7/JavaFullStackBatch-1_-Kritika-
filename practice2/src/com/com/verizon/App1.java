package com.verizon;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class App1 { 

	   WebDriver driver;  
	   @Test
       public void verifyTitle() {

	         driver= new ChromeDriver();

	         driver.get("https://www.browserstack.com/");

	         Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");

	         driver.quit();

	   }

	}