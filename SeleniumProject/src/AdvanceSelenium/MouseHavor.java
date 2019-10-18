package AdvanceSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHavor {
	@Test
	public void test() throws InterruptedException {
		System.out.println("Launch chrome browser");

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.get("https://www.flipkart.com/");

		dr.manage().window().maximize();

		// Implicit wait
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		WebElement men = dr.findElement(By.xpath("//span[text()='Men']"));

		Actions act = new Actions(dr);

		act.moveToElement(men).build().perform();

		WebElement shirt = dr.findElement(By.xpath("//a[text()='Shirts']"));

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(dr, 5);

		wait.until(ExpectedConditions.visibilityOf(shirt)).click();

		Thread.sleep(2000);

		WebElement drag = dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div"));

		act.dragAndDropBy(drag, 50, 0).build().perform();

		String parent = dr.getWindowHandle();

		Thread.sleep(5000);

		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();

		Set<String> wins = dr.getWindowHandles();

		for (String w : wins) {
			if (!w.equals(parent))
				dr.switchTo().window(w);

		}
		dr.findElement(By.xpath("//a[text()='S']")).click();
	}
}
