package com.automationTest.pages;

import org.openqa.selenium.JavascriptExecutor;
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

public class LoginUserBlankInputsPage extends BasePage implements TestPage {
	

		// Login...Start
		
		@FindBy(linkText="Log in")
		WebElement LoginButtonTop;
		
		@FindBy(xpath="//button[@class='button-1 login-button']")
		WebElement LoginButton;
		
		@FindBy(xpath="//span[@id='Email-error']")
		WebElement BlankEmailLogin;	
		
		@FindBy(xpath="//input[@name='Email']")
	    WebElement Email;
		
		@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
		WebElement BlankPasswordLogin;
		
		
		// Login..End
		

	public LoginUserBlankInputsPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

 
//  ********* Login Start *********
     public LoginUserBlankInputsPage ClickTopLoginbtn()
	
	   {
		  wait.until(ExpectedConditions.visibilityOf(LoginButtonTop));
		  LoginButtonTop.click();
		  return this;
	   }



      public LoginUserBlankInputsPage ClickOnLoginbtn()

    {
	   JavascriptExecutor js11 = (JavascriptExecutor)driver;
	   js11.executeScript("window.scroll(0,450)");
	   wait.until(ExpectedConditions.visibilityOf(LoginButton));
	   LoginButton.click();
	   return this;
    }
      
      
      public LoginUserBlankInputsPage GetBlankEmailErrorLogin(String BlankEmailForLogin) 
  	
     	{
   	
  	 	  wait.until(ExpectedConditions.visibilityOf(BlankEmailLogin));
  		  BlankEmailForLogin = BlankEmailLogin.getText();
  		  System.out.println(BlankEmailForLogin);
  		  String ExpectedMessage = "Please enter your email";		
  		  Assert.assertEquals(BlankEmailForLogin, ExpectedMessage);
  		  return this;
  	   }
      
      
    	public LoginUserBlankInputsPage EmailForLogin()
    	
     	{
  		  wait.until(ExpectedConditions.visibilityOf(Email));
  		  Email.sendKeys("sankysabane@gmail.com");
  		  return this;
  		
  	    }
    	
    	
    	 public LoginUserBlankInputsPage GetBlankPasswordErrorLogin(String BlankPasswordForLogin) 
    	  	
      	{
    	
   	 	  wait.until(ExpectedConditions.visibilityOf(BlankPasswordLogin));
   	 	  BlankPasswordForLogin = BlankPasswordLogin.getText();
   		  System.out.println(BlankPasswordForLogin);
   		  String ExpectedMessage = "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect";		
   		  Assert.assertEquals(BlankPasswordForLogin, ExpectedMessage);
   		  return this;
   	   }

//   ********* Login End *********

	
}
