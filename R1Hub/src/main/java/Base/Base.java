package Base;

import org.openqa.selenium.support.PageFactory;

public class Base {
	
	 public static Base CurrentPage;
	 
	    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page)
	    {
	        Object obj = PageFactory.initElements(LocalDriverContext.getRemoteWebDriver(), page);
	        return page.cast(obj);
	    }
	 
	   public <TPage extends BasePage> TPage As(Class<TPage> pageInstance)
	    {
	        try
	        {
	            return (TPage)this;
	        }
	        catch (Exception e)
	        {
	            e.getStackTrace();
	        }
	        return null;
	    }

}
