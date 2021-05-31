package com.page;

import org.openqa.selenium.By;
import com.Generic.PojoClass;

public class MagentoAdvanceSearchPage {
	private PojoClass PojoObj;

	public MagentoAdvanceSearchPage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	
	private By txt_price1=By.id("price");
	private By txt_price_to=By.id("price_to");
	
	private By btn_Serach=By.xpath("//div[@class='buttons-set']//span[contains(text(),'Search')]");



	public void setPriceField(String int1)
	{
		PojoObj.getDriver().findElement(txt_price1).sendKeys(int1);
	}
	public void setPriceToField(String int2)
	{
		PojoObj.getDriver().findElement(txt_price_to).sendKeys(int2);
	}

	public void clickOnSearchButton()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PojoObj.getDriver().findElement(btn_Serach).click();
	}

}
