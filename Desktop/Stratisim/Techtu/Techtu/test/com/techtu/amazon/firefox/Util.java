package com.techtu.amazon.firefox;

import org.openqa.selenium.WebDriver;

public class Util {

	public static void wait(WebDriver driver, long seconds) {
		try{
			Thread.sleep(seconds * 1000);
		}catch(Exception e){
		}
	}
}
