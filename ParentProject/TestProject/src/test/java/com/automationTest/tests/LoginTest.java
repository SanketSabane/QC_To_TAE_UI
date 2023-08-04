package com.automationTest.tests;

import org.aspectj.lang.annotation.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationTest.operations.LoginUser;
import com.automationTest.operations.RegisterUser;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;



public class LoginTest extends BaseTest 
{ 
		@Test 
		@Severity(SeverityLevel.CRITICAL)
		@Description("Test Description: To validate Login functionality.")
		
		public void verifyLoginfeature() throws InstantiationException, IllegalAccessException, DriverNotInitializedException, InterruptedException
		
		{
					
			LoginUser loginuser = TestOperationFactory.getOperation(LoginUser.class);
			loginuser.LoginUserFeature();		
		}	
	}