package orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//public WebDriver driver;
public HomePage(WebDriver driver)	
{
  super(driver);	
	}
//To Identify Username Field
@FindBy(xpath="//input[@name='username']") WebElement usernameField;
//To Identify Password Field
@FindBy(xpath="//input[@name='password']") WebElement passwordField;
//To Identify Login Button

@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")  WebElement loginBtn;

@FindBy(xpath="//span[@class=\"oxd-userdropdown-tab\"]") WebElement loginIcon;
public void setUsername(String usermame)
{
	usernameField.sendKeys(usermame);
}  

public void setPassword(String password)
{
	passwordField.sendKeys(password);
}  
public void clickLoginBtn()
{
	loginBtn.click();
	}
public boolean loginIconIsDisplayed()
{
	
	boolean status=loginIcon.isDisplayed();
	return status;
	}
}
