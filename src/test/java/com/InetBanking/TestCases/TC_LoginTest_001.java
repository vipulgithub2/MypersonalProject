package com.InetBanking.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.InetBanking.PageObject.LoginPage;

public class TC_LoginTest_001 extends TestBase {
	LoginPage loginpage;
	
	WebDriver driver;
	@Test
	public void LoginTest() throws InterruptedException {
		
		
		loginpage=new LoginPage(driver);
		
		Thread.sleep(20);
		
		loginpage.setUserName(username);
		
		Thread.sleep(20);
		
		loginpage.setPassword(password);;
		Thread.sleep(20);
		
		loginpage.ClickSubmit();
		
		
	}

}
