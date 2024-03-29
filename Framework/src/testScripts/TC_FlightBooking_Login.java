package testScripts;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.Configuration;

import libraries.ApplicationLibrary;
import pages.Pageinterface;

public class TC_FlightBooking_Login {

	
		Pageinterface page;
		WebDriver dr;
		ApplicationLibrary lib;
		
		@BeforeClass
		public void initialize()
		{
	      lib=new ApplicationLibrary();
	      
	      //Launch Browser
	      dr=lib.launchBrowser("Chrome");
	      
	      page=new Pageinterface(dr);
	      
		}
		@Test
		public void loginTest()
		{
			lib.navigate(dr, Configuration.url);
			String temp=page.homePage.login(Configuration.globalUserName, Configuration.globalPassword);
			Assert.assertTrue(temp.contains("Find a Flight"));
		}
		@Test
		public void logoutTest()
		{
			String temp=page.flightFinder.clickSignoff();
			
			Assert.assertTrue(temp.contains("Sign-on"));
		}
		@AfterClass
		public void tearDown()
		{
			dr.quit();
		}
	
}
