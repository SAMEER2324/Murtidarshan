package Testcases;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.BapsAtlanta;
import objectrepository.BapsOrg;

public class Murtidarshan {
	
	@Test
	public void darshan() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

		driver.get("https://www.baps.org");
		driver.manage().window().maximize();
		BapsOrg org=new BapsOrg(driver);
		org.Cookies().click();
		org.Select().click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		BapsAtlanta atl=new BapsAtlanta(driver);
		atl.darhsan().click();
		atl.Select().click();
		Thread.sleep(2000L);
		atl.Play().click();
		Thread.sleep(10000L);
		driver.close();
		driver.switchTo().window(parentid);
		driver.close();
		
		
	}
}
