package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationTest.operations.AddToWishList;
import com.automationTest.operations.ContactUs;
import com.automationTest.operations.ExistingRegisterUser;
import com.automationTest.operations.InvalidEmailRegisterUser;
import com.automationTest.operations.InvalidPasswordRegisterUser;
import com.automationTest.operations.JewelryRent;
import com.automationTest.operations.OrderBookSearch;
import com.automationTest.operations.RegisterUser;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CatchExistingRegisterUserErrorTest extends BaseTest 

{

	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To Validate Existing User Error Message.")
	public void ExistingRegisterUserErrorFeature () throws Exception {
		
		// Allready Register User
		ExistingRegisterUser existingregisteruser= TestOperationFactory.getOperation(ExistingRegisterUser.class);
		existingregisteruser.ExistingRegisterUserErrorFeature();		
		
		
		existingregisteruser.ExistingRegisterUserErrorFeature();
		
	}
}