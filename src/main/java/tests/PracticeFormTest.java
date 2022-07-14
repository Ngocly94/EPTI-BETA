package tests;

import common.TestBasic;
import pages.AutomationPracticeFormPage;
import pages.FormPage;
import pages.HomePage;
import pages.ThanksForSubmittingPage;

public class PracticeFormTest {
	
public void submitDataSuccessfully() {
	TestBasic testBasic = new TestBasic();
	testBasic.openBrowser();// Mở trình duyệt
	HomePage homePage = new HomePage(testBasic.driver); 
	FormPage formPage = homePage.clickFormButton();
	AutomationPracticeFormPage automationPracticeFormPage = formPage.clickPracticeFormMenu(); 
	String firstName="Lê";
	String lastName="Ngọc";
	ThanksForSubmittingPage thanksForSubmittingPage = automationPracticeFormPage.inputPracticeForm(firstName,lastName);
	
	String fullName =firstName + lastName;
	if( fullName.equals(thanksForSubmittingPage.getText(thanksForSubmittingPage.fullNameLocator))) {
		System.out.print("Testcase Pass");
	}
		else {
			System.out.print("Testcase Fail");
		}	
}
public static void main(String[] args) {
	PracticeFormTest praticeFormTest = new PracticeFormTest();
	praticeFormTest.submitDataSuccessfully();
}
}



