package Maven.mvn_project;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Seleniumgrid2 extends Selenium_grid {

	public WebDriver driver;
	  @Test
	  public void f1() {
		  driver.get("https://www.facebook.com/");
		  System.out.println("facebook check");
		  
	  }
	  @BeforeMethod
	  void setup() throws MalformedURLException
	  {
		  driver= browserConnection("MicrosoftEdge");
				  
	  }
	  @AfterMethod
	  public void f2() {
		  	 driver.close();
		  	 driver.quit();
}
}
