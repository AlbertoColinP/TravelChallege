package com.globantu.automation.jose_colin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest {

	
	MyDriver myDriver;
	
	private TravelocityHomePage homePage;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	public void beforeSuite(String browser) {
		
		myDriver=new MyDriver(browser);
		homePage=new TravelocityHomePage(myDriver.getDriver());
		
	}
	
	
	
	@AfterMethod(alwaysRun=true)
	public void afterSuite() {
		homePage.dispose();
	}
	
	public TravelocityHomePage getHomePage() {
		return homePage;
	}
}
