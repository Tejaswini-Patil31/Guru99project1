package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.Generic.PojoClass;

public class MagentoManageCatalog 
{
	private PojoClass PojoObj;

	public MagentoManageCatalog(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}


	private By btn_Catalog=By.xpath("//a//span[text()='Catalog']");
	private By btn_ReviewRate=By.xpath("//a//span[text()='Reviews and Ratings']");
	private By btn_CustomerReview=By.xpath("//a//span[text()='Customer Reviews']");
	private By btn_PendingReview=By.xpath("//a//span[text()='Pending Reviews']");

	public void clickOnCatalogButton()
	{

		WebElement catalog= PojoObj.getDriver().findElement(btn_Catalog);
		Actions action= new Actions(PojoObj.getDriver());
		action.moveToElement(catalog);
		action.build().perform();

		WebElement review= PojoObj.getDriver().findElement(btn_ReviewRate);
		action.moveToElement(review);
		action.build().perform();

		WebElement CustomerReview= PojoObj.getDriver().findElement(btn_CustomerReview);
		action.moveToElement(CustomerReview);
		action.build().perform();


		WebElement PendingReview= PojoObj.getDriver().findElement(btn_PendingReview);
		action.moveToElement(PendingReview);
		action.click().build().perform();

	}









}
