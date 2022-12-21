package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage; // or protected type
	
	@BeforeMethod
	public void setUp () {
		// First job is to recognize the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.portal.cms.oct\\driver\\chromedriver.exe");
		// Then we need to instantiate the driver
		driver = new ChromeDriver();
		// maximize method maximize the window
		driver.manage().window().maximize();
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		// get method get the trageted url
		driver.get("https://portal.cms.gov/portal/");
		// Pageloadtimeout is towait to load the page for curtain amount
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// Implicitly wait is to wait for a webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void tearUp () {
		driver.quit();
	}
	
	

}
