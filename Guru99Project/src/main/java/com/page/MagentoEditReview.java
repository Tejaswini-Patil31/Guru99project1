package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.Generic.PojoClass;

public class MagentoEditReview 
{
private PojoClass PojoObj;
	
	public MagentoEditReview(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	private By drp_status=By.id("status_id");
	private By btn_Save=By.xpath("//span[text()='Save Review']");
	private By rd_quality=By.id("Quality 1_4");


	public void clickOnStatusDropdown()
	{
		Select status=new Select(PojoObj.getDriver().findElement(drp_status));
		status.selectByVisibleText("Approved");
	}
	public void clickOnQualityRadioButton()
	{
		PojoObj.getDriver().findElement(rd_quality).click();
	}
	
	public void clickOnSaveButton()
	{
		PojoObj.getDriver().findElement(btn_Save).click();
	}
	
	
}
