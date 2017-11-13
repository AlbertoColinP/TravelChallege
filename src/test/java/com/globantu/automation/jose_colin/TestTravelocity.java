package com.globantu.automation.jose_colin;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTravelocity extends BaseTest{
	
	
	
	@Test(enabled=true)
	public void testMenu() {
		TravelocityHomePage page=getHomePage();
		
		SecondPage second=page.inicio();
		
//		Assert.assertEquals(second.getTextH1(), "        Start by choosing your hotel");s
		
	}
	
	
	
}
