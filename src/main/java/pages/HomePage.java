package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

	public HomePage(WebDriver dr) {
		super(dr);
		this.driver = dr;
	}

	public FormPage clickFormButton() {
	
		System.out.print("abcxbcbcbcbcbbcbc" + driver);
		WebElement e = driver.findElement(By.xpath("//h5[text()='Forms']/../../.."));
		System.out.print("sadsadsdaasd"+ e);
		e.click();// Click vào Form - Cách 1 (Viết tắt)

		// WebElement e = driver.findElement(By.xpath("//h5[text()='Forms']"));// Tìm
		// element và lưu vào biến e - Cách 2
		// e.click();

		return new FormPage(driver);

	}
}
