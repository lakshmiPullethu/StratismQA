
package com.techtu.amazon.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAmazon {
	public static void login(WebDriver driver, String userEmail, String pwd) {

		Util.wait(driver, 2);
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(userEmail);
		Util.wait(driver, 2);
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(pwd);
		Util.wait(driver, 2);
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();

	}
}
