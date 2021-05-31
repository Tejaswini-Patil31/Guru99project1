package com.page;

import org.openqa.selenium.By;
import com.Generic.PojoClass;

public class MagentoMobileHomePage {
	private PojoClass PojoObj;

	public MagentoMobileHomePage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	private By btn_Mobile=By.xpath("//a[@class='level0 ']");
	private By btn_AdvanceSearch=By.xpath("//a[@title='Advanced Search']");

	public void clickOnMobile()
	{
		PojoObj.getDriver().findElement(btn_Mobile).click();
	}
	
	public void clickOnAdvanceSearch()
	{
	PojoObj.getDriver().findElement(btn_AdvanceSearch).click();	
	}

}
