package com.techtu.amazon.firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected String url;
	protected String dataFilePathName;

	@BeforeClass
	public void initBeforeClass() throws Exception {
		url = "https://www.amazon.com/";
		dataFilePathName = "C:\\Users\\Lakshmi\\workspace\\Selenium\\SeleniumWS\\Techtu\\data\\amazon-user-details.csv";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lakshmi\\Downloads\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\55_old\\firefox.exe");

	}

	public WebDriver openBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	public void quit(WebDriver driver) {
		if (driver != null)
			driver.quit();
	}

}
