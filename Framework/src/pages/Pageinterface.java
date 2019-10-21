package pages;

import org.openqa.selenium.WebDriver;

public class Pageinterface {

	public FlightFinder flightFinder;
	public HomePage homePage;
	public Pageinterface(WebDriver dr)
	{
		 homePage = new HomePage(dr);
		 flightFinder=new FlightFinder(dr);
		//Add objects of other pages as well 
	}
	
	
}
