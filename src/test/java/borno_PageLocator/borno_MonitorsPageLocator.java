package borno_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import borno_UtiliTY.borno_base;

public class borno_MonitorsPageLocator extends borno_base{
	
	public borno_MonitorsPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Deals']")
	public WebElement deal;

}
