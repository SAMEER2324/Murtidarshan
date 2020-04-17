package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BapsAtlanta {

	WebDriver driver;
	public BapsAtlanta(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="dsimages")
	WebElement select;
	
	@FindBy(id="TitleLink117985")
	WebElement darshan;
	
	@FindBy(className="highslide-play")
	WebElement play;
	
	
	
	
	
	 public WebElement darhsan()
	    {
	    	return darshan;
	    }
	 
	 public WebElement Select()
	    {
	    	return select;

	   }
	 
	 public WebElement Play()
	    {
	    	return play;
	    }
	 
	 }