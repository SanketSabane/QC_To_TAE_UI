package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationTest.operations.AddToWishList;
import com.automationTest.operations.ContactUs;
import com.automationTest.operations.JewelryRent;
import com.automationTest.operations.OrderBookSearch;
import com.automationTest.operations.RegisterUser;
import com.automationTest.operations.RegisterUserMandatoryFieldsBlankInput;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class BlankInputsOnRegisterUserMandatoryFieldsTest extends BaseTest 

{

	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Validate Error messages after passing blank inputs on Register User Page")
	public void MandatoryFieldsBlankOnRegisterUserPageFeature () throws Exception {
		

		RegisterUserMandatoryFieldsBlankInput BlankInputs= TestOperationFactory.getOperation(RegisterUserMandatoryFieldsBlankInput.class);
		BlankInputs.RegisterUserMandatoryFieldsBlankInputsFeature();

		
	}
}