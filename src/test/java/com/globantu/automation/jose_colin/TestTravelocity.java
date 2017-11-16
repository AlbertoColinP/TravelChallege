package com.globantu.automation.jose_colin;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTravelocity extends BaseTest{
	
	
	
	@Test(enabled=true)
	public void testMenu() {
		TravelocityHomePage page=getHomePage();
		
		Page2 second=page.inicio();
		

		Page3 p3=second.inicio();
		
		Page4 p4=p3.inicio();
		
		p4.inicio();
		
		Assert.assertEquals(second.getPartida(), "Las Vegas (LAS)");
		Assert.assertEquals(second.getRegreso(), "Los Angeles, CA, United States (LAX)");
		Assert.assertEquals(second.getPartidaFechaSt(), "04/01/2018");
		Assert.assertEquals(second.getRegresoFechaSt(), "05/01/2018");
		Assert.assertEquals(second.getResumeSt(), "1 Traveler, All Airlines, Economy / Coach");
		
		Assert.assertEquals(p4.getLugarPartidaString(), "Los Angeles Intl. (LAX)");
	}
	
	
	
}
