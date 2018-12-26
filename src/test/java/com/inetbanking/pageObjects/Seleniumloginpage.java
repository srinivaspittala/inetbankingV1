package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumloginpage {

WebDriver ldriver;
	
	public Seleniumloginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")
	@CacheLookup
	WebElement lnkselenium;
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[11]/a")
	@CacheLookup
	WebElement lnklogin;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	@CacheLookup
	WebElement txtemailadd;
	
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	@CacheLookup
	WebElement btnsignin;
	
	
	public void clickselenium() {
		lnkselenium.click();
			
	}
	
	public void clicklogin() {
		lnklogin.click();
			
	}
	
	public void setemail(String eml)
	{
		txtemailadd.sendKeys(eml);
	}
	
	public void setPassword(String pwd)
	{
		txtpass.sendKeys(pwd);
	}
	
	public void clicksignin()
	{
		btnsignin.click();
	}	
	
	
}
