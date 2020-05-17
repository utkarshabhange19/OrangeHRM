package WebdriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Shoplesey {
	 public static WebDriver driver;
	 

public static void init1() throws Exception  {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disiable- allnotification");
 driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	  driver =new ChromeDriver();
	driver.get("https://edusol20-trials65101.orangehrmlive.com/auth/login");
	String txtUsername = driver.findElement(By.id("txtUsername")).getAttribute("attribute_value");
	
	//driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[3]/li[2]/a")).click();
	
	
	
}


		

	

}
