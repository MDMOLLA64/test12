package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utility.ReadPropFile;

public class BaseTest {

	WebDriver driver;
	Properties prop;

	@Before
	public void open1() throws IOException {
		 prop = ReadPropFile.ReadFile("/Users/bittech/eclipse-workspace/POMProject/config.properties");
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mdmolla/Downloads/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "path of geckodriver");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	@After
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
