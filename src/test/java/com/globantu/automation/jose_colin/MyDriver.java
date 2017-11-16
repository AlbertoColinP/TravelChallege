package com.globantu.automation.jose_colin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyDriver {

	
	private WebDriver driver;
	
	public MyDriver(String browser) {
		switch (browser) {
		case "remotefirefox":
				try {
					driver=new RemoteWebDriver(new URL(""),DesiredCapabilities.firefox());
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver =new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			
			break;
		case "explorer":
			System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		default:
			break;
		}
		
	
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
