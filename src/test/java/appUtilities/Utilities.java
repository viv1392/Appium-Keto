package appUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class Utilities {
	
	public void scroll(String text,AndroidDriver driver) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+text+"\"))"))
				.click();
	}
	public void waitElement(AndroidDriver driver,WebElement ele1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(ele1));
		
	}
	public String emailRandom() {
		Faker faker=new Faker();
		String x=faker.internet().emailAddress();
		return x;
	}
	public void back(AndroidDriver driver) {
		driver.navigate().back();
	}
    public static String screenShots(AndroidDriver driver,String testName) throws IOException {
    	File source=driver.getScreenshotAs(OutputType.FILE);
    	String destinationFile=System.getProperty("user.dir")+"\\ScreenshotsApp\\screenshot"+testName+".png";
    	FileUtils.copyFile(source, new File(destinationFile));
    	return destinationFile;
	}
    public static String localHostUrl() throws IOException {
    	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\Config\\Config.properties");
    	Properties prop =new Properties();
    	prop.load(fs);
    	String url =prop.getProperty("localhost");
    	return url;
    	
    }
  }

	

