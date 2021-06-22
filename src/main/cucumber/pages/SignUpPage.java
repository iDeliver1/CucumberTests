package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;

public class SignUpPage extends PageBase{
	
	//Page Elements
	
	@FindBy(xpath = "//iframe[contains(@name,'blank_')]")
	public WebElement btnPopUp;
	
	@FindBy(xpath = "//a[contains(text(),'Enroll Now')]")
	public WebElement btnEnrollNow;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement txtBoxFirstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement txtBoxLastName;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement txtBoxEmail;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement txtBoxPasword;
	
	@FindBy(xpath = "//label[@for='check1']")
	public WebElement chkBoxStdIAgree;
	
	@FindBy(xpath = "//label[@for='check1']")
	public WebElement chkBoxTutorIAgree;
	
	@FindBy(xpath = "//input[@id='submitbutton']")
	public WebElement btnRegister;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
	public WebElement txtRegisterSuccess;
	
	@FindBy(xpath = "//a[contains(text(),'Become a Tutor')]")
	public WebElement selectTutorBtn1;
	
	@FindBy(xpath = "//a[contains(text(),'Signup as a Tutor')]")
	public WebElement selectTutorBtn2;
	
	//Constructor
	
	public SignUpPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	//Page methods
	
	public void enrollAsStudent(String FirstName, String LastName, String Email, String Password) throws Throwable{
		waitDriver();
		
		/*if (btnPopUp.isEnabled() && btnPopUp.isDisplayed())
		{
			btnPopUp.click();
		}
		
		if (btnEnrollNow.isEnabled() && btnEnrollNow.isDisplayed())
		{
			btnEnrollNow.click();
		}
		waitDriver();
		*/
		fillRegistrationDetails(FirstName, LastName, Email, Password, chkBoxStdIAgree);	
	}
	
	public void enrollAsTutor(String FirstName, String LastName, String Email, String Password) throws Throwable{
		waitDriver();
		
		/*if (btnPopUp.isEnabled() && btnPopUp.isDisplayed())
		{
			btnPopUp.click();
		}
		
		if(selectTutorBtn1.isEnabled() && selectTutorBtn1.isDisplayed()) 
		   {
			selectTutorBtn1.click();
			waitDriver();
			selectTutorBtn2.click();
		   }
		waitDriver();
		*/
		fillRegistrationDetails(FirstName, LastName, Email, Password, chkBoxTutorIAgree);
	}
	
	public void fillRegistrationDetails(String FirstName, String LastName, String Email, String Password, WebElement chkBox) throws Throwable {
		
		txtBoxFirstName.click();
		txtBoxFirstName.sendKeys(FirstName);
		//waitDriver();
		
		txtBoxLastName.click();
		txtBoxLastName.sendKeys(LastName);
		//waitDriver();
		
		txtBoxEmail.click();
		txtBoxEmail.sendKeys(Email);
		//waitDriver();
		
		txtBoxPasword.click();
		txtBoxPasword.sendKeys(Password);
		waitDriver();
		
		chkBox.click();
		waitDriver();
		
		btnRegister.click();
	}
	


}
