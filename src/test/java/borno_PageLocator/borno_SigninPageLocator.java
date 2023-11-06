package borno_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import borno_UtiliTY.borno_base;

public class borno_SigninPageLocator extends borno_base {
	
	public borno_SigninPageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "SignInModel_EmailAddress")
	public WebElement bornoUN;
	
	@FindBy(id = "userPwd_UserInputSecret")
	public WebElement bornoPSW;

	@FindBy(id = "btnSignIn")
	public WebElement bornoBTTN;

	@FindBy(id = "validationSummaryContainer-33f7b4da-9c56-4762-a38b-6df0c516a641")
	public WebElement Error;

}
