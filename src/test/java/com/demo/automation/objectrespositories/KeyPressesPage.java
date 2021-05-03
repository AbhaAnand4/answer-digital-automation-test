package com.demo.automation.objectrespositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage {
	
	public WebDriver driver;
	Actions action;
	public KeyPressesPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	/*****WebElement Locators*****/
	
	@FindBy(xpath = "//*[@id=\"result\"]")
    private WebElement result;
	
	@FindBy(xpath = "//*[@id=\"target\"]")
    private WebElement inputField;

	
	/*****WebElement Methods*****/
    
	public void enterInputField(String input){
		inputField.sendKeys(input);
     }
	
	public String getResult(){
    	return result.getText();
     }

}
