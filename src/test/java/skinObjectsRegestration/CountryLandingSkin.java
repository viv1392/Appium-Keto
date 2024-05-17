package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CountryLandingSkin {
    AndroidDriver driver;
    public GenderSelection gender;
	public CountryLandingSkin(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
     WebElement ele;
	@FindBy(xpath="//android.widget.TextView[@text='Get Started with US']")
	WebElement ele1;
	public GenderSelection countrySelection() {
		ele.click();
		ele1.click();
		gender=new GenderSelection(driver);
		return gender;
	}
}
