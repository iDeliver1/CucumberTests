package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SkedioHomePage extends PageBase {
	
@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[3]/div[1]/button[1]/p[1]")
public WebElement btnSubject;

@FindBy(xpath = "//a[contains(text(),'Math')]")
public WebElement ddMath;

@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
public WebElement cbDmath;

public SkedioHomePage(WebDriver driver) {
	setWebDriver(driver);
	
}

public boolean validate() {
	return btnSubject.isDisplayed(); 
}

public boolean btnSubject() throws Throwable {
	btnSubject.click();
	ddMath.click();
	cbDmath.click();
	if(validate()==true)
		return true;
	else
		return false;
	
}


}