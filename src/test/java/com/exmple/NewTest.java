package com.exmple;

import org.testng.annotations.Test;

import chapter1.DataWrapper;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends DataWrapper{
  @Test(dataProvider = "dp")
  public void f(Map<String,String> hm) {
	  System.setProperty("webdriver.chrome.driver", "Y:\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  
	  WebDriverWait wait  = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	  
	  ArrayList<String> arr = new ArrayList<String>();
	  Iterator iter1 = arr.iterator();
	  Iterator iter = hm.entrySet().iterator();
	  while(iter.hasNext()) {
//		  System.out.println(iter.next());
		  Map.Entry<String, String> data = (Map.Entry<String, String>) iter.next();
		  System.out.println(data.getKey()+" is "+data.getValue());
	  }
	  
//	  driver.get("https://www.google.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
