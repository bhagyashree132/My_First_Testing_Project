package orangehrm.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import orangehrm.pages.HomePage;

public class LoginPage_tc extends BaseClass {

	
	@Test(priority=1)
	public void verifyLogin()
	{
      
		try {
		HomePage hp =new HomePage(driver);
		hp.setUsername("Admin");
		hp.setPassword("admin123");
		hp.clickLoginBtn();

		boolean status=hp.loginIconIsDisplayed();
		assertEquals(status, true);
		
		}
		catch(NoSuchElementException e){
		System.out.println("Exception catched:"+e);	
		System.out.println("Login is not successful");	
		}
	}
}
