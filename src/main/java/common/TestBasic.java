package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	public WebDriver driver;
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "/Users/ngocc/Documents/AutomationTest/03Tool/chromedriver");
	driver = new ChromeDriver();
	
	//open page: http://shop.demoqa.com
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();

}
public void closeBrowser() {
	driver.close();
}
}
