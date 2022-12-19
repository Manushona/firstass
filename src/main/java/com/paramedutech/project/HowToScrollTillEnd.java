package com.paramedutech.project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToScrollTillEnd {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
	   // javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//img[contains(@src,'twitter')])[1]")));
	    javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
	    Thread.sleep(1000);
	    javascriptExecutor.executeScript("window.scrollBy(0,-20)", "");
	    Thread.sleep(2000);
	    javascriptExecutor.executeScript("window.scrollBy(1000,0)", "");
	    Thread.sleep(2000);
	    javascriptExecutor.executeScript("window.scrollBy(-500,0)", "");
	    Thread.sleep(2000);
	    
	    javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	}


