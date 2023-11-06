package borno_PageAction;

import org.openqa.selenium.interactions.Actions;

import borno_PageLocator.borno_homePageLocator;
import borno_UtiliTY.borno_base;

public class borno_homePageAction extends borno_base{
	
	borno_homePageLocator borhomePageLocator = new borno_homePageLocator();
	
	public void mousehovertosigninpage() throws Exception {
		Actions ac = new Actions(driver);
		ac.moveToElement( borhomePageLocator.signinpage).build().perform();
		Thread.sleep(3000);
	}
		
	
	public void  Clicksigninlink() throws Exception {
		borhomePageLocator.link2.click();
		Thread.sleep(2000);
	}
	
	public void ClickMonitorspage() throws Exception {
		borhomePageLocator.monitorpage.click();
		Thread.sleep(2000);
	}
	public void ClickCreateanAccount() throws Exception{
		borhomePageLocator.CApage.click();
		Thread.sleep(2000);
	}
	
	

}
