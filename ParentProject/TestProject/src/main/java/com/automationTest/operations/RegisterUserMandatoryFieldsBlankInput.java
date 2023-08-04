package com.automationTest.operations;

import com.automationTest.pages.ContactUsPage;
import com.automationTest.pages.LandingPage;
import com.automationTest.pages.RegisterUserMandatoryFieldsBlankInputsPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class RegisterUserMandatoryFieldsBlankInput implements IOperations

{
	
	RegisterUserMandatoryFieldsBlankInputsPage BlankInputsRegisterUser;

	public void RegisterUserMandatoryFieldsBlankInputsFeature() throws  InterruptedException, DriverNotInitializedException {
		
		BlankInputsRegisterUser = TestPageFactory.getPage(RegisterUserMandatoryFieldsBlankInputsPage.class)
				                                .ClickonTopRegisterbutton()
				                                .ClickFinalRegisterbtn()
				                                .GetBlankFirstNameError("BlankFirstNameError")
				                                .GetBlankLastNameError("BlankLastNameError")
				                                .GetBlankEmailError("BlankEmailError")
				                                .GetBlankPasswordError("BlankPasswordError")
				                                .GetConfmBlankPasswordError("BlankConfirmPasswordError");
		

		
		                                         
				                            
				                                
			                                    
												
												
	 

	}
	
	
		
	}



