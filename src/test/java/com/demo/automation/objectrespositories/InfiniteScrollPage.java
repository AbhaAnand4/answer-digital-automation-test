package com.demo.automation.objectrespositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfiniteScrollPage {
	
	public WebDriver driver;
	Actions action;
	public InfiniteScrollPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	/*****WebElement Locators*****/
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    public WebElement infiniteScrollText;

	
	/*****WebElement Methods*****/
	public String getinfIniteScrollText(){
    	return infiniteScrollText.getText();
     }
}
