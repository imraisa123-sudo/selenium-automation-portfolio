package com.qa.portfolio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
        String Title = driver.getTitle();
        System.out.println(Title);
//        web page login and perform forgot password
        driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
	    driver.findElement(By.name("inputPassword")).sendKeys("123456");
	    driver.findElement(By.className("submit")).click();
	   
	    // css selector (in console -> $('')
	    //Class name -> tagname.classname -> Button.btn.
	    //Id -> tagname#id -> input#inputUsername
	    //Tagname[attribute='value']
	 
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    //Xpath - $x('')
	  //Tagname[@attribute='value']
	  //input[@placeholder='Username']
	    
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("124578930");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());

	}

}
