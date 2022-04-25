package testNG_Class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestNGExample {
	
	@BeforeMethod
	public void open() {
		System.out.println("open");
	}
	@AfterMethod
		public void close() {
			System.out.println("close");
    }
	
	@Test(priority = 2)
	public void google() {
		System.out.println("Google Display Page");
	}
	@Test(priority = 0)
	public void facebook() {
		System.out.println("Facebook display page");
	}
	@Test(priority = 3)
	public void twitter() {
		System.out.println("Twitter display Page");
	}
	@Test(invocationCount = 5,priority = 1)
	public void instagram() {
		System.out.println("Instagram display page");
	}
	

}
