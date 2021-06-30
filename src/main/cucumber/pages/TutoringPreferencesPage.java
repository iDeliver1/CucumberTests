package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class TutoringPreferencesPage extends PageBase{
	
	//Page Elements	
	@FindBy(xpath = "//a[contains(text(),'Tutoring preferences')]")
	public WebElement lnkTutoring;

	@FindBy(xpath = "//div[contains(text(),'Tutoring preferences')]")
	public WebElement txtPageTitle;
	
	//Constructor
	public TutoringPreferencesPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	//Methods
	public void selectTabTutoring() throws Throwable 
	{
		waitDriver();
		if (lnkTutoring.isDisplayed()) 
		{
			lnkTutoring.click();
			Thread.sleep(5000);
		}
	}
	
	public boolean lblTutorText() throws Throwable
	{
		waitDriver();
		if (txtPageTitle.isDisplayed()) {
			return true;
		}
		else
		{
			return false;
		}	
	}

}
