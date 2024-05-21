package appUtilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;


public class KetoListners implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		report = ExtntReport.extntReport();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.INFO, result.getName() + "--StartExecuting");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName() + "  TestSucced");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName() + "--TestFailed");
		AndroidDriver driver=null;
		
		try {
			driver = (AndroidDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		try {
			String capturePath=Utilities.screenShots(driver,result.getName());
			test.addScreenCaptureFromPath(capturePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName() + "--TestSkipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		File extentReport = new File(System.getProperty("user.dir") + "\\extentReportsApp\\Appreport.html");
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
