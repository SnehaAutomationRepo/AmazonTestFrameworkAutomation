package amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.qa.base.TestBase;
import amazon.qa.util.webTools;

public class HomePage extends TestBase {
	
	//Page Factory - Object Repository
	@FindBy(xpath="//span[text()='Hello. Sign in']")
	WebElement HelloSigninHover;
	
	@FindBy(css = "a[id='nav-link-accountList']")
	static
    WebElement HelloSignIn;
	
	@FindBy(linkText="Gift Cards")
	WebElement GiftCards;

	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//a[@class='nav-action-button']//span[text()='Sign in']")
	static
	WebElement Signinbuttn;
	
	@FindBy(xpath="*//a[@aria-label='Amazon']")
	static
	WebElement AmazonLogo;
	
	
	//initializing Page Objects
   public HomePage(){
	PageFactory.initElements(driver, this);
}
   
   
   //Actions 
  public static boolean validateAmazonLogo() {
	  return AmazonLogo.isDisplayed();
  }
  
  public static SignInPage helloSigninhover() {
	  webTools.click(HelloSignIn);
	  return new SignInPage();
  }
  
  public GiftCardsPage giftcardslink() {
	  GiftCards.click();
	  return new GiftCardsPage();
  }
  
  
  
  
  
  
}