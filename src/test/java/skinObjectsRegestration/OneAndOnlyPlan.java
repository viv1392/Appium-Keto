package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OneAndOnlyPlan {
	AndroidDriver driver;
     public YourWeight weight;
     
	public OneAndOnlyPlan(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele5;
	public YourWeight oneAndOnlyPlan() throws InterruptedException {
		Thread.sleep(1000);
		ele5.click();
		weight=new YourWeight(driver);
		return weight;
	}

}
