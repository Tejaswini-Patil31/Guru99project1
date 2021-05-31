package com.Generic;

import org.openqa.selenium.WebDriver;

public class PojoClass 
{
	private static WebDriver driver;

	public WebDriver getDriver()
	{
		return driver;
	}

	public void setDriver(WebDriver driver)
	{
		PojoClass.driver=driver;
	}
}
