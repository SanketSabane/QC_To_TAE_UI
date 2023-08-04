package com.automationTest.operations;

import com.automationTest.pages.ContactUsPage;
import com.automationTest.pages.InvalidEmailRegisterUserPage;
import com.automationTest.pages.InvalidPasswordRegisterUserPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class InvalidPasswordRegisterUser implements IOperations

{
	
	InvalidPasswordRegisterUserPage invalidpasswordregisteruserPage;

	public void InvalidpasswordRegisterUserFeature() throws  InterruptedException, DriverNotInitializedException {
		
		invalidpasswordregisteruserPage = TestPageFactory.getPage(InvalidPasswordRegisterUserPage.class)
				                                       .ClickonTopRegisterbutton()
                                                       .Selectgender()
                                                       .FirstNameofUser()
                                                       .LastNameofUser()
                                                       .SelectDayOfDateOfBirth("18")
                                                       .SelectMonthOfDateOfBirth("12")
                                                       .SelectYearOfDateOfBirth("1983")                                                   
                                                       .EnterEmailId()
                                                       .EnterCompanyName()
                                                       .EnterInvalidPaassword()
                                                       .GetInvalidPasswordError("InvalidPassword");
		
				                               
				                                
			                                    
												
												
	 

	}
	
	
		
	}



