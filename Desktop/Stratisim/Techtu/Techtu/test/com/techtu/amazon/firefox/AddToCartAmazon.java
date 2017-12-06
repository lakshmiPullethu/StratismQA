package com.techtu.amazon.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartAmazon {

	public static void addProduct(WebDriver driver, String product) {
		search(driver, product);
		selectProduct(driver);
	}

	private static void selectProduct(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='result_3']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
	}

	private static void search(WebDriver driver, String product) {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(product);
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
	}

}
