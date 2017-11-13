package com.globantu.automation.jose_colin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Page2 extends BasePage {

	@FindBy(id = "departure-airport-1")
	private WebElement partidaInput;

	@FindBy(id = "arrival-airport-1")
	private WebElement regresoInput;

	@FindBy(id = "departure-date-1")
	private WebElement partidaFecha;

	@FindBy(id = "return-date-1")
	private WebElement regresoFecha;

	@FindBy(xpath = "//*[@class='secondary-playback-summary']")
	private WebElement resume;
	
	@FindBy(xpath="//button[@data-leg0-natural-key='633696b176c91264cbf6271d24915fc6']")
	private WebElement selectFlight;

	private String partida;

	private String regreso;

	private String partidaFechaSt;

	private String regresoFechaSt;

	private String resumeSt;

	public Page2(WebDriver driver) {
		super(driver);
	}

	public Page3 inicio() {
		System.out.println("entra");
		// getWait().until(ExpectedConditions.visibilityOf((partidaInput)));
		partida = partidaInput.getAttribute("value");
		// getWait().until(ExpectedConditions.visibilityOf((regresoInput)));
		regreso = regresoInput.getAttribute("value");

		partidaFechaSt = partidaFecha.getAttribute("value");
		regresoFechaSt = regresoFecha.getAttribute("value");

		resumeSt = resume.getText();
		
	//SORT///////////////////
		
		Select select = new Select(getDriver().findElement(By.xpath("//*[@name='sort']")));
		select.selectByValue("duration:asc");
		
		getWait().until(ExpectedConditions.elementToBeClickable(selectFlight));
		selectFlight.click();
		
		return new Page3(getDriver());
	}

	public String getPartida() {
		return partida;
	}

	public String getRegreso() {
		return regreso;
	}

	public String getPartidaFechaSt() {
		return partidaFechaSt;
	}

	public String getRegresoFechaSt() {
		return regresoFechaSt;
	}

	public String getResumeSt() {
		return resumeSt;
	}

}
