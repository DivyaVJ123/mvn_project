package Maven.mvn_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom_identifiers {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		Pom_action ref= new Pom_action(driver);
		ref.accountE();
		ref.RegisterE();
		ref.FirstNameE("aru123");
		ref.LastNameE("mutyala");
		ref.emailid("aru123@gmail.com");
		ref.MobileE("99457688");
		ref.PasswordE("aru2345");
		ref.repassword("aru2345");
		ref.PolicyE();
		ref.contuineE();
		if(driver.getPageSource().contains("Congratulations"))
		{
			System.out.println("sucess");
			
		}else
		{
			System.out.println("fail");
		}

	}

}
