package com.orangeHRM.BasePackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static WebDriver driver;
	
	public static Properties pro;

	public BaseClass() {
		pro = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(
					"D:\\SpringBoot API Projects\\OrangeHRM\\src\\main\\java\\com\\orangeHRM\\Properties\\config.properties");
			pro.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://edusol20-trials65101.orangehrmlive.com/auth/login");
		System.out.println("init method exicute");
		
		System.out.println("suraj changes last day");
		
	}
	

}
