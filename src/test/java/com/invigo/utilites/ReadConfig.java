package com.invigo.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() {
		File file=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is :"+e.getMessage());
		}
	}
	
	public String getappURL() {
		String url=prop.getProperty("baseURL");
		return url;		
	}
	
	public String getUsername() {
		String username=prop.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String Password=prop.getProperty("password");
		return Password;
	}
	
	public String getChromepath() {
		String chromePath=prop.getProperty("chromepath");
		return chromePath;
	}
	
	public String getFirefoxepath() {
		String FirefoxPath=prop.getProperty("firefoxpath");
		return FirefoxPath;
	}
	
	public String getEdgepath() {
		String EdgePath=prop.getProperty("edgepath");
		return EdgePath;
	}
	
	
	
	
	
	

}
