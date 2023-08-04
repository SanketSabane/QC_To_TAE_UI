package com.automationTest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automationTest.operations.RegisterUser;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;
import com.framework.page.TestPageFactory;

public class AddRemoveProductFromShoppingCartPage extends BasePage implements TestPage {
	
	
	
	
	
	@FindBy(linkText="Computers")
	WebElement ComputersButton;  
	
	
	@FindBy(linkText="Notebooks")
	WebElement Notebooks; 
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement SortByPrice;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement SortBySize;
	
	@FindBy(xpath="//a[@class='viewmode-icon list']")
	WebElement ListView;
	
	@FindBy(xpath="//Button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/6/1/1\"),!1']")
	WebElement AddToCartBtn;
	
	
	@FindBy(xpath="//a[@class='ico-cart']")
	WebElement ClickAddToCart;
	
	@FindBy(xpath="//button[@class='remove-btn']")
	WebElement ClickRemoveCart;
	
	@FindBy(xpath="//div[@class='no-data']")
	WebElement EmtyShoppingCart;
	
	@FindBy(xpath="//div[@class='bar-notification success']")
	WebElement AddProductMessage;
	
	@FindBy(xpath="//button[@class='remove-btn']")
	WebElement RemoveProduct;

	@FindBy(xpath="//a[@class='ico-cart']")
	WebElement AddToCart;
	
	@FindBy(xpath="//div[@class='no-data']")
	WebElement EmtyCart;
	
	
	public AddRemoveProductFromShoppingCartPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	
	
	public AddRemoveProductFromShoppingCartPage HoverOnComputerClickOnNotebook()
	
	{
		wait.until(ExpectedConditions.visibilityOf(ComputersButton));
		//ApparelButton.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(ComputersButton).perform();;
		wait.until(ExpectedConditions.visibilityOf(Notebooks));
		Notebooks.click();
		return this;
		
	}
	
	
	  public AddRemoveProductFromShoppingCartPage SelectPriceRange(String PriceRange)
		
		{
			wait.until(ExpectedConditions.visibilityOf(SortByPrice));
			
			Select PriceRangeValue=new Select(SortByPrice);
			PriceRangeValue.selectByVisibleText(PriceRange);
			return this;
		}
	  
	  
	  public AddRemoveProductFromShoppingCartPage SelectPageSize(String PageSize)
		
	 	{
	 		wait.until(ExpectedConditions.visibilityOf(SortBySize));
	 		
	 		Select PageSizeValue=new Select(SortBySize);
	 		PageSizeValue.selectByVisibleText(PageSize);
	 		return this;
	 	}
		
		

	  public AddRemoveProductFromShoppingCartPage SetListView()
		
		{
			wait.until(ExpectedConditions.visibilityOf(ListView));
			ListView.click();
			return this;
		}
   
	  public AddRemoveProductFromShoppingCartPage ClickAddToCartButton() throws InterruptedException
		
		{
		    Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(AddToCartBtn));
			AddToCartBtn.click();
			return this;
		}
	  
	  
	  public AddRemoveProductFromShoppingCartPage CatchProductAddedMessage(String ProductMessageForAdd)
	  
		{
			wait.until(ExpectedConditions.visibilityOf(AddProductMessage));
			ProductMessageForAdd=AddProductMessage.getText();
			System.out.println(ProductMessageForAdd);
			String ExpectedReviewAddedMessage = "The product has been added to your shopping cart";	
			Assert.assertEquals(ProductMessageForAdd, ExpectedReviewAddedMessage);
			return this;
		}
	  
	  
	  public AddRemoveProductFromShoppingCartPage AddToCartProduct() throws InterruptedException
		
		{
		   Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(AddToCart));
			AddToCart.click();
			return this;
		}
	  
	  public AddRemoveProductFromShoppingCartPage RemoveProduct() throws InterruptedException
		
		{
		   
			wait.until(ExpectedConditions.visibilityOf(RemoveProduct));
			RemoveProduct.click();
			return this;
		}
	  
	 
	  public AddRemoveProductFromShoppingCartPage RemoveProductConfirmation(String EmtyCartMessage) throws InterruptedException
		
		{  
		 
			wait.until(ExpectedConditions.visibilityOf(EmtyCart));
			EmtyCartMessage=EmtyCart.getText();
			System.out.println(EmtyCartMessage);
			String ExpectedEmptyWishlist = "Your Shopping Cart is empty!";	
			Assert.assertEquals(EmtyCartMessage, ExpectedEmptyWishlist);
			return this;
		}
	  

}
