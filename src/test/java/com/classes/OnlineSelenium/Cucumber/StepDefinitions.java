package com.classes.OnlineSelenium.Cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.SignOut;
import pages.SignUpPage;

import static org.junit.Assert.*;

import org.junit.Assert;

import base.TestBase;

public class StepDefinitions extends TestBase {
	
	SignOut objsggnOut;
	
	
	
	
	@Given("I am at the login form")
	public void i_am_at_the_login_form() throws Throwable {
		System.out.println("Starting the browser and navigate to Login page");
		//Starting the browser and navigate to Registration page
		launchApplication("https://skiedo.com/tutor");
		
	}

	@When("I enter {string}, {string}")
	public void i_enter(String string3, String string4) throws Throwable {
		//Enter values to register
		LoginPage pblogin = new LoginPage(driver);
		pblogin.signIn(string3, string4);

		System.out.println(string3);
		System.out.println(string4);
	}

	@Then("I should see the confirm email message on screen")
	public void i_should_see_the_confirm_email_message_on_screen() {
		//Should get the email verification screen
		System.out.println("Should get the email verification screen");

	}

	@And("The title should be confirm you email id")
	public void the_title_should_be_verfiy_you_email_id() {
		System.out.println("I want to write a step with name9");
	}
	
	@Then("I should click on SignOut button")
	public void i_should_click_on_SignOut_button() {
		//Should get the email verification screen
		 objsggnOut = new SignOut(driver);
		 objsggnOut.sigNOutPerform();

	}

	@And("The SignOut Verfication message will come")
	public void the_SignOut_Verfication_message_will_come() {
		try {
		Assert.assertEquals(true, objsggnOut.signOutVerfy());
		System.out.println("Successfully Signout");
		}catch (Exception E) {
			System.out.println("Failed to Signout");
		}
		driver.close();
	}
	
	
	
	//Signup methods 

	@Given("Guest am at the Registration form of {string}")
	public void guest_am_at_the_registration_form_of(String string) throws Throwable {
		launchApplication(string);
	}
	
	@When("Guest enter {string}, {string}, {string}, {string}")
	public void guest_enter(String string, String string2, String string3, String string4) throws Throwable {
		System.out.println("Guest entering details");
		SignUpPage pgSignUp = new SignUpPage(driver);
		pgSignUp.enrollAsStudent(string, string2, string3, string4);
	}
	
	@Then("Guest should see the Validate email message on screen")
	public void guest_should_see_the_validate_email_message_on_screen() {
		System.out.println("Guest should see the Validate email message on screen");
	}
	
	@And("The title should be verfiy you email id")
	public void The_title_should_be_verfiy_you_email_id() {
		System.out.println("The title should be verfiy you email id");
		driver.close();
	}

	
	





}
