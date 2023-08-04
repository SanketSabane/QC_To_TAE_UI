package com.automationTest.operations;

import com.automationTest.pages.BookPage;
import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.JewelleryPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class OrderBookSearch implements IOperations{
	
	BookPage bookpage;

	public void OrderBookSearchFeature() throws DriverNotInitializedException, InterruptedException {
		
		bookpage = TestPageFactory.getPage(BookPage.class)
			                                   
			                                    .ClickonBookoption()
			                                    .SearchBookName()
			                                    .ClickOnAddToCart()
			                                    .ClickonShoppingCart()
			                                    .CheckTermService()
			                                    .ClickonCheckoutbutton()
			                                    .SelectCountry("India")
			                                    .EnterCityName()
			                                    .EnterAddress()
			                                    .EnterZipCode()
			                                    .EnterPhoneNumber()
			                                    .ClickonSave()
			                                    .ClickonSaveShippingMethod()
			                                    .PaymentMethod()
			                                    .SavePaymentMethod()
			                                    .EnterCardHolderName()
			                                    .EnterCardNumber()
			                                    .SelectCardExpiryYear("2027")
			                                    .EnterCardCode()
			                                    .PaymentInfoSave()
			                                    .ConfirmSave()
			                                    .CatchOrderProcessedMessage("OrderProcessedMessage")
			                                    .ClickOnContinue();
		
		                                            									
	 

	}
	
	}
	

