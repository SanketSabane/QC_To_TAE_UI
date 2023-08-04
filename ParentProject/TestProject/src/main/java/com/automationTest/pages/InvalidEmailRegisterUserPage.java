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

public class InvalidEmailRegisterUserPage extends BasePage implements TestPage {
	
	
	
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
	
	@FindBy(xpath="//span[@class='field-validation-error']")
	WebElement InvalidEmailId;
	
	
	
	public InvalidEmailRegisterUserPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public InvalidEmailRegisterUserPage ClickonTopRegisterbutton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(TopRegisterbtn));
		TopRegisterbtn.click();
		return this;
	}
	
   
	public InvalidEmailRegisterUserPage Selectgender()
	{
		wait.until(ExpectedConditions.visibilityOf(Male));
		Male.click();
		return this;
		
	}
	
	
	public InvalidEmailRegisterUserPage FirstNameofUser()
	{
		wait.until(ExpectedConditions.visibilityOf(FirstNameUser));
		FirstNameUser.sendKeys("sanket");
		return this;
		
	}
	
	public InvalidEmailRegisterUserPage LastNameofUser()
	{
		wait.until(ExpectedConditions.visibilityOf(LastNameUser));
		LastNameUser.sendKeys("sabane");
		return this;
		
	}
	
	
	 public InvalidEmailRegisterUserPage SelectDayOfDateOfBirth (String DayS)
     {
    	 
    	Select Day=new Select(day);
    	Day.selectByValue(DayS);
    	return this;
     }
     
     public InvalidEmailRegisterUserPage SelectMonthOfDateOfBirth (String MonthS)
     {
    	 
    	Select Day=new Select(Month);
    	Day.selectByValue(MonthS);
    	return this;
     }

     
     public InvalidEmailRegisterUserPage SelectYearOfDateOfBirth (String YearS)
     {
    	 
    	Select Day=new Select(Year);
    	Day.selectByValue(YearS);
    	return this;
     }
     
     
 	public InvalidEmailRegisterUserPage EnterInvalidemailid()
 	{
 		wait.until(ExpectedConditions.visibilityOf(Emailid));
 		Emailid.sendKeys("Invalid Email %$#()" + Keys.TAB);
 		return this;
 	}
 	
 	
 	 public InvalidEmailRegisterUserPage GetInvalidEmailError(String InvalidEmailError) 
 	
 	{
  	
 		wait.until(ExpectedConditions.visibilityOf(InvalidEmailId));
 		InvalidEmailError = InvalidEmailId.getText();
 		System.out.println(InvalidEmailError);
 		String ExpectedMessage = "Wrong email";		
 		Assert.assertEquals(InvalidEmailError, ExpectedMessage);
 		return this;
 	}
   
 
	
}
