package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition
{
	public static void main(String[] args) throws Throwable {
 System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
 
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
driver.get("https://flipkart.com");
driver.get("https://google.com");
Thread.sleep(5000);
driver.get("https://youtube.com");
Thread.sleep(5000);
driver.close();
	}

}
