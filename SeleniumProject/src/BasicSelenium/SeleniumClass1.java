package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass1 
{
	@Test
	public void login()
	{
		System.out.println("Launch chrome browser");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.get("https://google.co.in");
		
	
	}
	

}
