package com.verizon1;

import org.junit.Test;

import dev.failsafe.internal.util.Assert;
import org.openqa.Selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class App1 {
WebDriver driver;
@Test
public void verifyTitle() {
	driver =new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	Assert.assertEquals(driver.getTitle(),"App & Cross Browser Testing Platform | BrowserStack ")
driver.quit();
	}
}
