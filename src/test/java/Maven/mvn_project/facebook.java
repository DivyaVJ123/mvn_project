package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	WebDriver driver;
  @BeforeClass
  
  public void f1() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }
  @Test
  public void f2() {
	 driver.findElement(By.id("email")).sendKeys("9948442116");
	 driver.findElement(By.id("pass")).sendKeys("Aruna@1995");
  }
  @AfterClass
  public void f3() {
	 driver.close();
	 driver.quit();
  }
}
