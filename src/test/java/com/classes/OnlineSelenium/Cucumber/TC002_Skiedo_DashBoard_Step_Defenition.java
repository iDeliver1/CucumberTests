package com.classes.OnlineSelenium.Cucumber;



import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChatsPage;
import pages.MyEarningsPage;
import pages.MybasicInformationPage;
import pages.NotificationsPage;
import pages.SkedioHomePage;
import pages.TutoringPreferencesPage;

public class TC002_Skiedo_DashBoard_Step_Defenition  extends TestBase
{
	SkedioHomePage objHome;
	NotificationsPage objNoti;
	ChatsPage objChat;
	MyEarningsPage objearn;
	TutoringPreferencesPage objTut;
	MybasicInformationPage objBasic;
	
	
	@Given("Tutor at the dashboard page")
	public void tutor_at_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
		objHome = TC001_Skiedo_Login_Step_Defination.pbHomePage;
	}
	
	
	@When("Tutor should click   {string}")
	public void tutor_should_click(String string) {
	  
		objNoti = 	(NotificationsPage) objHome.clickOnTab(string);
	}

	@Then("Tutor should see the notifications Page")
	public void tutor_should_see_the_notifications_page() throws Throwable {
	   Assert.assertEquals(true, objNoti.lblNotifications());
	   
	}
	
	@And("Tutuor is on Notification Page")
	public void tutuor_is_on_notification_page() {
	   System.out.println("Heelloooooo");
	}
	

	
	
	@When("Tutor should click Chat Page  {string}")
	public void tutor_should_click_chat_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		objChat = (ChatsPage) objHome.clickOnTab(string);
	}

	@Then("Tutor should see the chats Page")
	public void tutor_should_see_the_chats_page() throws Throwable {
		  Assert.assertEquals(true, objChat.lblChats());
		  
	}


	
	
	@When("Tutor should click   my earnings Page {string}")
	public void tutor_should_click_my_earnings_page(String string) {
		objearn = (MyEarningsPage) objHome.clickOnTab(string);
	}


	@Then("Tutor should see the my earnings Page")
	public void tutor_should_see_the_my_earnings_page() throws Throwable {
	
		Assert.assertEquals(true, objearn.lblMyEarnings());
	}
	
	

	
	@When("Tutor should click  my basic information Page {string}")
	public void tutor_should_click_my_basic_information_page(String string) {
		objBasic = (MybasicInformationPage) objHome.clickOnTab(string);
	}

	@Then("Tutor should see the my basic information Page")
	public void tutor_should_see_the_my_basic_information_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(true, objBasic.lblMybasicinformation());
	}
	
	
	
	@When("Tutor should click  my tutoring preferences Page {string}")
	public void tutor_should_click_my_tutoring_preferences_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		objTut = 	(TutoringPreferencesPage) objHome.clickOnTab(string);
	}
	
	
	@Then("Tutor should see the my tutoring preferences Page")
	public void tutor_should_see_the_my_tutoring_preferences_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, objTut.lblTutorText());
		closeBrowser();
	}
	

	

	

	

	
	
	

}