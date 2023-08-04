package com.automationTest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automationTest.operations.RegisterUser;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class ContactUsPage extends BasePage implements TestPage {
	
	
	
	
	@FindBy(xpath="//*[contains(text(),'Contact us')]")
	WebElement ContactUs;
	

	@FindBy(xpath="//input[@placeholder='Enter your name.']")
	WebElement Name;

	@FindBy(xpath="//input[@placeholder='Enter your email address.']")
	WebElement Email;

	@FindBy(id="Enquiry")
	WebElement Enquiry;
	
	@FindBy(xpath="//button[@class='button-1 contact-us-button']")
	WebElement Submitbtn;
	
	@FindBy(xpath="//div[@class='result']")
	WebElement ConfirmationMessage;
	
	
	
	public ContactUsPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public ContactUsPage ClickonContactUs()
	
	{
		wait.until(ExpectedConditions.visibilityOf(ContactUs));
		ContactUs.click();
		return this;
	}
	
   public ContactUsPage EnterName()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Name));
		Name.clear();
		Name.sendKeys("Sanket Sabane");
		return this;
	}
   
   public ContactUsPage EnterEmail()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(Email));
 		Email.clear();
 		Email.sendKeys("sankysabane@gmail.com");
 		return this;
 	}
   
   public ContactUsPage EnterEnquiry()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Enquiry));
		Enquiry.sendKeys("Hi,How to take premium verion of opencart application?");
		return this;
	}
   
   public ContactUsPage ClickonSubmitButton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Submitbtn));
		Submitbtn.click();
		return this;
	}
	
   public ContactUsPage GetConfirmationMessage(String EnquirySentMessage)
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(ConfirmationMessage));
  		EnquirySentMessage= ConfirmationMessage.getText();
 		System.out.println(EnquirySentMessage);
       String ExpectedMessage = "Your enquiry has been successfully sent to the store owner.";		
		Assert.assertEquals(EnquirySentMessage, ExpectedMessage);
 		return this;
  	}
 	
}
