package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class GooglePage extends BasePage {
	

/*	WebDriver driver;
	
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/

    @FindBy(how = How.NAME, using = "q")
    public WebElement txtName;
    
  
    @FindBy(how = How.XPATH, using = "//a[text()='Sign in']")
    public WebElement buttonSignIn;
    
    public void enterText()
    {
    	txtName.sendKeys("Selenium");
    	txtName.sendKeys(Keys.ENTER);
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public GoogleAccoubtPage ClickOnSignIn()
    {
    	buttonSignIn.click();
    	
    	return GetInstance(GoogleAccoubtPage.class);
    }

}
