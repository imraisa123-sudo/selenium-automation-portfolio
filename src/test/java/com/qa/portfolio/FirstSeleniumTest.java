package com.qa.portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstSeleniumTest {


	public static void main(String[] args) {


		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods


		// Chrome

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");


		WebDriver driver = new ChromeDriver(options);


		//Firefox


		// WebDriver driver1 = new FirefoxDriver();


		//Microsoft Edge

		// WebDriver driver2 = new EdgeDriver();


		driver.get("https://github.com/imraisa123-sudo/selenium-automation-portfolio");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();


	}

}

