package testjava;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageEvents.HomePageEvent;
import pageEvents.LoginPageEvent;

public class sampletest extends BaseTest {
  
	@Test(priority = 1)
	public void samplemethodemailentering() {
		HomePageEvent h = new HomePageEvent();
		h.clickonsigninbutton();
		
		LoginPageEvent e = new LoginPageEvent();
		e.verifyloginpageopen();
		e.enteremailid();
	}
	
	@Test(priority = 2)
	public void enterpassword() {
		HomePageEvent h = new HomePageEvent();
		h.clickonsigninbutton();
		
		LoginPageEvent e = new LoginPageEvent();
		e.verifyloginpageopen();
		e.enteremailid();
		LoginPageEvent e1 = new LoginPageEvent();
		e1.enterpassword();
	}
	
	@Test(priority = 3)
	public void failedmethod() {
		driver.findElement(By.id("ok")).click();
	}
	
	
}
