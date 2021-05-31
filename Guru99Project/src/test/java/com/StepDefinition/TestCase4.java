package com.StepDefinition;

import com.Generic.BaseTestClass;
import com.page.MagentoAdvanceSearchPage;
import com.page.MagentoCommercePage;
import com.page.MagentoMobileHomePage;

import io.cucumber.java.en.*;

public class TestCase4 extends BaseTestClass{
	//		1. Go to http://live.demoguru99.com/index.php/
	//		 2. Click on Advance Search


	private MagentoMobileHomePage MMHObj;
	private MagentoAdvanceSearchPage MASObj;
	private MagentoCommercePage MCPObj;

	private void initializeViewAndThis()
	{
		MMHObj=new MagentoMobileHomePage(this);
		MASObj=new MagentoAdvanceSearchPage(this);
		MCPObj=new MagentoCommercePage(this);
	}

	@When("click on Advance serach")
	public void click_on_advance_serach() {
		initializeViewAndThis();
		MMHObj.clickOnAdvanceSearch();
	}

	//	 3. In Price field enter range 0-150. Click Search

	@Then("^In Price field enter range (.*) and (.*)$")
	public void in_price_field_enter_range_and(String int1, String int2) {
		MASObj.setPriceField(int1);
		MASObj.setPriceToField(int2);
	}

	@And("click Search")
	public void click_search() {
		MASObj.clickOnSearchButton();
	}

	//	 4. Note the Price and Product Name in the result. Print on console

	@Then("Verify Price and Product Name in result")
	public void verify_price_and_product_name_in_result() {

		MCPObj.getProductName();
		MCPObj.getProductPrice();
	}


	//	 5. Again, In Price field enter range 151-1000. Click Search
	//	 6. Note the Price and Product Name in the result. Print on console

	@Then("^Again In Price field enter range (.*) and (.*)$")
	public void again_in_price_field_enter_range_and(String int3, String int4) {
		MASObj=new MagentoAdvanceSearchPage(this);
		MASObj.setPriceField(int3);
		MASObj.setPriceToField(int4);
	}
}
