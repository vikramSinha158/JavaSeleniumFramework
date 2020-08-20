package stepsDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;

import Base.BrowserType;
import Base.DriverContext;
import Base.FrameworkInitialize;
import Config.Settings;
import Utilities.ExtentReport;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestInitialize extends FrameworkInitialize {
	
	 @Before
	 public void Initialize(Scenario scenario){
		   //Enter the scenario name
        // ExtentReport.startScenario(scenario.getName());
		  InitializeBrowser(Settings.BrowserType);

	      DriverContext.GoToUrl(Settings.AUT);
		 
	 }
	 
	 @After
	  public void TearDown(){
	        DriverContext.QuitDriver();
	  }

}
