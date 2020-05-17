package com.orangeHRM.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeHRM.BasePackage.BaseClass;
import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.RetryLoginPage;
import com.orangeHRM.Utile.UtillClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BaseClass {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
         	BaseClass.init();
		}

	@Then("^user enters valid username and valid password$")
	public void user_enters_valid_username_and_valid_password() throws Throwable {
	  LoginPage.User_enter_credentials_username_and_password("Admin", "10QwjTXO@z"); // valid user name and valid password
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	  LoginPage.user_clicks_on_submitButton();
	}

	@Then("^user will land on dashbord page$")
	public void user_will_land_on_dashbord_page() throws Throwable {
	   HomePage.HomePageLogo();
	   HomePage.HomePageUsername();
	}

	@Then("^logout from application and close browser$")
	public void logout_from_application_and_close_browser() throws InterruptedException  {
	 UtillClass.logout_and_close_Browser();
	}
	
	
	
	@Then("^user enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password() throws Throwable {
	  LoginPage.User_enter_credentials_username_and_password("Admin", "10QwjTXO@zx"); // vlaid user name and invalidpassword    
	}

	@Then("^user will land on retry login page$")
	public void user_will_land_on_retry_login_page() throws Throwable {
	   RetryLoginPage.retry_Login_Title();;
	   RetryLoginPage.invalid_Credentials_Message();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   UtillClass.closerBrowser();
	}

	@Then("^view password if show password is eanble$")
	public void view_password_if_show_password_is_eanble() throws Exception {
	  LoginPage.view_password_if_show_password_is_eanble();
	}


}
