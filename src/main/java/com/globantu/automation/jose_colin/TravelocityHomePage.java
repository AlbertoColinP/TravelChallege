package com.globantu.automation.jose_colin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TravelocityHomePage extends BasePage{

	private static final String STARBUCKS_URL = "https://www.travelocity.com";
	private final String origen="LAS";
	private final String destino="LAX";
	
	@FindBy(id="package-origin-hp-package")
	private WebElement origenInput;
	
	@FindBy(id="package-destination-hp-package")
	private WebElement destinoInput;
	
	@FindBy(id="package-departing-hp-package")
	private WebElement fechaInicio;
	
	@FindBy(id="package-returning-hp-package")
	private WebElement fechaFin;
	
	@FindBy(id="package-1-adults-hp-package")
	private WebElement comboAdulto;
	
	@FindBy(id="search-button-hp-package")
	private WebElement buscar;

	public TravelocityHomePage(WebDriver driver) {
		super(driver);
		driver.get(STARBUCKS_URL);
		
		
	}
	
	public SecondPage inicio(){
		
		origenInput.sendKeys(origen);
		destinoInput.sendKeys(destino);
		
		Select adulto = new Select(comboAdulto);
		adulto.selectByValue("1");
		
		getWait().until(ExpectedConditions.elementToBeClickable(buscar));
		
		buscar.click();
		
		return new SecondPage(getDriver());
	}
	
	

}
