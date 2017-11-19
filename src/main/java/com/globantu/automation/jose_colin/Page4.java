package com.globantu.automation.jose_colin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page4 extends BasePage{

	@FindBy(id="forcedChoiceNoThanks")
	private WebElement popup;
	
	private final String LUGARESXPATH="//ol[@class='odPair nobullet']//span[@class='airport type-300']";	
	
	private final String FECHASXPATH="//div[@class='flex-area-primary']//h3";	
	
	private final String BOTONESXPATH="//div[@class='farePrice']//form[@class='continueBookingForm']//button";
	
	@FindBy(xpath="//span[@class='packagePriceTotal']")
	private WebElement precio;
	
	@FindBy(id="bookButton")
	private WebElement buttonContinue;
	
	
	private List<WebElement> fechas;
	
	private List<WebElement> lugares;
	
	private List<WebElement> botones;
	
	private List<String> fechasString=new ArrayList<>();
	
	private List<String> lugaresString=new ArrayList<>();
	
	
	private String precioString;
	
	
	
	
	public Page4(WebDriver driver) {
		super(driver);
	}
	
	public Page5 inicio() {
		
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
		//getWait().until(ExpectedConditions.visibilityOf(lugarPartida));
		
		
		
		fechas=getDriver().findElements(By.xpath(FECHASXPATH));
		
		for (WebElement webElement : fechas) {
			fechasString.add(webElement.getText());
		}
		
		precioString=precio.getText();
		
		lugares=getDriver().findElements(By.xpath(LUGARESXPATH));
		
		for (WebElement webElement : lugares) {
			lugaresString.add(webElement.getText());
		}
		
		getWait().until(ExpectedConditions.elementToBeClickable(buttonContinue));
		buttonContinue.click();
//		botones=getDriver().findElements(By.xpath(BOTONESXPATH));
//		
//		System.out.println(botones.size());
		
		return new Page5(getDriver());
		
		
	}
	
	public List<String> getLugaresString() {
		return lugaresString;
	}
	
	public List<String> getFechasString() {
		return fechasString;
	}
	
	public String getPrecioString() {
		return precioString;
	}
}
