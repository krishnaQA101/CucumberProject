package WebAppFramework.framework;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * 
 * @author Krishna Kumar
 *
 */
public class Reporter {
	
	private static ExtentHtmlReporter htmlReporter=null;
	private static ExtentReports extent=null;
	private static ExtentTest test=null;
	private static ExtentTest initModule=null;
	
	private static Logger log=Logger.getLogger(Reporter.class.getName());
	private static Handler consoleHandler=null;
	private static Handler fileHandler=null;
	private static Handler simpleFormatter=null;
	
	private static String ActiveReportDir=null;
	
	public static String takeScreenshot() {
		
		try {
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy hh-mm-ss");
			sdf.format(date);
			File screenshotFolder=((TakesScreenshot)WebDriverWrapper.getWebdriver())
					.getScreenshotAs(OutputType.FILE);
			
			String scrnFolder=ActiveReportDir+"\\Screenshots";
			
			
			
			}
		
		catch(Throwable th) {
			
		}
		return null;
		
		
		
	}
	

}
