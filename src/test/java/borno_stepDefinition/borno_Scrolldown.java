package borno_stepDefinition;

import borno_PageAction.borno_DealsPageAction;
import borno_PageAction.borno_MonitorsPageAction;
import borno_PageAction.borno_homePageAction;
import borno_UtiliTY.borno_base;
import cucumber.api.java.en.Then;

public class borno_Scrolldown extends borno_base{
	
	borno_homePageAction borhomePageAction = new borno_homePageAction();
	borno_MonitorsPageAction borMonitorsPageAction = new borno_MonitorsPageAction();
	borno_DealsPageAction borDealsPageAction = new borno_DealsPageAction();
	
	@Then("^Click Monitors page$")
	public void click_Monitors_page() throws Throwable {
		borhomePageAction.ClickMonitorspage();
	}

	@Then("^click on Deals$")
	public void click_on_Deals() throws Throwable {
		borMonitorsPageAction.clickonDeals();
	}

	@Then("^Verify bornouser can scrolldown$")
	public void verify_bornouser_can_scrolldown() throws Throwable {
		borDealsPageAction.Verifybornousercanscrolldown();
	}



}
