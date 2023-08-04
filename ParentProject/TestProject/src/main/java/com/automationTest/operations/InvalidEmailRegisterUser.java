package com.automationTest.operations;

import com.automationTest.pages.ContactUsPage;
import com.automationTest.pages.InvalidEmailRegisterUserPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class InvalidEmailRegisterUser implements IOperations

{
	
	InvalidEmailRegisterUserPage invalidemailregisteruserPage;

	public void InvalidEmailRegisterUserFeature() throws  InterruptedException, DriverNotInitializedException {
		
		invalidemailregisteruserPage = TestPageFactory.getPage(InvalidEmailRegisterUserPage.class)
				                                       .ClickonTopRegisterbutton()
                                                       .Selectgender()
                                                       .FirstNameofUser()
                                                       .LastNameofUser()
                                                       .SelectDayOfDateOfBirth("23")
                                                       .SelectMonthOfDateOfBirth("11")
                                                       .SelectYearOfDateOfBirth("1993")
                                                       .EnterInvalidemailid()
                                                       .GetInvalidEmailError("InvalidEmailId");
		
				                             
				                                
			                                    
												
												
	 

	}
	

		
	}



