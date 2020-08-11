package amazon.qa.testcases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazon.qa.base.TestBase;
import amazon.qa.pages.CreateAccountPage;
import amazon.qa.pages.HomePage;
import amazon.qa.pages.SignInPage;
import amazon.qa.util.TestUtil;

public class CreateAccountPageTest extends TestBase {
	
	HomePage homePage;
	SignInPage esignin;
	CreateAccountPage crtaccpg;
	String sheetName = "AccountData";
	
	//Create account Page Test
	//Comment added to test stash
	
	//extra work
	public CreateAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		esignin = new SignInPage();
		HomePage.helloSigninhover();
		esignin.ClickCreateAccount();
		
    }

	@Test(dataProvider="getAmazonTestData")
	public void CreateAccTest(String name, String email, String password) {
		crtaccpg = new CreateAccountPage();
		crtaccpg.NewAccount(name, email, password);
	
	}
	
	
	@DataProvider
    public Map<String,String> getAmazonTestData() {
		 Random rand = new Random(); 
		 Object info1[][];
		 Map<String, String> data = new HashMap();
	        // Generate random integers in range 0 to 999 
	        int num = rand.nextInt(1000);
	        String name = "rocky"+num;
	        String email = "rocky"+num+"@gmail.com";
	        String password = "mybestbuddy";
	        
	        data.put(name, "rocky"+num);
	        data.put(email, "rocky"+num+"@gmail.com");
	        data.put(password, "mybestbuddy");
				//= TestUtil.getTestData(sheetName);
	        
		return data;
	}
	
	
    @AfterMethod
    public void teardown() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}


}