package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MyEducationPage extends PageBase{

	@FindBy(xpath = "//a[contains(text(),'My Education')]")
	public WebElement lnkEducation;
	
	@FindBy(xpath = "//div[contains(text(),'Education')]")
	public WebElement txtPageTitle;
		
	public MyEducationPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	public void selectTabEducation() throws Throwable 
	{
		waitDriver();
		if (lnkEducation.isDisplayed()) 
		{
			lnkEducation.click();
			Thread.sleep(5000);
		}
	}
	
	public Object validateSelectionTab() throws Throwable
	{
		waitDriver();
		if (txtPageTitle.isDisplayed()) {
			return new SkedioHomePage(pbDriver);
		}
		else
		{
			return null;
		}	
	}
}
