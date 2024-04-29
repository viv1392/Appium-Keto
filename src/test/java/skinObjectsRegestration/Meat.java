package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Meat {
	WebDriver driver ;
	public  Veggies veggies;

	public Meat(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Chicken']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Fish']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Seafood']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Beef']")
	 WebElement ele4;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='I eat all meats']/android.widget.ImageView")
	WebElement eatAll;
	@FindBy(xpath="//android.widget.TextView[@text='I am Vegetarian']")
	 WebElement ele5;
	@FindBy(xpath="//android.widget.TextView[@text='I am Vegan']")
	 WebElement ele6;
	@FindBy(xpath="//android.view.View")
	 WebElement ele7;
	public Veggies nonVeg() {
		ele1.click();
		ele2.click();
		ele3.click();
		ele4.click();
		ele7.click();
		veggies=new  Veggies(driver);
		return veggies;
	}
	public Veggies vegetarian() {
		ele5.click();
		ele7.click();
		veggies=new  Veggies(driver);
		return veggies;
	}
	public Veggies vegan() {
		ele6.click();
		ele7.click();
		veggies=new  Veggies(driver);
		return veggies;
	}
	public Veggies eatAllNonVeg() {
		eatAll.click();
		ele7.click();
		veggies=new  Veggies(driver);
		return veggies;
	}
}
