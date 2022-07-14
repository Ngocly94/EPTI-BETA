package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksForSubmittingPage extends Page{

	public ThanksForSubmittingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stu
	
		
	}
	public By fullNameLocator = By.xpath("//tbody/tr[1]/td[2]");
	public String getText(By locator) {
		String result = "";
		result = driver.findElement(locator).getText();
		return result;
		
	}
	}


