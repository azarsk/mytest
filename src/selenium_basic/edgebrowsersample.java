package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class edgebrowsersample {

	WebDriver driver;

	@BeforeMethod
	public void open() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\azaruddin.shaik\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(4000);

	}

	@Test(priority = 0)
	public void signUpForEmailOrPhoneNumber() throws InterruptedException {
        System.out.println("wait for 4 sec");
		driver.findElement(By.xpath("//a[@href='/i/flow/signup']")).click();
		System.out.println("signup button clicked");
		Thread.sleep(4000);
		driver.findElement(By.name("name")).sendKeys("azaruddin");
		driver.findElement(By.name("phone_number")).sendKeys("8987654329");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Use email instead')]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("azar.php1111@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Use phone instead')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("phone_number")).sendKeys("8987654329");
		Thread.sleep(2000);

	}
	@Test(priority = 2)
	public void signUpForgoogle() {
		driver.findElement(By.xpath("//div[@class='K4efff']/div")).sendKeys("somu123@gmail.com");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
