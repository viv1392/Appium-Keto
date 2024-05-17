package mobileResponsive;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileResponsivness {
	@Test
	public void mobileResponsive() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setChromedriverExecutable("C:\\Users\\vivek\\git\\Appium-Keto\\resources\\chromedriver.exe");
		options.setDeviceName("Android Device");
		options.setCapability("browserName", "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/");
		WebDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://ketobalanced.com/");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		driver.findElements(By.linkText("Personalized keto diet meal plan that is easy to follow")).get(1).click();
		
		
	}

}
