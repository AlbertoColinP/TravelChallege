package com.globantu.automation.jose_colin;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page3 extends BasePage {

	@FindBy(xpath = "//ul[@id='flightModuleList']//li[3]//button")
	private WebElement selectFlight;

	@FindBy(xpath = "/html/body/main/section[1]/div[2]/div[1]/div/div/div[1]/ol/li[2]/span[2]")
	private WebElement fechaPartida;

	public Page3(WebDriver driver) {
		super(driver);
	}

	public Page4 inicio() {

		getWait().until(ExpectedConditions.elementToBeClickable(selectFlight));

		System.out.println("entra 3");
		System.out.println("aaaa " + selectFlight.isDisplayed());

		selectFlight.click();

		try {
			Thread.sleep(3000);
			System.out.println("sleep");
		} catch (InterruptedException e) {

			
		
		}
		
		System.out.println(getDriver().getCurrentUrl());
		
		ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
		
		System.out.println(tabs2);
	    getDriver().switchTo().window(tabs2.get(1));
	    
	    System.out.println(getDriver().getCurrentUrl());
//		getWait().until(ExpectedConditions.visibilityOf(fechaPartida));
//		System.out.println("parida " + fechaPartida.getText());
		return new Page4(getDriver());
	}
}
