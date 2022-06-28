package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9948442116");
		Thread.sleep(1000);
		
		System.out.println("Maven");
	}

}
