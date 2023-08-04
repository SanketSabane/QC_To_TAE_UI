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

public class JewelleryPage extends BasePage implements TestPage {
	
	
	
	@FindBy(linkText="Jewelry")
	WebElement JwellaryButton;
	
	@FindBy(xpath="//*[contains(text(),'Rent')]")
	WebElement RentButton;
	
	
	@FindBy(xpath="//input[@id='rental_start_date_40']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='rental_end_date_40']")
	WebElement EndDate;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-40']")
	WebElement RentButtonIn;
	
	@FindBy(xpath="//a[@class='ico-cart']")
	WebElement ShoppingCartbtn;
	
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement Iagreecheckbox;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkoutbtn;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	WebElement CountryS;
	  
	   @FindBy(xpath="//input[@id='BillingNewAddress_City']")
		WebElement City;
	   
	   @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
		WebElement Address1;

	   @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
		WebElement Zipcode;
		
	   @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
		WebElement PhoneNumber;
	   
	   @FindBy(xpath="//input[@type='checkbox']")
		WebElement UncheckCheckBox;
	 
		
	   @FindBy(xpath="//button[@onclick='Billing.save()']")
		WebElement Savebtn;
		
	   @FindBy(xpath="//button[@onclick='Billing.save()']")
	   WebElement BillingSavebtn;
	   
	  
	   @FindBy(xpath="//button[@onclick='ShippingMethod.save()']")
	   WebElement ShippingMethod;
	   
		
	   @FindBy(xpath="//input[@id='paymentmethod_1']")
	   WebElement PaymentMethod;
	  
	   @FindBy(xpath="//button[@onclick='PaymentMethod.save()']")
	   WebElement PaymentMethodsave;
	   
	   @FindBy(xpath="//input[@id='CardholderName']") 
	   WebElement CardHolderName;
	   
	   @FindBy(xpath="//input[@id='CardNumber']") 
	   WebElement CardNumber;
	 
	   @FindBy(xpath="//select[@id='ExpireYear']") 
	   WebElement CardExpirYear;
	   
	   public void CardExpirYear (String CardYear)
	     {
	    	 
	    	Select CardExpYear=new Select(CardExpirYear);
	    	CardExpYear.selectByVisibleText(CardYear);
	     }
	   
	   @FindBy(xpath="//input[@id='CardCode']") 
	   WebElement CardCode;
	  
	   @FindBy(xpath="//button[@onclick='PaymentInfo.save()']") 
	   WebElement PaymentSave;
		
		//scroll down
	   
	   @FindBy(xpath="//button[@onclick='ConfirmOrder.save()']") 
	   WebElement ConfirmSave;
	   
	   @FindBy(xpath="//*[contains(text(),'Your order has been successfully processed!')]") 
	   WebElement OrderProcessedMessage;
	   
	   @FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
	   WebElement Continuebtn;
	   
	   
			
	
	public JewelleryPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public JewelleryPage ClickonJwellaryoption()
	
	{
		wait.until(ExpectedConditions.visibilityOf(JwellaryButton));
		JwellaryButton.click();
		return this;
	}
	
	public JewelleryPage ClickonRent()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RentButton));
		RentButton.click();
		return this;
	}
	
	public JewelleryPage EnterStartDate()
	
	{
		wait.until(ExpectedConditions.visibilityOf(StartDate));
		StartDate.sendKeys("3/25/2028");
		return this;
	}
	
   public JewelleryPage EnterEndtDate()
	
	{
		wait.until(ExpectedConditions.visibilityOf(EndDate));
		EndDate.sendKeys("9/27/2032");
		return this;
	}
   
   public JewelleryPage ClickonRenrbuttonIn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RentButtonIn));
		RentButtonIn.click();
		return this;
	}
   
   public JewelleryPage ShoppingCartbutton()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(ShoppingCartbtn));
  		ShoppingCartbtn.click();
  		return this;
  		
  	}
   
   public JewelleryPage IagreeCheckbox()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(Iagreecheckbox));
 		Iagreecheckbox.click();
 		return this;
 		
 	}
   
   public JewelleryPage ClickonCheckoutbutton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Checkoutbtn));
		Checkoutbtn.click();
		return this;
		
	}
   
   public JewelleryPage UncheckShipToSameAddress()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(UncheckCheckBox));
  		UncheckCheckBox.click();
  		return this;
  		
  	}
   
   
   
   public JewelleryPage SelectCountry(String MyContry)
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(CountryS));
  		Select CountryName=new Select(CountryS);
  		CountryName.selectByVisibleText(MyContry);
  		return this;
  		
  	}
   
   
   
   
   
   public JewelleryPage EnterCityName()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(City));
 		City.sendKeys("Pimpri");
 		return this;
 		
 	}

   public JewelleryPage EnterAddress1()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(Address1));
  		Address1.sendKeys("Sinhgad Road Lane 29");
  		return this;
  		
  	}
   
   
   public JewelleryPage EnterZipCode()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(Zipcode));
 		Zipcode.sendKeys("411042");
 		return this;
 		
 	}
   
   public JewelleryPage EnterPhonenumber()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(PhoneNumber));
  		PhoneNumber.sendKeys("9878787834");
  		return this;
  		
  	}
   
   public JewelleryPage Clickonsavebutton()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(Savebtn));
 		Savebtn.click();
 		return this;
 		
 	}
   
   public JewelleryPage ClickonBillingsavebutton()
	
	{
	   	   
		wait.until(ExpectedConditions.visibilityOf(BillingSavebtn));
		BillingSavebtn.click();
		return this;
		
	}
   
   
   
   public JewelleryPage ShippingMethodSave() throws InterruptedException
	
 	{
	  
	   Thread.sleep(5000);
 		wait.until(ExpectedConditions.visibilityOf(ShippingMethod));
 		ShippingMethod.click();
 		return this;
 		
 	}
   
   
   public JewelleryPage SelectPaymentMethod()
	
  	{
	   
  		wait.until(ExpectedConditions.visibilityOf(PaymentMethod));
  		PaymentMethod.click();
  		return this;
  		
  	}
   
   public JewelleryPage SavePaymentMethod()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(PaymentMethodsave));
 		PaymentMethodsave.click();
 		return this;
 		
 	}
   
   public JewelleryPage EnterCardHolderName()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(CardHolderName));
  		CardHolderName.sendKeys("sanket sabane");
  		return this;
  		
  	}
   
   public JewelleryPage EnterCardNumber()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(CardNumber));
 		CardNumber.sendKeys("4111111111111111");
 		return this;
 		
 	}
   
   public JewelleryPage SelectCardExpiryYear(String CardYear)
	
	{
		wait.until(ExpectedConditions.visibilityOf(CardExpirYear));
		Select CardExpYear=new Select(CardExpirYear);
    	CardExpYear.selectByVisibleText(CardYear);
		return this;
		
	}
   
   public JewelleryPage EnterCardCode()
	
	{
		wait.until(ExpectedConditions.visibilityOf(CardCode));
		CardCode.sendKeys("123");
		return this;
		
	}
   
   public JewelleryPage PaymentSave()
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(PaymentSave));
  		PaymentSave.click();
  		return this;
  		
  	}
   
   
   public JewelleryPage ConfirmSave()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(ConfirmSave));
 		ConfirmSave.click();
 		return this;
 		
 	}
   
   
   public JewelleryPage CatchOrderProcessedMessage(String OrderProcessed) throws InterruptedException
	  
 		{
 		    Thread.sleep(5000);
 			wait.until(ExpectedConditions.visibilityOf(OrderProcessedMessage));
 			OrderProcessed=OrderProcessedMessage.getText();
 			System.out.println(OrderProcessed);
 			String ExpectedReviewAddedMessage = "Your order has been successfully processed!";	
 			Assert.assertEquals(OrderProcessed, ExpectedReviewAddedMessage);
 			return this;
 		}
   
   
   
   public JewelleryPage ClickOnContinue()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Continuebtn));
		Continuebtn.click();
		return this;
	
	}
   
   
	
}
