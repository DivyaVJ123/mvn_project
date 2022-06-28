package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations_Example {
	WebDriver driver;
	  @BeforeClass
	  
	  public void f1() {
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("launching browser");
	  }
	  
	  @BeforeTest
	  public void loginapplication()
	  {
		 System.out.println("validating the login page"); 
	  }
	 
	  @BeforeMethod
	  public void method1()                               //test,class,method,@test
	{
		  System.out.println("enter username and password");
	  }
	  
	  @Test
	  public void f2() {
		 driver.findElement(By.id("email")).sendKeys("9948442116");
		 driver.findElement(By.id("pass")).sendKeys("Aruna@1995");
		}
	  @Test
	  public void f3() throws InterruptedException
	  {
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(2000);
		  driver.navigate().to("https://www.facebook.com/");
		  System.out.println(driver.getCurrentUrl());
	  }
	  @AfterTest
	  public void logintest()
	  {
		 System.out.println("user enters in to home page"); 
	  }
	  
	  @AfterMethod
	  public void method2()
	  {
		  System.out.println("login successfull"); 
	  }
	 
	  @AfterClass
	  public void Browserclose() {
		 driver.close();
		 driver.quit();
	  }
	}