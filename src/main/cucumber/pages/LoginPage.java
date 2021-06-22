package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;

public class LoginPage extends PageBase
{
	//Page Elements
	
		@FindBy(xpath= "//a[@class='nav-link dropdown-toggle']")
		WebElement selectLogin;
	
		@FindBy(xpath= "//input[@id='email']")
		WebElement txtBoxEmail;
		
		@FindBy(xpath= "//input[@id='password']")
		WebElement txtBoxPassword;
		
		@FindBy(xpath= "//label[contains(text(),'Remember Me!')]")
		WebElement CheckBoxRememberMe;
		
		@FindBy(xpath = "//input[@value='Sign in']")
		WebElement btnSignIn;
		
		@FindBy(xpath = "//h2[contains(text(),'Welcome back, dap custo')]")
		WebElement ProfileName;
		
		
		public LoginPage(WebDriver driver) 
		{
			setWebDriver(driver);
		}
		
		
		public void selectLogin()
		{
			if(selectLogin.isEnabled() && selectLogin.isDisplayed()) 
			   { 
				Select select = new Select(selectLogin);
				select.selectByVisibleText("Tutor Login"); 
			   } 
			  else 
			  { 
			       
			  } 
		}

		public void enterEmailandPassword(String userNAme, String PAssword)throws InterruptedException
		{
			waitForElementToAppear(txtBoxEmail);
			if(txtBoxEmail.isDisplayed()) 
			{
				txtBoxEmail.click();
				txtBoxEmail.sendKeys(userNAme);
			}
			
			waitForElementToAppear(txtBoxPassword);
			if(txtBoxPassword.isDisplayed()) 
			{
				txtBoxPassword.click();
				txtBoxPassword.sendKeys(PAssword);
			}
		}
		
		
		public void ClickOnCheckBox()throws InterruptedException
		{
			waitForElementToAppear(CheckBoxRememberMe);
			if(CheckBoxRememberMe.isDisplayed()) 
			{
				CheckBoxRememberMe.click();
			}
		}
		
		public SkedioHomePage signIn(String userName, String Password)throws InterruptedException
		{
			
				enterEmailandPassword(userName,Password);
				ClickOnCheckBox();
				waitForElementToAppear(btnSignIn);
				btnSignIn.click();
				if(validateSignIn().equalsIgnoreCase("skiedo"))
					return new SkedioHomePage(pbDriver);
				else
					return null;
		}
		
		public String validateSignIn() throws InterruptedException 
		{
			Thread.sleep(2000);
			return pbDriver.getTitle();
		}
}