package Calculator;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
static	AppiumDriver <MobileElement>driver;
	
	public static void main(String[] args) throws Exception {
	
		opencalculator();

	}
	
	
	public static void opencalculator() throws Exception  {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "suraj");
		cap.setCapability("udid", "2879b96d0404");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("appPackage", "com.android.vending");
		cap.setCapability("appactivity", "com.miui.calculator.cal.calculatorActivity");
	
		URL url =new URL("http://127.0.01:4723/wd/hub");
		driver =new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Aplication tarted....");
		
		
		
		
		
		
	}
	
	

}
