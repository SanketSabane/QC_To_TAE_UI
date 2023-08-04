package com.automationTest.operations;

import com.automationTest.pages.AddRemoveProductFromShoppingCartPage;
import com.automationTest.pages.AddToWishListPage;
import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.JewelleryPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class AddRemoveProductFromCart implements IOperations{
	
	AddRemoveProductFromShoppingCartPage addremoveproductfromshoppingcartpage;

	public void AddRemoveProductFeature() throws DriverNotInitializedException, InterruptedException {
		
		addremoveproductfromshoppingcartpage = TestPageFactory.getPage(AddRemoveProductFromShoppingCartPage.class)
			                                    .HoverOnComputerClickOnNotebook()
			                                    .SelectPriceRange("Price: High to Low")
		                                        .SelectPageSize("3")
		                                        .SetListView()
		                                        .ClickAddToCartButton()
		                                        .CatchProductAddedMessage("CatchWishListMessage")
		                                        .AddToCartProduct()
		                                        .RemoveProduct()
		                                        .RemoveProductConfirmation("EmtyCart");
		                                       
		
		
		
		
			                                   
			                                    
		
		                                            
		
			                                    
			                                   
												
												
	 

	}

	
		
	
	
	//public boolean isContineueButtonVisible() {
		
		//return registeruserpage.iscontinueButtonDisplayed();
		
	}
	

