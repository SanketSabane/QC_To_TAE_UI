package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationTest.operations.JewelryRent;
import com.automationTest.operations.LoginUser;
import com.automationTest.operations.RegisterUser;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class JewelryTest extends BaseTest 

{
    
	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate Jewelry on Rent functionality.")
	
	public void verifyJewelryRentrFeature () throws Exception {
		
		LoginUser loginuser = TestOperationFactory.getOperation(LoginUser.class);
		loginuser.LoginUserFeature();
		
		JewelryRent jewelryrent= TestOperationFactory.getOperation(JewelryRent.class);
		jewelryrent.JewelryRentrFeature();	
	}
	
}