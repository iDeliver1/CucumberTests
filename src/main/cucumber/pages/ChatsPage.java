package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class ChatsPage extends PageBase{
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[3]")
	public WebElement btnChats;
	@FindBy(xpath = "//div[contains(text(),'Chat')]")
	public WebElement txtChat;
	
	public ChatsPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	public boolean validate() {
		return txtChat.isDisplayed();
		
		
	}
	
	public boolean lblChats() throws Throwable{
		btnChats.click();
		if(validate()==true)
			return true;
		else
			return false;
		
	}

}
