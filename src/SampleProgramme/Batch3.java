package SampleProgramme;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Batch3 {
	/*
	 * @Test public void faceBook() { System.out.println("Facebook open"); }
	 * 
	 * @Test public void google() { System.out.println("Google open"); }
	 * 
	 * @Test public void instagram() { System.out.println("Instagram open"); }
	 */


	@AfterMethod
	public void close() {
		System.out.println("Close");
	}

	@BeforeMethod
	public void open() {
		System.out.println("open");
	}

	@Test
	public void batch3() {
		System.out.println("Facebook open");
	}

}
