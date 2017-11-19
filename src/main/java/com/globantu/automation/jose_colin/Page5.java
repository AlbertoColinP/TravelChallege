package com.globantu.automation.jose_colin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page5 extends BasePage{

	@FindBy(id="firstname[0]")
	private WebElement fnameInput;
	
	@FindBy(id="middlename[0]")
	private WebElement mnameInput;
	
	@FindBy(id="lastname[0]")
	private WebElement lnameInput;
	
	@FindBy(id="phone-number[0]")
	private WebElement phoneInput;
	
	@FindBy(id="country_code[0]")
	private WebElement countryInput;
	
	private List<Boolean>fieldsDisplayed=new ArrayList<>();
	
	public Page5(WebDriver driver) {
		super(driver);
 	}
	
	
	public void inicio() {
		fieldsDisplayed.add(fnameInput.isDisplayed());
		fieldsDisplayed.add(mnameInput.isDisplayed());
		fieldsDisplayed.add(lnameInput.isDisplayed());
		fieldsDisplayed.add(phoneInput.isDisplayed());
		fieldsDisplayed.add(countryInput.isDisplayed());
		
	}
	
	public List<Boolean> getFieldsDisplayed() {
		return fieldsDisplayed;
	}

}
