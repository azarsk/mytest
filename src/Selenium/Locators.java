package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public void login() {

	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\azaruddin.shaik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://saaki.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * driver.findElement(By.className("btn-orange")).click();
		 * driver.findElement(By.xpath("//input[@id='Form_submitForm_FullName']")).
		 * sendKeys("Azaruddin");
		 * driver.findElement(By.xpath(" //input[@id='Form_submitForm_CompanyName']")).
		 * sendKeys("GD");
		 * driver.findElement(By.xpath("//input[@id='Form_submitForm_JobTitle']")).
		 * sendKeys("SoftWare");
		 * driver.findElement(By.xpath("//input[@id='Form_submitForm_Contact']")).
		 * sendKeys("996694945");
		 * driver.findElement(By.xpath("//input[@id='Form_submitForm_Email']")).sendKeys
		 * ("azar@gmail.com");
		 * driver.findElement(By.xpath("//textarea[@id='Form_submitForm_Comment']"))
		 * .sendKeys("I want to research on the data"); Select selDrop = new
		 * Select(driver.findElement(By.xpath(
		 * "//select[@id='Form_submitForm_NoOfEmployees']")));
		 * selDrop.selectByVisibleText("16 - 20"); // selDrop.selectByIndex(2);
		 * driver.findElement(By.xpath("//img[@class='nav-logo']")).click();
		 * driver.findElement(By.xpath("//input[@id='linkadd']")).click();
		 */
		/*
		 * driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(
		 * "azar@gd.com");
		 * driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(
		 * "yasmeen@786");
		 * driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();
		 */
		// driver.findElement(By.xpath("//a[@class=\"announcement__link\"]")).click();
		// Locating the Main Menu (Parent element)
		// driver.findElement(By.xpath("//span[contains(text(),'My
		// Wishlist')]/parent::a")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'SHOP NOW')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Saaki Girl')]")).click();
		// a[@href="/collections/weaves-of-south"][2]
		driver.findElement(By.xpath("//a[@href=\"/collections/weaves-of-south\"][2]")).click();
		// span[contains(text(),'My Wishlist')]

	}

}
