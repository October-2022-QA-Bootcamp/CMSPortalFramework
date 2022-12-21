package testPages;

import org.testng.annotations.Test;
import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	
	// The test executed based on alphabetically if no priority given
	
	@Test (enabled = true, priority = 3)
	public void clickLoginButtonTest () throws InterruptedException {
		homePage.clickLoginButton();
	}
	
	@Test (enabled = true, priority = 2)
	public void clickUserIdTest () throws InterruptedException {
		homePage.clickUserId();
	}
	
	@Test (enabled = true, priority = 4)
	public void clickPasswordTest () throws InterruptedException {
		homePage.clickPassword();
	}
	
	
	@Test (enabled = true, priority = 1)
	public void clickNewUserRegistrationTest() throws InterruptedException {
		homePage.clickNewUserRegistration();
	}

}
