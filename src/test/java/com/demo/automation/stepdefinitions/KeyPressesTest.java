package com.demo.automation.stepdefinitions;

import com.demo.automation.base.BaseCucumber;
import com.demo.automation.objectrespositories.HomePage;
import com.demo.automation.objectrespositories.KeyPressesPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class KeyPressesTest extends BaseCucumber {
	
	
	@Given("^Go to key presses page$")
	public void go_to_key_presses_page() throws Throwable {
		homePage2 = new HomePage(driver);
		homePage2.clickKeyPresses();
	}

	@When("^I click on key \"([^\"]*)\"$")
	public void i_click_on_key(String number) throws Throwable {
		keypresses = new KeyPressesPage(driver);
		keypresses.enterInputField(number);
	}
	
	@Then("^Text displayed should be \"([^\"]*)\"$")
	public void text_displayed_should_be(String expectedResult) throws Throwable {
		Assert.assertTrue(keypresses.getResult().contains(expectedResult));
	}


}
