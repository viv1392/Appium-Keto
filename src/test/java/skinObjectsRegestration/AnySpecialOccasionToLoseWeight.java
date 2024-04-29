package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnySpecialOccasionToLoseWeight {
	WebDriver driver;
	public EventsDate date;
	public OneAndOnlyPlan plan;

	public AnySpecialOccasionToLoseWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Vacation']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='No']")
	 WebElement ele2;
	
	public EventsDate specialEvent() {
		ele1.click();
		date=new EventsDate(driver);
		return date;
	}
	public OneAndOnlyPlan noEvent() {
		ele2.click();
		plan=new OneAndOnlyPlan(driver);
		return plan;
	}

}
