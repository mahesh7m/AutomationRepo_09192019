package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicSelenium4 
{
	

@Test
public void test()
{
	System.out.println("Launch chrome browser");

	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

	ChromeDriver dr = new ChromeDriver();

	dr.get("http://newtours.demoaut.com/");

	dr.manage().window().maximize();

	System.out.println(dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
	
}
}
