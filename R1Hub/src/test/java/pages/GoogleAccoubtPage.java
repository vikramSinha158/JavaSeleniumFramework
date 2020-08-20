package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BasePage;

public class GoogleAccoubtPage extends BasePage {
	
/*	public GoogleAccoubtPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}*/
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'account')]")
    public WebElement accountText;
	
	public void checkAccountPage()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(accountText.isDisplayed())
	    {
	    	Assert.assertTrue(true,"Account not visible");
	    }
	}
	

}
