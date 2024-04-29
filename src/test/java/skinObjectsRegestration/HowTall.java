package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;

public class HowTall {
    WebDriver driver;
    public CurrentWeight currentWeight;
	public HowTall(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='5']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='6']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	 WebElement ele3;
	 WebElement ele6;
	@FindBy(xpath="//android.widget.TextView[@text='Cm']")
	 WebElement elecm;
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele;
	public CurrentWeight howTallInFeet() throws InterruptedException {
		ele1.click();
		ele2.click();
		ele3.click();
		ele.click();
		currentWeight=new CurrentWeight(driver);
		return currentWeight;
	}
	public CurrentWeight howTallInCm() {
		elecm.click();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"179\"))"))
				.click();
		ele.click();
		currentWeight=new CurrentWeight(driver);
		return currentWeight;
		
	}
	
}
