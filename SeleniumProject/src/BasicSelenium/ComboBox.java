package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ComboBox
{
@Test
public void test()
{
	System.out.println("Launch chrome browser");

	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

	ChromeDriver dr = new ChromeDriver();

	dr.get("file:///C:/Users/Mahesh7M/Downloads/Practice.html");

	dr.manage().window().maximize();
	
	WebElement box=dr.findElement(By.id("anand"));
	
	Select sel= new Select(box);
	sel.selectByIndex(2);
	sel.selectByIndex(3);
	sel.selectByIndex(4);
}



}
