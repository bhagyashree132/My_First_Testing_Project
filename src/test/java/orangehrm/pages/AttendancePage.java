package orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttendancePage extends BasePage {
	public AttendancePage(WebDriver driver) {
		super(driver);
	}
	
	

	//Punch In Date
	@FindBy(xpath="//input[@placeholder='yyyy-dd-mm']") WebElement punchinDtHldr;
	//PunchIn  Time
	@FindBy(xpath="//input[@placeholder='hh:mm']") WebElement punchinTmHldr;
	 //Note In ld
	@FindBy(xpath="//textarea[@placeholder=\"Type here\"]") WebElement noteInFld;
	//In Button 
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/child::button") WebElement inButton;
	
	//Punch Out date
	@FindBy(xpath="//input[@placeholder='yyyy-dd-mm']") WebElement punchoutDtHldr;
	//PunchOut time
	@FindBy(xpath="//input[@placeholder='hh:mm']") WebElement punchoutTmhldr;
	 //Note out field
	@FindBy(xpath="//textarea[@placeholder=\"Type here\"]") WebElement noteOutField;
	//Out Button 
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/child::button") WebElement outButton;

	
	public void putPunchInDate()
	{
		//punchinDtHldr.click();
		punchinDtHldr.sendKeys("2024-15-09");
	} 
	public void putPunchInTime()
	{
		//punchinDtHldr.click();
		punchinTmHldr.sendKeys("09:00 AM");
	} 
	
	public void addInTextNote()
	{
		
		noteInFld.sendKeys("Punched in at 9");
	}
	
	public void clickInButton()
	{
		
		inButton.click();
		
	}
	
	public void putPunchOutDate()
	{
		//punchinDtHldr.click();
		punchoutDtHldr.sendKeys("2024-15-09");
	} 
	public void putPunchOutTime()
	{
		//punchinDtHldr.click();
		punchoutTmhldr.sendKeys("06:00 PM");
	} 
	
	public void addOutTextNote()
	{
		
		noteOutField.sendKeys("Punched in at 9");
	}
	
	public void clickOutButton()
	{
		
		outButton.click();
	}
	
}
