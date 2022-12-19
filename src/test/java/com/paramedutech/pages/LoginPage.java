package com.paramedutech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebElement UserNameTextBox;
	WebElement PasswordTextBox;
	WebElement LoginButton;
	
public LoginPage(WebDriver driver) {
	
		this.driver = driver;
	}

WebDriver driver;

public WebElement getUserNameTextBox() {
	setUserNameTextBox();
	return UserNameTextBox;
}

public void setUserNameTextBox() {
	UserNameTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
}

public WebElement getPasswordTextBox() {
	setPasswordTextBox();
	return PasswordTextBox;
}

public void setPasswordTextBox() {
	PasswordTextBox =  driver.findElement(By.xpath("//input[@id='input-password']"));;
}

public WebElement getLoginButton() {
	setLoginButton();
	return LoginButton;
}

public void setLoginButton() {
	LoginButton = driver.findElement(By.xpath("//input[@value='Login']"));
}

}
