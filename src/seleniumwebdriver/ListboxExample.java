package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxExample {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		@SuppressWarnings("unused")
		boolean value = monthlistbox.isMultiple();
		daylistbox.selectByVisibleText("15");
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		
		monthlistbox.selectByIndex(3);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		yearlistbox.selectByValue("1997");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.close();
		

	}

}
