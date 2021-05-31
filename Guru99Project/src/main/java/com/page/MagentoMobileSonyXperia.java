package com.page;

import org.openqa.selenium.By;
import com.Generic.PojoClass;


public class MagentoMobileSonyXperia{
	
	private PojoClass PojoObj;
	
	public MagentoMobileSonyXperia(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	private By rb_quality=By.id("Quality 1_4");
	private By txt_thought=By.id("review_field");
	private By txt_summary=By.id("summary_field");
	private By txt_nickname=By.id("nickname_field");
	private By btn_submit=By.xpath("//button[@class='button']");
	

	
	public void clickOnQualityRadioButton()
	{
	
		PojoObj.getDriver().findElement(rb_quality).click();
	}
	
	public void setThoughtField() 
	{
		PojoObj.getDriver().findElement(txt_thought).sendKeys("nice");
	}
	public void setSummaryField()
	{
		PojoObj.getDriver().findElement(txt_summary).sendKeys("Good Product");
	}
	
	public void setNicknameField()
	{
		PojoObj.getDriver().findElement(txt_nickname).sendKeys("ABCD");
	}
	
	public void clickOnSubmitButton()
	{
		PojoObj.getDriver().findElement(btn_submit).click();
	}
	

}
