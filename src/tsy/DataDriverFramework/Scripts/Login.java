package tsy.DataDriverFramework.Scripts;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	public WebDriver driver;
	
	@BeforeClass
	public void beforeclass() {
		PropertyConfigurator.configure("./log4.properties");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}
	
	@Test
	public void login_normal() {
		
	}
}
