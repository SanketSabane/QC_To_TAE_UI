package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationTest.operations.AddProductReview;
import com.automationTest.operations.AddToWishList;
import com.automationTest.operations.JewelryRent;
import com.automationTest.operations.LoginUser;
import com.automationTest.operations.OrderBookSearch;
import com.automationTest.operations.RegisterUser;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AddReviewForProductTest extends BaseTest 
{

	@Test 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate Add Product in Wishlist functionality.")
	public void ReviewProductFeature () throws Exception {
		

		LoginUser loginuser = TestOperationFactory.getOperation(LoginUser.class);
		loginuser.LoginUserFeature();
		
		AddProductReview addproductreview= TestOperationFactory.getOperation(AddProductReview.class);
		addproductreview.ReviewForProductFeature();	
		
	}
}