package Utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import okhttp3.internal.platform.Platform;

public class ExtentManager {
	
	  private static ExtentReports extent = new ExtentReports();
	    private static Platform platform;
	    private static String reportFileName = "ExtentReport.html";
	    private static String macPath = System.getProperty("user.dir") + "/TestReport";
	    private static String windowsPath = System.getProperty("user.dir") + "\\TestReport";
	    private static String macReportFileLoc = macPath + "/" + reportFileName;
	    private static String winReportFileLoc = windowsPath + "\\" + reportFileName;

	    
	    //Create an extent report instance
	    public synchronized static ExtentReports createInstance() {

	        String fileName = getReportFileLocation();
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	       // htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	        //.config().setChartVisibilityOnOpen(true);
	        
	        htmlReporter.config().setTheme(Theme.DARK);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        extent.attachReporter(htmlReporter);
	        
	        return extent;
	    }

	    //Select the extent report file location based on platform
	    private static String getReportFileLocation() {
	        String reportFileLocation = null;

	                reportFileLocation = winReportFileLoc;
	                createReportPath(windowsPath);
	                System.out.println("ExtentReport Path for WINDOWS: " + windowsPath + "\n");
	                return reportFileLocation;
	    }

	    //Create the report path if it does not exist
	    private static void createReportPath(String path) {
	        File testDirectory = new File(path);
	        if (!testDirectory.exists()) {
	            if (testDirectory.mkdir()) {
	                System.out.println("Directory: " + path + " is created!");
	            } else {
	                System.out.println("Failed to create directory: " + path);
	            }
	        } else {
	            System.out.println("Directory already exists: " + path);
	        }
	    }

	    //Get current platform
	/*    private static Platform getCurrentPlatform() {
	        if (platform == null) {
	            String operSys = System.getProperty("os.name").toLowerCase();
	            if (operSys.contains("win")) {
	                platform = Platform.WINDOWS;
	            } else if (operSys.contains("mac")) {
	                platform = Platform.MAC;
	            }
	        }
	        return platform;
	    }*/

}
