package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class AutomationPracticeFormPage extends Page{
	public AutomationPracticeFormPage(WebDriver dr) {
		super(dr);
		this.driver = dr;
	}

public ThanksForSubmittingPage  inputPracticeForm (String firstName, String lastName ) {
	
//	WebElement html = driver.findElement(By.tagName("html"));
//	html.sendKeys(Keys.chord(Keys.COMMAND, Keys.SUBTRACT));
	
	driver.findElement(By.id("firstName")).sendKeys(firstName);
	driver.findElement(By.id("lastName")).sendKeys(lastName);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ngocle210894@gmail.com");
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected();
	driver.findElement(By.id("userNumber")).sendKeys("0838690247");
//	driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.TAB);
//	driver.findElement(By.id("dateOfBirthInput")).sendKeys("21 Aug 1994");
	
	driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
	driver.findElement(By.id("subjectsInput")).sendKeys("abc");
	driver.findElement(By.id("hobbies-checkbox-2")).isSelected();
	driver.findElement(By.id("uploadPicture")).sendKeys("/Users/ngocc/Downloads/Test app cho P_060722.xlsx");
	driver.findElement(By.id("currentAddress")).sendKeys("885 Tam Trinh");
	driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).isSelected();
	driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).isSelected();
	
	driver.findElement(By.id("submit")).click();
	
return new ThanksForSubmittingPage(driver);

}
}
