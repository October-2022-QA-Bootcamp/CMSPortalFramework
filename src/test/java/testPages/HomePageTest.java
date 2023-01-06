package testPages;

import static common.CommonActions.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	
	Dimension dimension;
	Actions actions;
	Select select;
	
	
	// The test executed based on alphabetically if no priority given
	// enabled = true means The test case is not disable
	// enabled = false means The test case is disable
	// priority = 1 means, this test case will run first
	@Test (enabled = false, priority = 3)
	public void clickLoginButtonTest () throws InterruptedException {
		homePage.clickLoginButton();
	}
	
	@Test (enabled = false, priority = 2)
	public void clickUserIdTest () throws InterruptedException {
		homePage.clickUserId();
	}
	
	@Test (enabled = false, priority = 4)
	public void clickPasswordTest () throws InterruptedException {
		homePage.clickPassword();
	}
	
	
	@Test (enabled = false, priority = 1)
	public void clickNewUserRegistrationTest() throws InterruptedException {
		homePage.clickNewUserRegistration();
	}
	
	// This test case will fail after 20 seconds and show NoSuchElementException
	// if WebDriver don't find the element, it will look for it the time frame given to implicitly wait
	@Test (enabled = false)
	public void implicitlyWaitTest() throws InterruptedException {
		homePage.incorrectNewUserRegistrationClick();
	}
	
	// This test case will fail, remove Pagefactory class from code to test this
	// When PageFactory class is absent, you will find NullPointerException
	@Test (enabled = false)
	public void nullPointerExceptionTest() throws InterruptedException {
		homePage.clickNewUserRegistration();
	}
	
	@Test (enabled = false)
	public void forgotUserIdTest () {
		homePage.forgotUserIdClick();
	}
	
	// if we use try catch block in HomePage, we don't need to use it here, something new
	@Test(enabled = false)
	public void inputTextInUserIdFieldTest() {
		homePage.inputTextInUserIdField();
	}
	
	@Test (enabled = false)
	public void inputTextInUserIdAndPasswordFieldTest () throws InterruptedException {
		homePage.inputTextInUserIdAndPasswordFieldThenClickLoginButton();
	}
	
	// Important: Use of xpath as locator
	// Web Element: New User Registration Button
	// We can use an webelement directly in the test class, that is also common, but different people like different way
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_new_user_registration_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='cms-newuser-reg']")).click();
		Thread.sleep(5000);
	}
	
	// This is best scripted in ebay (I will show it later)
	// Important: Use of linkText as locator
	// Web Element: New User Registration Button
	@Test(enabled = false)
	public void use_of_linkText_as_locator_in_new_user_registration_button() {
		driver.findElement(By.linkText("New User Registration")).click();
	}
	
	// This is best scripted in ebay
	// Important: Use of partialLinkText as locator
	// Web Element: New User Registration Button
	@Test(enabled = false)
	public void use_of_partialLinkText_as_locator_in_new_user_registration_button() {
		driver.findElement(By.partialLinkText("New User Regi")).click();		
	}
	
	// Compound class names not permitted, so if even you see class value unique but separated by space, 
	// it will show error and failed
	@Test(enabled = false)
	public void why_we_use_cssSelector_as_locator_in_logo () {
			driver.findElement(By.className("cms-icon cms-sprite-loggedout ms-3")).click();
	}
	
	// Web Element: New User Registration Button
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> inside the string, first put html tag, then dot, then write value of the class attribute 
	@Test(enabled = false)
	public void role1_use_of_cssSelector_as_locator_in_new_user_registration_button () {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();	
	}
	
	// Web Element: logo
	// Important: Use of cssSelector as locator
	// if the class contain separate words [cms-icon cms-sprite-loggedout ms-3], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class.name.value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = false)
	public void role2_use_of_cssSelector_as_locator_in_logo () {
			driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).click();
	}
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// if you wanna create cssSelector by id 
	// first html tag, then # (hash), then write the value of id attribute inside the string
	@Test(enabled = false)
	public void role3_use_of_cssSelector_as_locator_in_login_button() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
	}
	
	// Use of cssSelector as locator
	// Web Element: login Button
	// high level, can ignore
	// cssSelector by another attribute
	// --> htmltag[any attribute name='value'] , in xpath - you use // and @, which is absent here 
	// and you can use attribute except id and class
	@Test(enabled = false)
	public void role4_use_of_cssSelector_as_locator_in_login_button () {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
	}
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag.value of class[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role5_use_of_cssSelector_as_locator_in_login_button() {
		driver.findElement(By.cssSelector("button.cms-green-button-reg[name='Submit Login']")).click();
	}
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag#value of ID[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role6_use_of_cssSelector_as_locator_in_login_button () {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
	}
	
	// Important: Use of tagName as locator
	// tag name: we have to go to Amazon and look for table
	
	// Web Element: logo
	// isDisplayed() is an alternate of click() method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element within the web page.
	// Use of isDisplayed() available- image, link, button, text field, check box etc.
   @Test(enabled = false)
	public void use_of_isDisplayed_in_logo_image() {
		boolean elementDisplayed = driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).isDisplayed();
		System.out.println("Is the LOGO displayed? Ans: " + elementDisplayed);
	}

   	// Web Element: login Button
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled(), a boolean type method
	
	@Test(enabled = false)
	public void use_of_isEnabled_in_login_button() throws InterruptedException {
		boolean loginButtonEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + loginButtonEnabled);
	}
	
	// Web Element: New User Registration
	// no need next time
	// another example
	@Test(enabled = false)
	public void newUserRegistrationTest() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
	
    // Both is not working
	// Web Element: check box
	@Test (enabled = false)
	public void use_of_isSelected_in_check_box () {
		boolean checkBoxSelected = driver.findElement(By.xpath("//label[@id='cms-label-tc']")).isSelected();
		System.out.println("Is the check Box selected? Ans: " + checkBoxSelected);
	}

	// Web Element: Radio button in Forgot User ID 
	@Test (enabled = false)
	public void use_of_isSelected_in_radio_button () throws InterruptedException {
		// first click on Forgot User ID
		homePage.forgotUserIdClick();
		Thread.sleep(5000);
		boolean radioButtonSelected = driver.findElement(By.xpath("(//label[@class='check-radio'])[1]")).isSelected();
		System.out.println("Is the check Radio Button selected? Ans: " + radioButtonSelected);
	}
	
	@Test(enabled = false)
	public void logoDisplayedTest() {
		homePage.logoDisplayed();
	}
	
	@Test (enabled = false)
	public void clickUnlockTest() {
		homePage.clickUnlock();
	}
	
	// We use New User Registration
	// how can you find the title of the page?
	// Basically inside <head> tag, <title> tag is present, you can get it from there or
	// right click on an empty place of any page -- click "view page source" -- ctrl+f (to find) 
	// -- Type 'title' -- find the <title> tag
	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page() {
		System.out.println("The Title of the Page is: " + driver.getTitle());
	}
	
	// We use New User Registration
	@Test(enabled = false)
	public void use_of_getTitle_method_in_nur_page() throws InterruptedException {
		driver.findElement(By.className("cms-newuser-reg")).click();
		Thread.sleep(5000);
		System.out.println("The Title of the Page is: " + driver.getTitle());
	}
	
	// We use New User Registration	
	@Test(enabled = false)
	public void use_of_getCurrentURL_method () throws InterruptedException {
		driver.findElement(By.className("cms-newuser-reg")).click();
		Thread.sleep(5000);
		System.out.println("The Title of the Page is: " + driver.getTitle());
		System.out.println("The current URL is: " + driver.getCurrentUrl());
	}
	
	// We use New User Registration web element to see the text of the web element
	@Test(enabled = false)
	public void use_of_getText_method () {
		WebElement nur = driver.findElement(By.className("cms-newuser-reg"));
		System.out.println("The Text for the Web Element is: " + nur.getText());
	}
	
	// In User id no text is present, let's see what it shows as text? -- Empty
	@Test(enabled = false)
	public void use_of_getText_method_in_userid () {
		WebElement userId = driver.findElement(By.name("user-d"));
		System.out.println("The Text for the Web Element is: " + userId.getText());
	}
	
	// We use New User Registration
	// getAttribute() actually give the value of the Attribute
	@Test(enabled = false)
	public void use_of_getAttribute_method () {
		String value01 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("id");
		String value02 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("class");
		String value03 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("title");
		String value04 = driver.findElement(By.xpath("//a[contains(text(), 'New')]")).getAttribute("href");
		System.out.println("The value of the id attribute is: " + value01);
		System.out.println("The value of the class attribute is: " + value02);
		System.out.println("The value of the title attribute is: " + value03);
		System.out.println("The value of the href attribute is: " + value04);
	}
	
	// CMS doesn't have search field, so we will direct to Amazon page
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_submit_and_then_clear() throws InterruptedException {
		Thread.sleep(5000);
		// directing to Amazon.com but this you will never see in industry
		// I did it just for emergency
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Writing text in search field
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		Thread.sleep(5000);
		// click on submit button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(5000);
		// Writing text in search field
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPad");
		Thread.sleep(5000);
		// click on submit button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		
	}
	
	// search field
	// enter_key = Enter/Return button in your laptop/desktop
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_enter_key_or_button_and_then_clear () throws InterruptedException {
		Thread.sleep(5000);
		// directing to Amazon.com but this you will never see in industry
		// I did it just for emergency
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Writing text in search field and press Enter button
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple Watch", Keys.ENTER);
		Thread.sleep(5000);
		// You don't need to click on submit button
		// driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(5000);
		// Writing text in search field and press on Return button
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Airpod Pro", Keys.RETURN);
		Thread.sleep(5000);
		// You don't need to click on submit button
		// driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		// Thread.sleep(5000);
	}
	
	@Test(enabled = false)
	public void use_of_navigate_method () throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	// Very important interview question
	// How can you reset a window size? or they can ask how you can change the screen size by selenium
	@Test(enabled = false)
	public void use_of_set_specific_size_in_a_window() throws InterruptedException {
		Thread.sleep(3000);
		// Will get the size of cms window
		// System.out.println("The size of the maximize screen is: "+ driver.manage().window().getSize());
		dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("https://www.cvs.com");
		Thread.sleep(4000);
		System.out.println("The size of the set screen is: "+ driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the maximize screen is: "+ driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension); // just to show again the set size
		Thread.sleep(5000);
		System.out.println("The size of the set screen is: "+ driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the full screen is: "+ driver.manage().window().getSize());				
	}
	
	// not important at all
	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void use_of_set_script_timeout_for_window() {
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
        // setScriptTimeout () method deprecated, so giving you warning, this method is going to be out from selenium
        // you use @SuppressWarnings("deprecation")
		driver.get("https://www.ebay.com");		

	}
	
	@Test(enabled = false)
	public void logoDisplayedTest1() {
		homePage.logoDisplayed();
		Assert.assertTrue(true, "Application Logo is not Displayed ..... ..... ");
	}
	
	// Web Element: logo (mount sinai)
	@Test(enabled = false)
	public void role1_use_of_hard_assert_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag2 = logo.isDisplayed();
		System.out.println("Is the logo displayed? Ans: "+flag2);
		Assert.assertTrue(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
	}
	
	// Web Element: logo (mount sinai)
	@Test(enabled = false)
	public void role2_use_of_hard_assert_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertFalse(false, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
	}
	
	// Web Element: logo (mount sinai)
	// This test case will be failed
	@Test(enabled = false)
	public void role3_use_of_hard_assert_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Mount Sinai']"));
		boolean flag = logo.isDisplayed();
		// System.out.println("Is the logo displayed? Ans: "+flag);
		Assert.assertFalse(true, "Application Logo is not displayed .....");	// error message will be appeared when the assertion failed 
	}
	
	// A regular title test
	@Test(enabled = false)
	public void use_of_getTitle_method01() throws InterruptedException {
		Thread.sleep(5000);	
		System.out.println("The title of the Page is: " + driver.getTitle());
	}
	
	// Will Pass
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion01() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");  
		// Hard Assertion will not go to next line of failed, but move to next line when passed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
		
	}
	
	// Will Fail
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion02() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal           ";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");  // Hard Assertion, execution stopped here if Assertion fail
		// Hard Assertion will not go to next line of failed, but move to next line when passed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
		
	}
	
	// Will Pass
	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal           ";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Home Page Title doesn't match ....... "); 
		// Soft Assertion, execution will not stopped here if Assertion is failed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
		
	}
	
	// Hover Action or Mouse Hover Over action
	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_aboutUs() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		// To do the mouse hove action, we use Actions class
		actions = new Actions(driver);
		WebElement aboutUs = driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class= 'hidden-xs dropdown']"));
		Thread.sleep(5000);	
		actions.moveToElement(aboutUs).build().perform();  // this syntax interview question
		Thread.sleep(4000);
		
	}
	
	// similar like above, nothing different, extra example
	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_ourLocations () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		Actions actions = new Actions(driver); // very important interview question
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(6000);	
		System.out.println("\nThe text of this web element is: "+ ourLocations.getText());
	}
	
	// CMS dropdown Application doesn't work because it's created dynamically by angular framework
	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// here - using selectByIndex() method
	// This method is not suggested, or not used much
	// Because, adding a new web element or deleting a new one change the index number
	@Test(enabled=false)
	public void use_of_dropdown_selectByIndex_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement dropElement1 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		select = new Select(dropElement1);
		select.selectByIndex(10);
		Thread.sleep(4000);
	}

	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()
	@Test(enabled=false)
	public void use_of_dropdown_selectByVisisbleText_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement droElement2 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		select = new Select(droElement2);
		select.selectByVisibleText("Books");
		Thread.sleep(4000);
	}
	
	// drop down, all categories
	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test(enabled=false)
	public void use_of_dropdown_selectByValue_method () throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropElement3 = driver.findElement(By.name("_sacat"));
		select = new Select(dropElement3);
		select.selectByValue("15032");
		Thread.sleep(5000);		
	}
	
	// Regular click method
	@Test(enabled = false)
	public void use_of_click_method_in_loginButtonTest () throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3000);
	}
	
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest01() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest02() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}
	

	// alternate of click()
	@Test(enabled = true)
	public void alternate_of_click_method_in_loginButtonTest03() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.id("cms-login-submit"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
		Thread.sleep(4000);
	}
	
	// alternate of click()
	// "arguments[0].click()" --- easy to memorize, memorize it, if you want
	// follow the above one, because you can use any kind of locator 
	// (specially xpath is difficult to create by below one)
	// Que: what is the alternative of click() method or click an web element 
	// or how to find a hidden web element-- very important interview question 
	// don't follow this one, but if you ever see it, i hope you can recognize it
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest04() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('cms-login-submit').click();");
	}
	
	// From here till end, this is high level, so just see, don't take them seriously
	// alternative to click an web element in many ways (never memorize, a collection of code)
	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest06() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.click(homepageLoginButton).perform();
	}
	
	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest07() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.moveToElement(homepageLoginButton).click().perform();
	}

	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest08() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.clickAndHold(homepageLoginButton).release().perform();
	}

	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest09() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
	}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	

}
