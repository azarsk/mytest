package selenium_basic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeSession {
	WebDriver driver;
	// WebDriverWait wait;

	@BeforeMethod
	public void pageLoad() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\azaruddin.shaik\\eclipse-workspace\\JavaBasic\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void handleSelect() throws InterruptedException {
		// Handling dropdown

		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
		driver.findElement(By.name("FullName")).sendKeys("Azaruddin Shaik");
		Select noOfEmployess = new Select(
				driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']")));
		noOfEmployess.selectByIndex(5);
		Thread.sleep(2000);
		noOfEmployess.selectByValue("16 - 20");
		Thread.sleep(2000);
		noOfEmployess.selectByVisibleText("101 - 150");
		Thread.sleep(2000);

	}

	@Test(enabled = false)
	public void alertHandle() throws InterruptedException {

		driver.get("C:\\xampp\\htdocs\\alert.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert pop = driver.switchTo().alert();
		Thread.sleep(4000);
		// pop.sendKeys("Java");
		// Thread.sleep(4000);
		pop.accept();
		// pop.dismiss();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void authenticationPopup() {

		String url = "http://dev:dev@dev-rbi-awards.pantheonsite.io"; // with out using third party url
		driver.get(url);
		System.out.println("Authanication popup handle by using selenium alert concept");
		// Alert pop= driver.switchTo().alert();
		// pop.sendKeys("azar");
		System.out.println("Alert Handle Sucessfully");

	}

	@Test(enabled = false)
	public void frameHandle() {

		driver.get("https://demo.guru99.com/test/guru99home/");
		// Return webelement on the home page
		// iframe to frame is not possible
		driver.switchTo().frame(0); // By index
		// driver.switchTo().frame("googlefcLoaded"); //By Iframe name tag
		// driver.switchTo().frame(null); //WebElement Ex:xpath
		driver.switchTo().defaultContent();
		driver.switchTo().frame("googlefcLoaded"); // By Iframe name tag
		// driver.switchTo().frame(null); //WebElement Ex:xpath
	}

	@Test(enabled = true)
	public void formFrameHandle() throws InterruptedException {
		driver.get("https://www.globaldata.com/contact-us/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.name("375052_482063pi_375052_482063")).sendKeys("azar");

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement mainMenuOne = driver.findElement(By.xpath("//span[contains(text(),'Who We Serve')]"));
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(mainMenuOne).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Equity Research')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.switchTo().frame(0);
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void facebook() throws InterruptedException {

		// wait = new WebDriverWait(driver, 30);
		driver.get("https://www.facebook.com/");
		// wait commands
		// Thread.sleep(2000)-- its java wait command

		// selenium wait commands
		// default time for selenium wait commands
		// 1.implicit wait--is equal to thread.sleep,Thread.sleep is actual a java
		// command
		// ,implicit wait is selenium command ,it will wait only given time ,It will
		// wait upto that time

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 2.explict Wait--Actually it is conditional based wait command,im my current
		// frame work i prefrred only
		// explicit wait command, why because once element present it wont wait for
		// given time

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Create
		// New Account')]")));
		// alert is present ,elemnet to clickable,frame to be available,presence of all
		// elements,
		// visibility of element located,text to be prsence in element

		// 3.Fluient wait -i never worked on this one. It wait based on duration

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("azar");
		driver.findElement(By.name("lastname")).sendKeys("shaik");
		driver.findElement(By.name("reg_email__")).sendKeys("asss@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("azar@123");
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByIndex(11);
		Thread.sleep(2000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("2");
		Thread.sleep(2000);
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).click();
		Thread.sleep(2000);
		boolean custom = driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).isEnabled();
		if (custom) {
			Select preferred = new Select(driver.findElement(By.name("preferred_pronoun")));
			preferred.selectByIndex(2);
			// driver.findElement(By.name("preferred_pronoun")).sendKeys("")
			driver.findElement(By.name("custom_gender")).sendKeys("My Space");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'_8ien')]/img")).click();

	}

	@Test(enabled = false)
	public void roundTrip() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);

		boolean oneWayTrip = driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).isEnabled();
		if (oneWayTrip) {
			System.out.println("One Way Trip is Enabled");
		} else {
			System.out.println("One Way Trip is not enabled");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys("Hyderabad");

		List<WebElement> listData = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		Thread.sleep(3000);
		// System.out.println("Size of drop Down:"+list.size());

		for (int i = 0; i < listData.size(); i++) {
			// System.out.println(listData.get(i).getText());
			String citydata = listData.get(i).getText();
			if (citydata.contains("Hyderabad")) {
				listData.get(i).click();
				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys("Delhi");
		Thread.sleep(3000);
		List<WebElement> desCity = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));

		Thread.sleep(3000);
		for (int k = 0; k < desCity.size(); k++) {
			String desCitydata = desCity.get(k).getText();
			if (desCitydata.contains("Delhi")) {
				desCity.get(k).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

	@Test(enabled = false)
	public void mouseHandler() throws InterruptedException {
		driver.get("https://saaki.co/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class=''][1]/div[1]/img/parent::div")).click();
		Thread.sleep(3000);
		WebElement mainMenu = driver.findElement(By.xpath("//li/a[contains(text(),'Collections')]"));
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu);
		WebElement subMenu = driver.findElement(By.xpath(
				"//ul[@class=\"site-nav__dropdown text-left\"]/descendant::a[contains(text(),'Curated Craft Wear')]"));
		System.out.println("Submenu");
		action.moveToElement(subMenu);
		System.out.println("end of sub menu");
		// Thread.sleep(5000);
		action.click().build().perform();

	}

	@Test(enabled = false)
	public void getLinks() {
		driver.get("https://saaki.co/");
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getText());
		}
	}

	@AfterMethod
	public void closeMethod() throws InterruptedException {
		// driver.close();
		// driver.quit();

	}

}
