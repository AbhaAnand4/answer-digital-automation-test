package com.demo.automation.objectrespositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	public WebDriver driver;
	Actions action;
	public HomePage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	/*****WebElement Locators*****/
	
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[21]/a")
	private WebElement formAuthenticationlink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[26]/a")
    private WebElement infiniteScrollLink;

	@FindBy(xpath = "//*[@id=\"content\"]/ul/li[31]/a")
    private WebElement keyPresses;

	
	
	/*****WebElement Methods*****/
    
    public void clickFormAuthenticationlink(){
    	formAuthenticationlink.click();
     }
    
    public void clickInfiniteScroll(){
    	infiniteScrollLink.click();
     }
    
    public void clickKeyPresses(){
    	keyPresses.click();
     }
    
}
