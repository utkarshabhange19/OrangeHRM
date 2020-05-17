package WebdriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmDemo {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://edusol20-trials65101.orangehrmlive.com/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		String txtUsername = driver.findElement(By.id("txtUsername")).getAttribute("style");
		
		System.out.println(txtUsername);
		
		String txtPassword = driver.findElement(By.id("txtPassword")).getAttribute("style");
		System.out.println(txtPassword);
		/* driver.findElement(By.id("txtUsername")).sendKeys("Admin"); driver.findElement(By.id("txtUsername"));
	
		 String sp = driver.findElement(By.id("txtUsername")).getAttribute("text");
		
		System.out.println(sp);
		 
		String nonExistingAttributeValue=sp.getAttribute("nonExistingAttribute");
		 System.out.println("Value of nonExistingAttribute attribute: ");
		 
*/
		driver.close();
	}

}
