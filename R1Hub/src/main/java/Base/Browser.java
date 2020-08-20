package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser extends Base {
	
	 private RemoteWebDriver _driver;

	    public Browser(RemoteWebDriver driver) {
	        _driver = driver;
	    }

	    
	    public BrowserType Type;

	    
	    public void GoToUrl(String url)
	    {
	        _driver.get(url);
	    }

	    public void Maximize()
	    {
	        _driver.manage().window().maximize();
	    }

}
