package com.automationTest.operations;

import com.automationTest.pages.AddToWishListPage;
import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.JewelleryPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class AddToWishList implements IOperations{
	
	AddToWishListPage addTowishListpage;

	public void JewelryRentrFeature() throws DriverNotInitializedException, InterruptedException {
		
		addTowishListpage = TestPageFactory.getPage(AddToWishListPage.class)
			                                    .ClickonBookButton()
			                                    .SelectPriceRange("Price: High to Low")
		                                        .SelectPageSize("3")
		                                        .SetListView()
		                                        .ClickAddToWishListButton()
		                                        .GetWishListMessage("CatchWishListMessage")
		                                        .ClickonWishList()
		                                        .GetTotalAmount("TotalAmount")
		                                        .EnterQuantity()
		                                        .GetUpdatedTotalAmount("UpdatedAmount")
		                                        .RemoveProductFromWishList()
		                                        .RemoveWishListConfirmation("RemoveWishListMessage");
		
		
		
		
			                                   
			                                    
		
		                                            
		
			                                    
			                                   
												
												
	 

	}

	
		
	
	
	//public boolean isContineueButtonVisible() {
		
		//return registeruserpage.iscontinueButtonDisplayed();
		
	}
	

