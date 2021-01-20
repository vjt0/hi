package utility_info;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



@SuppressWarnings({ "deprecation", "unused" })
@Test
public class ExtentReport {
	public ExtentHtmlReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest test;
	

	
	@BeforeTest
	public void setreport() {
		htmlreport=new ExtentHtmlReporter("./report.html");
		htmlreport.config().setEncoding("utf=8");
		htmlreport.config().setDocumentTitle("VIjay tomar");
		htmlreport.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(htmlreport);
	}
	
	
	@AfterTest
	public void end() {
		extent.flush();
	}
	
	@AfterMethod
	public void tearDown(ITestResult results) {
		if(results.getStatus()==ITestResult.SUCCESS) {
		String methodName =results.getMethod().getMethodName();
		System.out.println(methodName);
		
		}else if (results.getStatus()==ITestResult.FAILURE) {
			System.out.println(results.getMethod().getMethodName());	
		}
		
	}
	
}