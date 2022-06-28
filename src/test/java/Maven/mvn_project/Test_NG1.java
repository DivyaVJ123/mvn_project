package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_NG1 {
  @Test
  public void F1() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).click();
		driver.findElement(By.linkText("Register")).click();
}
}
