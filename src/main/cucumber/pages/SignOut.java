package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.PageBase;

public class SignOut extends PageBase {
	
	
	@FindBy(xpath= "//a[normalize-space()='Sign Out']")
	WebElement signOutBtn;

	@FindBy(xpath= "//button[@type='button'][normalize-space()='Yes']")
	WebElement signOutYesBtn;
	
	@FindBy(xpath= "//h2[normalize-space()='Do you know?']")
	WebElement signOutMessage;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-block session-box']")
	WebElement signOutVerifcation;
	
	public SignOut(WebDriver driver) 
	{
		setWebDriver(driver);
	}

	public void sigNOutPerform() {
		
		
		signOutBtn.click();
		
		if(signOutMessage()) {
			signOutYesBtn.click();
		}
		
		
	}
	
	public boolean signOutMessage() {
		return signOutMessage.isDisplayed();
	}
	
	public boolean signOutVerfy() {
		return signOutVerifcation.isDisplayed();
	}
}
