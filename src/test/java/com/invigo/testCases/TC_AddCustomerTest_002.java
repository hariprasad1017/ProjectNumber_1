package com.invigo.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.invigo.pageObjects.AddCustomerpage;
import com.invigo.pageObjects.LoginPage;

public class TC_AddCustomerTest_002 extends BaseClass {
	
	
	@Test
	public void AddCustomer() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerpage addcus=new AddCustomerpage(driver);
		addcus.AddNewcusLink();
		
		addcus.CusName("Pavan");
		addcus.CusGender();
		addcus.CusDob("10", "15", "1985");
		Thread.sleep(3000);
		addcus.CusAddress("India");
		addcus.CusCity("hyd");
		addcus.Cusstate("ap");
		addcus.Cuspincode("515408");
		addcus.Cusmobile("9052039878");
		
		String email= randomstring()+"@gmail.com";
		addcus.Cusmailid(email);
		
		addcus.Cuspassword("abcdef");
		addcus.Cussubmit();
		
		Thread.sleep(3000);
		
	
		
		
		
		
		
	}
	
	public String randomstring() {
		 String generate= RandomStringUtils.randomAlphabetic(8);
		 return generate;
	}
	
	
	
	
	
	
	

}
