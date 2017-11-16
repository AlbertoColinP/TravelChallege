package com.globantu.automation.jose_colin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page4 extends BasePage{

	@FindBy(id="forcedChoiceNoThanks")
	private WebElement popup;
	
	@FindBy(xpath="/html/body/main/section[1]/div[2]/div[1]/div/div/div[1]/ol/li[2]/span[2]")
	private WebElement lugarPartida;
	
	private String lugarPartidaString;
	public Page4(WebDriver driver) {
		super(driver);
	}
	
	public void inicio() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("page 4");
//		getWait().until(ExpectedConditions.elementToBeClickable(popup));
		
//		if (popup.isEnabled()) {
//			popup.click();
//		}
//		
		getWait().until(ExpectedConditions.visibilityOf(lugarPartida));
		
		lugarPartidaString=lugarPartida.getText();
	}
	
	public String getLugarPartidaString() {
		return lugarPartidaString;
	}
	
}
