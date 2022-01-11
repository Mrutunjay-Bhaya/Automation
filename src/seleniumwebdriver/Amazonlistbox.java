package seleniumwebdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonlistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
	
		
		Select listbox = new Select(driver.findElement(By.name("url")));
		//Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement> olist = listbox.getOptions();
	System.out.println("No of item r::"+olist.size());
	for(WebElement each : olist)
	{
		String eachitemname =each.getText();
		System.out.println(eachitemname);
		each.click();
	}
		Thread.sleep(5000);
		driver.close();
	}

	}

