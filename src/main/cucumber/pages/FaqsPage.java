package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class FaqsPage extends PageBase {
	//Page Elements
			@FindBy(xpath= "//a[normalize-space()='FAQs']")
			WebElement faQs;

			@FindBy(xpath= "//div[@class='profile-heading']")
			WebElement profileFaqs;
			
			
	public FaqsPage(WebDriver driver)
	{
		setWebDriver(driver);
	}
	
	public Boolean getFaqs()
	{
		JavascriptExecutor js = (JavascriptExecutor) pbDriver;
		if(faQs.isDisplayed() && faQs.isEnabled())
		{
			faQs.click();
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		return profileFaqs.isDisplayed();
	}
}
