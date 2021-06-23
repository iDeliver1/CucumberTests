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
		WebElement lnkBlogs;
		
		@FindBy(xpath= "//h2[contains(text(),'My Blogs')]")
		WebElement myBlogs;
	

		public MyBlogsPage(WebDriver driver) 
		{
			setWebDriver(driver);
		}
		
		public Boolean getMyBlogs()
		{
			JavascriptExecutor js = (JavascriptExecutor) pbDriver;
			if(lnkBlogs.isDisplayed() && lnkBlogs.isEnabled())
			{
				lnkBlogs.click();
			    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
			return myBlogs.isDisplayed();
		}

}
