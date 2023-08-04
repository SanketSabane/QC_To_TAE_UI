package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationTest.operations.AddToWishList;
import com.automationTest.operations.ContactUs;
import com.automationTest.operations.JewelryRent;
import com.automationTest.operations.LoginUser;
import com.automationTest.operations.OrderBookSearch;
import com.automationTest.operations.RegisterUser;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ContactUsForEnquiryTest extends BaseTest 

{

	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate ContactUs functionality.")
	public void ContactUsFeature () throws Exception {
		
		LoginUser loginuser = TestOperationFactory.getOperation(LoginUser.class);
		loginuser.LoginUserFeature();
		
		
		ContactUs contactus= TestOperationFactory.getOperation(ContactUs.class);
		contactus.ContactUsFeature();

		
	}
}