package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BapsOrg {

	WebDriver driver;
	public BapsOrg(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="ATLANTA")
	WebElement select;
	
	@FindBy(linkText="I accept")
	WebElement cookies;
	
	
	
	 public WebElement Select()
	    {
	    	return select;
	    }
	 public WebElement Cookies()
	    {
	    	return cookies;
	    }
}