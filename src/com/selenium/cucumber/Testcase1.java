package com.selenium.cucumber;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.JavascriptExecutor;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		//Invoking Browsers
		//Creating Chromedriver
		
		//ChromeDriver driver = new ChromeDriver();
		String strDriverPath = System.getProperty("user.dir");

		String strBrowser = "Chrome";
		if(strBrowser=="Chrome") {
			strDriverPath = strDriverPath + File.separator + "chromedriver" + File.separator + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",strDriverPath);
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
		}
		
		if(strBrowser=="Firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Selva\\Geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.close();
		}
	}

}
