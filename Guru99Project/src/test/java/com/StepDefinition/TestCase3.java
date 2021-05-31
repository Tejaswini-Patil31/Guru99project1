package com.StepDefinition;

import com.Generic.BaseTestClass;
import com.page.MagentoManageSales;
import com.page.MagentoSaleInvoice;

import io.cucumber.java.en.*;


public class TestCase3 extends BaseTestClass {

	//		1.Go to http://live.demoguru99.com/index.php/backendlogin
	//		 2.Login with credentials provided
	//		 3.Go to Sales Invoice

	private MagentoManageSales MMSObj;
	private MagentoSaleInvoice MSIObj;

	private void initializeViewAndThis()
	{
		MMSObj=new MagentoManageSales(this);
		MSIObj=new MagentoSaleInvoice(this);
	}


	@When("User Mouse Hover on Sale in home page")
	public void user_mouse_hover_on_sale_in_home_page() {
		initializeViewAndThis();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MMSObj.clickOnSales1();
	}
	@And("User Mouse Hover on Invoice")
	public void user_mouse_hover_on_invoice() {
	    System.out.println("User click on Invoices");
	}
	//	 4.Sort Invoice Date Column in ascending and descending order
	//	 5.Verify the sort is working as expected

	@Then("User sort Invoice date in Ascending and descending order and Verify the sort is working as expected")
	public void user_sort_invoice_date_in_ascending_and_descending_order_and_Verify_the_sort_is_working_as_expected() 
	{
		MSIObj.clickInvoiceDate();
	}

}
