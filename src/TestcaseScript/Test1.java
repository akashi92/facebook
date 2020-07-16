package TestcaseScript;


import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.*;
import POM.LoginPage;

public class Test1 extends Generic{

	@Test
	public void Test_Login() throws Exception
	{
		
	      LoginPage lp= new LoginPage(driver);
	      lp.setemail("akankshagangwar@yahoo.in");
	      Thread.sleep(3000);
	     
	     
	      
	    
	      
	      
}
}

