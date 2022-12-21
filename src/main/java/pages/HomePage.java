package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy (className = "cms-newuser-reg")
	WebElement newUserRegistration;
	
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
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	

}
