package com.invigo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.invigo.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();  
		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}else {
			takeScreenshot("loginTest");
			Assert.assertTrue(false);
		}
		
		
	}
	
	
	
	
	

}
