package WebdriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrickeyWebpage {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		  driver =new ChromeDriver();
		driver.get(
				"https://www.google.com/search?sxsrf=ALeKk00ec2o_gQbVPfs32PfJXXXMaJAOFA%3A1587808143980&source=hp&ei=jwekXofqOY-Q4-EPlOG3sAs&q=wizard+of+oz&oq=wizar+o&gs_lcp=CgZwc3ktYWIQAxgAMgQIABAKMgQIABAKMgQIABAKMgQIABAKMgQIABAKMgQIABAKMgQIABAKMgQIABAKMgQIABAKMgQIABAKOgQIIxAnOgIIADoFCAAQgwE6BAgAEEM6BwgjELECECdQnjtYxEJgv1BoAHAAeACAAdsBiAG3BJIBBTAuMi4xmAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"rhs\"]/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/canvas"))
				.click();

driver.navigate().refresh();
		//driver.findElement(By.xpath("//*[@id=\"rhs\"]/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/canvas")).click();

		

		String tital=driver.getTitle();
		System.out.println(tital);
	 Assert.assertEquals(tital, "wizard of oz - Google Search");
		System.out.println("done");
	}

}
