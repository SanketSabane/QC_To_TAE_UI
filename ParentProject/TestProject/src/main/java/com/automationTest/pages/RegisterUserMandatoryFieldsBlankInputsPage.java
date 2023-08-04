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

public class RegisterUserMandatoryFieldsBlankInputsPage extends BasePage implements TestPage {
	
	
	//RegisterUser Mandatory
	
	@FindBy(xpath="//a[@href='/register?returnUrl=%2F']")               
	WebElement TopRegisterbtn;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement RegisterButton;
	
	@FindBy(xpath="//span[@id='FirstName-error']")
	private WebElement BlankFirstNameError;
	
	@FindBy(xpath="//span[@id='LastName-error']")
	WebElement BlankLastNameError;
	
	@FindBy(xpath="//span[@id='Email-error']")
	WebElement BlankEmailError;
	
	@FindBy(xpath="//span[@id='Password-error']")
	WebElement BlankPasswordError;
	
	@FindBy(xpath="//span[@id='ConfirmPassword-error']")
	WebElement BlankConfirmPasswordError;
	
	
	public RegisterUserMandatoryFieldsBlankInputsPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public RegisterUserMandatoryFieldsBlankInputsPage ClickonTopRegisterbutton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(TopRegisterbtn));
		TopRegisterbtn.click();
		return this;
	}
	
    public RegisterUserMandatoryFieldsBlankInputsPage ClickFinalRegisterbtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RegisterButton));
		RegisterButton.click();
		return this;
	}
    
    public RegisterUserMandatoryFieldsBlankInputsPage GetBlankFirstNameError(String BlankFname) throws InterruptedException
	
 	{
    	Thread.sleep(5000);
 		wait.until(ExpectedConditions.visibilityOf(BlankFirstNameError));
 		BlankFname = BlankFirstNameError.getText();
 		System.out.println(BlankFname);
 		String ExpectedMessage = "First name is required.";		
 		Assert.assertEquals(BlankFname, ExpectedMessage);
 		return this;
 	}
    
  public RegisterUserMandatoryFieldsBlankInputsPage GetBlankLastNameError(String BlankLname) throws InterruptedException
	
 	{
    	Thread.sleep(5000);
 		wait.until(ExpectedConditions.visibilityOf(BlankLastNameError));
 		BlankLname = BlankLastNameError.getText();
 		System.out.println(BlankLname);
 		String ExpectedMessage = "Last name is required.";		
 		Assert.assertEquals(BlankLname, ExpectedMessage);
 		return this;
 	}
 
   public RegisterUserMandatoryFieldsBlankInputsPage GetBlankEmailError(String BlankEmail) 
	
	{
 	
		wait.until(ExpectedConditions.visibilityOf(BlankEmailError));
		BlankEmail = BlankEmailError.getText();
		System.out.println(BlankEmail);
		String ExpectedMessage = "Email is required.";		
		Assert.assertEquals(BlankEmail, ExpectedMessage);
		return this;
	}
   
   public RegisterUserMandatoryFieldsBlankInputsPage GetBlankPasswordError(String BlankPassword) 
	
  	{
   	
  		wait.until(ExpectedConditions.visibilityOf(BlankPasswordError));
  		BlankPassword = BlankPasswordError.getText();
  		System.out.println(BlankPassword);
  		String ExpectedMessage = "Password is required.";		
  		Assert.assertEquals(BlankPassword, ExpectedMessage);
  		return this;
  	}
   
   
   public RegisterUserMandatoryFieldsBlankInputsPage GetConfmBlankPasswordError(String ConfmBlankPassword) 
	
 	{
  	
 		wait.until(ExpectedConditions.visibilityOf(BlankConfirmPasswordError));
 		ConfmBlankPassword = BlankConfirmPasswordError.getText();
 		System.out.println(ConfmBlankPassword);
 		String ExpectedMessage = "Password is required.";		
 		Assert.assertEquals(ConfmBlankPassword, ExpectedMessage);
 		return this;
 	}
  
	
}
