package tests;

import common.TestBasic;
import pages.HomePage;

public class PracticeFormTest {
	public String username = "mlg-sale-v1";
	public String password = "mlg@2021";
	public String quenMatKhau = "QUÊN MẬT KHẨU";

//TC01
	public void submit_Data_Successfully() {
		TestBasic testBasic = new TestBasic();
		testBasic.openBrowser();// Mở trình duyệt
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickButtonDangNhap();
		homePage.tenDangNhap(username);
		homePage.matKhau(password);
		homePage.dangNhap();
		if (username.equals(homePage.viewUserName())) {
			System.out.print("Testcase Pass");
		}
		else{
			System.out.print("Testcase Fail");
		}	
		homePage.dangXuat();
	}

// TC02
	public void passWord_Not_Correct() {
		TestBasic testBasic = new TestBasic();
		testBasic.openBrowser();// Mở trình duyệt
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickButtonDangNhap();
		homePage.tenDangNhap(username);
		homePage.matKhau("123456");
		homePage.dangNhap();
		if (!password.equals(homePage.getPassWord())) {
			System.out.print("Mật khẩu không đúng");
		}
		else{
			System.out.print("Testcase Fail");
		}	
	}
//TC03
	public void userName_Not_Correct() {
		TestBasic testBasic = new TestBasic();
		testBasic.openBrowser();// Mở trình duyệt
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickButtonDangNhap();
		homePage.tenDangNhap("mlg-sale-v1111");
		homePage.matKhau("password");
		homePage.dangNhap();
		if (!username.equals(homePage.getUserName())) {
			System.out.print("Tên đăng nhập không đúng");
		}
		else{
			System.out.print("Testcase Fail");
		}	
	}
//TC04
	public void empty_Data() {
		TestBasic testBasic = new TestBasic();
		testBasic.openBrowser();// Mở trình duyệt
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.clickButtonDangNhap();
		homePage.tenDangNhap("");
		homePage.matKhau("");
		homePage.dangNhap();
		if (!username.equals(homePage.getUserName()) && !password.equals(homePage.getPassWord())) {
			System.out.println("Tên đăng nhập không được bỏ trống");
			System.out.println("Mật khẩu không được bỏ trống");
		}
		else {
			System.out.print("Testcase Fail");
		}	
	}
		public void space_Data() {
			TestBasic testBasic = new TestBasic();
			testBasic.openBrowser();// Mở trình duyệt
			HomePage homePage = new HomePage(testBasic.driver);
			homePage.clickButtonDangNhap();
			homePage.tenDangNhap("   ");
			homePage.matKhau("   ");
			homePage.dangNhap();
			if (!username.equals(homePage.getUserName()) && !password.equals(homePage.getPassWord())) {
				System.out.println("Tên đăng nhập không được bỏ trống");
				System.out.println("Mật khẩu không được bỏ trống");
			}
			else {
				System.out.print("Testcase Fail");
			}	


	}
		public void click_Quen_Mat_Khau() {
			TestBasic testBasic = new TestBasic();
			testBasic.openBrowser();// Mở trình duyệt
			HomePage homePage = new HomePage(testBasic.driver);
			homePage.clickButtonDangNhap();
			homePage.buttonQuenMatKhau();
			if(quenMatKhau.equals(homePage.getQuenMatKhau())) {
				System.out.print("Testcase Pass");
			}
			else {
				System.out.print("Testcase Fail");
			}	
		}

	public static void main(String[] args) {
		PracticeFormTest praticeFormTest = new PracticeFormTest();
		praticeFormTest.submit_Data_Successfully();
	    praticeFormTest.passWord_Not_Correct();
	    praticeFormTest.userName_Not_Correct();
	    praticeFormTest.empty_Data();
		praticeFormTest.space_Data();
		praticeFormTest.click_Quen_Mat_Khau();

	}

}
