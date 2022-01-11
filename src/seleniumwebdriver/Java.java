package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	public static void main(String[] args)throws Throwable {
	//create instant object
		//System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//lunch url
		driver.get("https://facebook.com");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
			driver.findElement(By.name("email")).sendKeys("mrutunjaybhayasibu@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("143iloveyou");
			driver.findElement(By.name("login")).click();
		Thread.sleep(20000);
		driver.close();
	}}
	
	
	

		
		
	

	


