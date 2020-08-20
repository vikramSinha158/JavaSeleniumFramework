package runner;

import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import Config.ConfigReader;

import java.io.IOException;

import org.testng.IInvokedMethod;

public class TestNgListener implements IInvokedMethodListener {
	
	@Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

        if (!iInvokedMethod.isTestMethod()) {
            //Initialize Config
            try {
                ConfigReader.PopulateSettings();
            } catch (IOException e) {
                e.printStackTrace();
            }
   
        }

    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
	

}
