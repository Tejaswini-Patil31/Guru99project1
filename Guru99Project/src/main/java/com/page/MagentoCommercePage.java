package com.page;

import org.openqa.selenium.By;

import com.Generic.PojoClass;

public class MagentoCommercePage {
	private PojoClass PojoObj;

	public MagentoCommercePage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}
	private By txt_ProName=By.xpath("//div[@class='product-info']//h2//a");
	private By txt_ProPrice=By.className("regular-price");
	
	public void getProductName()
	{
		String PName=PojoObj.getDriver().findElement(txt_ProName).getText();
		System.out.println("Product name is="+PName);
	}
	public void getProductPrice()
	{
		String PPrice=PojoObj.getDriver().findElement(txt_ProPrice).getText();
		System.out.println("Product price is="+PPrice);
	}
}
