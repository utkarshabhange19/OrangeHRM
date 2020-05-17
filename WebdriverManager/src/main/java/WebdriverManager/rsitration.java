package WebdriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rsitration {
	
 rsitration() {

		PageFactory.initElements(Shoplesey.driver, this);
	}
 
 @FindBy(xpath = "//*[@href=\"/shopieasy/customer/registration\"]")
	static WebElement signing;

	public static void isAvailable() {
		signing.click();
	}

	public static void main(String[] args) {
	

		

	}

}
