package Maven.mvn_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class class1_annotations {
	@Test(priority=1)
	  public void c() {
		 System.out.println("Hello");
	  }
	  @Test(priority=2)
	  public void a() {
		  Assert.assertEquals(1, 1);
		 System.out.println("Hello1");
	  }
	  @Test(priority=3,enabled=false)
	  public void  b() {
		 System.out.println("Hello2");
	  }
	  
	  @BeforeMethod
	  public void Method1()
	  {
	  System.out.println("calling before method");
	  }
	  
	  @AfterMethod
	  public void Method2()
	  {
	  System.out.println("calling after method");
	  }
	  
	  @BeforeClass
	  public void Method3()
	  {
	  System.out.println("calling before class");
	  }
	  @AfterClass
	  public void Method4()
	  {
	  System.out.println("calling after class");
	  }
	  @BeforeTest
	  public void Method5()
	  {
	  System.out.println("calling before test");
	  }
	  @AfterTest
	  public void Method6()
	  {
	  System.out.println("calling after test");
	  }
	  
}
