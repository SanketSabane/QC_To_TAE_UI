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

public class BookPage extends BasePage implements TestPage {
	
	
	
	@FindBy(linkText="Books")
	WebElement BooksButton; 
	

	
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement SearchBookName;
	
	@FindBy(xpath="//*[contains(text(),'Add to cart')]")
	WebElement AddToCart;
	
	
	@FindBy(xpath="//a[@class='ico-cart']")
	WebElement ShoppingCart;
	//scroll down
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement TermService;
	
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement CheckoutButton;
	
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	WebElement CountryS;
	
	
	
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	WebElement CityName;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	WebElement Address1;
			
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement ZipCode;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement PhoneNumber;
		
	@FindBy(xpath="//button[@onclick='Billing.save()']")
	WebElement SaveClick;


	@FindBy(xpath="//button[@onclick='ShippingMethod.save()']")
	WebElement SaveShippingMethd;
	
	@FindBy(xpath="//input[@id='paymentmethod_1']")
	WebElement PaymentMethod;
	
	@FindBy(xpath="//button[@onclick='PaymentMethod.save()']")
	WebElement SavePaymentMethod;

	@FindBy(xpath="//input[@id='CardholderName']")
	WebElement CardHolderName;
	
	@FindBy(xpath="//input[@id='CardNumber']")
	WebElement CardNumber;
	
	
	@FindBy(xpath="//select[@id='ExpireYear']") 
	WebElement CardExpirYear;
			
	
	
	@FindBy(xpath="//input[@id='CardCode']")
	WebElement CardCode;
	

	@FindBy(xpath="//button[@onclick='PaymentInfo.save()']")
	WebElement PaymentInfoSave;
	
	 @FindBy(xpath="//button[@onclick='ConfirmOrder.save()']") 
	 WebElement ConfirmSave;
	
	 @FindBy(xpath="//*[contains(text(),'Your order has been successfully processed!')]") 
	   WebElement OrderProcessedMessage;
	   
	   @FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
	   WebElement Continuebtn;
	   
	
	
	public BookPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public BookPage ClickonBookoption()
	
	{
		wait.until(ExpectedConditions.visibilityOf(BooksButton));
		BooksButton.click();
		return this;
	}
	
   public BookPage SearchBookName()
	
	{
		wait.until(ExpectedConditions.visibilityOf(SearchBookName));
		SearchBookName.sendKeys("Fahrenheit 451 by Ray Bradbury");
		return this;
	}
    
   public BookPage ClickOnAddToCart()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(AddToCart));
  		AddToCart.click();
  		return this;
  	}
   
   
   public BookPage ClickonShoppingCart()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(ShoppingCart));
 		ShoppingCart.click();
 		return this;
 	}
   
   public BookPage CheckTermService()
	
	{
		wait.until(ExpectedConditions.visibilityOf(TermService));
		TermService.click();
		return this;
	}
   
   public BookPage ClickonCheckoutbutton()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(CheckoutButton));
  		CheckoutButton.click();
  		return this;
  	}
	

   
   public BookPage SelectCountry(String MyContry)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(CountryS));
 		Select CountryName=new Select(CountryS);
 		CountryName.selectByVisibleText(MyContry);
 		return this;
 		
 	}
   
   public BookPage EnterCityName()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(CityName));
 		CityName.sendKeys("Pune");
 		return this;
 	}
   
   public BookPage EnterAddress()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Address1));
		Address1.sendKeys("SInhgad Road");
		return this;
	}
   
   public BookPage EnterZipCode()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(ZipCode));
  		ZipCode.sendKeys("411041");
  		return this;
  	}
   
   
   public BookPage EnterPhoneNumber()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(PhoneNumber));
 		PhoneNumber.sendKeys("9889877887");
 		return this;
 	}
   
   public BookPage ClickonSave()
	
	{
		wait.until(ExpectedConditions.visibilityOf(SaveClick));
		SaveClick.click();
		return this;
	}
   
   public BookPage ClickonSaveShippingMethod()
	
	{
		wait.until(ExpectedConditions.visibilityOf(SaveShippingMethd));
		SaveShippingMethd.click();
		return this;
	}
   
   public BookPage PaymentMethod()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(PaymentMethod));
  		PaymentMethod.click();
  		return this;
  	}
   
   
   public BookPage SavePaymentMethod()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(SavePaymentMethod));
 		SavePaymentMethod.click();
 		return this;
 	}
   
   
   public BookPage EnterCardHolderName()
	
	{
		wait.until(ExpectedConditions.visibilityOf(CardHolderName));
		CardHolderName.sendKeys("sanket sabane");
		return this;
	}
   
   
   public BookPage EnterCardNumber()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(CardNumber));
  		CardNumber.sendKeys("4111111111111111");
  		return this;
  	}
   
   
   
   public BookPage SelectCardExpiryYear(String CardYear)
	
	{
		wait.until(ExpectedConditions.visibilityOf(CardExpirYear));
		Select CardExpYear=new Select(CardExpirYear);
    	CardExpYear.selectByVisibleText(CardYear);
		return this;
		
	}
   
   
   public BookPage EnterCardCode()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(CardCode));
 		CardCode.sendKeys("1233");
 		return this;
 	}
   
   public BookPage PaymentInfoSave()
	
	{
		wait.until(ExpectedConditions.visibilityOf(PaymentInfoSave));
		PaymentInfoSave.click();
		return this;
	}
   
   
   public BookPage ConfirmSave()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(ConfirmSave));
  		ConfirmSave.click();
  		return this;
  		//scroll down
  	}
   
   
   public BookPage CatchOrderProcessedMessage(String OrderProcessed) throws InterruptedException
	  
	{
	    Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(OrderProcessedMessage));
		OrderProcessed=OrderProcessedMessage.getText();
		System.out.println(OrderProcessed);
		String ExpectedReviewAddedMessage = "Your order has been successfully processed!";	
		Assert.assertEquals(OrderProcessed, ExpectedReviewAddedMessage);
		return this;
	}



public BookPage ClickOnContinue()

{
	wait.until(ExpectedConditions.visibilityOf(Continuebtn));
	Continuebtn.click();
	return this;

}
   

}
