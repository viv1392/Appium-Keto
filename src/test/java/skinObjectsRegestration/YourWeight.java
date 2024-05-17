package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class YourWeight {
	AndroidDriver driver;
       public EmailId email;
	public YourWeight(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele;
	public EmailId yourWeight() {
		ele.click();
		email=new EmailId(driver);
		return email;
	}

}
