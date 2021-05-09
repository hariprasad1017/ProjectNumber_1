package com.invigo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {
	
	WebDriver driver;
	
	public AddCustomerpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'New Customer')]")
	WebElement linkAddCustomer;
	
	@FindBy(how=How.NAME,using="name")
	WebElement txtCusName;
	
	@FindBy(name="rad1")
	WebElement gender;
	
	@FindBy(name="dob")
	WebElement txtdob;
	
	@FindBy(how=How.NAME,using="addr")
	WebElement txtAddress;
	
	@FindBy(name="city")
	WebElement txtcity;
	
	@FindBy(how=How.NAME,using="state")
	WebElement txtstate;
	
	@FindBy(name="pinno")
	WebElement txtpincode;
	
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement txtmobilenum;
	
	@FindBy(name="emailid")
	WebElement txtemailid;
	
	@FindBy(how=How.NAME,using="password")
	WebElement txtpassword;
	
	@FindBy(name="sub")
	WebElement txtsubmit;
	
	public void AddNewcusLink() {
		linkAddCustomer.click();
	}
	
	public void CusName(String cname) {
		txtCusName.sendKeys(cname);
	}
	
	public void CusGender() {
		gender.click();
	}
	
	public void CusDob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void CusAddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}
	
	public void CusCity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void Cusstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void Cuspincode(String cpin) {
		txtpincode.sendKeys(cpin);
	}
	
	public void Cusmobile(String cmobile) {
		txtmobilenum.sendKeys(cmobile);
	}
	
	public void Cusmailid(String cmailid) {
		txtemailid.sendKeys(cmailid);
	}
	
	public void Cuspassword(String cpass) {
		txtpassword.sendKeys(cpass);
	}
	
	public void Cussubmit() {
		txtsubmit.click();
	}
		

}
