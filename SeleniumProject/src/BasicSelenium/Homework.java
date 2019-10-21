package BasicSelenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	@Test
	public void Login() {
		System.out.println("Launch Chrome Browser");
		System.setProperty("webdriver.chrome.drive", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();

	}

}
