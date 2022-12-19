package com.paramedutech.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxandRadiobutton {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/"); {
		WebElement maleRadioButton =  driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		System.out.println(maleRadioButton.isDisplayed());
		System.out.println(maleRadioButton.isEnabled());
		System.out.println(maleRadioButton.isSelected());
		
		WebElement orangeCheckBox =  driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		System.out.println(orangeCheckBox .isDisplayed());
		System.out.println(orangeCheckBox .isEnabled());
		System.out.println(orangeCheckBox .isSelected());
		
		WebElement blueCheckBox =  driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		System.out.println(blueCheckBox .isDisplayed());
		System.out.println(blueCheckBox .isEnabled());
		System.out.println(blueCheckBox .isSelected());
		
		WebElement disabledbutton =  driver.findElement(By.xpath("//*[@id=\"HTML6\"]/h2"));
		System.out.println(disabledbutton .isDisplayed());
	}

}
}