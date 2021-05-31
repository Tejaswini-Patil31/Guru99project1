package com.StepDefinition;

import com.Generic.BaseTestClass;
import com.page.MagentoCustomerInformationPage;
import com.page.MagentoManageCustomer;

import io.cucumber.java.en.*;

public class TestCase5 extends BaseTestClass{

	//	1.Go to http://live.demoguru99.com/index.php/backendlogin
	//	 2.Login with credentials provided

	MagentoManageCustomer MCObj;
	MagentoCustomerInformationPage MCIObj;

	private void initializeViewAndThis()
	{
		MCObj=new MagentoManageCustomer(this);
		MCIObj=new MagentoCustomerInformationPage(this);
	}

	//	 3.Go to Customers-> Manage Customers menu

	@When("User Mouse Hover on Customers")
	public void user_mouse_hover_on_customers() 
	{
		initializeViewAndThis();
		MCObj.clickOnCustomerButton();
	}

	@Then("User Mouse Hover on Manage Customers Menu")
	public void user_mouse_hover_on_manage_customers_menu() {
		System.out.println("click on Manager Customer Menu");
	}

	//	 4.Open any customer's detail by clicking on view link in the grid

	@Then("Open any customer")
	public void open_any_customer() {
		System.out.println("Click on any cutomer");
		MCObj.clickOnEdit();
	}

	//	 5.Click on 'Account Information' tab for the customer's detail page

	@When("click on Account Information")
	public void click_on_account_information() {
		MCIObj.clickOnAccountInformation();
	}

	//	 6. Verify disabled fields

	@And("Verify disabled fields")
	public void verify_disabled_fields() {
		MCIObj.checkMainWebsite();
		MCIObj.checkAccountCreate();
	}

	//	 7. Verify Blank fields
	
	@And("Verify Blank fields")
	public void verify_blank_fields() {
		MCIObj.checkPasswordField();
	}
}
