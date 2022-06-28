package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class class2 {
	WebDriver driver;
	@Before
	public void xyz()
	{
		System.out.println("before test");
	}
	@After
	public void xyt()
	{
		System.out.println("after test");
	}
	
	@Given("naviagte to fb link")
	public void naviagte_to_fb_link() {
		 WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}
	   
	
	@Given("user is on fb link")
	public void user_is_on_fb_link() 
	{
		System.out.println("facebook login");
	}
	@When("^user enters fb (.*) and (.*)$")
	//regular expression
	public void user_enters_fb_uname_and_pword(String uname,String pword) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(uname);
		 driver.findElement(By.id("pass")).sendKeys(pword); 
		 Thread.sleep(3000);
	}

	@When("click login button")
	public void click_login_button() {
		System.out.println("facebook");
	}
	    
	}



