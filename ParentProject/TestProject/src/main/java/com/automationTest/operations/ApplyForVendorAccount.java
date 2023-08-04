package com.automationTest.operations;

import java.awt.AWTException;

import com.automationTest.pages.ApplyForVendorAccountPage;
import com.automationTest.pages.ContactUsPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class ApplyForVendorAccount implements IOperations

{
	
	ApplyForVendorAccountPage applyforvendoraccountpage;

	public void VendorAccountFeature() throws  InterruptedException, DriverNotInitializedException, AWTException {
		
		applyforvendoraccountpage = TestPageFactory.getPage(ApplyForVendorAccountPage.class)
				                                  .ClickonVendorAccount()
				                                  .EnterVendorName()
				                                  .EnterVendorDescription()
				                                  .SelectFile()
				                                  .ClickonSubmitButton()
				                                  .GetConfirmationMessage("ConfirmationMessage");
		
		                                         
				                               
				                                
			                                    
												
												
	 

	}
	
	
	}



