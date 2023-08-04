package com.automationTest.operations;

import com.automationTest.pages.LandingPage;
import com.automationTest.pages.LoginPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class LoginUser implements IOperations

{
	
	LoginPage loginuserpage;

	public void LoginUserFeature() throws  InterruptedException, DriverNotInitializedException {
		
		loginuserpage = TestPageFactory.getPage(LoginPage.class)
				                                      .ClickTopRegisterbtn()
                                                      .Selectgender()
                                                      .FirstNameofUser()
                                                      .LastNameofUser()
                                                      .SelectDayOfDateOfBirth("12")
                                                      .SelectMonthOfDateOfBirth("8")
                                                      .SelectYearOfDateOfBirth("1997")
                                                      .Enteremailid()
                                                      .EnterCompanyName()
                                                      .EnterPaassword()
                                                      .ConfirmPaassword()
                                                      .ClickFinalRegisterbtn()
                                                      .ClickTopLoginbtn()
                                                      .EmailForLogin()
                                                      .PasswordForLogin()
                                                      .ClickOnLoginbtn();
	}
	                                           
		
		public boolean isLogoutButtonDisplayed() 
		
		{
			
			return loginuserpage.isLogoutButtonDisplayed();
				     
		
	    }
		
	}

	

	
	
