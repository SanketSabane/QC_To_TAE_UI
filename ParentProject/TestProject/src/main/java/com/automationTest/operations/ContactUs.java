package com.automationTest.operations;

import com.automationTest.pages.ContactUsPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class ContactUs implements IOperations

{
	
	ContactUsPage contactuspage;

	public void ContactUsFeature() throws  InterruptedException, DriverNotInitializedException {
		
		contactuspage = TestPageFactory.getPage(ContactUsPage.class)
				                                .ClickonContactUs()
				                                .EnterName()
				                                .EnterEmail()
				                                .EnterEnquiry()
				                                .ClickonSubmitButton()
				                                .GetConfirmationMessage("ConfirmationMessage");
		                                         
				                              
				                                
			                                    
												
												
	 

	}
	
	
		
	}



