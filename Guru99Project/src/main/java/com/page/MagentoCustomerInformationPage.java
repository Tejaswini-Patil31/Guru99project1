package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Generic.PojoClass;

public class MagentoCustomerInformationPage {
	private PojoClass PojoObj;

	public MagentoCustomerInformationPage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}
	
	private By btn_accountInfo=By.id("customer_info_tabs_account");
	private By drp_mainwebsite=By.id("_accountwebsite_id");
	private By txt_accountCreate=By.id("_accountcreated_in");
	private By txt__accountnew_password=By.id("_accountnew_password");
	
	public void clickOnAccountInformation()
	{
		PojoObj.getDriver().findElement(btn_accountInfo).click();
	}
	
	public void checkMainWebsite()
	{
		WebElement drop = PojoObj.getDriver().findElement(drp_mainwebsite);
		 if (drop.isEnabled()) {
		  System.out.println("Main Website dropdown is Enable");
		 } else {
		System.out.println("Main Website dropdown is Disable");
		 }
	}
	
	public void checkAccountCreate() {
		WebElement form = PojoObj.getDriver().findElement(txt_accountCreate);
		 if (form.isEnabled()) {
		  System.out.println("Default Store View is Enable");
		 } else {
		System.out.println("Default Store View is Disable");
		 }
	}
	
	public void checkPasswordField()
	{
		WebElement password = PojoObj.getDriver().findElement(txt__accountnew_password);
		String textInsideInputBox = password.getAttribute("value");
		if(textInsideInputBox.isEmpty())
		{
		   System.out.println("Password field is empty");
		}
	}
}
