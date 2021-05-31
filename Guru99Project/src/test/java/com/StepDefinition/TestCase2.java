package com.StepDefinition;

import org.testng.annotations.BeforeSuite;

import com.Generic.BaseTestClass;
import com.page.MagentoEditReview;
import com.page.MagentoManageCatalog;
import com.page.MagentoManagePendingReviw;
import com.page.MagentoMobileDashboardPage;
import com.page.MagentoMobileHomePage;
import com.page.MagentoMobileSonyXperia;
import com.page.MagentoMobileSonyReview;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class TestCase2 extends BaseTestClass{


	private MagentoMobileSonyXperia MMSObj;
	private MagentoManageCatalog MMCObj;
	private MagentoManagePendingReviw MMPObj;
	private MagentoEditReview MERObj;
	private MagentoMobileHomePage MMHObj;
	private MagentoMobileDashboardPage MMDObj;
	private MagentoMobileSonyReview MMSRObj;
	
	private void initializeViewAndThis()
	{
		MMSObj=new MagentoMobileSonyXperia(this);
		MMCObj=new MagentoManageCatalog(this);
		MMPObj=new MagentoManagePendingReviw(this);
		MERObj=new MagentoEditReview(this);
		MMHObj=new MagentoMobileHomePage(this);
		MMDObj=new MagentoMobileDashboardPage(this);
		MMSRObj=new MagentoMobileSonyReview(this);

	}

	@Before(order=0)
	public void beforeScenarioStart(){
		System.out.println("-----------------Start of Scenario-----------------");
	} 


	@After(order=0)
	public void afterScenarioFinish(){
		System.out.println("-----------------End of Scenario-------------------");
	} 

	//Launching Browser
	@BeforeSuite
	@Given("the user opens a web browser")
	public void the_user_opens_a_web_browser() {
		this.initializeBrowserSetup();
		initializeViewAndThis();

	}

	/*	1. Go to http://live.demoguru99.com/.
	URL Loading        						*/
	@When("^User enter URL1 (.*)$")
	public void user_enter_URL1(String url1) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.LaunchUrl(url1);
	}

	//Verify Title
	@Then("Verify Title of Home Page")
	public void verify_title_of_home_page() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualtitle=getDriver().getTitle();
		System.out.println("Actual title Magento Home Page is="+actualtitle);	
	}


	//2. Go To Link - http://live.demoguru99.com/index.php/review/product/list/id/1/
	// URL Loading
	@When("^User enter Url2 as (.*)$")
	public void user_enter_url2_as(String url2) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().get(url2);
	}


	@Then("Product Page is Open")
	public void product_page_is_open() {
		System.out.println("Product page is Open");
	}

	//Verify title
	@And("Verify Title of Product Page")
	public void verify_title_of_product_page() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title=getDriver().getTitle();
		System.out.println("Title of Sony Experia page is="+title);
	}

	//3. Fill the required review and submit it

	@When("User Fills Review data")
	public void user_fills_review_data() {
		MMSObj.clickOnQualityRadioButton();
		MMSObj.setThoughtField();
		MMSObj.setSummaryField();
		MMSObj.setNicknameField();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("Click on Submit button")
	public void click_on_Submit_button() {
		MMSObj.clickOnSubmitButton();

	}

	@Then("User is navigated to Product Page")
	public void user_is_navigated_to_product_page() {
		System.out.println("Navigated to Home Page");
	}

	// 6. Go to Catalogue -> Reviews and Ratings -> Customer Reviews ->Pending Reviews Menu

	@When("User Mouse Hover on Catalogue")
	public void user_mouse_hover_on_catalogue() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MMCObj.clickOnCatalogButton();
		System.out.println("Mouse hover on Catalogue");
	}

	@Then("User Mouse Hover on Reviews and Ratings")
	public void user_mouse_hover_on_reviews_and_ratings() {
		System.out.println("Mouse hover on  Review and Rating");
	}

	@And("User Mouse Hover on Customer Reviews")
	public void user_mouse_hover_on_customer_reviews() {
		System.out.println("Mouse hover on  Customer Reviews");
	}

	@And("User Mouse Hover on Pending Reviews Menu")
	public void user_mouse_hover_on_pending_reviews_menu() {
		System.out.println("Mouse hover on  user_mouse_hover_on_pending_reviews_menu");
	}

	//7.Sort table by Id and select comment then click on Edit link

	@Then("User Sort table by Id")
	public void user_sort_table_by_Id() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MMPObj.clickOnID();

		System.out.println("ID is Sorted");
	}


	@When("User select comment")
	public void user_select_comment() {
		MMPObj.clickOnCheckBok();
	}

	@Then("User click on Edit link")
	public void user_click_on_edit_link() {
		MMPObj.clickOnEdit();
	}

	//8.Change status to 'Approved' and click "Save Review"

	@And("User Change status to Approved in Dropdown")
	public void user_change_status_to_Approved_in_dropdown() {
		MERObj.clickOnStatusDropdown();

	}

	@Then("User Click on Save Review button")
	public void user_click_on_Save_Review_button() {
		MERObj.clickOnQualityRadioButton();
		MERObj.clickOnSaveButton();
	}

	//	9.Go to http://live.demoguru99.com/. Click Mobile Menu


	@When("User Click on Mobile Menu button")
	public void user_click_on_mobile_menu_button() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MMHObj.clickOnMobile();
	}


	@Then("Mobile Menus are shown")
	public void mobile_menus_are_shown() {
		System.out.println("user is on Mobile Dashboard Page");
	}

	//	 10. Click on Sony Xperia image.

	@When("User click on Sony Xperia image")
	public void user_click_on_sony_xperia_image() {
		MMDObj.clickOnSonyXperiaImage();
	}


	@Then("user is on page of Sony Xperia")
	public void user_is_on_page_of_sony_xperia() {
		System.out.println("User is on SonyXperia Mobile Page");
	}

	// 11. In detail page click on Review tab at bottom of page

	@When("User click on Review tab button at bottom of page")
	public void user_click_on_Review_tab_button_at_bottom_of_page() {
		MMSRObj.clickOnReviewsButton();
	}

	//	 12. Verify the review comment is shown

	@Then("User Verify the review comment")
	public void user_verify_the_review_comment() {
		MMSRObj.verifyVeview();
	}

}
