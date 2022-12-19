package com.paramedutech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paramedutech.project.Utility;

public class BasePage {
	WebDriver driver;
	WebElement shoppingcartlink;
	WebElement checkoutlink;
	WebElement myaccountLink;
	WebElement loginLink;
	
	

	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getShoppingcartlink() {
		setShoppingcartlink();
		return shoppingcartlink;
	}

	public void setShoppingcartlink() {
		shoppingcartlink = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
	}

	public WebElement getCheckoutlink() {
		setCheckoutlink();
		return checkoutlink;
	}

	public void setCheckoutlink() {
		checkoutlink = driver.findElement(By.xpath("//span[text()='Checkout']"));
	}
	
	public WebElement getMyaccountLink() {
	setMyaccountLink();
		return myaccountLink;
	}

	public void setMyaccountLink() {
		myaccountLink = driver.findElement(By.xpath("//a[@title='My Account']"));
	}

	public WebElement getLoginLink() {
		setLoginLink();
		return loginLink;
	}

	public void setLoginLink() {
		loginLink = driver.findElement(By.xpath("//[starts-with(@class,'dropdown')]//li/a[countains(@href,'login')]"));
	}

	public void clickOnShoppingCart()
	{;
		getShoppingcartlink().click();
	}
	
	public void clickOnLoginLink()
	{
		getMyaccountLink().click();
		Utility.waitForElementToBeClickableForGivenTime(getLoginLink(), driver, 3);
		getLoginLink().click();
	}
	
	}
	
