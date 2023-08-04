package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationTest.operations.AddToWishList;
import com.automationTest.operations.ContactUs;
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

public class EnterInvalidPasswordForRegisterUserTest extends BaseTest 

{

	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate Error Message after enter Invalid password on Register User Page.")
	public void InvalidPasswordRegisterUserFeature () throws Exception {
		
		
		InvalidPasswordRegisterUser invalidpasswordregisterUser= TestOperationFactory.getOperation(InvalidPasswordRegisterUser.class);
		invalidpasswordregisterUser.InvalidpasswordRegisterUserFeature();
		
	}
}