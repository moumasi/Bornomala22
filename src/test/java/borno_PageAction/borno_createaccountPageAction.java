package borno_PageAction;

import org.openqa.selenium.JavascriptExecutor;

import borno_PageLocator.borno_createaccountPageLocator;
import borno_UtiliTY.borno_base;

public class borno_createaccountPageAction extends borno_base{
	
	borno_createaccountPageLocator borcreateaccountPageLocator = new borno_createaccountPageLocator();
	
	public void Typefirstnamelastnameemailandpassward(String F,String L,String E,String P) throws Exception {
		 borcreateaccountPageLocator.Fname.sendKeys(F);
		 borcreateaccountPageLocator.Lname.sendKeys(L);
		 borcreateaccountPageLocator.Email.sendKeys(E);
		 borcreateaccountPageLocator.createPass.sendKeys(P);
		 Thread.sleep(2000);
	}
	public void Clickoncheckbox() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		borcreateaccountPageLocator.Chkbox.click();
		 Thread.sleep(3000);
	}
	public void  ClickonCreateaccountbutton() {
		 borcreateaccountPageLocator.ClkButton.click();
	}
	

}
