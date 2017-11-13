package com.globantu.automation.jose_colin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TravelocityHomePage extends BasePage {

	private static final String STARBUCKS_URL = "https://www.travelocity.com";
	private final String origen = "LAS";
	private final String destino = "LAX";

	@FindBy(id = "tab-flight-tab-hp")
	private WebElement flight;

	@FindBy(id = "flight-origin-hp-flight")
	private WebElement origenInput;

	@FindBy(id = "aria-option-0")
	private WebElement origenSeleccionado;

	@FindBy(id = "flight-destination-hp-flight")
	private WebElement destinoInput;

	@FindBy(id = "aria-option-0")
	private WebElement destinoSeleccionado;

	/////////////////////// fecha ´partida
	@FindBy(id = "flight-departing-hp-flight")
	private WebElement fechaInicio;

	@FindBy(xpath = "//*[@class=\"datepicker-paging datepicker-next btn-paging btn-secondary next\"]")
	private WebElement inicioNextMonth;

	@FindBy(xpath = "//button[@data-month='3' and @data-day='1' and @data-year='2018']")
	private WebElement diaInicio;

	/////////////////// fecha llegada

	@FindBy(id = "flight-returning-hp-flight")
	private WebElement fechaFin;

	@FindBy(xpath = "//*[@class=\"datepicker-paging datepicker-next btn-paging btn-secondary next\"]")
	private WebElement finNextMonth;

	@FindBy(xpath = "//button[@data-month='4' and @data-day='1' and @data-year='2018']")
	private WebElement diaFin;

	///////////////////////

	@FindBy(id = "flight-adults-hp-flight")
	private WebElement comboAdulto;

	@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button")
	private WebElement buscar;

	public TravelocityHomePage(WebDriver driver) {
		super(driver);
		driver.get(STARBUCKS_URL);

	}

	public Page2 inicio() {

		getWait().until(ExpectedConditions.elementToBeClickable(flight));

		flight.click();

		origenInput.sendKeys(origen);

		getWait().until(ExpectedConditions.elementToBeClickable(origenSeleccionado));

		origenSeleccionado.click();

		destinoInput.sendKeys(destino);

		getWait().until(ExpectedConditions.elementToBeClickable(destinoSeleccionado));

		destinoSeleccionado.click();

		// fechas partida

		fechaInicio.click();

		getWait().until(ExpectedConditions.elementToBeClickable(inicioNextMonth));
		inicioNextMonth.click();
		inicioNextMonth.click();
		inicioNextMonth.click();
		inicioNextMonth.click();
		getWait().until(ExpectedConditions.elementToBeClickable(diaInicio));

		diaInicio.click();

		//////// llegada

		fechaFin.click();
		getWait().until(ExpectedConditions.elementToBeClickable(finNextMonth));
		finNextMonth.click();
		finNextMonth.click();
		// finNextMonth.click();
		// finNextMonth.click();
		// finNextMonth.click();
		getWait().until(ExpectedConditions.elementToBeClickable(diaFin));
		diaFin.click();

		// comboAdulto.click();
		// Select adulto = new Select(comboAdulto);
		// adulto.selectByValue("1");
		//
		
		buscar.click();

		return new Page2(getDriver());
	}

}
