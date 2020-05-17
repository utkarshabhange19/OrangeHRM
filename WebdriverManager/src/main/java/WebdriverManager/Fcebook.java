package WebdriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fcebook {
	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver","D:\\JARs\\firefox_setup\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 System.out.println("firefox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("shahinsayyed66@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("mariyam8421");
		Thread.sleep(5000);
		WebElement logIn = driver.findElement(By.id("u_0_b"));
		logIn.click();
		Thread.sleep(5000);
		WebElement priyaKamble = driver.findElement(By.xpath("(//div[@class='linkWrap noCount'])[1]"));
		priyaKamble.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(@class,'_1din _156q')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='_3jjt'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(@class,'_4jy0 _4jy3')])[4]")).click();
		System.out.println("Your profile picture has been saved successfully");
		
		
		
		
	}


}
