package com.page;

import org.openqa.selenium.By;
import com.Generic.PojoClass;

public class MagentoLoginPage 
{
private PojoClass PojoObj;
	
	public MagentoLoginPage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}
	
	private By txt_username=By.id("username");
	private By txt_password=By.id("login");
	private By btn_login=By.className("form-button");
	private By btn_closePopup=By.xpath("//a//span[text()='close']");
	
	
	public void setUsernameField(String username)
	{
		PojoObj.getDriver().findElement(txt_username).sendKeys(username);
	}
	
	public void setPasswordField(String password)
	{
		PojoObj.getDriver().findElement(txt_password).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		PojoObj.getDriver().findElement(btn_login).click();
	}
	public void clickOnClosePopup()
	{
		PojoObj.getDriver().findElement(btn_closePopup).click();
	}
	
}
