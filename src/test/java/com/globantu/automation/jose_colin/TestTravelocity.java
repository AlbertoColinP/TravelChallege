package com.globantu.automation.jose_colin;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTravelocity extends BaseTest{
	
	
	
	@Test(enabled=true)
	public void testMenu() {
		TravelocityHomePage page=getHomePage();
		
		Page2 second=page.inicio();
		

		Page3 p3=second.inicio();
		
		Page4 p4=p3.inicio();
		
		Page5 p5=p4.inicio();
		
		p5.inicio();
		
		//step 2 validations
		Assert.assertEquals(second.getPartida(), "Las Vegas (LAS)");
		Assert.assertEquals(second.getRegreso(), "Los Angeles, CA, United States (LAX)");
		Assert.assertEquals(second.getPartidaFechaSt(), "04/01/2018");
		Assert.assertEquals(second.getRegresoFechaSt(), "05/01/2018");
		Assert.assertEquals(second.getResumeSt(), "1 Traveler, All Airlines, Economy / Coach");
		
		//step 7,8 validations
		Assert.assertEquals(p4.getLugaresString(), Arrays.asList("McCarran Intl. (LAS)","Los Angeles Intl. (LAX)","Los Angeles Intl. (LAX)","McCarran Intl. (LAS)"));
		Assert.assertEquals(p4.getFechasString().get(0), "Apr 1, 2018");
		Assert.assertEquals(p4.getFechasString().get(1), "May 1, 2018");
		Assert.assertEquals(p4.getPrecioString(), "$157.59");
		
		//step 10 validations
		
		Assert.assertEquals(p5.getFieldsDisplayed(),Arrays.asList(true,true,true,true,true));
		
	}
	
	
	
}
