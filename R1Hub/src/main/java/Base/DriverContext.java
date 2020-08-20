package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverContext {
	

    public static Browser Browser;
    
    public static void GoToUrl(String url)
    {
        LocalDriverContext.getRemoteWebDriver().get(url);
    }

    public static void QuitDriver(){
        LocalDriverContext.getRemoteWebDriver().quit();
    }


 

}
