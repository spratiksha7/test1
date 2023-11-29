package com.saucedemo.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	//with using page factory
	WebDriver driver;
	public Loginpage1(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	//identify element
	@FindBy(id="user-name")
      WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	public void enterusernmae(String user)
	{
		username.sendKeys(user);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonlogin()
	{
		loginbutton.click();
	}
}
