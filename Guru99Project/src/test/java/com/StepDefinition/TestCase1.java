package com.StepDefinition;

import org.testng.annotations.AfterSuite;

import com.Generic.BaseTestClass;
import com.page.MagentoLoginPage;
import com.page.MagentoManageSales;
import com.page.MagentoOrderPage;
import io.cucumber.java.en.*;


public class TestCase1 extends BaseTestClass {

	private MagentoLoginPage MLPObj;
	private MagentoManageSales MMSObj;
	private MagentoOrderPage MOPObj;

	private void initializeViewAndThis()
	{
		MLPObj=new MagentoLoginPage(this);
		MMSObj=new MagentoManageSales(this);
		MOPObj=new MagentoOrderPage(this);
	}

	//	1.Go to http://live.demoguru99.com/index.php/backendlogin

	@When("^User enter Url as (.*)$")
	public void user_enter_url_as(String url) {
		initializeViewAndThis();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.LaunchUrl(url);
	}

	//	 2.Login the credentials provided
	@Then("^User enters (.*) and (.*)$")
	public void user_enters(String username, String password) {

		MLPObj.setUsernameField(username);
		MLPObj.setPasswordField(password);
	}

	//Click on login button
	@And("User Click on Login")
	public void user_click_on_login() {
		MLPObj.clickOnLoginButton();
	}

	//Close popup
	@And("close Popup")
	public void close_popup() {
		MLPObj.clickOnClosePopup();
	}

	//	 3.Go to Sales-> Orders menu
	@When("User Mouse Hover on Sale")
	public void user_mouse_hover_on_sale() {

		MMSObj.clickOnSales();
	}

	//Mouse Hover on Order Menu
	@And("User Mouse Hover on Orders Menu")
	public void user_mouse_hover_on_orders_menu() {
		System.out.println("User click on Order");
	}

	//	 4.In the status field select "Canceled". Click Search
	@Then("select Canceled in Status field")
	public void select_canceled_in_status_field() {
		MOPObj.clickOnCancelStatusDropDown();
	}

	//Click on search button
	@And("Click Search")
	public void click_search() {
		MOPObj.clickOnSearchButton();
	}


	//	 5.Select the checkbox next to first order
	//	 9.Select the checkbox next to first order

	//Select Checkbox on First Order
	@When("User Select First Order Checkbox")
	public void user_select_first_order_checkbox() {
		MOPObj.clickOnOrderCheckBox();
	}

	//	 6.In Actions, select "Print Invoices". Click Submit
	//	10.In Actions, select "Print Invoices". Click Submit

	//Select Print Invoice dropdown 
	@And("Select Print Invoices")
	public void select_print_invoices() {
		MOPObj.clickOnPrintInvoiceActionDropDown();
	}

	//Click on Submit Button
	@Then("Click on Submit")
	public void click_on_submit() {
		MOPObj.clickOnSubmitButton();
	}

	//	 7.Verify the error message
	@And("Verify the message")
	public void verify_the_message() {
		MOPObj.verifyError();
	}

	//	 8.In the status field select "Complete". Click Search
	@When("User select complete field in Status")
	public void user_select_complete_field_in_status() {
		MOPObj.clickOnCompleteStatusDropDown();
	}

	//	 11. Verify invoice is downloaded
	@And("Verify invoice is downloaded")
	public void verify_invoice_is_downloaded() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MagentoOrderPage.isFileDownloaded("invoice2021-05-21_05-50-05");
		//		MOPObj.isFileDownloaded();
	}

	// Close Browser
	@AfterSuite
	@And("close browser")
	public void close_browser() {
		this.closeBrowser();
		this.quitBrowser();
	}


}
