package borno_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import borno_UtiliTY.borno_base;

public class borno_homePageLocator extends borno_base{
	
	public borno_homePageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "um-si-label")
	public WebElement signinpage;
	
	@FindBy(xpath = "/html/body/main/section[1]/header/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/a[1]")
	public WebElement link2;

	@FindBy(xpath = "//div[text()='Monitors']")
	public WebElement monitorpage;
	
	@FindBy(linkText = "Create an Account")
	public WebElement CApage;
	
}
