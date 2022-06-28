package Maven.mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Identifiers_Exampleprogram {
	WebDriver driver;
	//Actions action=new Actions(driver);
    By Search= By.xpath("//input[@placeholder='Search']");
    By Searchbutton=By.xpath("//button[@class='btn btn-default btn-lg']");
   // action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ENTER).perform();
    By Addbutton= By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]");
    By Addtocart= By.xpath("//span[normalize-space()='Add to Cart']");
    By Itembutton=By.id("cart-total");
    //Thread.sleep(2000);
    //By Viewcartbutton=By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
   // By Itemdrop=By.xpath("//ul[@class='dropdown-menu pull-right']");
    By Viewcart= By.xpath("//strong[normalize-space()='View Cart']");
    By Quantitybutton= By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]");
   // By Quantity= By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[4]/div/input");
    By Quantityclick= By.xpath("//button[@type='submit']");
    
    Identifiers_Exampleprogram (WebDriver d)
    {
    	driver=d;
    }
    public void SearchE(String iphone)
	{
	driver.findElement(Search).sendKeys("iphone");
    }
	
	public void SearchbuttonE()
	{
		driver.findElement(Searchbutton).click();
	}
	public void AddbuttonE()
	{
		driver.findElement(Addbutton).click();
	}
	public void AddtocartE()
	{
	driver.findElement(Addtocart).click();
    }
	
	public void ItembuttonE()
	{
		driver.findElement(Itembutton).click();
	}
	/*public void  Viewcartbutton()
	{
	driver.findElement( Viewcartbutton).click();
    }
	 public void Itemdrop()
		{
		driver.findElement(Itemdrop).click();
	    }*/
	 
	public void ViewcartE()
	{
		driver.findElement(Viewcart).click();
	}
	public void  Quantitybutton()
	{
	driver.findElement( Quantitybutton).click();
    }
	
	/*public void Quantity()
	{
		driver.findElement(Quantity).click();
	}*/
	public void Quantityclick()
	{
		driver.findElement(Quantityclick).click();
	}

}
