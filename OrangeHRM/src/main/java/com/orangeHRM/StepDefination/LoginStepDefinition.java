package com.orangeHRM.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeHRM.BasePackage.BaseClass;
import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BaseClass {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		BaseClass.init();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Exception {
		LoginPage.Valid_Credentials_username_and_password();
	}

	@Then("^user clicks on login page$")
	public void user_clicks_on_login_page() {
		LoginPage.user_clicks_on_login_page();
	}

	@Then("^close the browser$")
	public void close_the_browser_login_() {
		LoginPage.close_the_browser_login_();
	}
	
	@Then("^Verify user cant login with valid user name and invalid password$")
	public void verify_user_cant_login_with_valid_user_name_and_invalid_password() throws Exception {
		LoginPage.valid_user_name();
		LoginPage.invalid_user_Password();
	}
	@Then("^view password if show password is eanble$")
	public void view_password_if_show_password_is_eanble() throws Exception {
	  LoginPage.view_password_if_show_password_is_eanble();
	}


}
