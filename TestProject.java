package com.testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sharmi\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sharmila123@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sharmila@123");
	
		WebElement button = driver.findElement(By.name("login"));
		button.click();
		
	}

}
