package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DiseaseSkin {
	AndroidDriver driver;
	public  HowTall tall;

	public DiseaseSkin(AndroidDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Diabetes']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='High cholesterol']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='High blood pressure']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='None of the above']")
	 WebElement ele4;
	@FindBy(xpath="//android.view.View")
	 WebElement ele5;

	public HowTall disease() {
		ele1.click();
		ele2.click();
		ele3.click();
		ele5.click();
		tall=new  HowTall(driver);
		return tall;
	}
	public HowTall noDisease() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"None of the above\"))"))
				.click();
		ele5.click();
		tall=new  HowTall(driver);
		return tall;
	}

}
