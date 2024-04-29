package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;

public class PerfectWeight {
   WebDriver driver;
   public YourAge age;

	public PerfectWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele1;
	public YourAge perfectWeightInLb() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"88\"))"))
				.click();
		ele1.click();
		age=new YourAge(driver);
		return age;
	}
	public YourAge perfectWeightInKg() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"51\"))"))
				.click();
		ele1.click();
		age=new YourAge(driver);
		return age;
	}
}
