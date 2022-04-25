package selenium_basic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAdvancedCommands {

	WebDriver driver;

	@BeforeMethod
	public void open() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\azaruddin.shaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void dropDownHandle() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("azar");
		// handling dropdown funtionality by using selenium commands
		Select fbDate = new Select(driver.findElement(By.id("day")));
		fbDate.selectByIndex(22);// index start with zero
		Thread.sleep(4000);
		fbDate.selectByValue("12");
		Thread.sleep(4000);
		fbDate.selectByVisibleText("17");
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void alertHandle() throws InterruptedException {

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(4000);
		driver.findElement(By.name("cusid")).sendKeys("azar");

		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		// alert Handle by selenium
		Alert popup = driver.switchTo().alert();
		// popup.accept();
		// popup.dismiss();

		System.out.println(popup.getText());
		popup.accept();
		// popup.sendKeys("");
		System.out.println(popup.getText());
		popup.accept();

		Thread.sleep(4000);

	}

	@Test(enabled = true)
	public void mouseHover() throws InterruptedException {

		// open Myntra mover hover womens to flats

		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		WebElement mainMenu = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu);

		WebElement subMenu = driver.findElement(By.xpath("//a[@href='/flats']"));
		action.moveToElement(subMenu);

		// Action class is used for advanced selenium concepts like mouse hover,drag and
		// drop and double click ,contextclick(Rightclick)
		// click and hold
		// action.moveToElement(mainMenu).moveToElement(subMenu).click().build().perform();
		action.click().build().perform();

	}

	@Test(enabled = false)
	public void linksFindElements() throws InterruptedException {

		driver.get("https://thewaytoselenium.blogspot.com/");
		Thread.sleep(4000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links:" + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}

	}

	@AfterMethod
	public void close() {
		// driver.close();
		// driver.quit();
	}

}
