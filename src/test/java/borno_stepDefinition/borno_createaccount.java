package borno_stepDefinition;

import borno_PageAction.borno_createaccountPageAction;
import borno_PageAction.borno_homePageAction;
import borno_UtiliTY.borno_base;
import cucumber.api.java.en.Then;

public class borno_createaccount extends borno_base{
	
	borno_homePageAction borhomePageAction = new borno_homePageAction();
	borno_createaccountPageAction borcreateaccountPageAction = new borno_createaccountPageAction();
	
	@Then("^Click Create an Account$")
	public void click_Create_an_Account() throws Throwable {
		borhomePageAction.ClickCreateanAccount();
	}
	@Then("^Type first name last name email and passward$")
	public void type_first_name_last_name_email_and_passward() throws Throwable {
		borcreateaccountPageAction.Typefirstnamelastnameemailandpassward( bornoPro.getProperty("BornFirstname"),bornoPro.getProperty("BornoLastname"), bornoPro.getProperty("BornEmail"),  bornoPro.getProperty("BornPassward"));
		
	}

	@Then("^Click on check box$")
	public void click_on_check_box() throws Throwable {
		borcreateaccountPageAction.Clickoncheckbox();
	}

	@Then("^Click on Create account button$")
	public void click_on_Create_account_button() throws Throwable {
		borcreateaccountPageAction.ClickonCreateaccountbutton();
	}

	@Then("^Verify bornouser can create new account$")
	public void verify_bornouser_can_create_new_account() throws Throwable {
	  
	}


}
