package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;

public class SummaryOfOverallWellness extends Utilities {
	WebDriver driver;
	public AnySpecialOccasionToLoseWeight occassion;

	public SummaryOfOverallWellness(WebDriver driver) {
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
