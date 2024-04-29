package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialCustomersPage {
     WebDriver driver;
     public TargetZone targetzone;
	public SocialCustomersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
 }
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	WebElement ele;
	
	public TargetZone socialPage() throws InterruptedException {
		ele.click();
		Thread.sleep(1000);
		targetzone=new TargetZone(driver);
		return targetzone;
	}
}		