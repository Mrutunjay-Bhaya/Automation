package seleniumwebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args)throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//print parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		
		//get collection of all windows id
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		//iterate all window
		for(String each:windows)
		{
			//parent window id is not to equals to child
			if(!parent.equals(each))
			{
				//switch to child window
				String pagetitle=driver.switchTo().window(each).getTitle();
				driver.manage().window().maximize();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
				
			}
			}
			
		}
			

	}


