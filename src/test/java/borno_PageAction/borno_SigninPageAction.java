package borno_PageAction;

import org.testng.Assert;

import borno_PageLocator.borno_SigninPageLocator;
import borno_UtiliTY.borno_base;
import borno_UtiliTY.borno_testData;
import borno_UtiliTY.borno_utiliti;

public class borno_SigninPageAction extends borno_base{
	
	borno_SigninPageLocator borSigninPageLocator = new borno_SigninPageLocator();

	public void Enterinvalidusernamepasswardandclicksigninbutton(String u, String f) throws Exception {
		borSigninPageLocator.bornoUN.sendKeys(borno_testData.Bornousername);
		 borSigninPageLocator.bornoPSW.sendKeys(borno_testData.Bornopassward);
		 borSigninPageLocator.bornoBTTN.click();
		Thread.sleep(2000);
		
	}
	public void Verifybornousercannotsigninwithinvaliddata() throws Exception {
		boolean veriscc = borSigninPageLocator.Error.isDisplayed();
		Assert.assertTrue(veriscc);
		Thread.sleep(2000);
		borno_utiliti.takeMyScreenshot(driver, "error msg page");
	}
	
	
}
