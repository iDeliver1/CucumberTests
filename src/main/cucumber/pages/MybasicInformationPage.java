package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MybasicInformationPage extends PageBase {
	
	@FindBy(xpath = "//a[contains(text(),'My Basic information')]")
	public WebElement btnMybasicinformation;
	
	@FindBy(xpath = "//div[contains(text(),'My Basic Information')]")
	public WebElement txtMybasicinformation;
	
	public MybasicInformationPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	public boolean validate() {
		return txtMybasicinformation.isDisplayed();
		
		
	}
	public boolean btnMybasicinformation() {
		btnMybasicinformation.click();
		if(validate()==true)
			return true;
		else
			return false;
		
		
	}

}
