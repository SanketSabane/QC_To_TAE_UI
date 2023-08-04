package com.automationTest.operations;

import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.JewelleryPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class JewelryRent implements IOperations{
	
	JewelleryPage jewellerypage;

	public void JewelryRentrFeature() throws DriverNotInitializedException, InterruptedException {
		
		jewellerypage = TestPageFactory.getPage(JewelleryPage.class)
			                                    .ClickonJwellaryoption()
			                                    .ClickonRent()
			                                    .EnterStartDate()
			                                    .EnterEndtDate()
			                                    .ClickonRenrbuttonIn()
			                                    .ShoppingCartbutton()
			                                    .IagreeCheckbox()
			                                    .ClickonCheckoutbutton()			                                 
			                                    .SelectCountry("Mali")
			                                    .EnterCityName()
			                                    .EnterAddress1()
			                                    .EnterZipCode()
			                                    .EnterPhonenumber()
			                                    .Clickonsavebutton()
			                                    .ClickonBillingsavebutton()
			                                    .ShippingMethodSave()			                                 
			                                    .SelectPaymentMethod()
			                                    .SavePaymentMethod()
			                                    .EnterCardHolderName()
			                                    .EnterCardNumber()
			                                    .SelectCardExpiryYear("2026")
			                                    .EnterCardCode()
			                                    .PaymentSave()
			                                    .ConfirmSave()
		                                        .CatchOrderProcessedMessage("OrderProcessedMessage")
		                                        .ClickOnContinue();
		
		                                            
			                                    
			                                    

	}
	
	
		
	}
	

