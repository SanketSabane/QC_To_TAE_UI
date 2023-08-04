package com.automationTest.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

public class ApplyForVendorAccountPage extends BasePage implements TestPage {
	
	
	//Vendor Account start..
	
	@FindBy(xpath="//*[contains(text(),'Apply for vendor account')]")
	WebElement VendorAccount;
	

	@FindBy(xpath="//input[@placeholder='Enter vendor name.']")
	WebElement VendorName;

	@FindBy(xpath="//textarea[@id='Description']")
	WebElement Description;
	
	@FindBy(xpath="//button[@id='apply-vendor']")
	WebElement Submitbtn;
	
	
	@FindBy(xpath="//div[@class='result']")
	WebElement ConfirmationMessageVendorAccount;
	
	
	
	public ApplyForVendorAccountPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
	}

	

	
	public ApplyForVendorAccountPage ClickonVendorAccount()
	
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2400)");
		wait.until(ExpectedConditions.visibilityOf(VendorAccount));
		VendorAccount.click();
		return this;
	}
	
   public ApplyForVendorAccountPage EnterVendorName()
	
	{
		wait.until(ExpectedConditions.visibilityOf(VendorName));
		VendorName.sendKeys("Sanket Sabane");
		return this;
	}
   
   public ApplyForVendorAccountPage EnterVendorDescription()
	
 	{
 		wait.until(ExpectedConditions.visibilityOf(Description));
 		Description.sendKeys("Hello..\n \nPlease send me the Vendor account details \n \nThanks\""  +Keys.TAB +Keys.ENTER);
 		return this;
 	}
   
   public ApplyForVendorAccountPage SelectFile() throws InterruptedException, AWTException
	
	{
		//Choose File	 - Need to store this file on common location. ***
		Thread.sleep(2000);
		Robot rb = new Robot();	
		StringSelection str = new StringSelection("C:\\Users\\sanket.sabane\\Downloads\\NewUser.PNG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	    
	    Thread.sleep(2000);
	    // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	    
	     Thread.sleep(2000);
	    // release Contol+V for pasting
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	  
	     Thread.sleep(2000);
	     // for pressing and releasing Enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
		return this;
	}
   
   public ApplyForVendorAccountPage ClickonSubmitButton()
	
	{
		wait.until(ExpectedConditions.visibilityOf(Submitbtn));
		Submitbtn.click();
		return this;
	}
	
   public ApplyForVendorAccountPage GetConfirmationMessage(String VendorAccountMessage)
	
  	{
  		wait.until(ExpectedConditions.visibilityOf(ConfirmationMessageVendorAccount));
  		VendorAccountMessage= ConfirmationMessageVendorAccount.getText();
 		System.out.println(VendorAccountMessage);
       String ExpectedMessage = "Your request has been submitted successfully. We'll contact you soon.";		
		Assert.assertEquals(VendorAccountMessage, ExpectedMessage);
 		return this;
  	}
 
   

	
}
