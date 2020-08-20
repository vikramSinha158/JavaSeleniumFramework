package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.GherkinKeyword;

import Base.Base;
import Base.DriverContext;
import Utilities.ExtentReport;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GoogleAccoubtPage;
import pages.GooglePage;

public class CWLStepDef extends Base {
	 
	@Given("^user is on R!Hun login page$")
	public void user_is_on_R_Hun_login_page() throws Throwable {

		 CurrentPage=GetInstance(GooglePage.class);
	    CurrentPage.As(GooglePage.class).enterText();
	    //ExtentReport.getScenario().createNode(new GherkinKeyword("Given"), "user is on R!Hun login page");
	}

	@Given("^user give userName and password$")
	public void user_give_userName_and_password() throws Throwable {

		System.out.println("Browser Closed");
		//ExtentReport.getScenario().createNode(new GherkinKeyword("Given"), "user give userName and password");
	}

	

}
