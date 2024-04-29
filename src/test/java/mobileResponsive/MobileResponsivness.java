package mobileResponsive;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileResponsivness {
	@Test
	public void mobileResponsive() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		WebDriverManager.chromedriver().setup();
		options.setChromedriverExecutable(
				"C:\\Users\\HISPL\\eclipse-workspace\\ProjectAppium\\src\\test\\java\\resorurces\\chromedriver.exe");
		options.setDeviceName("Android Device");
		options.setCapability("browserName", "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://ketobalanced.com/");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		driver.findElements(By.linkText("Personalized keto diet meal plan that is easy to follow")).get(1).click();
		
		
	}

}
