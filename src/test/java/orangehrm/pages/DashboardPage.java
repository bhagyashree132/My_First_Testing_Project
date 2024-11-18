package orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	

	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']") WebElement clockButton;
	public void clickClockButton()
	{
		clockButton.click();
	} 
	
	
	
	
}
