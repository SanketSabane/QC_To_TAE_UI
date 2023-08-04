package com.automationTest.pages;

import org.openqa.selenium.JavascriptExecutor;
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

public class SendGiftCardToFriendByEmailPage extends BasePage implements TestPage {
	
	
	//Jewelry start..
	
	@FindBy(linkText="Gift Cards")
	WebElement GiftCardButton;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement SortByPrice;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement SortBySize;
	
	@FindBy(xpath="//a[@class='viewmode-icon list']")
	WebElement ListView;
	
	@FindBy(xpath="//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/45/1/1\"),!1']")
	WebElement AddToCartbtn;
	
	@FindBy(xpath="//input[@class='recipient-name']")
	WebElement RecipientsName;
	
	@FindBy(xpath="//textarea[@class='message']")
	WebElement Message;
	
	@FindBy(xpath="//button[@class='button-2 email-a-friend-button']")
	WebElement EmailToFriend;
	
	@FindBy(xpath="//input[@class='friend-email']")
	WebElement FriendEmailId;
	
	
	@FindBy(xpath="//textarea[@class='your-email']")
	WebElement PersonalMessage;


	@FindBy(xpath="//button[@name='send-email']")
	WebElement SendEmailbtn;
	
	@FindBy(xpath="//div[@class='result']	")
	WebElement EmailSendMessage;
	
	
	
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
	


	
	public SendGiftCardToFriendByEmailPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public SendGiftCardToFriendByEmailPage ClickonGiftCardButtonButton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(GiftCardButton));
		GiftCardButton.click();
		return this;
	}
	
	
	
  public SendGiftCardToFriendByEmailPage  SelectPriceRange(String PriceRange)
	
	{
		wait.until(ExpectedConditions.visibilityOf(SortByPrice));
		
		Select PriceRangeValue=new Select(SortByPrice);
		PriceRangeValue.selectByVisibleText(PriceRange);
		return this;
	}
  
  
  public SendGiftCardToFriendByEmailPage SelectPageSize(String PageSize)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(SortBySize));
 		
 		Select PageSizeValue=new Select(SortBySize);
 		PageSizeValue.selectByVisibleText(PageSize);
 		return this;
 	}
	
	

  public SendGiftCardToFriendByEmailPage SetListView()
	
	{
		wait.until(ExpectedConditions.visibilityOf(ListView));
		ListView.click();
		return this;
	}
  
  public SendGiftCardToFriendByEmailPage ClickAddToCartButton() throws InterruptedException
	
	{
	   Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(AddToCartbtn));
		AddToCartbtn.click();
		
		JavascriptExecutor js11 = (JavascriptExecutor)driver;
		js11.executeScript("window.scroll(0,450)");
			
		return this;
	}
  
  
  public SendGiftCardToFriendByEmailPage EnterRecipientsName()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RecipientsName));
		RecipientsName.sendKeys("MyFriend");
		return this;
		
		//Message
	}
  
  
  public SendGiftCardToFriendByEmailPage EnterMessage()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(RecipientsName));
 		Message.sendKeys("Hey...Enjoy you'r Birthday Gift\n Happy Birthday.");
 		return this;		
 	}
  
  
  public SendGiftCardToFriendByEmailPage ClickOnEmailToFriendBtn()
	
	{
		wait.until(ExpectedConditions.visibilityOf(EmailToFriend));
		EmailToFriend.click();
		return this;
		
		
	}
  
  
  public SendGiftCardToFriendByEmailPage EnterFriendEmailId()
	
	{
		wait.until(ExpectedConditions.visibilityOf(FriendEmailId));
		FriendEmailId.sendKeys("Myfriend@gmail.com");
		return this;
		
		
	}
  
  
  public SendGiftCardToFriendByEmailPage EnterPersonalMessage()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(PersonalMessage));
 		PersonalMessage.sendKeys("Did you like the gift..?");
 		return this;		
 	}
  
  
  public SendGiftCardToFriendByEmailPage ClickOnSendEmailBtn()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(SendEmailbtn));
 		SendEmailbtn.click();
 		return this;	
 	}
  
  
  
  
  public SendGiftCardToFriendByEmailPage GetEmailMessage(String EmailMessage)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(EmailSendMessage));
 		EmailMessage = EmailSendMessage.getText();
 		System.out.println(EmailMessage);
 		
 		String ExpectedEmailSendMessage = "Your message has been sent.";	
		Assert.assertEquals(EmailMessage, ExpectedEmailSendMessage);
		return this;
		
 	}
   
  
  public SendGiftCardToFriendByEmailPage ClickonWishList()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(ClickWishList));
 		ClickWishList.click();
 		return this;
 	}
  
  public SendGiftCardToFriendByEmailPage GetTotalAmount(String TotalAmountOfProduct)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(TotalAmount));
 		TotalAmountOfProduct= TotalAmount.getText();
 		System.out.println(TotalAmountOfProduct);
 		return this;
 	}
  
  public SendGiftCardToFriendByEmailPage EnterQuantity()
	
	{
		wait.until(ExpectedConditions.visibilityOf(EnterQuantity));
		EnterQuantity.clear();
		EnterQuantity.sendKeys("4" + Keys.ENTER);
		return this;
	}
  
  
  public SendGiftCardToFriendByEmailPage GetUpdatedTotalAmount(String UpdatedTotalAmountOfProduct)
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(UpdatedAmount));
 		UpdatedTotalAmountOfProduct= UpdatedAmount.getText();
 		System.out.println(UpdatedTotalAmountOfProduct);
 		return this;
 	}
  
  public SendGiftCardToFriendByEmailPage RemoveProductFromWishList()
	
	{
		wait.until(ExpectedConditions.visibilityOf(RemoveWishList));
		RemoveWishList.click();
		return this;
	}
  
  public SendGiftCardToFriendByEmailPage RemoveWishListConfirmation(String EmtyMessage) throws InterruptedException
	
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
