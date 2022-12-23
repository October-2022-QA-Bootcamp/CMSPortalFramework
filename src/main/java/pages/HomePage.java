package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage (WebDriver driver) {
		this.driver = driver;
		// PageFactory help to instantiate WebElements
		PageFactory.initElements(driver, this);
	}
	
	// 1st way: Most common way to write the WebElement (@FindBy), you must know how to do that
	// Use of 'Id' attribute as locator
	@FindBy (id = "cms-login-submit")
	WebElement loginButton;
	
	@FindBy (name = "user-d")
	WebElement userId;
	
	// 2nd way to write the WebElement: not common, here password, I used
	// I will show it in the next class how to write method for this
	@FindBy (how = How.NAME, using = "pass-d")
	WebElement password;
	
	// Use of 'className' attribute as locator
	@FindBy (className = "cms-newuser-reg")
	WebElement newUserRegistration;
	
	@FindBy (className = "cms-newuser-registration")
	WebElement IncorrectNewUserRegistration;
	
	// Use of xpath as locator 
	@FindBy(xpath = "//a[text()='User ID']")
	WebElement forgotUserId;
	
	
	
	
	
	public void clickLoginButton () throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
	}
	
	public void clickUserId () throws InterruptedException {
		userId.click();
		Thread.sleep(3000);
	}
	
	public void clickPassword () throws InterruptedException {
		password.click();
		Thread.sleep(3000);
	}
	
	public void clickNewUserRegistration () throws InterruptedException {
		newUserRegistration.click();
		Thread.sleep(6000);
	}
	
	// If your Internet is slow, you can see the action of the pageLoadTimeout(), you can see it is taking 20 seconds to load the page
	// it shows error
	
	public void incorrectNewUserRegistrationClick(){
		IncorrectNewUserRegistration.click();
	}
	
	// click method is used from CommonActions
	public void forgotUserIdClick() {
		clickElement(forgotUserId);
	}
	
	// We are using sendKeys() to input text
	// here instead of throws , we are using try catch block
	// No relation of try catch with sendKeys()
	public void inputTextInUserIdField ()  {
		try {
		userId.sendKeys("Enthrall October 2022");
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// I used 2 common actions method
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton () throws InterruptedException {
		inputText(userId, "Enthrall October 2022");
		inputText(password, "Enthrall@123454");
		Thread.sleep(6000);
		clickElement(loginButton);
		Thread.sleep(6000);
	}
	
	

}
