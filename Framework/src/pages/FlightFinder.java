package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinder {
	WebDriver dr;
	public  FlightFinder(WebDriver dr)
	{
		this.dr=dr;
		
	}
	By signoff=By.xpath("//a[text()='SIGN-OFF']");
	public String clickSignoff()
	{
		dr.findElement(signoff).click();
		return dr.getTitle();
		
	}
}
