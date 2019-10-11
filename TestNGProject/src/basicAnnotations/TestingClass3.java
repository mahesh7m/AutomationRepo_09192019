package basicAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestingClass3
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
		System.out.println("***************************");
	}
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("Before Suit");
	}
@AfterSuite
public void aftersuit()
{
	System.out.println("After Suit");
}
}
