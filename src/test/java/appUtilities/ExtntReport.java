package appUtilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtntReport {
	static ExtentSparkReporter sparkreporter;

	public static ExtentReports extntReport() {
		File filepath=new File(System.getProperty("user.dir")+"\\extentReportsApp\\report.html");
		sparkreporter=new ExtentSparkReporter(filepath);
		sparkreporter.config().setTheme(Theme.DARK);
		sparkreporter.config().setReportName("ketoAppAndroid");
		sparkreporter.config().setDocumentTitle("ketoAppTestReoprt");
		sparkreporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(sparkreporter);
		reports.setSystemInfo("Enviroment", "Test");
		reports.setSystemInfo("Tested By", "Vivek Pandey");
		return reports;
	}

}
