package skinObjectsRegestration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneAndOnlyPlan {
     WebDriver driver;
     public YourWeight weight;
     
	public OneAndOnlyPlan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele5;
	public YourWeight oneAndOnlyPlan() throws InterruptedException {
		Thread.sleep(1000);
		ele5.click();
		weight=new YourWeight(driver);
		return weight;
	}

}
