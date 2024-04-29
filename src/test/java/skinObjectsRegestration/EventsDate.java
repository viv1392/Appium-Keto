package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsDate {
	WebDriver driver;
	public OneAndOnlyPlan plan;

	public EventsDate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='DD - MM - YYYY']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.Button[@text='May']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.Button[@text='June']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele5;
	
	public OneAndOnlyPlan eventDate() {
		ele1.click();
		ele2.click();
		ele3.click();
		ele4.click();
		ele5.click();
		plan=new OneAndOnlyPlan(driver);
		return plan;
	}

}
