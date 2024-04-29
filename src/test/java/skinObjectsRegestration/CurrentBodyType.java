package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentBodyType {
    WebDriver driver;
    public BodyTypeYouWant bodyPref;
	public CurrentBodyType(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Average']")
	WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Plump']")
	WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Extra']")
	WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Voluptuous']")
	WebElement ele4;
	
	public BodyTypeYouWant average() {
		ele1.click();
		bodyPref=new BodyTypeYouWant(driver);
		return bodyPref;
	}
	public BodyTypeYouWant plump() {
		ele2.click();
		bodyPref=new BodyTypeYouWant(driver);
		return bodyPref;
	}
   public BodyTypeYouWant extra() {
	ele3.click();
	bodyPref=new BodyTypeYouWant(driver);
	return bodyPref;
   }
   public BodyTypeYouWant volputious() {
	   ele4.click();
	   bodyPref=new BodyTypeYouWant(driver);
		return bodyPref;
   }
}
