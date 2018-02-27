package tsy.KeywordsFramework.ActionModules;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import tsy.DataDriverFramework.Util.Log;
import tsy.DataDriverFramework.Util.MapElement;
import tsy.DataDriverFramework.Util.WaitUtil;
import tsy.KeywordsFramework.Scripts.TestSuiteByExcel;
import tsy.KeywordsFramework.Util.KeyboardUtil;

public class KeywordsAction {

	public static WebDriver driver;
	private static MapElement mapelement = new MapElement("");
	
	static {
		PropertyConfigurator.configure("./log4.properties");
	}
	
	public static void open_browser(String string, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("Chrome浏览器已经声明");
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("Firefox浏览器已经声明");
		}
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		Log.info("浏览器访问网址：" + url);
	}
	
	public static void input(String locatorExpression, String inputString) {
		try {
			driver.findElement(mapelement.getLocator(locatorExpression)).sendKeys(inputString);
			
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("输入数据出现异常，异常信息为：" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void click(String locatorExpression) {
		try {
			driver.findElement(mapelement.getLocator(locatorExpression)).click();
			Log.info("单击成功：" + locatorExpression);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("单击失败：" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void waitfor_element(String locatorExpression) {
		try {
			WaitUtil.WaitWebElement(driver, locatorExpression);
			Log.info("显示等待页面元素成功：" + locatorExpression);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			Log.info("显示等待页面元素失败：" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void press_tab() {
		try {
			KeyboardUtil.pressTabKey();
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			e.printStackTrace();
		}
	}
	
	public static void paste_string(String string) {
		try {
			KeyboardUtil.setAndctrLVCLipboardData(string);
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			e.printStackTrace();
		}
	}
	
	public static void sleep(String sleepTime) {
		try {
			WaitUtil.sleep(Integer.parseInt(sleepTime));
			Log.info("等待时间" + Integer.parseInt(sleepTime)/1000 + "s成功");
		} catch (Exception e) {
			TestSuiteByExcel.testResult = false;
			e.printStackTrace();
		}
	}
	
	public static void assert_string(String assertString) {
		try {
			Assert.assertTrue(driver.getPageSource().contains(assertString));
			Log.info("断言成功-测试用例执行成功" + assertString);
		} catch (AssertionError e) {
			TestSuiteByExcel.testResult = false;
			Log.info(e.getMessage());
			System.out.println("断言失败");
		}
	}
	
	public static void close_browser() {
		try {
			System.out.println("浏览器关闭函数被执行");
			driver.quit();
			Log.info("关闭浏览器-测试结束");
		} catch (Exception e) {
			TestSuiteByExcel.testResult=false;
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
