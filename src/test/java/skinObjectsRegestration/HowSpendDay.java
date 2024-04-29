package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowSpendDay {
	WebDriver driver;
	public SelectMultipleAnswer multipleAnswer;

	public HowSpendDay(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='At workplace']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='At workplace but i happen to go out regularly']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='I spend pretty much time on foot']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Manual labor']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='I stay at home very often']")
	 WebElement ele5;
	public SelectMultipleAnswer atWorkPlace() {
		ele1.click();
		multipleAnswer=new SelectMultipleAnswer(driver);
		return multipleAnswer;
	}
	public SelectMultipleAnswer goOutRegularly() {
		ele2.click();
		multipleAnswer=new SelectMultipleAnswer(driver);
		return multipleAnswer;
	}
	public SelectMultipleAnswer prettyMuchTimeOnFoot() {
		ele3.click();
		multipleAnswer=new SelectMultipleAnswer(driver);
		return multipleAnswer;
	}
	public SelectMultipleAnswer manualLabour() {
		ele4.click();
		multipleAnswer=new SelectMultipleAnswer(driver);
		return multipleAnswer;
	}
	public SelectMultipleAnswer atHomeVeryOften() {
		ele5.click();
		multipleAnswer=new SelectMultipleAnswer(driver);
		return multipleAnswer;
	}

}
