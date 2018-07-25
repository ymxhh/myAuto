package tsy.DataDriverFramework.Scripts;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryTest {

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
	public void jqueryTest() throws InterruptedException {
		driver.get("http://cdt3-web.taoshouyou.com/game/wangzherongyao-2256-0-0");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = (WebElement) js.executeScript("return $('.ljgm').eq(2).find('a')");
//		WebElement element = (WebElement) js.executeScript("return $('.ljgm').eq(2).find('a')");
//		element.click();
//		Thread.sleep(5000);	
		
		@SuppressWarnings("unchecked")
		List<WebElement> elements = (List<WebElement>) js.executeScript("return $('.ljgm').find('a')");
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
	}
	
	@Test
	public void Test2() throws InterruptedException {
		driver.get("http://cdt3-web.taoshouyou.com/game/wangzherongyao-2256-0-0");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = (WebElement) js.executeScript("return $('.ljgm:first').find('a')");
//		element.click();
		List<WebElement> elements = (List<WebElement>) js.executeScript("return $('.ljgm:first').find('a').eq(0)");
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		Thread.sleep(5000);
	}
	
	public Boolean jQueryLoaded(JavascriptExecutor js) {
		Boolean loaded;
		try {
			loaded = (Boolean) js.executeScript("return " + "jQuery() != null");
		} catch (WebDriverException e) {
			loaded = false;
		}
		return loaded;
	}
	
	public void injectjQuery(JavascriptExecutor js) {
		js.executeScript(" var headID = "
						+ "document.getElementByTagName(\"head\")[0];"
						+ "var newScript = document.createElement('script');"
						+ "newScript.type = 'text/javascript';" + "newScript.src = "
						+ "'http://ajax.googleapis.com/ajax/"
						+ "libs/jquery/1.7.2/jquery.min.js';"
						+ "headID.appendChild(newScript);");	
	
	}
}
