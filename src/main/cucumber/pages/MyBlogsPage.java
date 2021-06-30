package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MyBlogsPage extends PageBase
{
	//Page Elements
	
		@FindBy(xpath= "//a[@href='https://skiedo.com/tutor/blogs']")
		private WebElement lnkBlogs;
		
		@FindBy(xpath= "//h2[contains(text(),'My Blogs')]")
		private WebElement txtMyBlogs;
	

		public MyBlogsPage(WebDriver driver) 
		{
			setWebDriver(driver);
		}
		
		public Boolean ClickOnMyBlogs()
		{
			jsExecutorscrollIntoView(lnkBlogs);
			if(lnkBlogs.isDisplayed() && lnkBlogs.isEnabled())
			{
				lnkBlogs.click();
			}
			return getMyBlogs();
		}
		public Boolean getMyBlogs()
		{
			return txtMyBlogs.isDisplayed();
		}

}
