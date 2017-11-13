package com.globantu.automation.jose_colin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends BasePage{

	@FindBy(xpath="//*[@id=\"hotelResultTitle\"]/h1")
	private WebElement h1;
	
	private String textH1;
	
	public SecondPage(WebDriver driver) {
		super(driver);
	}
	
	public void inicio(){
		textH1=h1.getText();
		
	}
	
	public String getTextH1() {
		return textH1;
	}

}
