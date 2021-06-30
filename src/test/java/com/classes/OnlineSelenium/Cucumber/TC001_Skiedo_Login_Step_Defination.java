package com.classes.OnlineSelenium.Cucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SkedioHomePage;


import org.junit.Assert;

import base.TestBase;

public class TC001_Skiedo_Login_Step_Defination extends TestBase {
	
	LoginPage pblogin;
	public static SkedioHomePage pbHomePage;

	@Given("I am at the login form")
	public void i_am_at_the_login_form() throws Throwable {
		System.out.println("Starting the browser and navigate to Login page");
		//Starting the browser and navigate to Registration page
		launchApplication("https://skiedo.com");
		
	}

	
	@When("I enter {string}, {string}")
	public void i_enter(String string3, String string4) throws Throwable {
		//Enter values to register
		 pblogin = new LoginPage(driver);
		 pbHomePage = pblogin.signInSkedio("Tutor",string3,string4);
	}

	@Then("I should see the confirm email message on screen")
	public void i_should_see_the_confirm_email_message_on_screen() {
		Assert.assertNotNull(pbHomePage);
	}

	
	
	






}
