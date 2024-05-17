package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MealPreparationTime {
	AndroidDriver driver;
   public Meat meat;
	public MealPreparationTime(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Up to 30 minutes']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Up to 1 hour']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='More than 1 hour']")
	 WebElement ele3;
	public Meat upTo30Monute() {
		ele1.click();
		meat=new Meat(driver);
		return meat;
	}
	public Meat upTo1hr() {
		ele2.click();
		meat=new Meat(driver);
		return meat;
	}
	public Meat morethan1Hrs() {
		ele3.click();
		meat=new Meat(driver);
		return meat;
	}

}
