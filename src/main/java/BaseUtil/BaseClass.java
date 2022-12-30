package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage; // or protected type
	Configuration config;
	
	@BeforeMethod
	public void setUp (){
		
		/*
		// System is a class and setProperty is a method
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.portal.cms.oct\\driver\\chromedriver.exe");
		*/
		
		/*
		// 2nd way, to show the location of chrome driver
		// This is a dynamic way (relative path)
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		*/
		
		// 3rd and final way, to show the location of chrome driver
		// This is a dynamic way (relative path)
		// I will use this one till end of the course
		// System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
		// driver = new ChromeDriver();
		
		// Above we showed till today with chrome browser
		// If you wanna use gecko driver, you must have firefox browser in your system
		// System.setProperty("webdriver.gecko.driver",  "./driver/geckodriver.exe");
		// You have to change the driver name if you change the driver above
		// driver = new FirefoxDriver();
		
		// If you wanna use edge driver, you must have microsoft edge browser in your system
		// System.setProperty("webdriver.edge.driver",  "./driver/msedgedriver.exe");
		// You have to change the driver name if you change the driver above
		// driver = new EdgeDriver();
		
		// When none of browser working, then you can use webdrivermanager
		// webdriver manager doesn't need any physical driver
		// From below line, the most updated version is used, when no version is mentioned
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		
		// 108.0.5359.71 -- current version, it always changed, so use it
		// 108.0.5359.22 -- older version
		// 107.0.5304.62 -- older version from above
		// older version sometimes used for stability of browser, sometime for the request of Authority
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated version
		// WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
		// driver = new ChromeDriver();
		
		// WebDriverManager is used for most updated firefoxdriver()
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();
		
		// WebDriverManager is used for most updated edgedriver()
		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();
		
		// In the industry: Chrome driver is used 90% time
		// and the best practice to show location: ./driver/chromedriver.exe
		// System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
		// driver = new ChromeDriver();
		
		config = new Configuration();
		initDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://portal.cms.gov/portal/");
		// we are calling URL from properties file
		driver.get(config.getProperty(URL));
		// how to convert String to long ----> Long.parseLong()
		long pageLoadTime =	Long.parseLong(config.getProperty(PAGELOAD_WAIT));
		long implicitlyWait =	Long.parseLong(config.getProperty(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		homePage = new HomePage(driver);
	}
	
	
	private void initDriver() {
		String browserName = config.getProperty(BROWSER);
		
		switch(browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver",  "./driver/gecodriver.exe");
			driver = new FirefoxDriver();
			break;
		case EDGE:
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		
		
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearUp () {
		driver.quit();
	}
	
	

}
