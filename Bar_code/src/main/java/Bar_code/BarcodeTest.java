package Bar_code;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeTest {   //notepad open kr
	
	@Test
	public static void test() throws IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\JARs\\\\chromeSelinium\\\\chrome80.387\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en/?data=suraj%40123%0A&multiplebarcodes=true");
		
		String barcodeurl =driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barcodeurl);
		
		URL url = new URL(barcodeurl);
		BufferedImage bufferimage= ImageIO.read(url);
		
		LuminanceSource luminancesource =new BufferedImageLuminanceSource(bufferimage);
		BinaryBitmap binaryBitmap= new BinaryBitmap(new HybridBinarizer(luminancesource));
		
		Result result =new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
