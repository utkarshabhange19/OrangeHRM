package PDF_Reader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PDF_Reader {   // notepad open kr
	@Test
	public void Pdf_reader() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\JARs\\\\chromeSelinium\\\\chrome80.387\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.orimi.com/pdf-test.pdf");
		
		String Currenturl = driver.getCurrentUrl();
		
		System.out.println(Currenturl);
		
		URL url =new URL(Currenturl);
		
		InputStream is =url.openStream();
		
		BufferedInputStream filepars =new BufferedInputStream(is);
		
		PDDocument document = null;
		
		document = PDDocument.load(filepars);
		
		String pdfcintain =new PDFTextStripper().getText(document);
		
		System.out.println(pdfcintain);
		
		
		
		
		
		
		
	}

}
