package com.practise;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child  {

  
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABITHA\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");   
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in/");
  driver.manage().window().maximize();
  WebElement insta = driver.findElement(By.xpath("//a[text()='Instagram']"));
  
/*  JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("arguments[0].scrollintoview();", insta);
  Thread.sleep(2000);
  js.executeScript("window.scrollBy(0,-5000)");*/
  }
	}



