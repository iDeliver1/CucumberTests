package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MyEarningsPage extends PageBase {
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[4]")
	public WebElement btnMyEarnings;
	@FindBy(xpath = "//div[contains(text(),'Payment Statistics')]")
	public WebElement txtPstatistics;
	
	public MyEarningsPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	public Boolean validate() {
		return txtPstatistics.isDisplayed() ;
		
	}
	
	public boolean btnMyEarnings() throws Throwable {
		btnMyEarnings.click();
		if(validate()==true)
			return true;
		else
			return false;
		
	}

}
