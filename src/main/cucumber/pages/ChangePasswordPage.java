package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class ChangePasswordPage extends PageBase 
{
	//Page Elements
	@FindBy(xpath= "//a[@href='https://skiedo.com/tutor/password/change']")
	WebElement passwordChange;
	
	@FindBy(xpath= "//div[@class='proile-heading']")
	WebElement proileHeading;
	
	public ChangePasswordPage(WebDriver driver) 
	{
		setWebDriver(driver);
	}
	
	public Boolean getPasswordChange()
	{
		JavascriptExecutor js = (JavascriptExecutor) pbDriver;
		if(passwordChange.isDisplayed() && passwordChange.isEnabled())
		{
			passwordChange.click();
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		return proileHeading.isDisplayed();
	}
	
	
}
