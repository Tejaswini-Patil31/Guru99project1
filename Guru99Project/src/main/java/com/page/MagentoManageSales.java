package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Generic.PojoClass;

public class MagentoManageSales{
	private PojoClass PojoObj;

	public MagentoManageSales(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	private By btn_Sales=By.xpath("//span[text()='Sales']");
	private By btn_Orders=By.xpath("//span[text()='Orders']");
	private By btn_Invoice=By.xpath("//span[text()='Invoices']");
	
	public void clickOnSales()
	{

		WebElement sales= PojoObj.getDriver().findElement(btn_Sales);
		Actions action= new Actions(PojoObj.getDriver());
		action.moveToElement(sales);
		action.build().perform();

		WebElement order= PojoObj.getDriver().findElement(btn_Orders);
		action.moveToElement(order);
		action.click().build().perform();

	}
	public void clickOnSales1()
	{

		WebElement sales= PojoObj.getDriver().findElement(btn_Sales);
		Actions action= new Actions(PojoObj.getDriver());
		action.moveToElement(sales);
		action.build().perform();

		WebElement invoice= PojoObj.getDriver().findElement(btn_Invoice);
		action.moveToElement(invoice);
		action.click().build().perform();

	}
}
