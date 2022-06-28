package Maven.mvn_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Exampleprogram {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		Identifiers_Exampleprogram  ref1=new Identifiers_Exampleprogram (driver);
		ref1.SearchE("iphone");
		ref1.SearchbuttonE();
		ref1.AddbuttonE();
		ref1. AddtocartE();
		Thread.sleep(5000);
		ref1.ItembuttonE();
		//ref1.Viewcartbutton();
		//ref1.Itemdrop();
		ref1.ViewcartE();
		ref1. Quantitybutton();
		//ref1.Quantity();
		ref1.Quantityclick();
		

	}

}
