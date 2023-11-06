package borno_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import borno_UtiliTY.borno_base;

public class borno_createaccountPageLocator extends borno_base {
	
	public borno_createaccountPageLocator(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "FirstName")
	public WebElement Fname;
	
	@FindBy(id = "LastName")
	public WebElement Lname;
	
	@FindBy(id = "EmailAddress")
	public WebElement Email;
	
	@FindBy(id = "userPwd_UserInputSecret")
	public WebElement createPass;
	
	@FindBy(id = "CreateAccountOptInCheckbox")
	public WebElement Chkbox;
	
	@FindBy(id = "btnCreateAccount")
	public WebElement ClkButton;
	
}




