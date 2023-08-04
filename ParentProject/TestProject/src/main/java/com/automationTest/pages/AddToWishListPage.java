package com.automationTest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automationTest.operations.RegisterUser;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class AddToWishListPage extends BasePage implements TestPage {
	
	

	
	@FindBy(linkText="Books")
	WebElement BookButton;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement SortByPrice;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement SortBySize;
	
	@FindBy(xpath="//a[@class='viewmode-icon list']")
	WebElement ListView;
	
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/38/2/1\"),!1']")
	WebElement AddToWishListbtn;
	
	@FindBy(xpath="//div[@class='bar-notification success']")
	WebElement CatchWishListMessage;
	
	@FindBy(linkText="Wishlist")
	WebElement ClickWishList;
	
	@FindBy(xpath="//span[@class='product-subtotal']")
	WebElement TotalAmount;
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement EnterQuantity;
	
	@FindBy(xpath="//span[@class='product-subtotal']")
	WebElement UpdatedAmount;
	
	@FindBy(xpath="//button[@class='remove-btn']")
	WebElement RemoveWishList;
	
	@FindBy(xpath="//div[@class='no-data']")
	WebElement RemoveWishListMessage;
	


	
	public AddToWishListPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public AddToWishListPage ClickonBookButton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(BookButton));
		BookButton.click();
		return this;
	}
	
  public AddToWishListPage  SelectPriceRange(String PriceRange)
	
	{
		wait.until(ExpectedConditions.visibilityOf(SortByPrice));
		
		Select PriceRangeValue=new Select(SortByPrice);
		PriceRangeValue.selectByVisibleText(PriceRange);
		return this;
	}
  
  
  public AddToWishListPage SelectPageSize(String PageSize)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(SortBySize));
 		
 		Select PageSizeValue=new Select(SortBySize);
 		PageSizeValue.selectByVisibleText(PageSize);
 		return this;
 	}
	
	

  public AddToWishListPage SetListView()
	
	{
		wait.until(ExpectedConditions.visibilityOf(ListView));
		ListView.click();
		return this;
	}
  
  public AddToWishListPage ClickAddToWishListButton() throws InterruptedException
	
	{
	   Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(AddToWishListbtn));
		AddToWishListbtn.click();
		return this;
	}
  
  public AddToWishListPage GetWishListMessage(String WishListMessage)
	
 	{
	    // Need to check
 		wait.until(ExpectedConditions.visibilityOf(CatchWishListMessage));
 		WishListMessage = CatchWishListMessage.getText();
 		System.out.println(WishListMessage);
 		return this;
 	}
   
  
  public AddToWishListPage ClickonWishList()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(ClickWishList));
 		ClickWishList.click();
 		return this;
 	}
  
  public AddToWishListPage GetTotalAmount(String TotalAmountOfProduct)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(TotalAmount));
 		TotalAmountOfProduct= TotalAmount.getText();
 		System.out.println(TotalAmountOfProduct);
 		return this;
 	}
  
  public AddToWishListPage EnterQuantity()
	
	{
		wait.until(ExpectedConditions.visibilityOf(EnterQuantity));
		EnterQuantity.clear();
		EnterQuantity.sendKeys("4" + Keys.ENTER);
		return this;
	}
  
  
  public AddToWishListPage GetUpdatedTotalAmount(String UpdatedTotalAmountOfProduct)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(UpdatedAmount));
 		UpdatedTotalAmountOfProduct= UpdatedAmount.getText();
 		System.out.println(UpdatedTotalAmountOfProduct);
 		return this;
 	}
  
  public AddToWishListPage RemoveProductFromWishList()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RemoveWishList));
		RemoveWishList.click();
		return this;
	}
  
  public AddToWishListPage RemoveWishListConfirmation(String EmtyMessage) throws InterruptedException
	
	{  
	   Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOf(RemoveWishListMessage));
		EmtyMessage=RemoveWishListMessage.getText();
		System.out.println(EmtyMessage);
		String ExpectedEmptyWishlist = "The wishlist is empty!";	
		Assert.assertEquals(EmtyMessage, ExpectedEmptyWishlist);
		return this;
	}
  
  
	
}
