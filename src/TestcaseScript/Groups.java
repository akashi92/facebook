package TestcaseScript;

import org.testng.annotations.Test;

public class Groups 
{
	@Test(groups="regression")
	public void compose()
	{
		System.out.println("Compose");
	}
	@Test(groups="regression")
	public void sentitems()
	{
		System.out.println("sentitems");
		
	}
	@Test(groups="smoke")
	public void draft()
	{
		System.out.println("Draft");
	}
}
