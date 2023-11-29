package com.saucedemo.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.webpages.Home;
import com.saucedemo.webpages.Loginpage1;

public class TestScript_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Loginpage1 ref=new Loginpage1(driver);
		ref.enterusernmae("standard_user");
		ref.enterpassword("secret_sauce");
		ref.clickonlogin();
		
		Home ref1=new Home(driver);
		
		ref1.clickOnAddToCart();
		
		

	}

}
