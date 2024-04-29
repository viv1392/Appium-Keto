package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatDoYouWantToAchieve {
     WebDriver driver;
     public SocialCustomersPage social;
	public WhatDoYouWantToAchieve(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Lose weight']")
	WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Boost brain power']")
	WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Reduce cholesterol level']")
	WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Improve bone health']")
	WebElement ele4;
	@FindBy(xpath="//android.view.View")
	WebElement ele5;
	
	public SocialCustomersPage  looseWeight() {
		ele1.click();
		social=new SocialCustomersPage(driver);
		return social;
	}
	public SocialCustomersPage boostBrainPowe() {
		ele2.click();
		social=new SocialCustomersPage(driver);
		return social;
	}
	public SocialCustomersPage reduceCholestrolLevel() {
		ele3.click();
		social=new SocialCustomersPage(driver);
		return social;
	}
	public SocialCustomersPage improveBoneHealth() {
		ele4.click();
		social=new SocialCustomersPage(driver);
		return social;
	}
	public SocialCustomersPage cont() {
		ele5.click();
		social=new SocialCustomersPage(driver);
		return social;
	}

}
