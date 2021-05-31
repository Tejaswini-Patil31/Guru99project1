package com.page;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Generic.PojoClass;

public class MagentoSaleInvoice 
{
	private PojoClass PojoObj;
	private By btn_InvoiceDate=By.xpath("//span[text()='Invoice Date']");

	public MagentoSaleInvoice(PojoClass PojoObj) 
	{
		this.PojoObj=PojoObj;
	}

	public void clickInvoiceDate()
    {
        
        List<WebElement> date=PojoObj.getDriver().findElements(By.xpath("//table[@id='sales_invoice_grid_table']//tbody//tr//td[3]"));
        String[] BeforeSort_date=new String[date.size()];

        // get text into the array
        for(int i=0; i<date.size();i++)
        {
            BeforeSort_date[i]=date.get(i).getText().trim();
        }
        System.out.println("//*************************Before Sort**********************//");
        Print(BeforeSort_date);
        System.out.println("  ");
        
        PojoObj.getDriver().findElement(btn_InvoiceDate).click();
        
        System.out.println("//******************After Sort: Ascending Order**************//");
        Arrays.sort(BeforeSort_date); // Sort Function
        Print(BeforeSort_date);
        System.out.println("  ");
        System.out.println("Date is Sorted in Ascending Order");
    
        System.out.println("//******************After Sort: Descending Order**************//");
        Arrays.sort(BeforeSort_date, Collections.reverseOrder()); // Sort Function in Reverse
        Print(BeforeSort_date);
        System.out.println("  ");
        System.out.println("Date is Sorted in Descending Order");

        System.out.println("  ");

        date=PojoObj.getDriver().findElements(By.xpath("//table[@id='sales_invoice_grid_table']//tbody//tr/td[3]"));
        String[] AfterSort_date=new String[date.size()];

        // get text into the array
        for(int i=0; i<date.size();i++)
        {
            AfterSort_date[i]=date.get(i).getText().trim();
        }

        if(AfterSort_date!=BeforeSort_date)
        {
            System.out.println("All Date are Sorted in both Ascending and Descending Order");
        }
        else
        {
            System.out.println("All Date are Not Sorted");
        }
    }

    public void Print(String[] ar)
    {
        for(int j=0;j<ar.length;j++)
        {
            System.out.println(ar[j]);
        }
    }
}
