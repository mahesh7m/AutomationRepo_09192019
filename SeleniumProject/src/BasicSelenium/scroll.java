package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroll {
	@Test
	public void test() {
		System.out.println("Launch chrome browser");

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.get("file:///C:/Users/Mahesh7M/Downloads/Practice.html");

		dr.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) dr;
		// js.executeScript("window.ScrollBy(0,500)");

		WebElement ele = dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView();", ele);

		ele.click();

		Alert alt = dr.switchTo().alert();

		System.out.println(alt.getText());

		alt.accept();
		//alt.dismiss();
		

	}

}
