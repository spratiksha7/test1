package com.saucedemo.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.webpages.LoginPage;

public class TestScript_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		LoginPage pg=new LoginPage(driver);
		pg.setLogin("standard_user","secret_sauce");
		pg.clicklogin();

	}

}
