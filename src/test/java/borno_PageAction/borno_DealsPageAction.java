package borno_PageAction;

import org.testng.Assert;

import borno_PageLocator.borno_DealsPageLocator;
import borno_UtiliTY.borno_base;
import borno_UtiliTY.borno_utiliti;

public class borno_DealsPageAction extends borno_base{
	
	borno_DealsPageLocator borDealsPageLocator = new borno_DealsPageLocator();
	
	public void Verifybornousercanscrolldown() throws Exception {
		boolean successSD = borDealsPageLocator.verifypage.isDisplayed();
		Assert.assertTrue(successSD);
		Thread.sleep(2000);
		 borno_utiliti.takeMyScreenshot(driver,"Deals page");
	}

}
