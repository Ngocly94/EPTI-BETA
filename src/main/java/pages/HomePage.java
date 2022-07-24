package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

	public HomePage(WebDriver dr) {
		super(dr);
		this.driver = dr;
	}
	

	
	public void clickButtonDangNhap () {
	
	driver.findElement(By.xpath("//a[contains(text(),'Đăng nhập')]")).click();
	
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		
		// WebElement e = driver.findElement(By.xpath("//h5[text()='Forms']"));// Tìm
		// element và lưu vào biến e - Cách 2
		// e.click();
	}
	public void tenDangNhap (String username) {
	driver.findElement(By.name("username")).sendKeys(username);
		
	}
	public void matKhau (String password) {
		driver.findElement(By.name("password")).sendKeys(password);
			
			
		}
	public void dangNhap () {
		driver.findElement(By.xpath("//span[contains(text(),'ĐĂNG NHẬP')]")).click();
			
			
		}
	public void buttonQuenMatKhau () {
		driver.findElement(By.xpath("//p[contains(text(),'Quên mật khẩu?')]")).click();
//		driver.findElement(By.xpath("/h3[contains(text(),'QUÊN MẬT KHẨU')]")).isDisplayed();
		}
	
	public String viewUserName() {
		return driver.findElement(By.xpath("//span[contains(text(),'mlg-sale-v1')]")).getText();
	}
	public void dangXuat () {
		driver.findElement(By.xpath("//span[contains(text(),'mlg-sale-v1')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
	}

	public String getPassWord() {
		return driver.findElement(By.name("password")).getText();
	}
	public String getUserName() {
		return driver.findElement(By.name("username")).getText();
	}
	public String getQuenMatKhau() {
		return driver.findElement(By.xpath("//h3[contains(text(),'QUÊN MẬT KHẨU')]")).getText();
	}

	
			
}
