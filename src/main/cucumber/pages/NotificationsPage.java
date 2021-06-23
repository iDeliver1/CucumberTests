package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class NotificationsPage extends PageBase{
	@FindBy(xpath = "//a[contains(text(),'Notifications')]")
	public WebElement btnNotifications;
	@FindBy(xpath = "//div[contains(text(),'Notifications')]")
	public WebElement txtNotifications;
	//div[contains(text(),'Notifications')]
	
	public NotificationsPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
 public Boolean validate() {
	return txtNotifications.isDisplayed() ;
	
}
 public boolean btnNotifications() throws Throwable {
	 btnNotifications.click();
	 if(validate()==true)
			return true;
		else
			return false;
	
}
}
