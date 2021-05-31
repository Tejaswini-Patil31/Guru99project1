package com.page;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Generic.PojoClass;

public class MagentoOrderPage {
	
	File folder;
	private PojoClass PojoObj;
	WebDriver driver;

	public MagentoOrderPage(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}
	
	private By drp_Status=By.id("sales_order_grid_filter_status");
	private By btn_Search=By.xpath("//span[text()='Search']");
	private By chk_selectOrder=By.xpath("//input[@name='order_ids']");
	private By drp_Actions=By.id("sales_order_grid_massaction-select");
	private By btn_Submit=By.xpath("//span[text()='Submit']");
	private By txt_VerifyError=By.xpath("//span[text()='There are no printable documents related to selected orders.']");

	
	
	public void clickOnCancelStatusDropDown()
	{
		Select action1=new Select(PojoObj.getDriver().findElement(drp_Status));
		action1.selectByVisibleText("Canceled");
		
	}
	
	public void clickOnSearchButton()
	{
		PojoObj.getDriver().findElement(btn_Search).click();
	}
	
	public void clickOnOrderCheckBox()
	{
		WebElement elem1 = PojoObj.getDriver().findElement(chk_selectOrder);
		try { 
			elem1.click(); 
		} catch (Exception e) { 
			elem1 = PojoObj.getDriver().findElement(chk_selectOrder); 
			elem1.click(); 
		} 
		
	}
	public void clickOnPrintInvoiceActionDropDown()
	{
		Select action2=new Select(PojoObj.getDriver().findElement(drp_Actions));
		action2.selectByVisibleText("Print Invoices");
		
	}
	
	public void clickOnSubmitButton()
	{
		   
		PojoObj.getDriver().findElement(btn_Submit).click();
	}
	
	public void verifyError()
	{
		String ActualError=PojoObj.getDriver().findElement(txt_VerifyError).getText();
		String ExpectedError="There are no printable documents related to selected orders.";
		if(ActualError.equals(ExpectedError))
		{
			System.out.println("Error is="+ActualError);
		}
		else
		{
			System.out.println("No error");
		}
		Assert.assertEquals(ExpectedError, ActualError);
	}
	
	public void clickOnCompleteStatusDropDown()
	{
		Select action1=new Select(PojoObj.getDriver().findElement(drp_Status));
		action1.selectByVisibleText("Complete");
		
	}
	

	public static boolean isFileDownloaded(String fileName) 
	{
		boolean flag = false;		
        String dirPath = "C:\\Users\\Ivavsys\\Downloads"; 
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) 
        {
            System.out.println("The directory is empty");
            flag = false;
        } 
        else 
        {
            for (File listFile : files) 
            {
                if (listFile.getName().contains(fileName)) 
                {
                    System.out.println(fileName + " is present");
                    break;
                }
                flag = true;
            }
        }
        return flag;		
	}
	
	
//	public void isFileDownloaded() 
//	{
//		folder=new File(UUID.randomUUID().toString());
//		folder.mkdir();
//	
//	    // Setting chrome driver path
//        System.setProperty("webdriver.chrome.driver", "/src/test/resources/Drivers/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        
//        // Setting new download directory path
//        Map<String, Object> prefs = new HashMap<String, Object>();
//         
//        // Use File.separator as it will work on any OS
//       prefs.put("profile.default_content_settings.popups", 0);
//       prefs.put("download.default_directory", folder.getAbsolutePath());
//       
//         options.setExperimentalOption("prefs", prefs);
//         DesiredCapabilities cap=DesiredCapabilities.chrome();
//         cap.setCapability(ChromeOptions.CAPABILITY, options);
//      
//         
//        // Launching browser with desired capabilities
//         driver= new ChromeDriver(options);
//         
//        // URL loading
//        PojoObj.getDriver().get("http://live.demoguru99.com/index.php/backendlogin/customer/index/key/4bd9331107348fa76329163f39945a9c/");
//         
//        // Click on download selenium server jar file
//        PojoObj.getDriver().findElement(btn_Submit).click();
//         
//		
//	}
}
