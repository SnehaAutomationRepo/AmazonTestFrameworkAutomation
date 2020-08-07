package amazon.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class webTools {
	static SoftAssert softAssert = new SoftAssert();
	static WebDriver driver;
	
	//method to sendKeys
	public static boolean sendTextToTextBox(By name, String Text) {	
		boolean result = true;
		
		((WebElement) name).sendKeys(Text);
		if(((WebElement) name).getAttribute("value").equals(Text)) {
			softAssert.assertTrue(((WebElement) name).getAttribute("value").equals(Text),"Send text to text box "+((WebElement) name)+ "is True");
		}
		else {
			softAssert.assertTrue(((WebElement) name).getAttribute("value").equals(Text),"Send text to text box "+((WebElement) name)+ "is false");
			result = false;
		}
		return result;
	}
	
	//method to perform click
	public static void click(WebElement name) {	
		name.click();
	}
	
	//method to Double Click
	public static void Doubleclick(WebElement name) {	
		Actions actions = new Actions(driver);
		actions.doubleClick(name).perform();
		actions.doubleClick(driver.findElement(By.id("")));
	}
	
	public static boolean hover(WebElement value) {
		boolean result = true;
		Actions action = new Actions(driver);
		if(result) {
		action.moveToElement(value).build().perform();
		}
		else {
			result = false;
		}
		return result;
	}

}
