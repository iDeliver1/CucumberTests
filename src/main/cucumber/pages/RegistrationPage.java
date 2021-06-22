package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;

public class RegistrationPage extends PageBase{
	
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
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/form[1]/div[5]/div[1]/label[1]")
	public WebElement chkBoxStdIAgree;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/form[1]/div[5]/div[1]/div[1]/label[1]")
	public WebElement chkBoxTutorIAgree;
	
	@FindBy(xpath = "//input[@id='submitbutton']")
	public WebElement btnRegister;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
	public WebElement txtRegisterSuccess;
	
	@FindBy(xpath = "//a[contains(text(),'Become a Tutor')]")
	public WebElement selectTutorBtn1;
	
	@FindBy(xpath = "//body/div[2]/div[4]/div[1]/div[2]/div[1]/nav[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	public WebElement lnkTutorBtn2;
	
	@FindBy(xpath = "//body/div[2]/div[4]/div[1]/div[2]/div[1]/nav[1]/div[2]/ul[1]/li")
	public List<WebElement> lnkBar;
	
	@FindBy(xpath = "//body/div[2]/div[3]/button[1]")
	public WebElement btnPromoCode;
	
	//Constructor
	
	public RegistrationPage(WebDriver driver) {
		setWebDriver(driver);
	}
	
	//Page methods
	
	public void enrollAsStudent(String FirstName, String LastName, String Email, String Password) throws Throwable{
		waitDriver();
		
		btnPopUp.click();
		btnEnrollNow.click();
		waitDriver();
		
		fillRegistrationDetails(FirstName, LastName, Email, Password, chkBoxStdIAgree);	
	}
	
	public void enrollAsTutor(String FirstName, String LastName, String Email, String Password) throws Throwable{
		waitDriver();
//		btnPromoCode.click();
		btnPopUp.click();
		
		if(selectTutorBtn1.isEnabled() && selectTutorBtn1.isDisplayed()) 
		   { 
			Select select = new Select(selectTutorBtn1);
			select.selectByVisibleText("Signup as a Tutor");
		   }
		waitDriver();
		
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
