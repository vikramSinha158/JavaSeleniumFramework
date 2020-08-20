package runner;


import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExtentReport;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(features = { "src/test/java/features" }, 
	 // dryRun = true,
      //tags= {"@test"},
	  glue = "stepsDefinition",
	  format = {"json:target/cucumber-json-report.json", 
			     "html:target/cucumber-report-html"})
      
public class Runner {
	
	private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(dataProvider = "features")
    public void EmployeeTest(CucumberFeatureWrapper cucumberFeatureWrapper) throws ClassNotFoundException {
    	  //String featureName = cucumberFeatureWrapper.getCucumberFeature().getGherkinFeature().getName();
         // ExtentReport.startFeature(featureName);
        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }
    @DataProvider
    public Object[] features(ITestContext context) {
    	return testNGCucumberRunner.provideFeatures();
/*    	Object[] featureName=testNGCucumberRunner.provideFeatures();
    	Object[] getFeature = null;
        for(Object item : featureName){
         	String xx=context.getName();
         	String yy=item.toString();
            if(item.toString().equalsIgnoreCase(context.getName())){
                getFeature = (Object[]) item;
            }
        }
        return getFeature;*/
    }
    
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        testNGCucumberRunner.finish();
    }

}
