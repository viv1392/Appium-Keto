package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Veggies {
     WebDriver driver;
     public OtherFoodItems otherItems;
	public Veggies(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='I eat them all']/android.widget.ImageView")
	WebElement allVeggies;
	@FindBy(xpath="//android.widget.TextView[@text='Broccoli']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Zucchini']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Lettuce']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Broccoli']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='Bok-Choy']")
	 WebElement ele5;
	@FindBy(xpath="//android.widget.TextView[@text='Spinach']")
	 WebElement ele6;
	@FindBy(xpath="//android.view.View")
	 WebElement ele7;
	public OtherFoodItems veggies() {
		ele1.click();
		ele2.click();
		ele3.click();
		ele4.click();
		ele5.click();
		ele6.click();
		ele7.click();
		otherItems=new OtherFoodItems(driver);
		return otherItems;
	}
	public OtherFoodItems eatAllVeggies() {
		allVeggies.click();
		ele7.click();
		otherItems=new OtherFoodItems(driver);
		return otherItems;
	}

}
