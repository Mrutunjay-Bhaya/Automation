package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange_hrm {
	WebDriver driver;

	@BeforeTest

	public void setup() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

	@Test(invocationCount=3)
	public void admin() {
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

	}

	@Test
	public void pim() {
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
	}

	@Test
	public void leav() {
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
	}

	@Test
	public void time() {
		driver.findElement(By.xpath("//b[contains(text(),'Time')]")).click();
	}

	@Test
	public void recuirment() {
		driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();
	}

	@Test
	public void myinfo() {
		driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
	}

	@Test
	public void perfomance() {
		driver.findElement(By.xpath("//b[contains(text(),'Performance')]")).click();
	}

	@Test
	public void dashboard() {
		driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
	}

	@Test(enabled = false)
	public void directory() {
		driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
	}

	@AfterTest
	public void teardown() throws Throwable {
		Thread.sleep(5000);
		driver.quit();

	}

}
