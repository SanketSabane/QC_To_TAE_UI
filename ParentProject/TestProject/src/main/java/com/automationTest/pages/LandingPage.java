package com.automationTest.pages;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.SystemClock;

import com.automationTest.operations.RegisterUser;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;
import com.github.javafaker.Faker;


import java.nio.charset.Charset;

public class LandingPage extends BasePage implements TestPage {
	
	
	
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
		//Register End...
		
		
		// Login...Start
		
		@FindBy(linkText="Log in")
		WebElement LoginButtonTop;
		
		@FindBy(xpath="//input[@name='Email']")
		WebElement Email;
		
		@FindBy(xpath="//input[@name='Password']")
		WebElement Password;
		
		@FindBy(xpath="//button[@class='button-1 login-button']")
		WebElement LoginButton;
		
		@FindBy(xpath="//a[@href='/logout']")
		WebElement Logoutbtn;
		
		
		// Login..End
		

   
	static String  RegEmailId ;
		
     

	public LandingPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public LandingPage ClickTopRegisterbtn() 
	
	{
		
		wait.until(ExpectedConditions.visibilityOf(TopRegisterbtn));
		TopRegisterbtn.click();
		return this;
	}
	
	public LandingPage Selectgender()
	{
		wait.until(ExpectedConditions.visibilityOf(Male));
		Male.click();
		return this;
		
	}
	
	
	public LandingPage FirstNameofUser()
	{
		 
		
		
		wait.until(ExpectedConditions.visibilityOf(FirstNameUser));	
		String FirstName = (RandomStringUtils.randomAlphabetic(7));	
		FirstNameUser.sendKeys(FirstName);	
		System.out.println(FirstName + "  First Name");
		
		return this;
		
		
	}
	
	public LandingPage LastNameofUser()
	
	{
		
		wait.until(ExpectedConditions.visibilityOf(LastNameUser));
		LastNameUser.sendKeys(RandomStringUtils.randomAlphabetic(5));
		System.out.println(RandomStringUtils.randomAlphabetic(5) + "- Last Name");
		return this;
		
	}
	
	
	 public LandingPage SelectDayOfDateOfBirth (String DayS)
     {
    	 
    	Select Day=new Select(day);
    	Day.selectByValue(DayS);
    	return this;
     }
     
     public LandingPage SelectMonthOfDateOfBirth (String MonthS)
     {
    	 
    	Select Day=new Select(Month);
    	Day.selectByValue(MonthS);
    	return this;
     }

     
     public LandingPage SelectYearOfDateOfBirth (String YearS)
     {
    	 
    	Select Day=new Select(Year);
    	Day.selectByValue(YearS);
    	return this;
     }
     
     
 	public LandingPage Enteremailid()
 	{
 		wait.until(ExpectedConditions.visibilityOf(Emailid));
 		RegEmailId = (RandomStringUtils.randomAlphabetic(7)+ "@gmail.com");	
 		System.out.println(RegEmailId+ " :- Email Id for Register");
 		Emailid.sendKeys(RegEmailId);
 	
 		
 		return this;
 		
 	}
 	
 	public String CreateEmailID()
 	{
 		
 		RegEmailId = (RandomStringUtils.randomAlphabetic(7)+ "@gmail.com");
 		return RegEmailId;
 		
 	}
 	
	public LandingPage EnterCompanyName()
 	{
 		wait.until(ExpectedConditions.visibilityOf(CompanyName));
 		CompanyName.sendKeys("Globant");
 		return this;
 		
 	}
	
	public LandingPage EnterPaassword()
 	{
 		wait.until(ExpectedConditions.visibilityOf(PasswordSet));
 		PasswordSet.sendKeys("sanket@123");
 		return this;
 		
 	}
	
	
	public LandingPage ConfirmPaassword()
 	{
 		wait.until(ExpectedConditions.visibilityOf(ConfirmPassword));
 		ConfirmPassword.sendKeys("sanket@123");
 		return this;
 		
 	}
	
	
	public LandingPage ClickFinalRegisterbtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RegisterButton));
		RegisterButton.click();
		return this;
	}
	
    public LandingPage ClickContinuerbtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(continueButton));
		continueButton.click();
		return this;
	}
    
    
    
    
//  ********* Login Start *********
public LandingPage ClickTopLoginbtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(LoginButtonTop));
		LoginButtonTop.click();
		return this;
	}

public LandingPage EmailForLogin()
{
	
	wait.until(ExpectedConditions.visibilityOf(Email));
	System.out.println(RegEmailId+ " :- Email id For Login");
	Email.sendKeys(RegEmailId);
	
	return this;
	
}

public LandingPage PasswordForLogin()
{
	wait.until(ExpectedConditions.visibilityOf(Password));
	Password.sendKeys("sanket@123");
	return this;
	
}

public LandingPage ClickOnLoginbtn()

{
	JavascriptExecutor js11 = (JavascriptExecutor)driver;
	js11.executeScript("window.scroll(0,450)");
	
	wait.until(ExpectedConditions.visibilityOf(LoginButton));
	LoginButton.click();
	return this;
}




public boolean isLogoutButtonDisplayed()
{
	// TODO Auto-generated method stub
	return Logoutbtn.isDisplayed();
			
}


// This Method is use for randomly generated strings 
   //First Name Last NName Email


public String generateRandomString(int length)
{
    return RandomStringUtils.randomAlphabetic(length);
} 



//   ********* Login End *********


	public boolean iscontinueButtonDisplayed()
	{
		// TODO Auto-generated method stub
		return continueButton.isDisplayed();
	}
	
}
