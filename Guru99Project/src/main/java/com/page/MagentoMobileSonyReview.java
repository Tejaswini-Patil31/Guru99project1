package com.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Generic.PojoClass;

public class MagentoMobileSonyReview{
private PojoClass PojoObj;
	
	public MagentoMobileSonyReview(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}
	
	private By btn_reviews=By.xpath("//span[text()='Reviews']");
	private By txt_reviews=By.xpath("//a[contains(text(),'Nice')]");

	
	public void clickOnReviewsButton()
	{
		PojoObj.getDriver().findElement(btn_reviews).click();
	}
	
	public void verifyVeview()
	{
		String review=PojoObj.getDriver().findElement(txt_reviews).getText();
		System.out.println("This is the Review="+review);
		String expectedreview="NICE";
		if(review.equals("NICE"))
		{
			System.out.println("Comments are shown");
		}
		else
		{
			System.out.println("Comments are not shown");
		}
		Assert.assertEquals(expectedreview, review);
	}
	
	
}
