package com.demo.automation.stepdefinitions;

import com.demo.automation.base.BaseCucumber;
import com.demo.automation.objectrespositories.HomePage;
import com.demo.automation.objectrespositories.InfiniteScrollPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class InfiniteScrollTest extends BaseCucumber {
	
	
	@Given("^user navigates to Infinite Scroll page$")
	public void user_navigates_to_Infinite_Scroll_page() throws Throwable {
		homePage2 = new HomePage(driver);
		homePage2.clickInfiniteScroll();
	}

	@When("^user scrolls to bottom of page twice$")
	public void user_scrolls_to_bottom_of_page_twice() throws Throwable {
		//This will scroll to bottom of the page.

        JavascriptExecutor js= (JavascriptExecutor) driver;

        for(int i = 0; i<3; i++) {//To run the loop twice.
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            scriptWait();

            if (i == 2) {
                break;
            }
        }
	}

	@When("^user scrolls back to top of the page$")
	public void user_scrolls_back_to_top_of_the_page() throws Throwable {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		infiniteScrollPage = new InfiniteScrollPage(driver);
        js.executeScript("arguments[0].scrollIntoView(true)", infiniteScrollPage.infiniteScrollText);
	}

	@Then("^user should see the text Infinite Scroll$")
	public void user_should_see_the_text_Infinite_Scroll() throws Throwable {
		scriptWait();
        String infiniteScrollText = infiniteScrollPage.getinfIniteScrollText();
        Assert.assertEquals("Infinite Scroll", infiniteScrollText);
	}

}
