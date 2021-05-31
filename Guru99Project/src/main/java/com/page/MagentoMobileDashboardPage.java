package com.page;

import org.openqa.selenium.By;
import com.Generic.PojoClass;

public class MagentoMobileDashboardPage {
	private PojoClass PojoObj;

	public MagentoMobileDashboardPage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	private By btn_SonyXperia=By.xpath("//a[@title='Sony Xperia']");

	public void clickOnSonyXperiaImage()
	{
		PojoObj.getDriver().findElement(btn_SonyXperia).click();
	}
}
