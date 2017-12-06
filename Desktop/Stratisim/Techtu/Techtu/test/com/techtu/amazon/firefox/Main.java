package com.techtu.amazon.firefox;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Main extends BaseTest {

	@Test
	public void testWebWithData() throws Exception {
		WebDriver driver = openBrowser();
		execute(driver);
		quit(driver);
	}

	public void execute(WebDriver driver) throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader(dataFilePathName));
		String line = reader.readLine(); // header
		if (line == null) {
			System.out.println("**  Input Data File empty or not found ***");
		}else{
			while ((line = reader.readLine()) != null) { // while not EOF

				Util.wait(driver, 2);
				// Login
				Util.wait(driver, 2);
				// Get Login-data from lineRead[] from .csv data-file
				String[] lineArray = line.split(",");// split line into comma
														// separated values
				String userEmail = lineArray[0];
				String pwd = lineArray[1];

				// Login
				LoginAmazon.login(driver, userEmail, pwd);

				// Add to Card
				AddToCartAmazon.addProduct(driver,"Java Book");
				// Checkout
				
				// Logout
				LogoutAmazon.logoutAmazon(driver, "Logout");
				Util.wait(driver, 2);
			}
		}
		reader.close();
	}

}
