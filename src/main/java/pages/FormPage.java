package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends Page {
	
	public FormPage(WebDriver dr) {
		super(dr);
		this.driver = dr;
	}

	public AutomationPracticeFormPage clickPracticeFormMenu() {
		driver.findElement(By.xpath("//*[text()='Practice Form']")).click();
		return new AutomationPracticeFormPage(driver);
		
	}
}

