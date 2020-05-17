package Shopelesey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebdriverManager.Shoplesey;
import net.bytebuddy.asm.Advice.Return;

public class ResitrationPage extends Shoplesey {

	public static void signbtn() {

		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[3]/li[2]/a")).click();

	}

}
