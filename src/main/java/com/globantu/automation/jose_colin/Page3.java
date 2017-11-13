package com.globantu.automation.jose_colin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page3 extends BasePage{

	@FindBy(xpath="//button[@data-leg0-natural-key='491cc0090a2d4b0a5680001353e23248s']")
	private WebElement selectFlight;
	
	public Page3(WebDriver driver) {
		super(driver);
	}

	
	public void inicio() {
		getWait().until(ExpectedConditions.elementToBeClickable(selectFlight));
//		Actions actions = new Actions(getDriver());
//		actions.moveToElement(selectFlight);
//		actions.click();
//		actions.build().perform();
		
//		Actions actions = new Actions(getDriver());
//		actions.moveToElement(selectFlight);
//		actions.perform();
		
//		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", selectFlight);
		selectFlight.click();
		System.out.println("entra 3");
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
