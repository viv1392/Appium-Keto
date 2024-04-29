package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;

public class YourAge{
    WebDriver driver;
    public SummaryOfOverallWellness wellness;
	public YourAge(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.view.View")
	 WebElement ele1;
	public SummaryOfOverallWellness yourAge() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"36\"))"))
				.click();
		ele1.click();
		wellness=new SummaryOfOverallWellness(driver);
		return wellness;
	}

}
