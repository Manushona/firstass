package com.paramedutech.project;

import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUsage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(4000);
		
		java.util.List<WebElement> list = driver.findElements(By.xpath("//ul//div[@class='wM6W7d']/span"));

		System.out.println("Search result found = " + list.size());
		
		for (WebElement elm : list) {
			System.out.println(elm.getText());
//			if (elm.getText().contains("mobile")) {
//				System.out.println("test passed");
//			} else {
//				System.out.println("test failed");
//			}
		}

	}

}
