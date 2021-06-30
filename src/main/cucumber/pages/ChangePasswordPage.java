package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class ChangePasswordPage extends PageBase 
{
	//Page Elements
	@FindBy(xpath= "//a[contains(text(),'Change Password')]")
	private WebElement lnkPasswordChange;
	
	@FindBy(xpath= "//div[@class='proile-heading']")
	private WebElement txtProileHeading;
	
	public ChangePasswordPage(WebDriver driver) 
	{
		setWebDriver(driver);
	}
	
	public Boolean ClickOnPasswordChangeLink()
	{
		jsExecutorscrollIntoView(lnkPasswordChange);
		if(lnkPasswordChange.isDisplayed() && lnkPasswordChange.isEnabled())
		{
			lnkPasswordChange.click();
		}
		return getPasswordChange();
	}
	public Boolean getPasswordChange()
	{
		return txtProileHeading.isDisplayed();
	}
	
	
}
