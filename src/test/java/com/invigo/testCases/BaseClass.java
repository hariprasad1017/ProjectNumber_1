package com.invigo.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.invigo.utilites.ReadConfig;

public class BaseClass {
	
		ReadConfig readconfig=new ReadConfig();
		
		public String baseURL=readconfig.getappURL();
		public String username=readconfig.getUsername();
		public String password=readconfig.getPassword();
		public static WebDriver driver;
		
		@Parameters({"browser"})
		@BeforeClass
		public void setup(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver=new ChromeDriver();
			
		    }else if(browser.equalsIgnoreCase("firefox")) {
		    	
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxepath());
			driver=new FirefoxDriver();
			
		    }else if(browser.equalsIgnoreCase("edge")) {
		    	
		    System.setProperty("webdriver.edge.driver", readconfig.getEdgepath());
		    driver=new EdgeDriver();
		    	
		    }
			
			driver.get(baseURL);
			driver.manage().window().maximize();
		}
			
		@AfterClass
		public void teardown() {
			driver.close();
		}
		
		public static void takeScreenshot(String filename) throws IOException {
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File( "./Screenshots/"+filename+".png"));
		}

	}

