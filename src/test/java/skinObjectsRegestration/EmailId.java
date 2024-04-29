package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;

public class EmailId extends Utilities{
	WebDriver driver;
	public PlanPage planPage;

	public EmailId(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.EditText[@text='Your Email Id']")
	   WebElement ele1;
	@FindBy(xpath=
			"//android.widget.TextView[@text='By checking this, you agree to get future information from us']")
		WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='I agree to the Privacy Policy']")
		WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='I agree']")
	WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='Get your plan']")
	WebElement ele5;
	
	public PlanPage emailId() throws InterruptedException {
		String k=emailRandom();
		ele1.sendKeys(k);
		ele2.click();
		ele3.click();
		ele4.click();
		ele5.click();
		Thread.sleep(1000);
		planPage=new PlanPage(driver);
		return planPage;
	}
}
