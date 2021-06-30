package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class FaqsPage extends PageBase
{
	//Page Elements
			@FindBy(xpath= "//a[normalize-space()='FAQs']")
			private WebElement lnkFaQs;

			@FindBy(xpath= "//div[@class='profile-heading']")
			private WebElement txtProfileFaqs;
			
			
	public FaqsPage(WebDriver driver)
	{
		setWebDriver(driver);
	}
	
	public Boolean ClickOnFaqsLink()
	{
		jsExecutorscrollIntoView(lnkFaQs);
		if(lnkFaQs.isDisplayed() && lnkFaQs.isEnabled())
		{
			lnkFaQs.click();
		}
		return getFaqs();
	}
	public Boolean getFaqs()
	{
		return txtProfileFaqs.isDisplayed();
	}
}
