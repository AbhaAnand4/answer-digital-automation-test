package com.demo.automation.objectrespositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public WebDriver driver;
	Actions action;
	public LogoutPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	/*****WebElement Locators*****/
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/a")
    private WebElement logoutButton;

	
	/*****WebElement Methods*****/
    
    public void clickLogoutButton(){
    	logoutButton.click();
     }
    
}
