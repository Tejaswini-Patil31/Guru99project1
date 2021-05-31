package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Generic.PojoClass;

public class MagentoManageCustomer {
	private PojoClass PojoObj;

	public MagentoManageCustomer(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}


	private By btn_Customer=By.xpath("//a//span[text()='Customers']");
	private By btn_ManageCustomer=By.xpath("//a//span[text()='Manage Customers']");
	private By btn_edit=By.linkText("Edit");
	

	public void clickOnCustomerButton()
	{

		WebElement customer= PojoObj.getDriver().findElement(btn_Customer);
		Actions action= new Actions(PojoObj.getDriver());
		action.moveToElement(customer);
		action.build().perform();


		WebElement ManagerCutomer= PojoObj.getDriver().findElement(btn_ManageCustomer);
		action.moveToElement(ManagerCutomer);
		action.click().build().perform();

	}
	public void clickOnEdit()
	{
		PojoObj.getDriver().findElement(btn_edit).click();
	}
}
