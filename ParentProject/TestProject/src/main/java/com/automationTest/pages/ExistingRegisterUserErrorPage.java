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

public class ExistingRegisterUserErrorPage extends BasePage implements TestPage {
	
	
	
	
	@FindBy(xpath="//a[@href='/register?returnUrl=%2F']")               
	WebElement TopRegisterbtn;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement Male;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstNameUser;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastNameUser;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement day;
	//Select day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement  Month;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement Year;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Emailid;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement CompanyName;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement PasswordSet;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement RegisterButton;

	@FindBy(xpath="//a[@class='button-1 register-continue-button']")
	WebElement continueButton;
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
	WebElement ExistingUser;
	
	
	public ExistingRegisterUserErrorPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public ExistingRegisterUserErrorPage ClickonTopRegisterbutton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(TopRegisterbtn));
		TopRegisterbtn.click();
		return this;
	}
	
   
	public ExistingRegisterUserErrorPage Selectgender()
	{
		wait.until(ExpectedConditions.visibilityOf(Male));
		Male.click();
		return this;
		
	}
	
	
	public ExistingRegisterUserErrorPage FirstNameofUser()
	{
		wait.until(ExpectedConditions.visibilityOf(FirstNameUser));
		FirstNameUser.sendKeys("sanket");
		return this;
		
	}
	
	public ExistingRegisterUserErrorPage LastNameofUser()
	{
		wait.until(ExpectedConditions.visibilityOf(LastNameUser));
		LastNameUser.sendKeys("sabane");
		return this;
		
	}
	
	
	 public ExistingRegisterUserErrorPage SelectDayOfDateOfBirth (String DayS)
     {
    	 
    	Select Day=new Select(day);
    	Day.selectByValue(DayS);
    	return this;
     }
     
     public ExistingRegisterUserErrorPage SelectMonthOfDateOfBirth (String MonthS)
     {
    	 
    	Select Day=new Select(Month);
    	Day.selectByValue(MonthS);
    	return this;
     }

     
     public ExistingRegisterUserErrorPage SelectYearOfDateOfBirth (String YearS)
     {
    	 
    	Select Day=new Select(Year);
    	Day.selectByValue(YearS);
    	return this;
     }
     
 	
 	
 	 public ExistingRegisterUserErrorPage EnterEmailId() 
 	
 	{
  	
 		wait.until(ExpectedConditions.visibilityOf(Emailid));
 		Emailid.sendKeys("sankysabane@gmail.com");
 		return this;
 	}
 	 
 	 
 	public ExistingRegisterUserErrorPage EnterCompanyName()
 	{
 		wait.until(ExpectedConditions.visibilityOf(CompanyName));
 		CompanyName.sendKeys("Globant");
 		return this;
 		
 	}
	
	public ExistingRegisterUserErrorPage EnterPaassword()
 	{
 		wait.until(ExpectedConditions.visibilityOf(PasswordSet));
 		PasswordSet.sendKeys("sanket@123");
 		return this;
 		
 	}
	
	
	public ExistingRegisterUserErrorPage ConfirmPaassword()
 	{
 		wait.until(ExpectedConditions.visibilityOf(ConfirmPassword));
 		ConfirmPassword.sendKeys("sanket@123");
 		return this;
 		
 	}
	
	
	public ExistingRegisterUserErrorPage ClickFinalRegisterbtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RegisterButton));
		RegisterButton.click();
		return this;
	}
	
    public ExistingRegisterUserErrorPage ClickContinuerbtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(continueButton));
		continueButton.click();
				
		return this;
	}
	
	 public ExistingRegisterUserErrorPage GetAlreadyRegisterUserError(String ExistingRegisterUserError) 
	 	
	 	{
	  	
	 		wait.until(ExpectedConditions.visibilityOf(ExistingUser));
	 		ExistingRegisterUserError = ExistingUser.getText();
	 		System.out.println(ExistingRegisterUserError);
	 		String ExpectedMessage = "The specified email already exists";		
	 		Assert.assertEquals(ExistingRegisterUserError, ExpectedMessage);
	 		return this;
	 	}

}
