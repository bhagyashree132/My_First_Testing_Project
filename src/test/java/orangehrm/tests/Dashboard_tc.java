package orangehrm.tests;

import org.testng.annotations.Test;

import orangehrm.pages.AttendancePage;
import orangehrm.pages.DashboardPage;

public class Dashboard_tc extends BaseClass{
	@Test(priority=1)
	public void AttendanceFLow()
	{
      
		try {
			
	
		DashboardPage dp =new DashboardPage(driver);
		AttendancePage ag=new AttendancePage(driver);
		BaseClass.login(driver);
        dp.clickClockButton();
        ag.putPunchInDate();
       ag.putPunchInTime();
      ag.addInTextNote();
    ag.clickInButton();
     ag.putPunchOutDate();
      // ag.putPunchOutTime();
        ag.addOutTextNote();
       // ag.clickOutButton();*/
      //  driver.navigate().back();
		
		
		}
        catch(Exception e)
		{}
		
	}
	
}

