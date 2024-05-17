package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;
import io.appium.java_client.android.AndroidDriver;

public class PerfectWeight  extends Utilities{
	AndroidDriver driver;
   public YourAge age;

	public PerfectWeight(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele1;
	public YourAge perfectWeightInLb() {
		scroll("88",driver);
//		driver.findElement(AppiumBy.androidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"88\"))"))
//				.click();
		ele1.click();
		age=new YourAge(driver);
		return age;
	}
	public YourAge perfectWeightInKg() {
		scroll("51",driver);
//		driver.findElement(AppiumBy.androidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"51\"))"))
//				.click();
		ele1.click();
		age=new YourAge(driver);
		return age;
	}
}
