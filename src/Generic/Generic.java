package Generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
static{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
}
@BeforeMethod
public void openApp()
{
	driver= new FirefoxDriver();
    driver.get("https://www.facebook.com");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
}
@AfterMethod
public void closeApp(ITestResult res) throws Exception
{
	int status = res.getStatus();
	System.out.println(status);
	String tcname = res.getName();
	System.out.println(tcname);
	if (status==2)
	{
		Generic_TakeScreenShot.Screenshot(driver,tcname);
	}
	Thread.sleep(5000);
	driver.quit();
}
}
