package com.orangeHRM.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.orangeHRM.BasePackage.BaseClass;

public class RetryLoginPage extends BaseClass {
    
	public static void  retry_Login_Title() {
    String actuals= driver.findElement(By.xpath("//*[@id=\"divContent\"]/div[2]/div/div[1]")).getText();
	String expecteds  = "Retry Login";
	Assert.assertEquals(expecteds, actuals, "Retry Login Tittle is not match");
	}
	
	public static void invalid_Credentials_Message() {
		String actuals= driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).getText();
		String expecteds  = "Invalid Credentials";
		Assert.assertEquals(expecteds, actuals, "Invalid Credentials is not Display");
	}
}
