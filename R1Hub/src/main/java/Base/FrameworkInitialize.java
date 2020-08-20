package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FrameworkInitialize {
	
public static void InitializeBrowser(BrowserType browserType)
	    {

	RemoteWebDriver driver = null;
	        switch (browserType)
	        {
	            case Chrome:
	            {
	            	System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace\\Project\\R1Hub\\src\\test\\resources\\driver\\chromedriver.exe");
	          	    driver = new ChromeDriver();
	          	    LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
	            }
	            case Firefox:
	            {
	                //Open the browser
	                //System.setProperty("webdriver.gecko.driver", "e:\\libs\\geckodriver.exe");
	                //driver= new FirefoxDriver();
	                break;
	            }
	            case IE:
	            {
	                break;
	            }
	        }
	
	        //Browser
	        DriverContext.Browser = new Browser(driver);
	        DriverContext.Browser.Maximize();

       }
}
