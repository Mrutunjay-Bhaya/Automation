package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFacebookaccount {

	public static void main(String[] args) throws Throwable {
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://facebook.com");
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[contains(@id,'u_0')])[3]")).click();

Thread.sleep(3000);	
driver.quit();
	}
	

}
