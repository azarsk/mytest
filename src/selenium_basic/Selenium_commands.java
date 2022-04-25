package selenium_basic;

import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_commands {

	@Test

	public void facebook() throws InterruptedException   {
      
		/*
		 * selenium components
		 * 
		 * Selenium IDE --- Tool -- Firefox add on - record and playback Tool, condition
		 * statements not possible Selenium RC - Remote control , server , Seleniu RC is
		 * a middleman between your browser and commands Selenium Webdriver -it direct
		 * speaks to your browser , Chromedriver.exe Selenium Grid - enhancement -
		 * parallel execution , script execute in different OS, Browsers at a time
		 */
		
		// open browser    
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azaruddin.shaik\\eclipse-workspace\\JavaBasic\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// Open browser Edge
		
		// Open browser Firefox 
		
		// Twitter 
		
		//window maximise 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// Passing URL 
		
	    driver.get("https://www.facebook.com/");
	    
	    // Get --> it will wait upto page load 
		
		driver.navigate().to("https://testng.org/doc/index.html");
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		// Enter User name 
		
		// web elements 
		
		//driver.findElement(null) -- it handle only one webelement 
		
		//driver.findElements(null) --- it handle morethan one webelement 
		
		driver.findElement(By.id("email")).sendKeys("somugaddam");
		
		
		
		// Enter Password 
		driver.findElement(By.
				xpath("//input[@id='email']/parent::div/following-sibling::div/descendant::input")).sendKeys("welcome@123");
	
		
		// Click Login button 
		
		driver.findElement(By.name("login")).click();
		
		
		//Browser close 
		
		driver.close();  // Current window close 
		
		
		driver.quit(); // It will close all browser instence (All Browser tabs )
		
		
		
	}

}
