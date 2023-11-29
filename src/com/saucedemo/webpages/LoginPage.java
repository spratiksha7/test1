package com.saucedemo.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


		// TODO Auto-generated method stub````
		private WebElement username;
		private WebElement password;
		private WebElement loginbutton;
		
		public  LoginPage(WebDriver driver)
		{
			username=driver.findElement(By.id("user-name"));
			password=driver.findElement(By.id("password"));
			loginbutton=driver.findElement(By.id("login-button"));
		}
		public void setLogin(String un,String pwd)
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
		}
		public void clicklogin()
		{
			loginbutton.click();
		}

	}


