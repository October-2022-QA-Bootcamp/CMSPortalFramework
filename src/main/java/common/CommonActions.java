package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class CommonActions {
	
	public static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}

	}
	
	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
