package com.orangeHRM.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.orangeHRM.BasePackage.BaseClass;

import cucumber.api.java.en.Then;

public class LoginPage extends BaseClass {
	
	public static void User_enter_credentials_username_and_password(String Username , String Password) throws Exception {
		WebElement username=driver.findElement(By.xpath(pro.getProperty("username")));
		username.sendKeys(Username);
		Thread.sleep(5000);
		WebElement password =driver.findElement(By.xpath(pro.getProperty("password")));
		password.sendKeys(Password);
	}

	public static void user_clicks_on_submitButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click(); // click on submit button

	}


	
	
public static boolean valid_user_name() throws Exception {

	  WebElement nameMessage = driver.findElement(By.xpath(pro.getProperty("username")));
	  nameMessage.sendKeys("Admin");

	return false;
}


public static boolean invalid_user_Password() throws Exception {
	
	
	WebElement pass= driver.findElement(By.xpath(pro.getProperty("password")));
	pass.sendKeys("10QwjTXO@z\\");
	return false;
}
public static void view_password_if_show_password_is_eanble() throws Exception {
	WebElement sp=driver.findElement(By.xpath(pro.getProperty("password")));
	sp.getText();
	System.out.println(sp);
	System.out.println("get Password");
	WebElement Hide=driver.findElement(By.id("frmLogin"));
	System.out.println(Hide.getText());
		
		System.out.println("Password Show");
	
			

	
}

}
