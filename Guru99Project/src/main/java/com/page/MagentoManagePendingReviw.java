package com.page;

import org.openqa.selenium.By;
import com.Generic.PojoClass;

public class MagentoManagePendingReviw {
	private PojoClass PojoObj;

	public MagentoManagePendingReviw(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	private By btn_SortId=By.xpath("//span[@class='sort-title']");
	private By chk_Comment=By.name("reviews");
	private By lnk_Edit=By.linkText("Edit");

	public void clickOnID()
	{
		PojoObj.getDriver().findElement(btn_SortId).click();
	}

	public void clickOnCheckBok()
	{
		PojoObj.getDriver().findElement(chk_Comment).click();
	}
	public void clickOnEdit()
	{
		PojoObj.getDriver().findElement(lnk_Edit).click();
	}

}
