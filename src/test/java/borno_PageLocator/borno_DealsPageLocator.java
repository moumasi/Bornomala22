package borno_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import borno_UtiliTY.borno_base;

public class borno_DealsPageLocator extends borno_base{
	
	public borno_DealsPageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "hero-subtitle")
	public WebElement verifypage;
	
	

}
