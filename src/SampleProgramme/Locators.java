package SampleProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	 public static void main(String[] args) {  
	      
		 // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", "C:\\Java Download\\chromedriver_win32\\chromedriver.exe");  
	          
	       // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  
	          
	           // Launch Website  
	        driver.get("");  
	          
	         //Maximize the browser  
	          driver.manage().window().maximize();  
	         // driver.findElement(By.cssSelector("input#email")).sendKeys("azar.php789@gmail.com");
	         //tag and ID
	          driver.findElement(By.cssSelector("input#email")).sendKeys("azar.php789@gmail.com");
	          driver.findElement(By.cssSelector("input#email")).sendKeys("azar.php789@gmail.com");
	          
	          //tag and attribute
	          
  }  
	

}
