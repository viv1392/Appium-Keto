package skinObjectsRegestration;

import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class PlanPage extends Utilities{
	AndroidDriver driver;

	public PlanPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void sixMonthPlan() throws InterruptedException {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Choose your plan\"))"))
				.click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Buy Now\"))"))
				.click();
	}
	public void oneMonthPlan() throws InterruptedException {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"1 Month Keto diet\"))"))
				.click();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Buy Now\"))"))
				.click();
		Thread.sleep(2000);
	}
	public void threeMonthPlan() throws InterruptedException {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"3 Month(s) Keto diet\"))"))
				.click();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Buy Now\"))"))
				.click();
		Thread.sleep(2000);
	}

}
