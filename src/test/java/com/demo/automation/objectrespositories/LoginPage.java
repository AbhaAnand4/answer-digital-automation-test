package com.demo.automation.objectrespositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	Actions action;
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	/*****WebElement Locators*****/
	@FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login\"]/button")
    private WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"flash\"]")
	private WebElement errorMessage;

	
	/*****WebElement Methods*****/
	public void enterUsername(String un){
		username.sendKeys(un);
     }
	
	public void enterPassword(String pass){
		password.sendKeys(pass);
     }
    
    public void clickLoginButton(){
    	loginButton.click();
     }
    
    public String getErrorMessage(){
    	return errorMessage.getText();
     }
    
}
