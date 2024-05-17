package skinObjectsRegestration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OtherFoodItems {
	AndroidDriver driver;
	public HowActive active;

	public OtherFoodItems(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='I eat all']/android.widget.ImageView")
	WebElement eatAllOthers;
	@FindBy(xpath="//android.widget.TextView[@text='Cheese']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Coconut']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Olives']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Egg']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='Nuts']")
	 WebElement ele5;
	@FindBy(xpath="//android.widget.TextView[@text='Strawberry']")
	 WebElement ele6;
	@FindBy(xpath="//android.view.View")
	 WebElement ele7;
	public HowActive nonVegUser() {
		ele1.click();
		ele4.click();
		ele6.click();
		ele5.click();
		ele7.click();
		active=new HowActive(driver);
        return active;		
	}
    public HowActive vegUser() {
    	ele1.click();
    	ele6.click();
    	ele5.click();
    	ele7.click();
    	active=new HowActive(driver);
        return active;	
    }
    public HowActive veganUser() {
    	ele3.click();
    	ele5.click();
    	ele6.click();
    	ele2.click();
    	ele7.click();
    	active=new HowActive(driver);
        return active;	
    }
    public HowActive eatAllOthers() {
    	eatAllOthers.click();
    	ele7.click();
    	active=new HowActive(driver);
        return active;
    }
}
