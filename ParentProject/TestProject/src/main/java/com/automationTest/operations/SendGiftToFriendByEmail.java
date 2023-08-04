package com.automationTest.operations;

import com.automationTest.pages.AddToWishListPage;
import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.JewelleryPage;
import com.automationTest.pages.LandingPage;
import com.automationTest.pages.SendGiftCardToFriendByEmailPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class SendGiftToFriendByEmail implements IOperations{
	
	SendGiftCardToFriendByEmailPage sendgiftcardTofriendbyemailpage;

	public void SendGiftCardByEmailFeature() throws DriverNotInitializedException, InterruptedException {
		
		sendgiftcardTofriendbyemailpage = TestPageFactory.getPage(SendGiftCardToFriendByEmailPage.class)
			                                    .ClickonGiftCardButtonButton()
			                                    .SelectPriceRange("Created on")
		                                        .SelectPageSize("3")
		                                        .SetListView()
		                                        .ClickAddToCartButton()
		                                        .EnterRecipientsName()
		                                        .EnterMessage()
		                                        .ClickOnEmailToFriendBtn()
		                                        .EnterFriendEmailId()
		                                        .EnterPersonalMessage()
		                                        .ClickOnSendEmailBtn()
		                                        .GetEmailMessage("EmailSendMessage");
		                                        
		
		

	}

	
		
	}
	

