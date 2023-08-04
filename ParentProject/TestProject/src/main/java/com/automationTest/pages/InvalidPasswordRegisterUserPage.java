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

public class InvalidPasswordRegisterUserPage extends BasePage implements TestPage {
	
	
	
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
	
	@FindBy(xpath="//span[@class='field-validation-error']")
	WebElement InvalidPassword;
	
	
	public InvalidPasswordRegisterUserPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public InvalidPasswordRegisterUserPage ClickonTopRegisterbutton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(TopRegisterbtn));
		TopRegisterbtn.click();
		return this;
	}
	
   
	public InvalidPasswordRegisterUserPage Selectgender()
	{
		wait.until(ExpectedConditions.visibilityOf(Male));
		Male.click();
		return this;
		
	}
	
	
	public InvalidPasswordRegisterUserPage FirstNameofUser()
	{
		wait.until(ExpectedConditions.visibilityOf(FirstNameUser));
		FirstNameUser.sendKeys("sanket");
		return this;
		
	}
	
	public InvalidPasswordRegisterUserPage LastNameofUser()
	{
		wait.until(ExpectedConditions.visibilityOf(LastNameUser));
		LastNameUser.sendKeys("sabane");
		return this;
		
	}
	
	
	 public InvalidPasswordRegisterUserPage SelectDayOfDateOfBirth (String DayS)
     {
    	 
    	Select Day=new Select(day);
    	Day.selectByValue(DayS);
    	return this;
     }
     
     public InvalidPasswordRegisterUserPage SelectMonthOfDateOfBirth (String MonthS)
     {
    	 
    	Select Day=new Select(Month);
    	Day.selectByValue(MonthS);
    	return this;
     }

     
     public InvalidPasswordRegisterUserPage SelectYearOfDateOfBirth (String YearS)
     {
    	 
    	Select Day=new Select(Year);
    	Day.selectByValue(YearS);
    	return this;
     }
     
 	
 	
 	 public InvalidPasswordRegisterUserPage EnterEmailId() 
 	
 	{
  	
 		wait.until(ExpectedConditions.visibilityOf(Emailid));
 		Emailid.sendKeys("sankysabane@gmail.com");
 		return this;
 	}
 	 
 	 
 	public InvalidPasswordRegisterUserPage EnterCompanyName()
 	{
 		wait.until(ExpectedConditions.visibilityOf(CompanyName));
 		CompanyName.sendKeys("Globant");
 		return this;
 		
 	}
	
	public InvalidPasswordRegisterUserPage EnterInvalidPaassword()
 	{
 		wait.until(ExpectedConditions.visibilityOf(PasswordSet));
 		PasswordSet.sendKeys("abc" + Keys.TAB);
 		return this;
 		
 	}
	
	
	 public InvalidPasswordRegisterUserPage GetInvalidPasswordError(String InvalidPasswordError) 
	 	
	 	{
	  	
	 		wait.until(ExpectedConditions.visibilityOf(InvalidPassword));
	 		InvalidPasswordError = InvalidPassword.getText();
	 		System.out.println(InvalidPasswordError);
	 		String ExpectedMessage = "Password must meet the following rules:\nmust have at least 6 characters";		
	 		Assert.assertEquals(InvalidPasswordError, ExpectedMessage);
	 		return this;
	 	}
   

}
