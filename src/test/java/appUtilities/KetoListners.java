package appUtilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


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
		report.createTest(result.getName());
		test.log(Status.INFO, result.getName() + "--TestPassed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.INFO, result.getThrowable());
		test.log(Status.FAIL, result.getName() + "--TestFailed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		report.createTest(result.getName());
		test.log(Status.INFO, result.getName() + "--TestSkipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		File extentReport = new File(System.getProperty("user.dir") + "\\extentReport\\report.html");
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
