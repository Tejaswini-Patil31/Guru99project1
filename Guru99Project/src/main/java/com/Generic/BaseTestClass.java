package com.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass extends PojoClass{

	
	public void initializeBrowserSetup()
	{
		System.out.println("Browser is Open");
		String projectpath=System.getProperty("user.dir");
		System.out.println("Project path="+projectpath);

		System.setProperty("webdriver.chrome.driver",projectpath+"/src/main/resources/Drivers/chromedriver.exe");
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
	}
	
	public void LaunchUrl(String url)
	{
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeBrowser(){
		getDriver().close();
	}
	
	public void quitBrowser()
	{
		getDriver().quit();
	}
}
