package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class BankDetailsPage extends PageBase 
{
	//Page Elements
		@FindBy(xpath= "//a[normalize-space()='Bank Details']")
		WebElement bankDetails;
		
		@FindBy(xpath= "//div[@class='proile-heading']")
		WebElement paymentMethod;
		
		public BankDetailsPage(WebDriver driver)
		{
			setWebDriver(driver);
		}
		
		public Boolean getBankDetails()
		{
			JavascriptExecutor js = (JavascriptExecutor) pbDriver;
			if(bankDetails.isDisplayed() && bankDetails.isEnabled())
			{
				bankDetails.click();
			    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
			return paymentMethod.isDisplayed();
		}
}
