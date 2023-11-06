package borno_stepDefinition;

import borno_PageAction.borno_SigninPageAction;
import borno_PageAction.borno_homePageAction;
import borno_UtiliTY.borno_base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class borno_signin extends borno_base{
	
	borno_homePageAction borhomePageAction = new borno_homePageAction();
	borno_SigninPageAction borSigninPageAction = new borno_SigninPageAction();
	
	@Given("^Launch <\"([^\"]*)\"> borno$")
	public void launch_borno(String url) throws Throwable {
		 bornolaunchurl(url);
	}
	@Then("^mouse hover to signin page$")
	public void mouse_hover_to_signin_page() throws Throwable {
		 borhomePageAction.mousehovertosigninpage();
	}

	@Then("^Click signin link$")
	public void click_signin_link() throws Throwable {
		 borhomePageAction.Clicksigninlink();
	}
    
	@Then("^Enter invalid username passward and click signin button$")
	public void enter_invalid_username_passward_and_click_signin_button() throws Throwable {
		borSigninPageAction.Enterinvalidusernamepasswardandclicksigninbutton(bornoPro.getProperty("Bornousername"),bornoPro.getProperty("Bornopassward ") );
	}

	@Then("^Verify bornouser cannot signin with invalid data$")
	public void verify_bornouser_cannot_signin_with_invalid_data() throws Throwable {
	
	}



}
