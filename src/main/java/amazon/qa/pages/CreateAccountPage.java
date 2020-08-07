package amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import amazon.qa.base.TestBase;
import amazon.qa.util.webTools;

public class CreateAccountPage extends TestBase{
	private WebDriver driver;
	//Page Factory -PO
	@FindBy(id="ap_customer_name")
	WebElement Name;
	
	public static final By Name1 = By.id("ap_customer_name");
	
	@FindBy(id="ap_email")
	WebElement Email;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="ap_password_check")
	WebElement ReEnterpassword;
	
	@FindBy(id="continue")
	WebElement CreateAccountButton;
	
	@FindBy(css="a[id='createAccountSubmit']")
	static WebElement CreateYourAmazonAccountButton;
	
	//initializing Page Objects
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void NewAccount(String name,String emlid,String pwd) {
		 Name.sendKeys(name);
		 super.verifyIfStepIsTrue("[NA-1]",webTools.sendTextToTextBox(Name1, name));
		Email.sendKeys(emlid);
		password.sendKeys(pwd);
		ReEnterpassword.sendKeys(pwd);
		CreateAccountButton.click();
	}
	
	
	

}
