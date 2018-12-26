package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Seleniumloginpage;
import com.inetbanking.pageObjects.LoginPage;


public class TC_SeleniumLogin_004 extends BaseClass

{
	@Test
	public void seleniumtologin() throws InterruptedException, IOException
	{
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
	
		Seleniumloginpage slogp=new Seleniumloginpage(driver);
		
		logger.info("Checking Selenium to Login");
		
		slogp.clickselenium();
		
		slogp.clicklogin();
		
		slogp.setemail("srinivas.motoe@gmail.com");
		
		slogp.setPassword("chaitra404");
		
		slogp.clicksignin();
				
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Successfully Logged in...");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"seleniumtologin");
			Assert.assertTrue(false);
		}
			
			
		
	}	
	
}
