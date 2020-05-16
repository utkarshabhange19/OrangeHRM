package com.orangeHRM.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.BasePackage.BaseClass;

//import junit.framework.Assert;



public class HomePage extends BaseClass{
	
	
	public static boolean HomePageLogo() {
	
		String expected="OrangeHRM";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
		return false;
	}
		
	public static boolean HomePageUsername() {
		
		String expected="Vishal S";
		String actual= driver.findElement(By.id("account-name")).getText();
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
		return false;
	}
	

}
