package WebdriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wm {
	static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		 WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();

		
		/*WebDriverManager.firefoxdriver().setup();
         driver =new FirefoxDriver();*/
		
		}

	@Test
	public static void exicute() {
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public static void close() {
		driver.quit();
	}
	
}
