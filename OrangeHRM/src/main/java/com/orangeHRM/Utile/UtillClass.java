package com.orangeHRM.Utile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangeHRM.BasePackage.BaseClass;

public class UtillClass extends BaseClass {
  public static void logout_and_close_Browser() throws InterruptedException {
      driver.findElement(By.xpath(or.getProperty("x_common_userDropDown"))).click(); // click on user drop down
      driver.findElement(By.xpath(or.getProperty("x_common_logOut"))).click();  // click on logout button
      driver.close(); 
	 }
  public static void closerBrowser() {
	  driver.close(); // close browser
  }
}
