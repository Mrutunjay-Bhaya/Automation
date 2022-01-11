package Testng;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class propertiesFile {
	WebDriver driver;
	Properties p;

	@BeforeMethod
	public void adminlogin() throws Throwable {
		p = new Properties();
		// login file
		p.load(new FileInputStream("C:\\Users\\MRUTUNJAY BHAYA\\eclipse-workspace\\selenium\\OR.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(p.getProperty("objusername"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("objpassword"))).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(p.getProperty("objlogin"))).click();
		Thread.sleep(4000);
	}

	@Test
	public void branchcreation() throws Throwable {
		driver.findElement(By.xpath(p.getProperty("objbranchs"))).click();
		driver.findElement(By.xpath(p.getProperty("objnewbranch"))).click();
		driver.findElement(By.xpath(p.getProperty("objbranchname"))).sendKeys(p.getProperty("branchname"));
		driver.findElement(By.xpath(p.getProperty("objaddress1"))).sendKeys(p.getProperty("address1"));
		driver.findElement(By.xpath(p.getProperty("objzip"))).sendKeys(p.getProperty("zipcode"));
		new Select(driver.findElement(By.xpath(p.getProperty("objcountry"))))
				.selectByVisibleText(p.getProperty("country"));
		new Select(driver.findElement(By.xpath(p.getProperty("objstate")))).selectByVisibleText(p.getProperty("state"));
		new Select(driver.findElement(By.xpath(p.getProperty("objcity")))).selectByVisibleText(p.getProperty("city"));
		driver.findElement(By.xpath(p.getProperty("objsubmit"))).click();
		Thread.sleep(4000);
		String alertmessage = driver.switchTo().alert().getText();
		Reporter.log(alertmessage, true);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
