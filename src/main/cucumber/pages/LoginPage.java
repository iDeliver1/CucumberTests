package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;
import utils.TestUtil;

public class LoginPage extends PageBase
{
	//Page Elements
	@FindBy(xpath= "//button[@class='btn-close']")
    WebElement btnClose;
	
		@FindBy(xpath= "//a[@class='nav-link dropdown-toggle']")
		WebElement navSelectLogin;
	
		@FindBy(xpath= "//input[@id='email']")
		WebElement txtBoxEmail;
		
		@FindBy(xpath= "//input[@id='password']")
		WebElement txtBoxPassword;
		
		@FindBy(xpath= "//label[contains(text(),'Remember Me!')]")
		WebElement chkBoxRememberMe;
		
		@FindBy(xpath = "//input[@value='Sign in']")
		WebElement btnSignIn;
		
		@FindBy(xpath = "//h2[contains(text(),'Welcome back, dap custo')]")
		WebElement lblProfileName;
		
		
		public LoginPage(WebDriver driver) 
		{
			setWebDriver(driver);
		}
		
		public void clickOnLoginType() {
			waitForElementToAppear(navSelectLogin);
			navSelectLogin.click();
			
		}
		
		public void selectLoginType(String strLoginType) {
			try {
				pbDriver.findElement(By.xpath("//a[normalize-space()='" + strLoginType + " Login']")).click();
			}catch(Throwable t) {
				System.out.println(t.getLocalizedMessage());
			}
			
			
		}
		
		
		
		public void enterEmail(String strEmail) {
			waitForElementToAppear(txtBoxEmail);
			txtBoxEmail.sendKeys(strEmail);
		}
		
		public void enterPassword(String strPassword) {
			waitForElementToAppear(txtBoxPassword);
			txtBoxPassword.sendKeys(strPassword);
		}
		
		public void clickOnChkBoxRememberMe() {
			waitForElementToAppear(chkBoxRememberMe);
			chkBoxRememberMe.click();
		}
		
		public void clickOnbtnSignIn() {
			waitForElementToAppear(btnSignIn);
			btnSignIn.click();
		}
		
		

		public SkedioHomePage signInSkedio(String pLoginType, String pUserNAme, String pPssword)throws Throwable
		{
			waitForPageLoad();
			
			if (btnClose.isDisplayed()) 
			{
				btnClose.click();
			}
			
			
			//clickOnLoginType();
			TestUtil.mouseHover(navSelectLogin);
			selectLoginType(pLoginType);
			waitForPageLoad();
			enterEmail(pUserNAme);
			enterPassword(pPssword);
			clickOnChkBoxRememberMe();
			clickOnbtnSignIn();
			waitForPageLoad();
			return new SkedioHomePage(pbDriver);
		}
		
		
		
}