package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMultipleAnswer {
	WebDriver driver;
	public HowExcitedToShedWeight shedWeight;

	public SelectMultipleAnswer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='I do not get quality sleep']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='I eat late at night']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='My salt intake is more']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='I can not quit eating sweets']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='I like soft drinks']")
	 WebElement ele5;
	@FindBy(xpath="//android.widget.TextView[@text='None of the above']")
	 WebElement ele6;
	@FindBy(xpath="//android.view.View")
	 WebElement ele7;
	public HowExcitedToShedWeight multipleAnswer() {
		ele1.click();
		ele2.click();
		ele5.click();
		ele7.click();
		shedWeight=new HowExcitedToShedWeight(driver);
		return shedWeight;
	}
	public HowExcitedToShedWeight noneOfTheAbove() {
		ele6.click();
		ele7.click();
		shedWeight=new HowExcitedToShedWeight(driver);
		return shedWeight;
	}

}
