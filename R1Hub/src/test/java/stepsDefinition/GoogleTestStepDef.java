package stepsDefinition;

import com.aventstack.extentreports.GherkinKeyword;

import Base.Base;
import Base.DriverContext;
import Utilities.ExtentReport;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GoogleAccoubtPage;
import pages.GooglePage;

public class GoogleTestStepDef extends Base {
	
	@Given("^user click in sign button$")
	public void user_click_in_sign_button() throws Throwable {
	   // CurrentPage=new GooglePage(DriverContext.Driver);
	    CurrentPage=GetInstance(GooglePage.class);
	    CurrentPage=CurrentPage.As(GooglePage.class).ClickOnSignIn();
	    //ExtentReport.getScenario().createNode(new GherkinKeyword("Given"), "user click in sign button");
	}

	@Then("^verify account page$")
	public void verify_account_page() throws Throwable {
		CurrentPage.As(GoogleAccoubtPage.class).checkAccountPage();
		//ExtentReport.getScenario().createNode(new GherkinKeyword("Given"), "verify account page");
	}

}
