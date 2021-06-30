package pages;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SkedioHomePage extends PageBase {
	
@FindBy(xpath = " //label[contains(text(),'Active')]")
public WebElement btnActive;

@FindBy(xpath = " //div[contains(text(),'My Schedules')] ")
public WebElement lnkMySchedules;

@FindBy(xpath = "//a[contains(text(),'Notifications')]")
public WebElement lnkNotifications;

@FindBy(xpath = "//a[contains(text(),'Chats')]")
public WebElement lnkChats;

@FindBy(xpath = "//a[contains(text(),'My Earnings')]")
public WebElement lnkMyEarnings;

@FindBy(xpath = "//a[contains(text(),'My Basic information')]")
public WebElement lnkMyBasicinformation;

@FindBy(xpath = "//a[contains(text(),'Tutoring preferences')]")
public WebElement lnkTutoringpreferences;

@FindBy(xpath = "//a[contains(text(),'My Education')]")
public WebElement lnkMyEducation;

@FindBy(xpath = "//a[contains(text(),'Teaching Subjects')]")
public WebElement lnkTeachingSubjects;

@FindBy(xpath = "//a[contains(text(),'Slots of Booking')]")
public WebElement lnkSlotsofBooking;

@FindBy(xpath = "//a[contains(text(),'My Blogs')]")
public WebElement lnkMyBlogs;

@FindBy(xpath = "//a[contains(text(),'Change Password')]")
public WebElement lnkChangePassword;

@FindBy(xpath = "//a[contains(text(),'Bank Details')]")
public WebElement lnkBankDetails;

@FindBy(xpath = "//a[contains(text(),'FAQs')]")
public WebElement lnkFAQs;


public SkedioHomePage(WebDriver driver) {
	setWebDriver(driver);
	
}

public boolean validateProfile() {
	return btnActive.isDisplayed(); 
}

public boolean btnActive() throws Throwable {
	if(lnkMySchedules.isDisplayed() && lnkMySchedules.isEnabled())
	{
		
	}
	if(validateProfile()==true)
		return true;
	else
		return false;
	
}

public Object clickOnTab(String tabName) {
	switch (tabName) {
	case "Notifications" 
			: lnkNotifications.click();
	return new NotificationsPage(pbDriver);
	
	case "Chats" 
	: lnkChats.click();
return new ChatsPage(pbDriver);

	case "My Earnings" 
	: lnkMyEarnings.click();
return new MyEarningsPage(pbDriver);

	case "My Basic Information" 
	: lnkMyBasicinformation.click();
return new MybasicInformationPage(pbDriver);

	case "Tutoring Preferences" 
	: lnkTutoringpreferences.click();
return new TutoringPreferencesPage(pbDriver);
   
	default:
		return null;
		
	}
	
	
	
}


}