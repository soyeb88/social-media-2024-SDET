package com.socialmedia2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Browser/chromedriver.exe");
		
		driver = new ChromeDriver();		
		driver.get("http://localhost:3000/facebook");
		driver.manage().window().maximize();		
		driver.close();
	}

}
