package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class BankDetailsPage extends PageBase 
{
	//Page Elements
		@FindBy(xpath= "//a[normalize-space()='Bank Details']")
		private WebElement lnkBankDetails;
		
		@FindBy(xpath= "//div[@class='proile-heading']")
		private WebElement txtPaymentMethod;
		
		public BankDetailsPage(WebDriver driver)
		{
			setWebDriver(driver);
		}
		
		public Boolean clickOnBankDetailsLink()
		{
			jsExecutorscrollIntoView(lnkBankDetails);
			if(lnkBankDetails.isDisplayed() && lnkBankDetails.isEnabled())
			{
				lnkBankDetails.click();   
			}
			return getBankDetails();
		}
		
		public Boolean getBankDetails()
		{
			return txtPaymentMethod.isDisplayed();
		}
}
