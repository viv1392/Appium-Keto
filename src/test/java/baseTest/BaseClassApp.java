package baseTest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import appUtilities.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import skinObjectsRegestration.CountryLandingSkin;

public class BaseClassApp {
	public AndroidDriver driver;
	public CountryLandingSkin country;

	public AndroidDriver driverSetUp() throws IOException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android Device");
		//options.setDeviceName("emulator-5554");
		//options.setUdid("5554");
		options.setPlatformName("Anroid");
		options.setApp(System.getProperty("user.dir")+"\\resources\\app-release.apk");
		URI localUri = new URI(Utilities.localHostUrl());
        URL localUrl = localUri.toURL();
		
		//URL url = new URL(localhost); // deprecated method
		AndroidDriver driver = new AndroidDriver(localUrl, options);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	@BeforeMethod
	public void popUp() throws IOException, URISyntaxException {
		driver = driverSetUp();
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']"))
				.click();
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"))
				.click();
		country = new CountryLandingSkin(driver);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
