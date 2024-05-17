package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;
import io.appium.java_client.android.AndroidDriver;

public class SummaryOfOverallWellness extends Utilities {
	AndroidDriver driver;
	public AnySpecialOccasionToLoseWeight occassion;

	public SummaryOfOverallWellness(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Summary of your overall wellness']")
	 WebElement ele;
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele1;
	public AnySpecialOccasionToLoseWeight overAllWellness() throws InterruptedException {
		waitElement(driver,ele);
		//Thread.sleep(10000);
		ele1.click();
		occassion=new AnySpecialOccasionToLoseWeight(driver);
		return occassion;
	}
}
