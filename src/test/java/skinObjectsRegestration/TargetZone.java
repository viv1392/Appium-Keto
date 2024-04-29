package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetZone {
	WebDriver driver;
	public LastHappy happy;

	public TargetZone(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Belly']")
	WebElement ele1;

	@FindBy(xpath = "//android.widget.TextView[@text='Butt']")
	WebElement ele2;

	@FindBy(xpath = "//android.widget.TextView[@text='Pecs']")
	WebElement ele3;

	@FindBy(xpath = "//android.widget.TextView[@text='Legs']")
	WebElement ele4;

	@FindBy(xpath = "//android.view.View")
	WebElement ele5;

	public LastHappy belly() {
		ele1.click();
		happy=new LastHappy(driver);
		return happy;
	}

	public LastHappy butt() {
		ele2.click();
		happy=new LastHappy(driver);
		return happy;
	}

	public LastHappy pecs() {
		ele3.click();
		happy=new LastHappy(driver);
		return happy;
	}

	public LastHappy legs() {
		ele4.click();
		happy=new LastHappy(driver);
		return happy;
	}

	public LastHappy cont() throws InterruptedException {
		ele5.click();
		Thread.sleep(2000);
		happy=new LastHappy(driver);
		return happy;
	}

}
