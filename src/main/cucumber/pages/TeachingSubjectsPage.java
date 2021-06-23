package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class TeachingSubjectsPage extends PageBase{
	
	@FindBy(xpath = "//a[contains(text(),'Teaching Subjects')]")
	public WebElement lnkSubjects;
	
	@FindBy(xpath = "//div[contains(text(),'My Subjects')]")
	public WebElement txtPageTitle;
	
	public TeachingSubjectsPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	public void selectTabTeaching() throws Throwable 
	{
		waitDriver();
		if (lnkSubjects.isDisplayed()) 
		{
			lnkSubjects.click();
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
