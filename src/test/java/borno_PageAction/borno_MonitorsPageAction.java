package borno_PageAction;

import org.openqa.selenium.JavascriptExecutor;

import borno_PageLocator.borno_MonitorsPageLocator;
import borno_UtiliTY.borno_base;

public class borno_MonitorsPageAction extends borno_base{
	
	borno_MonitorsPageLocator borMonitorsPageLocator = new borno_MonitorsPageLocator();
	
	public void clickonDeals() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll,(0,500)");
		borMonitorsPageLocator.deal.click();
		Thread.sleep(2000);
	}

}
