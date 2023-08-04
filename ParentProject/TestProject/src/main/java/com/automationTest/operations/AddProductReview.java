package com.automationTest.operations;

import com.automationTest.pages.AddProductReviewPage;
import com.automationTest.pages.AddToWishListPage;
import com.automationTest.pages.FlightResultPage;
import com.automationTest.pages.JewelleryPage;
import com.automationTest.pages.LandingPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.operation.TestOperationFactory;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class AddProductReview implements IOperations{
	
	AddProductReviewPage addproductreviewpage;

	public void ReviewForProductFeature() throws DriverNotInitializedException, InterruptedException {
		
		addproductreviewpage = TestPageFactory.getPage(AddProductReviewPage.class)
				                                .HoverOnApparelClickOnShoes()
				                                .SelectPriceRange("Price: Low to High")
				                                .SelectPageSize("9")
				                                .SetListView()
				                                .ClickAddToCartButton()
				                                .SelectShoesSize("10")
				                                .SelectColorOfShoes()
				                                .ClickonAddReview()
				                                .EnterReview()
				                                .EnterReviewText()
				                                .ClickonSubmitbutton()
				                                .CatchReviewAddedMessage("ProductReviewMessage");
		
			                                    
			                                   
			                                    
		
		                                            
		
			                                    
			                                   
												
												
	 

	}

	
		
	
	
	//public boolean isContineueButtonVisible() {
		
		//return registeruserpage.iscontinueButtonDisplayed();
		
	}
	

