package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;
import io.appium.java_client.android.AndroidDriver;

public class CurrentWeight extends Utilities {
	AndroidDriver driver;
	public PerfectWeight perfectWeight;

	public CurrentWeight(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Lb']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='96']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='97']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='98']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='100']")
	 WebElement elee5;
	@FindBy(xpath="//android.widget.TextView[@text='102']")
	 WebElement elee6;
	@FindBy(xpath="//android.widget.TextView[@text='104']")
	 WebElement elee7;
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele;
	public PerfectWeight currentWeightLb() {
		ele1.click();
		//javaScript(driver);
		
		ele2.click();
		ele3.click();
		ele4.click();
		elee5.click();
		elee6.click();
		elee7.click();
//		driver.findElement(AppiumBy.androidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"204\"))"))
//				.click();
		ele.click();
		perfectWeight=new PerfectWeight(driver);
		return perfectWeight;
	}
	@FindBy(xpath="//android.widget.TextView[@text='44']")
	 WebElement ele5;
	@FindBy(xpath="//android.widget.TextView[@text='45']")
	 WebElement ele6;
	@FindBy(xpath="//android.widget.TextView[@text='46']")
	 WebElement ele7;
	@FindBy(xpath="//android.widget.TextView[@text='47']")
	 WebElement ele8;
	@FindBy(xpath="//android.widget.TextView[@text='48']")
	 WebElement ele9;
	@FindBy(xpath="//android.widget.TextView[@text='49']")
	 WebElement ele10;
	@FindBy(xpath="//android.widget.TextView[@text='50']")
	 WebElement ele11;
	@FindBy(xpath="//android.widget.TextView[@text='51']")
	 WebElement ele12;
	@FindBy(xpath="//android.widget.TextView[@text='52']")
	 WebElement ele13;
	@FindBy(xpath="//android.widget.TextView[@text='53']")
	 WebElement ele14;
	@FindBy(xpath="//android.widget.TextView[@text='54']")
	 WebElement ele15;
	@FindBy(xpath="//android.widget.TextView[@text='56']")
	 WebElement ele16;
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement elee;
	
	public PerfectWeight currentWeightKg() {
		ele5.click();
		ele6.click();
		ele7.click();
		ele8.click();
		ele9.click();
		ele10.click();
		ele11.click();
		ele12.click();
		ele13.click();
		ele14.click();
		ele15.click();
		ele16.click();
		elee.click();
		perfectWeight=new PerfectWeight(driver);
		return perfectWeight;
	}
}
