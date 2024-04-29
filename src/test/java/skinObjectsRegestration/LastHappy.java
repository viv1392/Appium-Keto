package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastHappy {
	WebDriver driver;
	public MealPreparationTime time;

	public LastHappy(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Less than a year ago']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='1 to 2 years ago']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='More than 4 years ago']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Never']")
	 WebElement ele4;
	@FindBy(xpath="//android.view.View")
	 WebElement ele5;
	public MealPreparationTime lessThanAYearAgo() {
		ele1.click();
		time=new MealPreparationTime(driver);
		return time;
	}
	public MealPreparationTime oneTo2YearAgo() {
		ele2.click();
		time=new MealPreparationTime(driver);
		return time;
	}
	public MealPreparationTime moreThan4YearAgo() {
		ele3.click();
		time=new MealPreparationTime(driver);
		return time;
	}
	public MealPreparationTime never() {
		ele4.click();
		time=new MealPreparationTime(driver);
		return time;
	}
	public MealPreparationTime contt() {
		ele5.click();
		time=new MealPreparationTime(driver);
		return time;
	}
}
