package testNG_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallerExcecutionMethods {
	WebDriver driver;
   
	@Test
	public void login() {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
	}
	@Test
	public void register() {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
	}
	
	@Test
	public void bookForDemo() {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
	}
}
