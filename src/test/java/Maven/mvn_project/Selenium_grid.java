package Maven.mvn_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_grid {

		public WebDriver browserConnection(String browsername) throws MalformedURLException
		{
			WebDriver driver;
			DesiredCapabilities dc= new DesiredCapabilities();
			if(browsername.equals("chrome"))
			{
				dc.setBrowserName("chrome");
			}
			else
			{
				dc.setBrowserName("MicrosoftEdge");
			}
		
		
		driver=new RemoteWebDriver(new URL("http://192.168.0.102:4444"),dc);
		return driver;

	}
}

