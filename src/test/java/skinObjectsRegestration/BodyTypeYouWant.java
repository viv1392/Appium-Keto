package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyTypeYouWant {
     WebDriver driver;
     public WhatDoYouWantToAchieve achieve;
	public BodyTypeYouWant(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Fit']")
	WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Cut']")
	WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Bulk']")
	WebElement ele3;
	public WhatDoYouWantToAchieve fit() {
		ele1.click();
		achieve=new WhatDoYouWantToAchieve(driver);
		return achieve;
	}
	public WhatDoYouWantToAchieve cut() {
		ele2.click();
		achieve=new WhatDoYouWantToAchieve(driver);
		return achieve;
	}
	public WhatDoYouWantToAchieve plump() {
		ele3.click();
		achieve=new WhatDoYouWantToAchieve(driver);
		return achieve;
	}

}
