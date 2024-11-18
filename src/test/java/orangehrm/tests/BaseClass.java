package orangehrm.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import orangehrm.pages.HomePage;

public class BaseClass {
	
	
	public WebDriver driver;
@SuppressWarnings("deprecation")
@BeforeClass
@Parameters({"browser"})
	public void setup(String br)
	{
	 
	   switch(br.toLowerCase())
	   {
	  
	   case "chrome":	driver = new ChromeDriver();break;
	   case "edge" :    driver = new EdgeDriver();break;
	   case "firefox":  driver = new FirefoxDriver();break;
	   default: System.out.println("Invalid Browser Name "); return;
	   }
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

public static void  login(WebDriver driver)
{
	System.out.println("Code is coming in login");
HomePage hp1 =new HomePage(driver);
hp1.setUsername("Admin");
hp1.setPassword("admin123");
hp1.clickLoginBtn();
	
}

/***	@AfterClass
public void teardown()
{
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	driver.close();
}***/

}
