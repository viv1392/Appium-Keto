package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SocialCustomersPage {
	AndroidDriver driver;
     public TargetZone targetzone;
	public SocialCustomersPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
 }
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	WebElement ele;
	
	public TargetZone socialPage() throws InterruptedException {
		ele.click();
		Thread.sleep(1000);
		targetzone=new TargetZone(driver);
		return targetzone;
	}
}		