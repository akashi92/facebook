package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Generic_Verification 
{
public void verifytitle(WebDriver driver,String title)
{
	try
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("Tile is matching",true);
	}
	catch(Exception e)
	{
		Reporter.log("Tile is not matching",true);
		Assert.fail();
	}
}
}
