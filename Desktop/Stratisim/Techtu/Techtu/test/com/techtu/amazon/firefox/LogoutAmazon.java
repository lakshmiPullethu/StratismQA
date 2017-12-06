package com.techtu.amazon.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LogoutAmazon {
	public static void logoutAmazon(WebDriver driver, String fromPageTitle) {
		Util.wait(driver, 2);
		
		String xPathStr = "//*[@id='nav-item-signout']";
		
		driver.findElement(By.xpath(xPathStr)).click();
	}
}
