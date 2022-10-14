package com.InetBanking.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;





public class TestBase {

	
	public String  baseURL="https://demo.guru99.com/v4/";
	public String username="mngr446844";
	public String password="tUjegut";
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(baseURL);
	}
//	@AfterClass
//   public void teardown() {
//	driver.close();

}

