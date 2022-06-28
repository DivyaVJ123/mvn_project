package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_action {

		WebDriver driver;
	    By account=By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");
	    By Register=By.linkText("Register");
		By FirstName=By.id("input-firstname");
		By LastName=By.id("input-lastname");
		By email=By.id("input-email");
		By Mobile=By.id("input-telephone");
		By Password=By.id("input-password");
		By repassword=By.id("input-confirm");
		By Policy=By.xpath("//input[@name='agree']");
		By contuine=By.xpath("//input[@value='Continue']");
	//Constructor
		Pom_action(WebDriver d)
		{
			driver=d;
		}
		
	    public void accountE()
		{
		driver.findElement(account).click();
	    }
		
		public void RegisterE()
		{
			driver.findElement(Register).click();
		}
		public void FirstNameE(String FirstNames)
		{
			driver.findElement(FirstName).sendKeys(FirstNames);
		}
		public void LastNameE(String LastNames)
		{
			driver.findElement(LastName).sendKeys(LastNames);
		}
		public void emailid(String emailid)
		{
			driver.findElement(email).sendKeys(emailid);
		}
		public void MobileE(String MobileNum)
		{
			driver.findElement(Mobile).sendKeys(MobileNum);
		}
		public void PasswordE(String PasswordE)
		{
			driver.findElement(Password).sendKeys(PasswordE);
		}
		
		public void repassword(String repasswordE)
		{
			driver.findElement(repassword).sendKeys(repasswordE);
		}
		
		public void PolicyE()
		{
			driver.findElement(Policy).click();
		}
		
		public void contuineE()
		{
			driver.findElement(contuine).click();
		}
	

	}


