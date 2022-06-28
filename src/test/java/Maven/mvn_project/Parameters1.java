package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters1 {
	WebDriver driver;
	  @BeforeClass
	  @Parameters({"browser","url"})
  public void f1(String browser, String url) {
		  
		  
	  
		  if(browser.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();                           // parallel execution
  }
	  else {
	  
	  System.out.println("invalid browser");
	  }
	  driver.get(url);
	  }
@AfterClass
public void f2() {
	 driver.close();
	 driver.quit();
}

@Test
public void f3() {
	 driver.findElement(By.id("email")).sendKeys("9948442116");
	 driver.findElement(By.id("pass")).sendKeys("Aruna@1995");
 }

}