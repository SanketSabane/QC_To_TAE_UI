package com.automationTest.operations;

import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class RegisterUser implements IOperations{
	
	LandingPage registeruserpage;

	public void RegisterUserFeature() throws DriverNotInitializedException, InterruptedException {
		
		registeruserpage = TestPageFactory.getPage(LandingPage.class)
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
			                                    .ClickFinalRegisterbtn();
			                                   
												
												
	 

	}
	
	public boolean isLogoutButtonVisibl() 
	
	{
		
		return registeruserpage.isLogoutButtonDisplayed();
			     
	
    }
	
}
