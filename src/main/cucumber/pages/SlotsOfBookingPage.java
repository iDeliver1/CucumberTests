package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SlotsOfBookingPage extends PageBase{
	
	@FindBy(xpath = "//a[contains(text(),'Slots of Booking')]")
	public WebElement lnkSlots;
	
	@FindBy(xpath = "//div[contains(text(),'Slots List')]")
	public WebElement txtPageTitle;
	
	public SlotsOfBookingPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	public void selectTabBooking() throws Throwable 
	{
		waitDriver();
		if (lnkSlots.isDisplayed()) 
		{
			lnkSlots.click();
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

