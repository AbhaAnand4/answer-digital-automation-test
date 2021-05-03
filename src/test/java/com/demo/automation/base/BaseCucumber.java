package com.demo.automation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.demo.automation.objectrespositories.HomePage;
import com.demo.automation.objectrespositories.InfiniteScrollPage;
import com.demo.automation.objectrespositories.KeyPressesPage;
import com.demo.automation.objectrespositories.LoginPage;
import com.demo.automation.objectrespositories.LogoutPage;
import com.demo.automation.constant.Constant;


public class BaseCucumber {
	
	public static WebDriver driver;
	public static Properties prop;
	protected HomePage homePage2;
	protected HomePage homePage;
	protected LoginPage login;
	protected LogoutPage logout;
	protected KeyPressesPage keypresses;
	protected InfiniteScrollPage infiniteScrollPage;
	
	
	static {
		prop= new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(Constant.PROPERTYFILEPATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static WebDriver initializeDriver() throws IOException {
		
		/*****Create & Load Properties File*****/
		String browserName = prop.getProperty("browser");
		
		/*****Check & Initiate Browser Driver*****/
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver");
			driver = new FirefoxDriver();
					
		} else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "resources/drivers/MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();	
		} 
		
		/*****Configure Driver*****/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public void implicitWait() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    public void pageLoadTimeout(){
        driver.manage().timeouts().pageLoadTimeout(Constant.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public void scriptWait() throws InterruptedException {
        Thread.sleep(3000);
    }


}
