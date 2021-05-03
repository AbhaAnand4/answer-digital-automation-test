package com.demo.automation.stepdefinitions;

import com.demo.automation.base.BaseCucumber;
import com.demo.automation.objectrespositories.HomePage;
import com.demo.automation.objectrespositories.LoginPage;
import com.demo.automation.objectrespositories.LogoutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FormAuthenticationTest extends BaseCucumber {
	
	String usernme;
	String password;
	
	@Given("^want to login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void want_to_login_with_username_and_password(String un, String pass) throws Throwable {
		System.out.println("Username: " + un + " Password: "+ pass);
		homePage2 = new HomePage(driver);
		homePage2.clickFormAuthenticationlink();
		usernme = un;
		password = pass;
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		login = new LoginPage(driver);
		login.enterUsername(usernme);
		login.enterPassword(password);
		login.clickLoginButton();

	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String errorMessage) throws Throwable {
		System.out.println("ErrorMessage: " + errorMessage);
		System.out.println("login.getErrorMessage(): " + login.getErrorMessage());
		Assert.assertTrue(login.getErrorMessage().contains(errorMessage));
	}
	
	@Then("^I logout$")
	public void i_logout() throws Throwable {
		System.out.println("Logout Clicked");
		logout = new LogoutPage(driver);
		logout.clickLogoutButton();
	}

}
