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

public class AddProductReviewPage extends BasePage implements TestPage {
	
	
	//Apparel start..
	
	
	@FindBy(linkText="Apparel")
	WebElement ApparelButton;  
	
	
	@FindBy(linkText="Shoes")
	WebElement Shoes; 
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement SortByPrice;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement SortBySize;
	
	@FindBy(xpath="//a[@class='viewmode-icon list']")
	WebElement ListView;
	
	@FindBy(xpath="//Button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/25/1/1\"),!1']")
	WebElement AddToCartBtn;
	
	@FindBy(xpath="//select[@id='product_attribute_9']")
	WebElement ShoesSize;
	
	@FindBy(xpath="//span[@style='background-color:#363656']")
	WebElement ShoesColor;
	
	@FindBy(xpath="//*[contains(text(),'Add your review')]")
	WebElement AddReviewClick;
	
	@FindBy(xpath="//input[@class='review-title']")
	WebElement ReviewTitle;
	
	@FindBy(xpath="//textarea[@class='review-text']")
	WebElement ReviewText;
	
	@FindBy(xpath="//button[@name='add-review']")
	WebElement Submitbtn;
	
	@FindBy(xpath="//div[@class='result']")
	WebElement ProductReviewMessage;
	
	
	
	
	
	public AddProductReviewPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	
	
	public AddProductReviewPage HoverOnApparelClickOnShoes()
	
	{
		wait.until(ExpectedConditions.visibilityOf(ApparelButton));
		//ApparelButton.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(ApparelButton).perform();;
		wait.until(ExpectedConditions.visibilityOf(Shoes));
		Shoes.click();
		return this;
		
	}
	
	
	  public AddProductReviewPage SelectPriceRange(String PriceRange)
		
		{
			wait.until(ExpectedConditions.visibilityOf(SortByPrice));
			
			Select PriceRangeValue=new Select(SortByPrice);
			PriceRangeValue.selectByVisibleText(PriceRange);
			return this;
		}
	  
	  
	  public AddProductReviewPage SelectPageSize(String PageSize)
		
	 	{
	 		wait.until(ExpectedConditions.visibilityOf(SortBySize));
	 		
	 		Select PageSizeValue=new Select(SortBySize);
	 		PageSizeValue.selectByVisibleText(PageSize);
	 		return this;
	 	}
		
		

	  public AddProductReviewPage SetListView()
		
		{
			wait.until(ExpectedConditions.visibilityOf(ListView));
			ListView.click();
			return this;
		}
   
	  public AddProductReviewPage ClickAddToCartButton() throws InterruptedException
		
		{
		    Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(AddToCartBtn));
			AddToCartBtn.click();
			return this;
		}
	  
	  public AddProductReviewPage SelectShoesSize(String SizeofShoes) throws InterruptedException 
		
			{
			   Thread.sleep(2000);
			   wait.until(ExpectedConditions.visibilityOf(ShoesSize));		 		
		 		Select ShoesSizeValue=new Select(ShoesSize);
		 		ShoesSizeValue.selectByVisibleText(SizeofShoes);
		 		return this;
			}
   
   
	  public AddProductReviewPage SelectColorOfShoes() 
		
		{
		   
		   wait.until(ExpectedConditions.visibilityOf(ShoesColor));		
		   ShoesColor.click();	 		
	 		return this;
		}
   
	  public AddProductReviewPage ClickonAddReview()
		
		{
			wait.until(ExpectedConditions.visibilityOf(AddReviewClick));
			AddReviewClick.click();
			return this;
		}
	  
	  public AddProductReviewPage EnterReview()
		
		{
			wait.until(ExpectedConditions.visibilityOf(ReviewTitle));
			ReviewTitle.sendKeys("Shoes Review");
			return this;
		}
	  
	  
	  public AddProductReviewPage EnterReviewText()
		
		{
			wait.until(ExpectedConditions.visibilityOf(ReviewText));
			ReviewText.sendKeys("Nice Grip..\\nPerfect Fitting..");
			return this;
		}
	  
	  
	  public AddProductReviewPage ClickonSubmitbutton()
		
		{
			wait.until(ExpectedConditions.visibilityOf(Submitbtn));
			Submitbtn.click();
			return this;
		}
	  
	  public AddProductReviewPage CatchReviewAddedMessage(String ProductReview) throws InterruptedException
	  
		{
		    Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(ProductReviewMessage));
			ProductReview=ProductReviewMessage.getText();
			System.out.println(ProductReview);
			String ExpectedReviewAddedMessage = "Product review is successfully added.";	
			Assert.assertEquals(ProductReview, ExpectedReviewAddedMessage);
			return this;
		}
	  
		
     
	
}
