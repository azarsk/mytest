package poiApache;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class gettingExcelData {
	WebDriver driver;

	@BeforeMethod
	public void getUrl() {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\azaruddin.shaik\\eclipse-workspace\\JavaBasic\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS)
		
		
	}
	
	@Test(dataProvider="LoginData")
	public void loginData(String User,String Pass,String Exp) {
		driver.get("https://dev-autodesk.pantheonsite.io/wp-admin");
		
		WebElement userName = driver.findElement(By.id("user_login"));
		userName.clear();
		userName.sendKeys(User);
		
		WebElement password = driver.findElement(By.id("user_pass"));
		password.clear();
		password.sendKeys(Pass);
		
		driver.findElement(By.id("wp-submit")).click();
		
		String Exp_result=driver.getTitle();
		System.out.println(Exp_result);
		
		
		
		
		
		
		
		
		//System.out.println(UserName+" "+Pass+" "+Exp);
		
		
		
	}
	
	@DataProvider(name="LoginData")
	public String[][] getExcelData() throws IOException {
		
		String path="C:\\Users\\azaruddin.shaik\\eclipse-workspace\\JavaBasic\\src\\poiApache\\loginData.xlsx";
		poiApache obj =new poiApache(path);
		int totalRows=obj.getRowCount("sheet1");
		int totalCols=obj.getCellCount("sheet1", 1);
		String loginData[][]=new String[totalRows][totalCols];
		
		for(int i=1;i<totalRows;i++) {
			for(int j=0;j<totalCols;j++){
				
				loginData[i-1][j]=obj.getCellData("Sheet1", i, j);
			}
		}
		return loginData;
		
	}
	
	
	
	
}
