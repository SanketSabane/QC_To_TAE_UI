package com.automationTest.operations;

import com.automationTest.pages.ContactUsPage;
import com.automationTest.pages.ExistingRegisterUserErrorPage;
import com.automationTest.pages.InvalidEmailRegisterUserPage;
import com.automationTest.pages.InvalidPasswordRegisterUserPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class ExistingRegisterUser implements IOperations

{
	
	ExistingRegisterUserErrorPage existingregisterusererrorpage;

	public void ExistingRegisterUserErrorFeature() throws  InterruptedException, DriverNotInitializedException {
		
		existingregisterusererrorpage = TestPageFactory.getPage(ExistingRegisterUserErrorPage.class)
				                                       .ClickonTopRegisterbutton()
                                                       .Selectgender()
                                                       .FirstNameofUser()
                                                       .LastNameofUser()
                                                       .SelectDayOfDateOfBirth("18")
                                                       .SelectMonthOfDateOfBirth("12")
                                                       .SelectYearOfDateOfBirth("1983")                                                   
                                                       .EnterEmailId()
                                                       .EnterCompanyName()
                                                       .EnterPaassword()
                                                       .ConfirmPaassword()
                                                       .ClickFinalRegisterbtn()
                                                       .GetAlreadyRegisterUserError("ExistingUser");
		
		                                               
		
				                      
				                                
			                                    
												
												
	 

	}
	
	
	}



