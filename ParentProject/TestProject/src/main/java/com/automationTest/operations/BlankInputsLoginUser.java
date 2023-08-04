package com.automationTest.operations;

import com.automationTest.pages.LandingPage;
import com.automationTest.pages.LoginUserBlankInputsPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class BlankInputsLoginUser implements IOperations

{
	
	LoginUserBlankInputsPage loginuserblankinputspage;

	public void BlankInputsLoginUserFeature() throws  InterruptedException, DriverNotInitializedException {
		
		loginuserblankinputspage = TestPageFactory.getPage(LoginUserBlankInputsPage.class)
				                                .ClickTopLoginbtn()
				                                .ClickOnLoginbtn()
				                                .GetBlankEmailErrorLogin("BlankEmailLogin")
				                                .EmailForLogin()
				                                .ClickOnLoginbtn()
				                                .GetBlankPasswordErrorLogin("BlankPasswordLogin");
				                               
			                                    
												
												
	 

	}
	



}
